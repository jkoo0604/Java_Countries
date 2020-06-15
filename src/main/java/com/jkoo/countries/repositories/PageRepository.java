package com.jkoo.countries.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.jkoo.countries.models.Country;

@Repository
public interface PageRepository extends PagingAndSortingRepository<Country, Long>{
 
    @Query("select c.name, l.language, l.percentage from Country c left outer join c.languages l where l.language = 'Slovene' order by l.percentage desc")
    Page<Object[]> question1(PageRequest pageReq);
	
	// #2 total number of cities for each country
    //    return the name of the country and the total number of cities
    //    by the number of cities in descending order.
    //	  COUNTRY
    
    @Query("select c.name, count(t.id) as city_count from Country c left outer join c.cities t group by c.name order by count(t.id) desc")
    Page<Object[]> question2(PageRequest pageReq);
	
	// #3 all the cities in Mexico with a population of greater than 500,000
    //    by population in descending order.
    //	  CITY
    
    @Query("select t.name from City t join t.country c where c.name = 'Mexico' and t.population > 500000 order by t.population desc")
    Page<String> question3(PageRequest pageReq);
	
	// #4 all languages in each country with a percentage greater than 89%
    //    by percentage in descending order.
    //	  LANGUAGE
	
    @Query("select c.name, l.language, l.percentage from Country c left outer join c.languages l where l.percentage > 89 order by l.percentage desc")
    Page<Object[]> question4(PageRequest pageReq);
    
	// #5 all the countries with Surface Area below 501 and Population greater than 100,000
    //	  COUNTRY
    
    @Query("select c.name from Country c where c.surface_area < 501 and c.population > 100000")
    Page<String> question5(PageRequest pageReq);
	
	// #6 countries with only Constitutional Monarchy with a surface area of more than 200 and a life expectancy greater than 75 years
    
    @Query("select c.name from Country c where c.government_form = 'Constitutional Monarchy' and c.surface_area > 200 and c.life_expectancy > 75")
    Page<String> question6(PageRequest pageReq);
	
	// #7 all the cities of Argentina inside the Buenos Aires district and have the population greater than 500,000
    //    return the Country Name, City Name, District, and Population.
	
    @Query("select c.name, t.name as city, t.district, t.population from Country c join c.cities t where c.name = 'Argentina' and t.district = 'Buenos Aires' and t.population > 500000")
    Page<Object[]> question7(PageRequest pageReq);
    
	// #8 the number of countries in each region
    //    return name of the region and the number of countries
    //    by the number of countries in descending order
    
    @Query("select c.region, count(c.id) as country_count from Country c group by c.region order by count(c.id) desc")
    Page<Object[]> question8(PageRequest pageReq);
}
