<%--
  Created by IntelliJ IDEA.
  User: diduk
  Date: 8/12/2024
  Time: 4:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Employee-Info</title>
    <style>
        body {
            background-color: #ffe6e6; 
            font-family: 'Arial', sans-serif; 
        }

        h2 {
            text-align: center;
            color: #333333; 
            font-family: 'Georgia', serif; 
            font-size: 28px;
        }

        form {
            margin: 0 auto; 
            border-collapse: collapse;
            width: 80%;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); 
        }

        th, td {
            border: 1px solid #cccccc; 
            padding: 12px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2; 
            font-size: 18px;
        }

        td {
            background-color: #ffffff; 
        }

        input[type="button"] {
            padding: 6px 12px;
            background-color: #ff6666; 
            color: white;
            border: none;
            cursor: pointer;
            border-radius: 4px;
            font-size: 14px;
        }

        input[type="button"]:hover {
            background-color: #ff3333;
        }
    </style>
</head>
<body>
<h2>EmPloyee-Info</h2>


<%--@elvariable id="employee" type="java"--%>
<form:form action="saveEmployee" modelAttribute="employee">

    Name
    <form:input path="name"/>
    <br><br>

    Surname
    <form:input path="surname"/>
    <br><br>
    Position
    <form:input path="position.positionName"/>
    <br><br>

    Department
    <form:input path="department.name"/>
    <br><br>

    <input type="submit" value="OK"/>
</form:form>

</body>
</html>
