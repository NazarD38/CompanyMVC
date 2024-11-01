<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Projects</title>
    <style>
        body {
            background-color: #ffe6e6;
            font-family: 'Arial', sans-serif; 
        }

        h2 {
            text-align: center;
            color: #333333; /* Темно-серый цвет текста */
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
<h2>Projects</h2>

<form name="actionButton">
    <input type="button" value="Add"
           onclick="window.location.href = 'addNewProject'"/>
</form>

<table>
    <tr>
        <th>ID</th>
        <th>Project Name</th>
        <th>Description</th>
        <th>Start-Date</th>
        <th>End-Date</th>
        <th>Action</th>
    </tr>

    <c:forEach var="project" items="${allProjects}">
        <c:url var="updateButton" value="/projects/updateProject">
            <c:param name="projectId" value="${project.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/projects/deleteProject">
            <c:param name="projectId" value="${project.id}"/>
        </c:url>

        <tr>
            <td>${project.id}</td>
            <td>${project.projectName}</td>
            <td>${project.description}</td>
            <td>${project.startDate}</td>
            <td>${project.endDate}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="Delete" onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
