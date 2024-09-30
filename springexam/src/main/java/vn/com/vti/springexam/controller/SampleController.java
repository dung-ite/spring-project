package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.vti.springexam.entity.BusinessType;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	@RequestMapping(value="index") //URL: localhost:8080/sample/index
	@ResponseBody
	public BusinessType idx() {
		BusinessType businessType = new BusinessType();
		businessType.setBusinessTypeId("10");
		businessType.setBusinessTypeName("ABC");
		return businessType;
	}
	
	@RequestMapping("/form-demo")
	public String formDemo(@RequestParam String username, @RequestParam String password) {
		System.err.println(username);
		System.err.println(password);
		return "sample";
	}
}
