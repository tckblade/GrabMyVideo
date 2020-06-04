package com.tck.controller;

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
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class VideoController {

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

        //Authorized user will download the file
        String dataDirectory = request.getServletContext().getRealPath("/WEB-INF/downloads/video/");
        String tempFileName = "Tinie Tempah - Not Letting Go ft. Jess Glynne (XYconstant Remix).mp4";
        Path file = Paths.get(dataDirectory, tempFileName);
        if (Files.exists(file))
        {
                response.setContentType("application/video");
                response.addHeader("Content-Disposition", "attachment; filename=" + tempFileName);
                try {
                    Files.copy(file, response.getOutputStream());
                    response.getOutputStream().flush();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        return "video";
    }
}
