package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("prac")
public class aController {
	@RequestMapping("index")
	public String index(String txt,ModelMap m) {
		m.put("info", txt);
		return "prac/index";
	}
}
