<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4faff;
            text-align: center;
            padding: 50px;
        }

        h1 {
            color: #2c3e50;
            font-size: 32px;
            margin-bottom: 30px;
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
            color: #333;
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
            margin: 10px;
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

        .view-button {
            background-color: #2ecc71;
        }

        .view-button:hover {
            background-color: #27ae60;
        }
    </style>
</head>
<body>
    <h1>Student Registration Form</h1>

    <form method="post" action="submit">
        <label for="name">Name:</label>
        <input type="text" name="name" required />

        <label for="grade">Grade:</label>
        <input type="text" name="grade" required />
        
        <label for="department">Department:</label>
        <input type="text" name="department" required />

        <br>
        <!-- Submit Button -->
        <button type="submit">Submit</button>

        <!-- View Students Button -->
        <a href="/students">
            <button type="button" class="view-button">View Students</button>
        </a>
    </form>
</body>
</html>
