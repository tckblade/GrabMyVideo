package com.tck.controller;

import com.tck.model.MediaObject;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class AudioController {

    @GetMapping("audio")
    public String audio (@ModelAttribute("audio")MediaObject mediaObject){
        return "audio";
    }

    @PostMapping("audio")
    public String getVideo(@Valid @ModelAttribute("url") MediaObject mediaObject, BindingResult result){
        System.out.println("The URL is: " + mediaObject.getUrl());
        return "redirect:audio";
    }

}
