# GrabMyVideo

GrabMyVideo is a frontend web application using Spring framework for the Youtube-DL which is a command-line program to download videos from YouTube.com and a few other sites. Once downloaded, Tomcat step-up is completed and the server is run, go to http://localhost:8080/GrabMyVideo and select video, then paste in the link (for example a Youtube videos link) and press the go button. The server side operations takes care of grabbing the video file and returning it in the highest video quality available in MP4 format. If user wish for just the audio of the video then it will return MP3 file in the highest audio quality available.

This project was created in Intellij v2020.01.01.

# Prereqiusit for setting up this project.
Download Tomcat v9 Core (or latest version) as zip file & extract after downloading.
https://tomcat.apache.org/download-90.cgi

Download Youtube-DL.exe for your OS type & this also has prereqiusit, please read carefully. Move Youtube-DL.exe to src\main\webapp\WEB-INF\tool in project files.
http://ytdl-org.github.io/youtube-dl/download.html

Download FFMPEG as zip & extract after downloading. Go to ffmpeg-20200715-a54b367-win64-static\bin\ directory & move all files into src\main\webapp\WEB-INF\tool in project files. This makes sure that Youtube-DL grabs video and audio files 
https://ffmpeg.zeranoe.com/builds/

Setting up the Tomcat server:
Install Smart Tomcat plugin in Intellij by going to:
File > Setting > Plugins > press + > search "Smart Tomcat" > install.

Go to settings and select "Tomcat server".
Copy and paste the directory of the Tomcat core you downloaded perviously and press apply.

If in the right top of your Intellij IDE where the green play button is you see Tomcat Server, This means you don't need to follow the rest of the prereqiusit instructions. Press the run button to start Tomcat Server, go to http://localhost:8080/GrabMyVideo and enjoy it~

General Usage Instructions for setting up Tomcat server in Intellij IDE:
1. 
Open Edit Run/Debug, click edit confirguation and choose SmartTomcat from the option in "Templates".
2.
Config the run/debug as stated below.
Tomcat Server : config or choose tomcat server.
Deployment Directory : choose the webapp folder, e.g. "C:/Users/.../src/main/webapp/".
Context Path : input the contextPath, e.g. "/GrabMyVideo".
Server Port : input the server port, e.g. "8080".
VM Options : input the vm options, e.g. "-DENV=DEV".
3.
start run/debug.
enjoy it~


# Documentation
Youtube-DL website:
http://ytdl-org.github.io/youtube-dl/

Youtube-DL documentation:
https://github.com/ytdl-org/youtube-dl/blob/master/README.md#readme


