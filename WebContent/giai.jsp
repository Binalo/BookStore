<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action ="TestController">
      a=<input type="number" name="txta" placehoder="Nhap a" value ="<%=request.getAttribute("a")%>">
      <br>
      b=<input type="number" name="txtb" placehoder="Nhap b" value ="<%=request.getAttribute("b")%>">
      <br>
      kq=<input type="number" name="txtkq"  value ="<%=request.getAttribute("kq")%>">
      <br>
        <input type="submit" name="txtcong"  value ="+">
        <input type="submit" name="txttru"  value ="-">
        <input type="submit" name="txtnhan"  value ="*">
        <input type="submit" name="txtchia"  value ="/">
        
</form>     




</body>
</html>