<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    
    <title>Employee Form</title>
    
</head>
<body>

    <h2>Employee Form</h2>
    
    <form action="save" method="post">
        <input type="hidden" name="id" value="${employee.id}" />
        
        <label for="name">Name:</label>

        <input type="text" name="name" value="${employee.name}" /><br/>
        
        <label for="department">Department:</label>
       <input type="text" name="department" value="${employee.department}" /><br/>
       
        <label for="salary">Salary:</label>
        <input type="text" name="salary" value="${employee.salary}" /><br/>
       
        <input type="submit" value="Save" />
    </form>
    
</body>
</html>