package com.demo.fitnesstracker.controller;

import com.demo.fitnesstracker.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute ("exercise")Exercise exercise) {
        System.out.println("exercise: " + exercise.getMinutes());
        return "addMinutes.html";
    }

//    @RequestMapping(value = "/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute ("exercise")Exercise exercise) {
//        System.out.println("exercising: " + exercise.getMinutes());
//        return "addMinutes";
//    }

}