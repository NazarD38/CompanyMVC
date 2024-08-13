<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: diduk
  Date: 8/12/2024
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Department-Info</title>
    <style>
        body {
            background-color: #ffe6e6; /* Нежно-розовый фон */
            font-family: 'Arial', sans-serif; /* Стиль шрифта */
        }

        h2 {
            text-align: center;
            color: #333333; /* Темно-серый цвет текста */
            font-family: 'Georgia', serif; /* Красивый шрифт с засечками */
            font-size: 28px;
        }

        table {
            margin: 0 auto; /* Центрирование таблицы */
            border-collapse: collapse;
            width: 80%;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Легкая тень */
        }

        th, td {
            border: 1px solid #cccccc; /* Границы ячеек */
            padding: 12px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2; /* Немного более темный фон для заголовков */
            font-size: 18px;
        }

        td {
            background-color: #ffffff; /* Белый фон для ячеек таблицы */
        }

        input[type="button"] {
            padding: 6px 12px;
            background-color: #ff6666; /* Цвет фона кнопки */
            color: white;
            border: none;
            cursor: pointer;
            border-radius: 4px;
            font-size: 14px;
        }

        input[type="button"]:hover {
            background-color: #ff3333; /* Более темный красный при наведении */
        }
    </style>
</head>
<body>

<h2>Departments-Info</h2>

<%--@elvariable id="department" type="java"--%>
<form:form action="saveDepartment" modelAttribute="department">

    Name
    <form:input path="name"/>
    <br><br>

    Description
    <form:input path="description" style="width: 400px;"/>
    <br><br>


    <input type="submit" value="OK"/>
</form:form>

</body>
</html>
