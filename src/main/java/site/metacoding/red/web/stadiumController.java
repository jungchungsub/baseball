package site.metacoding.red.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class stadiumController {
	
	@GetMapping("/file/home")
	public String home() {
		return "boards/index";
	}
}	
