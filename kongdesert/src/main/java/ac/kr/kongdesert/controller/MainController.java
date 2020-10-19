package ac.kr.kongdesert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	String main() {
		
		return "main";
	}
}
