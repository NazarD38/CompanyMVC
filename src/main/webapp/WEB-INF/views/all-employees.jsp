<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employees</title>
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
<h2>Employee</h2>

<form name="actionButton">
    <input type="button" value="Add"
           onclick="window.location.href = 'addNewEmployee'"/>
</form>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Position</th>
        <th>Department</th>
        <th>Action</th>
    </tr>

    <c:forEach var="emp" items="${allEmployees}">
        <c:url var="updateButton" value="/employees/updateEmployee">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/employees/deleteEmployee">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.position.positionName}</td>
            <td>${emp.department.name}</td>

            <td>
                <input type="button" value="Update" onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="Delete" onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
