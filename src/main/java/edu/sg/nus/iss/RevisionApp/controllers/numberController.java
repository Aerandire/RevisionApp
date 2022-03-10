package edu.sg.nus.iss.RevisionApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sg.nus.iss.RevisionApp.services.numberService;

@Controller
@RequestMapping(path="/number")
public class numberController {
    @Autowired
    private numberService numSvc;
    
    @GetMapping("/{aNumber}")
    public String getNumWithNum(Model model, 
        @PathVariable String aNumber){

            String aNum = numSvc.checkNum(aNumber);

            if(aNum != null){
                model.addAttribute("numVal",aNum);
                return "numbers";
            }

            model.addAttribute("errNum", aNumber);
            return"error";
            
        }
}
