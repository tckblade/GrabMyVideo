package com.tck.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class DownloadRequest {

    public void downloadUserFiles(HttpServletRequest request, HttpServletResponse response, String fileType) {

        //Authorized user will download the file
        String dataDirectory = request.getServletContext().getRealPath("/WEB-INF/downloads/" + fileType + "/");
        File[] filesToDownload = new File(dataDirectory).listFiles();
        assert filesToDownload != null;
        for (File file : filesToDownload) {
            Path filePath = Paths.get(dataDirectory, file.getName());
            if (Files.exists(filePath)) {
                response.setContentType("application/" + fileType);
                response.addHeader("Content-Disposition", "attachment; filename=" + file.getName());
                try {
                    Files.copy(filePath, response.getOutputStream());
                    response.getOutputStream().flush();
                    Files.deleteIfExists(filePath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
