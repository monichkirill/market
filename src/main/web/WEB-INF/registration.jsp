<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h2>Registration</h2>
<form action="registration" method="POST">
    <label for="firstname">First name:</label>
    <input type="text" id="firstname" name="firstname" required>

    <label for="secondName">Second name:</label>
    <input type="text" id="secondName" name="secondName" required>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age" required>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>

    <label for="sex">Sex:</label>
    <input type="text" id="sex" name="sex" required>

    <label for="telephoneNumber">Telephone number:</label>
    <input type="text" id="telephoneNumber" name="telephoneNumber" required>

    <label for="login">Login:</label>
    <input type="text" id="login" name="login" required>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>

    <input type="submit" value="Registration">
</form>
</body>
</html>