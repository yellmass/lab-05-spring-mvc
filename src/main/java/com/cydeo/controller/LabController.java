package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LabController {

    @RequestMapping("/lab")
    public String getLab(Model model){
        String firstLab = "lab-01-Coupling";
        String secondLab = "lab-02-IoC";
        String thirdLab = "lab-03-DI";
        String fourthLab = "lab-04-Spring Boot";
        String fifthLab = "lab-05-Spring MVC";
        model.addAttribute("firstLab", firstLab);
        model.addAttribute("secondLab", secondLab);
        model.addAttribute("thirdLab", thirdLab);
        model.addAttribute("fourthLab", fourthLab);
        model.addAttribute("fifthLab", fifthLab);
        return "lab/lab-list";
    }
}
