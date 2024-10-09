package vn.com.vti.springexam.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Prefecture;
import vn.com.vti.springexam.entity.PrefectureExample;
import vn.com.vti.springexam.mapper.PrefectureMapper;

@Controller
@RequestMapping("prefecture") //chi dinh url
public class PrefectureController {

	@Autowired
	private PrefectureMapper prefectureMapper;
	
	@RequestMapping("input")//chi dinh url
	public String input() {
		return "prefecture/prefectureSearchInput";//chi dinh jsp
	}

	@PostMapping("searchById")//chi dinh url
	public String searchById(
			@RequestParam("prefectureId") Integer prefectureId
			,Model model
	) {
		Prefecture prefecture = prefectureMapper.selectByPrimaryKey(prefectureId);
		model.addAttribute("prefecture",prefecture);
		
		Date today = new Date();
		model.addAttribute("today", today);
		return "prefecture/prefectureSearchDetail";//chi dinh jsp
	}
	
	@RequestMapping("list")//prefecture/list
	public String list(Model model) {
		PrefectureExample prefectureExample = new PrefectureExample();
		prefectureExample.setDistinct(true);
		prefectureExample.setOrderByClause("ID DESC");
		//SELECT DISTINCT * FROM PREFECTURE ORDER BY ID DESC
		
		List<Prefecture> prefectureList = prefectureMapper.selectByExample(prefectureExample);
		
		model.addAttribute("prefectureList", prefectureList);
		return "prefecture/list";
	}
	
	
}
