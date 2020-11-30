<%@page import="bean.LichSuMuaHangbean"%>
<%@page import="bean.giohangbean"%>
<%@page import="bo.giohangbo"%>
<%@page import="bean.loaisachbean"%>
<%@page import="bo.loaisachbo"%>
<%@page import="java.security.spec.DSAGenParameterSpec"%>
<%@page import="bean.sachbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.sachbo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<!DOCTYPE html>
<html>
<head>
<title>Book Store</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
<style >
.side-link:hover{
    border-radius:5px ;
    background-color: rgb(82, 76, 76);
}
</style>
</head>
<body class="sb-nav-fixed">
	<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
		<a class="navbar-brand" href="SachController"><h3>MINH KHAI</h3></a>
<!-- 		<button class="btn btn-link btn-sm order-1 order-lg-0" -->
<!-- 			id="sidebarToggle" href="SachController"> -->
<!-- 			<i class="fas fa-bars"></i> -->
<!-- 		</button> -->
		<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
			<li class="nav-item active"><a class="nav-link"
				href="SachController">TRANG CHỦ </a></li>
			<li class="nav-item"><a class="nav-link" href="giosach.jsp">GIỎ
					HÀNG</a></li>
<!-- 			<li class="nav-item"><a class="nav-link" href="#">THANH TOÁN</a></li> -->
<!-- 			<li class="nav-item"><a class="nav-link" href="#">LỊCH SỬ -->
<!-- 					MUA HÀNG</a></li> -->

		</ul>
		<!-- Navbar Search-->
		<form
			class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0"
			method="post">
			<div class="input-group">
				<input class="form-control" name="txttk" type="text"
					placeholder="Search for..." aria-label="Search"
					aria-describedby="basic-addon2" />
				<div class="input-group-append">
					<button class="btn btn-primary" type="submit">
						<i class="fas fa-search"></i>
					</button>
				</div>
			</div>
		</form>
		<!-- Navbar-->
		<ul class="navbar-nav ml-auto ml-md-0">
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" id="userDropdown" href="#"
				role="button" data-toggle="dropdown"><i
					class="fas fa-user fa-fw"></i></a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="userDropdown">
					<%if (session.getAttribute("un") == null) { %>
					<a class="dropdown-item" href="Login.jsp">Đăng nhập</a>
					<a class="dropdown-item" href="Register.jsp">Đăng ký</a>
					<%} else {%>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item text-primary" href="#"> <%=session.getAttribute("un")%></a>
					<a class="dropdown-item" href="LogoutServlet">Đăng xuất</a>
					<%} %>
				</div></li>
		</ul>
	</nav>

	<!--Hết Phan Nav -->

	<div class="container-fluid">
		<div class="row">
			<div class="col-xl-10 col-lg-9 col-md-8 sidebar ">
					<div class="row">
						<div class="col-xl-10 col-lg-9 col-md-3 fixed-top"
							style="margin-top: 80px;">
							<h1>Lịch Sử Mua Hàng</h1>

							<table class="table table-hover table-border">
								<tr>
									<td>Sản phẩm</td>
									<td>Ngày đặt hàng</td>
									<td>Số Lượng</td>
									<td>Thành tiền</td>
								</tr>

								<%
									ArrayList<LichSuMuaHangbean> ds;
								if (session.getAttribute("un") != null) {
									ds = (ArrayList<LichSuMuaHangbean>) request.getAttribute("lsmuahang");
									int n = ds.size();
									for (int i = 0; i < n; i++) {
								%>

								<%
									LichSuMuaHangbean dd = ds.get(i);
								%>
								<tr>
									<td><img src="<%=dd.getAnh()%>" alt="" width="80px"
										height=auto><%=dd.getTensach()%></td>
									<td><%=dd.getNgaymua()%></td>
									<td><%=dd.getSoluongmua()%></td>
									<td><%=dd.getSoluongmua() * dd.getGia()%></td>
								</tr>
								<%}}%>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>
















