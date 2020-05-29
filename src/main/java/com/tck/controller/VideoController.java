package com.tck.controller;

import com.tck.model.MediaObject;
import com.tck.model.VideoGrabber;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class VideoController {

    private VideoGrabber videoGrabber;

    @GetMapping("video")
    public String video (@ModelAttribute ("video")MediaObject mediaObject){
        return "video";
    }

    @PostMapping("video")
    public String getVideo(@Valid @ModelAttribute("url") MediaObject mediaObject, BindingResult result){
        videoGrabber = new VideoGrabber();
        videoGrabber.run(mediaObject.getUrl(),"--format mp4");
        return "redirect:video";
    }
}
