package javaspringexamples.spring.beanvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javaspringexamples.spring.beanvalidation.domain.User;

import javax.validation.Valid;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */

@Controller
public class UserController {

	@RequestMapping(value = "/form")
	public ModelAndView initiateUser() {
		return new ModelAndView("userForm", "user", new User());
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public ModelAndView processUser(@Valid User user, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("usr", user);

		if (result.hasErrors()) {
			modelAndView.setViewName("userForm");
		} else {
			modelAndView.setViewName("userResult");
		}

		return modelAndView;
	}
}