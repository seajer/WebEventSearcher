<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EventSearcher Home</title>
</head>
<body>

 <!-- <div class="dropdown">
  <button onclick="myFunction()" class="dropbtn">Look for Events</button>
  <div id="myDropdown" class="dropdown-content">
    <a href="showAllEvents">Show All Events</a>
  </div>
  </div> -->
  
  
  <div class="dropdown">
  <button onclick="myFunction()" class="dropbtn">Look for Types</button>
  <div id="myDropdown" class="dropdown-content">
    <a href="showAllEventTypes">Show All Types</a>
  </div>
  </div>
  
 <!--   <div class="dropdown">
  <button onclick="myFunction()" class="dropbtn">Look for locations</button>
  <div id="myDropdown" class="dropdown-content">
    <a href="showAllEventLocations">Show All Locations</a>
  </div>
  </div> -->
  

<script>

function myFunction() {
    document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {

    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>

</body>
</html>