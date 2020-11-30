
<%@page import="bo.giohangbo"%>
<%@page import="bean.giohangbean"%>
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
	String ms = request.getParameter("ms");
	String sltam = request.getParameter("txtsl");
	if(ms!=null){
		giohangbo gh=(giohangbo)session.getAttribute("gh");
		gh.Them(ms,"",0,Integer.parseInt(sltam));
		session.setAttribute("gh", gh);
		response.sendRedirect("giosach.jsp");
	}
%>
</body>
</html>