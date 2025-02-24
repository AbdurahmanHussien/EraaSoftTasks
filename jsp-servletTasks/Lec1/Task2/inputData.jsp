<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task2</title>
</head>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 20px;
}

form {
    background: white;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    width: 300px;
    margin: auto;
}

input[type="text"], 
input[type="password"], 
select {
    width: 100%;
    padding: 8px;
    margin: 8px 0 15px;
    border: 1px solid #ccc;
    border-radius: 4px;
}

input[type="radio"] {
    margin-right: 5px;
}

label {
    font-weight: bold;
}

br {
    display: none;
}

input[type="submit"] {
    background-color: #007BFF;
    color: #fff;
    border: none;
    padding: 10px;
    width: 100%;
    border-radius: 4px;
    cursor: pointer;
    font-size: 16px;
    margin-top: 10px;
}

input[type="submit"]:hover {
    background-color: #0056b3;
}



</style>
<body>
<form action="PrintData.jsp" method= "post" >
  		Full name : <input type = "text" name = "f_name">
  		<br><br>
    	Password : <input type = "password" name = "password">
    	<br><br>
    	
    	Age : <input type = "text" name = "age">
    	<br><br>
    	
    	Address  : <br><br>
    		<input type = "radio" name =address value="cairo" > Cairo
    		<input type = "radio" name =address value="alex" > Alex
    		<input type = "radio" name =address value="menofia" > Menofia
    		
    	<br><br>
    	Address  : <br><br>
    		<select name="Address">
			<option value="cairo">Cairo</option>
			<option value="Alex">Alex</option>
			<option value="menofia">Menofia</option>
		</select>

		<br><br>
  		 <input type = "Submit" Value = "Submit">

     

</form>
</body>
</html>