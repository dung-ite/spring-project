package vn.com.vti.springexam.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.form.PrefectureForm;
import vn.com.vti.springexam.mapper.PrefectureMapper;

@Controller
@RequestMapping("prefectureInsert") //chi dinh url
public class PrefectureInsertController {

	@Autowired
	private PrefectureMapper prefectureMapper;
	
	@ModelAttribute
	public PrefectureForm createForm() {
		return new PrefectureForm();
	}
	
	@RequestMapping("input")//chi dinh url
	public String input( PrefectureForm prefectureForm ) {
		return "prefecture/prefectureInsertInput";//chi dinh jsp
	}

	@RequestMapping("confirm")//chi dinh url
	public String confirm(@Valid PrefectureForm prefectureForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return input(prefectureForm);
		}
		
		return "prefecture/prefectureInsertConfirm";//chi dinh jsp
	}
	
	
}
