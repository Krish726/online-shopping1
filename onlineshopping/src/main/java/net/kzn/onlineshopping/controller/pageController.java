package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pageController {

	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to spring mvc");
		return mv;
	}
	
	//**************************    DEMO OF @RequrstParam and @PathVariable        ***********************//
	
	//	Using query string
	
	/*
	 * @RequestMapping(value= {"/test"}) public ModelAndView
	 * test(@RequestParam(value="greeting", required = false)String greeting) {
	 * if(greeting==null) { greeting = "Hello"; } ModelAndView mv = new
	 * ModelAndView("page"); mv.addObject("greeting", greeting); return mv; }
	 */
	
	//	Using path variable
	
	/*
	 * @RequestMapping(value= {"test", "/test/{greeting}"}) public ModelAndView
	 * test(@PathVariable(value="greeting", required = false)String greeting) {
	 * if(greeting==null) { greeting = "Hello"; } ModelAndView mv = new
	 * ModelAndView("page"); mv.addObject("greeting", greeting); return mv; }
	 */
}
