<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: diduk
  Date: 8/11/2024
  Time: 2:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Positions</title>
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

        table {
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

<h2>Positions</h2>

<form name="actionButton">
    <input type="button" value="Add"
           onclick="window.location.href = 'addNewPosition'"/>
</form>


<table>
    <tr>
        <th>ID</th>
        <th>Department Name</th>
        <th>Description</th>
        <th>Action</th>
    </tr>



    <c:forEach var="pos" items="${allPositions}">
        <c:url var="updateButton" value="/positions/updatePosition">
            <c:param name="posId" value="${pos.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/positions/deletePosition">
            <c:param name="posId" value="${pos.id}"/>
        </c:url>


        <tr>
            <td>${pos.id}</td>
            <td>${pos.positionName}</td>
            <td>${pos.description}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href = '${updateButton}'"/>

                <input type="button" value="Delete"
                       onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
