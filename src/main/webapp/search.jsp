<html>
<head>
      <!-- Required meta tags -->
       <meta charset="utf-8">
       <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

       <!-- Bootstrap CSS -->
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

   <%@ include file="header.jsp"%>
</head>
<body>
    <script type="text/javascript">
        $(document).ready(function() {
            $("form").on("submit", function(event) {
                event.preventDefault();
                var formValue = $(this).serialize();
                $.post("search-tasks", formValue, function(data) {
                    $("#result").html(data);
                });
            });
        });
    </script>
    <div class="container W-50">
        <h2>Search</h2>
        <form>
            <div class="mb-2">
                <label for="searchtext" class="form-label">Search Task by Title</label>
                <input name="searchtext" type="text" class="form-control w-25" id="searchtext">
            </div>
            <button type="submit" class="btn btn-primary">Search</button>
        </form>
        <div id="result"></div>
    </div>
</body>
</html>
