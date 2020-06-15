package com.jkoo.countries.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jkoo.countries.repositories.PageRepository;

@Service
@Transactional
public class PageService {
	@Autowired
	PageRepository pageRepo;
	
	private static final int PAGE_SIZE = 10;
	
	public Page<Object[]> loadQuestion1(int pageNumber) {
		PageRequest pageReq = PageRequest.of(pageNumber, PAGE_SIZE, Sort.unsorted());
		Page<Object[]> answer1 = pageRepo.question1(pageReq);
		return answer1;
	}
	
	public Page<Object[]> loadQuestion2(int pageNumber) {
		PageRequest pageReq = PageRequest.of(pageNumber, PAGE_SIZE, Sort.unsorted());
		Page<Object[]> answer2 = pageRepo.question2(pageReq);
		return answer2;
	}
	
	public Page<String> loadQuestion3(int pageNumber) {
		PageRequest pageReq = PageRequest.of(pageNumber, PAGE_SIZE, Sort.unsorted());
		Page<String> answer3 = pageRepo.question3(pageReq);
		return answer3;
	}
	
	public Page<Object[]> loadQuestion4(int pageNumber) {
		PageRequest pageReq = PageRequest.of(pageNumber, PAGE_SIZE, Sort.unsorted());
		Page<Object[]> answer4 = pageRepo.question4(pageReq);
		return answer4;
	}
	
	public Page<String> loadQuestion5(int pageNumber) {
		PageRequest pageReq = PageRequest.of(pageNumber, PAGE_SIZE, Sort.unsorted());
		Page<String> answer5 = pageRepo.question5(pageReq);
		return answer5;
	}
	
	public Page<String> loadQuestion6(int pageNumber) {
		PageRequest pageReq = PageRequest.of(pageNumber, PAGE_SIZE, Sort.unsorted());
		Page<String> answer6 = pageRepo.question6(pageReq);
		return answer6;
	}
	
	public Page<Object[]> loadQuestion7(int pageNumber) {
		PageRequest pageReq = PageRequest.of(pageNumber, PAGE_SIZE, Sort.unsorted());
		Page<Object[]> answer7 = pageRepo.question7(pageReq);
		return answer7;
	}
	
	public Page<Object[]> loadQuestion8(int pageNumber) {
		PageRequest pageReq = PageRequest.of(pageNumber, PAGE_SIZE, Sort.unsorted());
		Page<Object[]> answer8 = pageRepo.question8(pageReq);
		return answer8;
	}

}
