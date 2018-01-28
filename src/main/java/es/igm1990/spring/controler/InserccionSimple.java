package es.igm1990.spring.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InserccionSimple {
    private final String WEB = "variable";

    @GetMapping("/html")
    public String variable(Model model) {
        model.addAttribute("name", "Iván sin modelo");
        return WEB;
    }

    @GetMapping("/htmlMAV")
    public ModelAndView variableMAV() {
        ModelAndView v = new ModelAndView(WEB);
        v.addObject("name", "Iván con modelo");
        return v;
    }
}
