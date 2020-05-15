<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wrapper class</title>
</head>
<body>
<%int id=5;
float price=6.5f;
String name="kamal";
Integer i=id;
Float f=price;
Object o[]={name,id,price};
for(int j=0;j<o.length;j++)
{
	out.println("<br>"+o[j]);
}
%>

</body>
</html>