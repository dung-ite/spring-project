package vn.com.vti.springexam.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("currentTime") //URL: currentTime
public class CurrentTimeController {
	
	@RequestMapping("index")  //URL: currentTime/index
	public String index(Model model) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateStr= sdf.format(date);
		
		List<String> list = new ArrayList<>();
		list.add("Ngoc");
		list.add("Khanh");
		list.add("An");
		
		model.addAttribute("date", dateStr);
		
		model.addAttribute("list",list);
		
		return "currentTime/index";
	}
}
