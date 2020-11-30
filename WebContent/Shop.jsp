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
<link href="styles.css" rel="stylesheet" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">
<style>
.side-link:hover {
	border-radius: 5px;
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
		<ul class="col-sm-4 col-lg-4 col-md-4 navbar-nav mr-auto mt-2 mt-lg-0">
			<li class="nav-item active"><a class="nav-link"
				href="SachController">TRANG CHỦ </a></li>
			<li class="nav-item"><a class="nav-link" href="Giohangforward">GIỎ
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
					<a class="dropdown-item" href="LichSuMuaHangServlet">Lịch sử mua hàng</a>
					<a class="dropdown-item" href="LogoutServlet" onclick="showMessage()">Đăng xuất</a>
					<%} %>
				</div></li>
		</ul>
	</nav>

	<!-- In ra phan loai sách -->

	<div class="container-fluid">
		<div class="row">
			<div class="col-xl-2 col-lg-9 col-md-8 sidebar "
				id="sidenavAccordion"
				style="margin-top: 50px; background: #848484;">
				<%
					ArrayList<loaisachbean> dsloai = (ArrayList<loaisachbean>) request.getAttribute("lstLoai");
				%>
				<%
					for (loaisachbean i : dsloai) {
				%>
				<tr>
					<td>
						<ul class="navbar-nav flex-column mt-3 ">
							<li class="nav-item side-link " style="transition: all .4s;"><a
								class="nav-link text-white text-center"
								href='SachController?ml=<%=i.getMaloai()%>'> <%=i.getTenloai()%>
							</a></li>
						</ul>
					</td>
				</tr>
				<%
					}
				%>

			</div>

			<!-- Show content -->
			<!-- Phần này in ra sách -->
			<div class="col-xl-10 col-lg-9 col-md-8 ml-auto ">
				<div class="row py-4 " style="margin-top: 40px;">
					<%
						ArrayList<sachbean> ds;
					if (request.getAttribute("lstSach") != null) {
						ds = (ArrayList<sachbean>) request.getAttribute("lstSach");
					} else if (request.getAttribute("lstma") != null) {
						ds = (ArrayList<sachbean>) request.getAttribute("lstma");
					} else{
						ds = (ArrayList<sachbean>) request.getAttribute("lsttk");}
					%>
					<%for (sachbean i : ds) {
					%>
					<div class="col-md-3 col-sm-6 my-3 my-md-0">
<!-- 						<form action="servlet/giohangbo" method="post"> -->
							<div class="card mt-1"
								style="position: relative; text-align: center; width: 300px; height: 370px">
								<div>
									<img src="<%=i.getAnh()%>" alt="Image1" class=""
										style="width: 60%; height: 225px; margin-top:5px">
									<div class="">
										<input type="hidden" name="namebook"
											value="<%=i.getTensach()%>">
										<h5 class="card-title"><%=i.getTensach()%></h5>

										<h5>
											<span class="price">$<%=i.getGia()%></span>
										</h5>
										<a
											href="Giohangforward?ms=<%=i.getMasach()%>&ts=<%=i.getTensach()%>&gia=<%=i.getGia()%>"><img
											src="image_sach/buynow.jpg"> </a>
									</div>
								</div>

							</div>

<!-- 						</form> -->
					</div>
					<%
						}
					%>
				</div>
			</div>
		</div>
	</div>

	<!-- Hết pahanf in sách -->
<!-- Footer -->
<footer class="page-footer font-small " style="background-color:#7D7877;">

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3">© 2020 Copyright:
    <a href="https://mdbootstrap.com/" class="text-dark"> NhaSachMinhKhai.com</a>
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer -->
<script>
			function showMessage(){
				if(confirm("BẠN MUỐN ĐĂNG XUẤT ?")){
					
				}else{
					event.preventDefault();
				}
			
			}
		</script>
	<script src="//code.jquery.com/jquery.js"></script>
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"
		crossorigin="anonymous"></script>
	<script src="scripts.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
		crossorigin="anonymous"></script>
	<script src="assets/demo/chart-area-demo.js"></script>
	<script src="assets/demo/chart-bar-demo.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"
		crossorigin="anonymous"></script>

</body>


</html>