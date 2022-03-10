package edu.sg.nus.iss.RevisionApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class calculateController {

    @GetMapping("/")
    public String getCalculator(Model model){
        return "calculator";
    }


    @PostMapping("/calculate")
    public String getCalculated(Model model, 
        String num1, String num2){
            return"result";
    }
}
