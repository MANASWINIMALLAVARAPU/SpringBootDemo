package com.klu.JFSDS12_SBDEMO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.websocket.server.PathParam;

@Controller
public class Controller2 {
    @GetMapping("/form")
    public String formController() {
        return "form";
    }

    @GetMapping("/index1")
    public String display( @RequestParam("fn") String name, @RequestParam("mb") String mobile,Model model) {
        model.addAttribute("name", name);
        model.addAttribute("mobile", mobile);
        return "index1";
    }
    
    @GetMapping("/input/{name}")
    public String path(@PathVariable("name") String name, Model model)
    {
    	model.addAttribute("name", name);
    	return "display";
    }
    
    @GetMapping("/{a}/{b}")
    public String sum(@PathVariable int a, @PathVariable int b) {
        int sum = a + b;
        return "Sum: " + sum;
    }
     
    }

   
