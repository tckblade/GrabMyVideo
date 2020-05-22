<!DOCTYPE html>
<html lang="en">
<title>GrabMyVideo</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
        <h1>Get the link, Paste it in & wait for the magic!</h1>

        <div class="w3-padding-32">
            <div class="w3-bar w3-border">
                <div class="w3-container">
                    <h2>With a Container</h2>
                    <hr>
                            <form action="/action_page.php" target="_blank">
                              <div class="w3-row-padding" style="margin:0 -16px 8px -16px">
                                <div class="w3-half">
                                  <input class="w3-input w3-border" type="text" placeholder="URL" required name="Paste Link Here...">
                                </div>
                                <div class="w3-dropdown-click">
                                                        <button onclick="myFunction()" class="w3-button w3-black">Click me</button>
                                                        <div id="Demo" class="w3-dropdown-content w3-bar-block w3-card-4 w3-animate-zoom">
                                                          <a href="#" class="w3-bar-item w3-button">MP4</a>
                                                        </div>
                                                      </div>
                              </div>
                              <input class="w3-input w3-border" type="text" placeholder="Message" required name="Message">
                              <button class="w3-button w3-black w3-section w3-right" type="submit">SEND</button>
                            </form>
                    <p>The w3-container class is one of the most important W3.CSS classes.</p>
                    <p>It provides correct margins, padding, alignments, and more, to most HTML elements.</p>
                </div>
                <div class="w3-container w3-teal">

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
    <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank" class="w3-hover-text-green">w3.css</a>
    </p>
</footer>
<script>
function myFunction() {
  var x = document.getElementById("Demo");
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
  } else {
    x.className = x.className.replace(" w3-show", "");
  }
}
</script>
</body>
</html>
