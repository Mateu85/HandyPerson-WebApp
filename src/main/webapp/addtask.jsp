<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>

<body>
<script type="text/javascript">
        $(document).ready(function() {
            $("form").on("submit", function(event) {
                event.preventDefault();
                var formValue = $(this).serialize();
                $.post("addtask", formValue, function(data) {
                    $("#result").html(data);
                });
            });
        });
    </script>

<div class="container w-50">

<form action="addtask" method="post">
<h2>Register a new assignment into the platform</h2></br>

 <div class="input-group input-group-lg mb-3">
   <div class="input-group-prepend">
     <span class="input-group-text" id="inputGroup-sizing-lg">Title</span>
   </div>
   <input name="title" id="title" type="text" class="form-control" aria-label="Large" aria-describedby="inputGroup-sizing-sm">
 </div>


  <div class="input-group input-group-lg mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text" id="inputGroup-sizing-lg">Description</span>
    </div>
    <input name="description" id="description" type="text" class="form-control" aria-label="Large" aria-describedby="inputGroup-sizing-sm">
  </div>

  <div class="input-group input-group-lg mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text" id="inputGroup-sizing-lg">Location</span>
    </div>
    <input name="location" id="location" type="text" class="form-control" aria-label="Large" aria-describedby="inputGroup-sizing-sm">
  </div>


  <div class="input-group input-group-lg mb-3">
      <button type="submit" value="Register" class="btn btn-secondary btn-lg">ADD</button>
    </div>


</form>

<div id="result"></div>

	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>