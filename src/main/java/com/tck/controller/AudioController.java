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
public class AudioController {

    private VideoGrabber videoGrabber;

    @GetMapping("audio")
    public String audio (@ModelAttribute("audio")MediaObject mediaObject){
        return "audio";
    }

    @PostMapping("audio")
    public String getVideo(@Valid @ModelAttribute("url") MediaObject mediaObject, BindingResult result){
        videoGrabber = new VideoGrabber();
        videoGrabber.run(mediaObject.getUrl(),"-x --audio-format mp3 -o '%(title)s.%(ext)s'");
        return "redirect:audio";
    }

}
