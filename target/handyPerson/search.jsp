<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
