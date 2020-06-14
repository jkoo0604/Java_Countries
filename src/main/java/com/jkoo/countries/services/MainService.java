package com.jkoo.countries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkoo.countries.models.Country;
import com.jkoo.countries.models.Language;
import com.jkoo.countries.repositories.CityRepository;
import com.jkoo.countries.repositories.CountryRepository;
import com.jkoo.countries.repositories.LanguageRepository;

@Service
public class MainService {
	@Autowired
	private CountryRepository countryRepo;
	@Autowired
	private CityRepository cityRepo;
	@Autowired
	private LanguageRepository langRepo;
	
	
	public void objectLists() {
		
		List<Object[]> dojos = countryRepo.getAllCountryIDName();
		Object[] dojo = dojos.get(0);
		Object dojoId = dojo[0];
		Object dojoName = dojo[1];
		
		
		List<Object[]> table = countryRepo.getAllCountryIDName();
		for(Object[] row : table) {
		    Country dojo2 = (Country) row[0];
		    Language ninja2 = (Language) row[1];
		    System.out.println(dojo2.getName());
		    System.out.println(ninja2.getLanguage());
		}
	}
	
	public List<Object[]> loadQuestion1() {
		List<Object[]> answer1 = countryRepo.question1();
		return answer1;
	}
	
	public List<Object[]> loadQuestion2() {
		List<Object[]> answer2 = countryRepo.question2();
		return answer2;
	}
	
	public List<String> loadQuestion3() {
		List<String> answer3 = countryRepo.question3();
		return answer3;
	}
	
	public List<Object[]> loadQuestion4() {
		List<Object[]> answer4 = countryRepo.question4();
		return answer4;
	}
	
	public List<String> loadQuestion5() {
		List<String> answer5 = countryRepo.question5();
		return answer5;
	}
	
	public List<String> loadQuestion6() {
		List<String> answer6 = countryRepo.question6();
		return answer6;
	}
	
	public List<Object[]> loadQuestion7() {
		List<Object[]> answer7 = countryRepo.question7();
		return answer7;
	}
	
	public List<Object[]> loadQuestion8() {
		List<Object[]> answer8 = countryRepo.question8();
		return answer8;
	}
	
}
