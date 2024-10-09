package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.entity.Infrastructure;
import vn.com.vti.springexam.entity.InfrastructureExample;
import vn.com.vti.springexam.mapper.InfrastructureMapper;

@Controller
@RequestMapping("infrastructure")
public class InfrastructureController {
	@Autowired
	private InfrastructureMapper infrastructureMapper;
	
	@RequestMapping("input")
	public String input() {
		return "infrastructure/list";
	}
	
	@RequestMapping("searchById")
	public String searchById() {
		return "infrastructure/list";
	}
	
	@RequestMapping("list")
	public String list(Model model) {
		InfrastructureExample infrastructureExample = new InfrastructureExample();
		List<Infrastructure> infrastructureList= infrastructureMapper.selectByExample(infrastructureExample);
		model.addAttribute("infrastructureList", infrastructureList);
		return "infrastructure/list";
	}
}
