package vn.com.vti.springexam.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FotuneController {
	@RequestMapping("fortune")
	public String fortune(Model model) {
		//get random value
		List<String> randomList = new ArrayList();
		randomList.add("Lucky");
		randomList.add("Normal");
		randomList.add("Bad");
		
		int listSize=randomList.size();
		Random random = new Random();
		int randomValue= random.nextInt(listSize);
		
		
		model.addAttribute("random",randomList.get(new Random().nextInt(randomList.size())));
		model.addAttribute("random1",randomList.get(randomValue));
		
		return "fortune";
	}
}
