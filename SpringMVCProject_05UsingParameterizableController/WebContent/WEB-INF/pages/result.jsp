<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Wish Msg</title>
    
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/jumbotron-narrow.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <script src="css/ie-emulation-modes-warning.js"></script>
  </head>

  <body>
<br>
    <div class="container">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation"><a href="home.htm">Home</a></li>
            <li role="presentation"><a href="about.htm">About</a></li>
            <li role="presentation"><a href="contact.htm">Contact</a></li>
          </ul>
        </nav>
        <h3 class="text-muted">WishPage</h3>
      </div>
      <div class="jumbotron">
        <h3 style="color:fuchsia;">Message :</h3>
        <h2 class="lead" style="color:blue;"><span style="color: lime;">Wish Message Is :</span> ${wmsg}</h2>
        <p><a class="btn btn-lg btn-success" href="home.htm" role="button">Back to Home</a></p>
      </div>
      <footer class="footer">
        <p>design By : Chetan&copy;2014</p>
      </footer>
    </div>
  </body>
</html>
