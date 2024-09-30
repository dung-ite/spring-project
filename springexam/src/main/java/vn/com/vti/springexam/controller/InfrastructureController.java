package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfrastructureController {
	@RequestMapping("infrastructure")
	public String index() {
		return "profile";
	}
}
