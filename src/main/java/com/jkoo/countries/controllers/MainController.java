package com.jkoo.countries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jkoo.countries.services.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService mainService;
	
	@RequestMapping("/")
	public String allQueries(Model model) {
		
		List<Object[]> answer1 = mainService.loadQuestion1();
		List<Object[]> answer2 = mainService.loadQuestion2();
		List<String> answer3 = mainService.loadQuestion3();
		List<Object[]> answer4 = mainService.loadQuestion4();
		List<String> answer5 = mainService.loadQuestion5();
		List<String> answer6 = mainService.loadQuestion6();
		List<Object[]> answer7 = mainService.loadQuestion7();
		List<Object[]> answer8 = mainService.loadQuestion8();
		
		model.addAttribute("answer1", answer1);
		model.addAttribute("answer2", answer2);
		model.addAttribute("answer3", answer3);
		model.addAttribute("answer4", answer4);
		model.addAttribute("answer5", answer5);
		model.addAttribute("answer6", answer6);
		model.addAttribute("answer7", answer7);
		model.addAttribute("answer8", answer8);
		
		return "index2.jsp";
	}
}
