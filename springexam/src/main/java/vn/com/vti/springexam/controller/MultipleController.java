package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("multiple") //chi dinh url
public class MultipleController {

	@RequestMapping("input")//chi dinh url
	public String input() {
		return "multiple/input";//chi dinh jsp
	}

	@RequestMapping("result")//chi dinh url
	public String result(
			@RequestParam("num1") Integer num1
			,@RequestParam("num2") Integer num2
			,Model model
	) {
		Integer result = num1*num2;
		model.addAttribute("sum", result);
		return "multiple/result";//chi dinh jsp
	}
}
