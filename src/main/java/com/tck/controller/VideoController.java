package com.tck.controller;

import com.tck.model.VideoGrabber;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;
@Controller
public class VideoController {


    @GetMapping("video")
    public String video (Map<String,Object> model){

        return "video";
    }
//    @PostMapping("")
//    public String addRegistration(@Valid @ModelAttribute("registration") VideoGrabber videoGrabber, BindingResult result){
//
////        if (result.hasErrors()){
////            System.out.println("Errors occurred");
////            return "registration";
////        }
////        System.out.println("Registration: " + videoGrabber.getName());
////        return "redirect:registration";
//    }
}
