<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">
<title>Video</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<style>
body,h1 {font-family: "Raleway", Arial, sans-serif}
h1 {letter-spacing: 6px}
.w3-row-padding img {margin-bottom: 12px}
</style>
<body>

<!-- !PAGE CONTENT! -->
<div class="w3-content" style="max-width:1500px">

    <!-- Header -->
    <header class="w3-panel w3-center w3-opacity" style="padding:128px 16px">
        <h1 class="w3-xlarge">GrabMyVideo</h1>
        <h1>Get link, Paste it & Press go!</h1>
        <div class="w3-padding-32">
            <div class="w3-bar w3-border">
                <div class="w3-container" style="width:300px">
                    <h2>Download as MP4</h2>
                    <hr>
                      <form:form method="POST" modelAttribute="video">
                        <div class="w3-row-padding" style="margin:0 -16px 8px -16px">
                                <form:input path="url" cssClass="w3-input w3-border" type="text" placeholder="Paste Link Here..."/>
                                <button class="w3-button w3-black w3-section"  type="submit" onclick="document.getElementById('id01').style.display='block'">Go</button>
                                <div id="id01" class="w3-panel w3-blue w3-display-container" style="display:none">
                                  <span onclick="this.parentElement.style.display='none'"
                                  class="w3-button w3-blue w3-display-topright">x</span>
                                  <p>Please wait while processing.</p>
                                </div>
                        </div>
                      </form:form>
                </div>
            </div>
        </div>
    </header>
</div>

<!-- End Page Content -->


<!-- Footer -->
<footer class="w3-container w3-padding-64 w3-light-grey w3-center w3-large">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
    <p>Created by Tolga Komur</p>
</footer>
</body>
</html>
