<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Student</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4faff;
            text-align: center;
            padding: 50px;
        }

        form {
            display: inline-block;
            padding: 30px;
            background-color: #ffffff;
            border: 2px solid #ddd;
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            text-align: left;
            margin: 15px 0 5px 0;
            font-weight: bold;
        }

        input[type="text"] {
            width: 250px;
            padding: 10px;
            margin-bottom: 20px;
            border-radius: 8px;
            border: 1px solid #aaa;
        }

        button {
            padding: 12px 24px;
            background-color: #3498db;
            color: white;
            border: none;
            border-radius: 10px;
            font-size: 16px;
            cursor: pointer;
        }

        button:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <h1>Edit Student</h1>

    <form action="/update" method="post">
        <input type="hidden" name="id" value="${student.id}" />

        <label for="name">Name:</label>
        <input type="text" name="name" value="${student.name}" required />

        <label for="grade">Grade:</label>
        <input type="text" name="grade" value="${student.grade}" required />

        <label for="department">Department:</label>
        <input type="text" name="department" value="${student.department}" required />

        <br>
        <button type="submit">Update</button>
    </form>
</body>
</html>
    