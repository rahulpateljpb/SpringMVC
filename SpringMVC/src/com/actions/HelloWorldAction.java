
package com.actions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldAction {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public ModelAndView says(Model model){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		model.addAttribute("HelloMessage", "Hello World from My First Spring 3 mvc application");
		return mv;
	}
	@RequestMapping(value="/hell",method=RequestMethod.GET)
	public ModelAndView Hello(Model model){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		model.addAttribute("HelloMessage", "Hi trainees");
		return mv;
	}
}
