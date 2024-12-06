<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Page</title>
</head>
<body>
    <h1>Submit Your Data</h1>
    <form action="/display" method="post">
        <label for="fn">First Name:</label>
        <input type="text" id="fn" name="fn" required>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
