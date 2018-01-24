package es.igm1990.spring.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.*;

@Controller
public class MainController {

	@GetMapping("/")
	public String login() {
		return "login";
	}

}
