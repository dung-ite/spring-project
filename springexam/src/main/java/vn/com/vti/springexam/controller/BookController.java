package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.vti.springexam.entity.BookCustom;
import vn.com.vti.springexam.mapper.BookCustomMapper;

@Controller
@RequestMapping("book")
public class BookController {
	
	@Autowired
	private BookCustomMapper bookCustomMapper;
	
	@RequestMapping("input")
	public String input() {
		return "book/input";
	}
	
	@RequestMapping("searchByName")
	public String searchByName(@RequestParam String bookName, Model model) {
		List<BookCustom> bookList = bookCustomMapper.selectByNamePart("%"+bookName+"%");
		model.addAttribute("bookList", bookList);
		return "book/list";
	}
	
	@RequestMapping("list")
	public String list(Model model) {
		List<BookCustom> bookList = bookCustomMapper.selectAll();
		model.addAttribute("bookList", bookList);
		return "book/list";
	}
	
	@GetMapping("data")
	@ResponseBody
	public List<BookCustom> getData(@RequestParam("bookName") String bookName) {
		List<BookCustom> bookList = bookCustomMapper.selectByNamePart("%"+bookName+"%");
		return bookList;
	}
}
