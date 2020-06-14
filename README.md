# GrabMyVideo

GrabMyVideo is a frontend web application using Spring framework for the Youtube-DL which is a command-line program to download videos from YouTube.com and a few other sites. Once step-up the user should copy a Youtube videos link, go to http://localhost:8080/GrabMyVideo and select video, then paste in the link and press the go button. The server side operations 

This project was created in Intellij v2020.01.01.

# Prereqiusit for setting up this project.
Download Tomcat v9 Core (or latest version) as Zip file and extract after downloading.
https://tomcat.apache.org/download-90.cgi

Install Smart Tomcat plugin in Intellij by going to:
File > Setting > Plugins > press + > search "Smart Tomcat" > install.

Go to settings and select "Tomcat server".
copy and paste the directory of the Tomcat core you downloaded and press apply

If in the right top of your Intellij IDE you see Tomcat Server, This means you don't need to follow the rest of the prereqiusit instructions. Press the run button to start Tomcat Server.

General Usage Instructions for setting up Tomcat server in Intellij
1.
Open Edit Run/Debug, click edit confirguation and choose SmartTomcat from the option in "Templates".
2.
Config the run/debug as stated below
Tomcat Server : config or choose tomcat server
Deployment Directory : choose the webapp folder, e.g. "C:/Users/.../src/main/webapp/"
Context Path : input the contextPath, e.g. "/GrabMyVideo"
Server Port : input the server port, e.g. "8080"
VM Options : input the vm options, e.g. "-DENV=DEV"
3.
start run/debug
enjoy it~


# Documentation
Youtube-DL website:
http://ytdl-org.github.io/youtube-dl/

Youtube-DL documentation:
https://github.com/ytdl-org/youtube-dl/blob/master/README.md#readme


