package dev.loganholt.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index.html", "/vets/index"})
    public String index(Model model) {
        return "vets/index";
    }
}
