package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LabController {

    @RequestMapping("/lab")
    public String lab(String firstLab, String secondLab,String thirdLab,  String fourthLab,String fifthLab, Model model){
        firstLab ="lab-00-coupling";
        secondLab="lab-01-ioc";
        thirdLab="lab-02-di";
        fourthLab="lab-03-springBoot";
        fifthLab="lab-04-springMvs";

        model.addAttribute("firstLab",firstLab);
        model.addAttribute("secondLab",secondLab);
        model.addAttribute("thirdLab",thirdLab);
        model.addAttribute("fourthLab",fourthLab);
        model.addAttribute("fifthLab",fifthLab);

        return "lab/lab-list";
    }
}
