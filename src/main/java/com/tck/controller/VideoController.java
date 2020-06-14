package com.tck.controller;

import com.tck.model.DownloadRequest;
import com.tck.model.MediaObject;
import com.tck.model.VideoGrabber;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class VideoController extends DownloadRequest {

    private VideoGrabber videoGrabber;

    @GetMapping("video")
    public String video (@ModelAttribute ("video")MediaObject mediaObject){
        return "video";
    }

    @PostMapping("video")
    public String getVideo(@Valid @ModelAttribute("url") MediaObject mediaObject, BindingResult result,
                           HttpServletRequest request, HttpServletResponse response){
        videoGrabber = new VideoGrabber();
        videoGrabber.run(mediaObject.getUrl(),"--format mp4 -o %(title)s.%(ext)s");
        downloadUserFiles(request,response,"video");
        return "redirect:video";
    }
}
