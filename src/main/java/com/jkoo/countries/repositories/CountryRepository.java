package com.jkoo.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jkoo.countries.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long>{
	List<Country> findAll();
	
	@Query(value="select * from countries", nativeQuery=true)
	List<Country> findAllCountries();
	
	@Query(value="SELECT * FROM countries WHERE id = ?1", nativeQuery=true)
    Country getCountrybyID(Long id);
	
	@Query(value="SELECT id, name FROM countries", nativeQuery=true)
    List<Object[]> getAllCountryIDName();
    
// // get all the names of the dojos
//    @Query("SELECT d.name FROM Dojo d")
//    List<String> findAllDojosNames();
//    
// // passing params and filtering (still retrieves a list)
//    @Query("SELECT d FROM Dojo d WHERE id = ?1")
//    List<Country> getDojoWhereId(Long id);
//    
//    // passing params and filtering
//    @Query("SELECT d FROM Dojo d WHERE id = ?1")
//    Country getSingleDojoWhereId(Long id);
//    
// // inner join retrieving dojos and ninjas
//    @Query("SELECT d, n FROM Dojo d JOIN d.ninjas n")
//    List<Object[]> joinDojosAndNinjas2();
    
    // SELECT c, p.name FROM Country c LEFT OUTER JOIN c.capital p
    
    
    // #1 all the countries that speak Slovene 
    //	  return the name of the country, language, and language percentage
    //    by language percentage in descending order.
    //	  COUNTRY
    
    @Query("select c.name, l.language, l.percentage from Country c left outer join c.languages l where l.language = 'Slovene' order by l.percentage desc")
    List<Object[]> question1();
	
	// #2 total number of cities for each country
    //    return the name of the country and the total number of cities
    //    by the number of cities in descending order.
    //	  COUNTRY
    
    @Query("select c.name, count(t.id) as city_count from Country c left outer join c.cities t group by c.name order by count(t.id) desc")
    List<Object[]> question2();
	
	// #3 all the cities in Mexico with a population of greater than 500,000
    //    by population in descending order.
    //	  CITY
    
    @Query("select t.name from City t join t.country c where c.name = 'Mexico' and t.population > 500000 order by t.population desc")
    List<String> question3();
	
	// #4 all languages in each country with a percentage greater than 89%
    //    by percentage in descending order.
    //	  LANGUAGE
	
    @Query("select c.name, l.language, l.percentage from Country c left outer join c.languages l where l.percentage > 89 order by l.percentage desc")
    List<Object[]> question4();
    
	// #5 all the countries with Surface Area below 501 and Population greater than 100,000
    //	  COUNTRY
    
    @Query("select c.name from Country c where c.surface_area < 501 and c.population > 100000")
    List<String> question5();
	
	// #6 countries with only Constitutional Monarchy with a surface area of more than 200 and a life expectancy greater than 75 years
    
    @Query("select c.name from Country c where c.government_form = 'Constitutional Monarchy' and c.surface_area > 200 and c.life_expectancy > 75")
    List<String> question6();
	
	// #7 all the cities of Argentina inside the Buenos Aires district and have the population greater than 500,000
    //    return the Country Name, City Name, District, and Population.
	
    @Query("select c.name, t.name as city, t.district, t.population from Country c join c.cities t where c.name = 'Argentina' and t.district = 'Buenos Aires' and t.population > 500000")
    List<Object[]> question7();
    
	// #8 the number of countries in each region
    //    return name of the region and the number of countries
    //    by the number of countries in descending order
    
    @Query("select c.region, count(c.id) as country_count from Country c group by c.region order by count(c.id) desc")
    List<Object[]> question8();
}
