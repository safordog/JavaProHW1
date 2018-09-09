<%--
  Created by IntelliJ IDEA.
  User: safordog
  Date: 08.09.18
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>questionnaire</title>
    <link rel="stylesheet" href="styles.css">
  </head>
  <body>
    <header>
      <h1>QUESTIONNAIRE</h1>
    </header>
    <fieldset>
      <form action="send" method="POST">
        <h2>Introduse yourself:</h2>
        <p>Input your name:<input type="text" name="name" placeholder="name"></p>
        <p>Input your surname:<input type="text" name="surname" placeholder="surname"></p>
        <p>Input your age:<input type="text" name="age" placeholder="age"></p>
        <h2>Answer the questions:</h2>
        <b>"Java" it is:</b><br>
        <input type="radio" name="Java" value="programming language">programming language<br>
        <input type="radio" name="Java" value="motobike">motobike<br>
        <b>Do you want to be a programmer?:</b><br>
        <input type="radio" name="Programmer" value="yes">yes<br>
        <input type="radio" name="Programmer" value="no">no<br>
        <p><input type="submit" value="send" name="submit"></p>
      </form>
    </fieldset>
    <footer>
      <p>Thanks for your answers</p>
    </footer>
  </body>
</html>
