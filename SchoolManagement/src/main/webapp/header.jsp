<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
        String uname=null;
    String sessionId=null;
    if(session.getAttribute("username")==null)
    	response.sendRedirect("Adminlogin.jsp");
    String username=(String)session.getAttribute("username");
    Cookie[] cookies =request.getCookies();
	if(cookies !=null) {
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("uname"))
				uname=cookie.getValue();
			if(cookie.getName().equals("JSESSIONID"))
				sessionId=cookie.getValue();
			}
		}
        %>
        <h2>welcome</h2>
        <form action="ClassServlet" method="GET">
        <input type="submit" value="Class"></form>
        <form action="StudentServlet" method="GET">
        <input type="submit" value="Student"></form>
        <form action="SubjectServlet" method="GET">
        <input type="submit" value="Subject"></form>
        <form action="TeacherServlet" method="GET">
        <input type="submit" value="Teacher"></form>
        <form action="LogoutServlet" method="GET">
        <input type="submit" value="Logout"></form>
           
        
</body>
</html>