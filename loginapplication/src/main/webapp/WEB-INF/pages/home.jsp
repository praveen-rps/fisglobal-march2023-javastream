<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
       <form action="/loginapplication/test">
       
       Enter login id <input type="text" name="lid" /><br>
       Enter password <input type="password" name="pwd" /><br>
       <input type="submit" value="Login" />
      
       </form>
    </body>
</html>
