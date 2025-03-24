<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task1</title>
</head>
<body>
 <%! 
  int id= 5;
  String name ="Abdurhaman";

 
 String concatination(int id , String name){
	 
	 return id+ " " + name;}
 
	%>  
 <p>Your data is : <b> <%= concatination(id,name) %> </b></p>
</body>
</html>