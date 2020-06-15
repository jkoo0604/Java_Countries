package com.jkoo.countries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jkoo.countries.services.MainService;
import com.jkoo.countries.services.PageService;

@Controller
public class MainController {
	@Autowired
	private MainService mainService;
	@Autowired
	private PageService pService;
	
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
	
	@RequestMapping("/answers/{id}")
	public String indivQ(Model model, @PathVariable("id") int questionID) {
		if (questionID == 1) {
			Page<Object[]> answer1 = pService.loadQuestion1(0);
			int totalPages = answer1.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer1", answer1);
		} else if (questionID == 2) {
			Page<Object[]> answer2 = pService.loadQuestion2(0);
			int totalPages = answer2.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer2", answer2);
		} else if (questionID == 3) {
			Page<String> answer3 = pService.loadQuestion3(0);
			int totalPages = answer3.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer3", answer3);
		} else if (questionID == 4) {
			Page<Object[]> answer4 = pService.loadQuestion4(0);
			int totalPages = answer4.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer4", answer4);
		} else if (questionID == 5) {
			Page<String> answer5 = pService.loadQuestion5(0);
			int totalPages = answer5.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer5", answer5);
		} else if (questionID == 6) {
			Page<String> answer6 = pService.loadQuestion6(0);
			int totalPages = answer6.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer6", answer6);
		} else if (questionID == 7) {
			Page<Object[]> answer7 = pService.loadQuestion7(0);
			int totalPages = answer7.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer7", answer7);
		} else if (questionID == 8) {
			Page<Object[]> answer8 = pService.loadQuestion8(0);
			int totalPages = answer8.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer8", answer8);
		} else {
			return "redirect:/";
		}
		
		model.addAttribute("currentQ",questionID);
		model.addAttribute("currentP", 1);
		return "q" + questionID + ".jsp";
	}
	
	@RequestMapping("/answers/{id}/{id2}")
	public String indivQ(Model model, @PathVariable("id") int questionID, @PathVariable("id2") int pageID) {
		if (questionID == 1) {
			Page<Object[]> answer1 = pService.loadQuestion1(pageID-1);
			int totalPages = answer1.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer1", answer1);
		} else if (questionID == 2) {
			Page<Object[]> answer2 = pService.loadQuestion2(pageID-1);
			int totalPages = answer2.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer2", answer2);
		} else if (questionID == 3) {
			Page<String> answer3 = pService.loadQuestion3(pageID-1);
			int totalPages = answer3.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer3", answer3);
		} else if (questionID == 4) {
			Page<Object[]> answer4 = pService.loadQuestion4(pageID-1);
			int totalPages = answer4.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer4", answer4);
		} else if (questionID == 5) {
			Page<String> answer5 = pService.loadQuestion5(pageID-1);
			int totalPages = answer5.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer5", answer5);
		} else if (questionID == 6) {
			Page<String> answer6 = pService.loadQuestion6(pageID-1);
			int totalPages = answer6.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer6", answer6);
		} else if (questionID == 7) {
			Page<Object[]> answer7 = pService.loadQuestion7(pageID-1);
			int totalPages = answer7.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer7", answer7);
		} else if (questionID == 8) {
			Page<Object[]> answer8 = pService.loadQuestion8(pageID-1);
			int totalPages = answer8.getTotalPages();
			model.addAttribute("totalPages", totalPages);
			model.addAttribute("answer8", answer8);
		} else {
			return "redirect:/";
		}
		
		model.addAttribute("currentQ",questionID);
		model.addAttribute("currentP", pageID);
		return "q" + questionID + ".jsp";
	}
}
