package es.igm1990.spring.controler;

import es.igm1990.spring.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListaVista {
    private final String WEB = "people";

    @GetMapping("/people")
    public String variable(Model model) {
        model.addAttribute("people", generatePeople(3));
        return WEB;
    }

    @GetMapping("/peopleMAV")
    public ModelAndView variableMAV() {
        ModelAndView v = new ModelAndView(WEB);
        v.addObject("people", generatePeople(5));
        return v;
    }

    private List<Person> generatePeople(int limit){
        List<Person> list = new ArrayList<>();
        list.add(new Person("A","B",1));
        list.add(new Person("C","D",2));
        list.add(new Person("E","F",3));
        return list;
    }
}
