package res.java.client.pp.g2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping(value="/")
	public String home(){
		return "front/layout/home_view";
	}
	@RequestMapping(value="/about")
	public String about(){
	return "front/layout/about_view";
	}
	
}
