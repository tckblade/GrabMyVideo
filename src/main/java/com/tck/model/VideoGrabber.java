package com.tck.model;

import java.io.PrintWriter;

public class VideoGrabber {

    int exitState;
    public void run(String url, String format){

        String downloadPath = "C:\\Users\\Tolga\\Documents\\Projects\\Java\\GrabMyVideo\\src\\main\\webapp\\WEB-INF\\tool";
        String downloadLocation = "C:\\Users\\Tolga\\Documents\\Projects\\Java\\GrabMyVideo\\src\\main\\webapp\\WEB-INF\\downloads\\video";
        if(url == null)
        {
            format  = "-x --audio-format mp3 ";
            url = "https://twitter.com/Twitter/status/1260294888811347969";
        }

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
            stdin.println(downloadPath + "\\youtube-dl " + format +" "+ url);
            stdin.close();
            exitState = p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
