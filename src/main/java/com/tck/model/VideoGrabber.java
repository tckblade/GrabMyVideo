package com.tck.model;

import java.io.PrintWriter;

public class VideoGrabber {

    public void run(String url, String format){

        String downloadPath = "C:\\YoutubeMP3";
        String downloadLocation = "C:\\YoutubeMP3\\Music";
        String convertToMP3 = "-x --audio-format mp3 ";
        url = "https://twitter.com/Twitter/status/1260294888811347969";
        String[] command =
                {
                        "cmd",
                };
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
            new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
            PrintWriter stdin = new PrintWriter(p.getOutputStream());
            stdin.println("cd \"" + downloadLocation + "\"");
            stdin.println(downloadPath + "\\youtube-dl " + convertToMP3 + url);
            stdin.close();
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
