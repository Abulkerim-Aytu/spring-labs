package com.cydeo.controller;

import com.cydeo.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class ProfileController {

    @RequestMapping("/profile")
    public String profile(Profile profile, Model model){

        profile=new Profile("Aytu","kerim","Hilal","05454892528","Abdukerim478@gmail.com", LocalDate.now().atStartOfDay());

        model.addAttribute("profile",profile);

        return "profile/profile-info";
    }
}
