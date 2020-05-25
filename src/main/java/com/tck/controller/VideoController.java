package com.tck.controller;

import com.tck.model.MediaObject;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class VideoController {

    @GetMapping("video")
    public String video (@ModelAttribute ("video")MediaObject mediaObject){
        return "video";
    }

    @PostMapping("video")
    public String getVideo(@Valid @ModelAttribute("url") MediaObject mediaObject, BindingResult result){
        System.out.println("The URL is: " + mediaObject.getUrl());
        return "redirect:video";
    }
}
