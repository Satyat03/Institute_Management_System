<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            text-align: center;
            background: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 300px;
        }
        h1 {
            color: #333333;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin: 10px 0 5px;
            color: #555555;
        }
        input {
            padding: 8px;
            margin-bottom: 15px;
            border: 1px solid #cccccc;
            border-radius: 5px;
        }
        button {
            padding: 10px;
            color: #ffffff;
            background-color: #007BFF;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
        <h1>Enter Data</h1>
        <form action="save">
            <label for="student-name">Student Name</label>
            <input type="text" name="sname" >
            
            <label for="batch-name">Batch Name</label>
            <input type="text" name="batch.bname">

            <label for="faculty-name">Faculty Name</label>
            <input type="text" name="batch.faculty.fname" >

            <label for="course-name">Course Name</label>
            <input type="text" name="batch.faculty.course.cname">

            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>