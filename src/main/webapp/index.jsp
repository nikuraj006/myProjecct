<html>
<body>
<h2>Hello World!</h2>
<head>
 <script src="js/api.js" async defer></script>
<script type="text/javascript">
       var widgetId1;
      var verifyCallback = function(response) {
        alert(response);
        if(response!=null){
             return true;
        }else{
            return false;
        }
      };
      </script>
</head>
<form action="/test" method="post" onclick="javascript:alert(grecaptcha.getResponse(widgetId1));">
<input type="text"name="name"/>
<div class="g-recaptcha" data-sitekey="6LfQWkoUAAAAALFRh4NiMKkvB5lNv46tpljQvFAj"></div>
 <br/>
<input type="submit">
</form>

</body>
</html>
