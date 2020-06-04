package com.tck.controller;

import com.tck.model.MediaObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class DownloadController {
    @GetMapping("download")
    public void download (HttpServletRequest request,
                          HttpServletResponse response,
                          @PathVariable("fileName") String fileName){
        //If user is not authorized - he should be thrown out from here itself

        //Authorized user will download the file
        String dataDirectory = request.getServletContext().getRealPath("/WEB-INF/downloads/video/");
        File[] files = new File(dataDirectory).listFiles();
        for (File file : files) {
            if (file.isFile()) {
                fileName = file.getName();
                response.setContentType("application/video");
                response.addHeader("Content-Disposition", "attachment; filename=" + fileName);
                try {
                    response.getOutputStream().flush();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
