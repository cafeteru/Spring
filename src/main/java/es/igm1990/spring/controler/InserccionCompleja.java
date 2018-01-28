package es.igm1990.spring.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import es.igm1990.spring.model.Persona;

@Controller
public class InserccionCompleja {
	private final String WEB = "object";
	private Persona ivan = new Persona("Iván", "González Mahagamage", 27);

	@GetMapping("/persona")
	public String variable(Model model) {
		model.addAttribute("person", ivan);
		return WEB;
	}

	@GetMapping("/personaMAV")
	public ModelAndView variableMAV() {
		ModelAndView v = new ModelAndView(WEB);
		v.addObject("person", ivan);
		return v;
	}
}
