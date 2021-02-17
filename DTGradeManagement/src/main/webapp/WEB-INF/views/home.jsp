<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="kr">

<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<title>메타넷 대우정보</title>
<link href="resources/css/styles.css" rel="stylesheet" />
<link
	href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css"
	rel="stylesheet" crossorigin="anonymous" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"
	crossorigin="anonymous"></script>
</head>

<body>
	<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
		<a class="navbar-brand" href="#">메타넷 대우정보</a>
	
		<form
			class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">

		</form>
		<!-- Navbar-->
		<ul class="navbar-nav ml-auto ml-md-0">
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" id="userDropdown" href="#"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="userDropdown">
					<a class="dropdown-item" href="#">설정</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">로그인</a>
				</div></li>
		</ul>
	</nav>
	<main>
	 <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-5" style="margin-top:60px; margin-bottom:100px;">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header" style="background-color:#343a40; color:white;"><h3 class="text-center font-weight-light my-4">MDT</h3></div>
                                    <div class="card-body">
                                        <form action="loginAction" method="post">
                                        	<div class="form-groupd">
                                        		<input type="radio" name="who" value="p"> 교수 <input type="radio" name="who" value="s" checked="checked"> 학생 <br>
                                        	</div>
                                            <div class="form-group">
                                                <label class="small mb-1" for="inputEmailAddress">학번</label>
                                                <input name="id" class="form-control py-4" type="text" placeholder="ID" />
                                            </div>
                                            <div class="form-group">
                                                <label class="small mb-1" for="inputPassword">비밀번호</label>
                                                <input name="pw" class="form-control py-4" type="password" placeholder="PASSWORD" />
                                            </div>
                                     
                                            <div class="form-group d-flex align-items-center justify-content-between mt-4 mb-0">
                             
                                                <button id="btn-Yes" class="btn btn-lg btn-primary btn-block" style="background-color:#343a40; border-color:#343a40;" type="submit">로 그 인</button>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="card-footer text-center">
                                        <div class="small"><a href="#" style="color:black;">메타넷대우정보 수강신청</a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main> 
                  <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy;KIM BAEKJUN & LIM DAUN 2021</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>	
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		crossorigin="anonymous"></script>
	<script src="resources/js/scripts.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
		crossorigin="anonymous"></script>
	<script src="resources/assets/demo/chart-area-demo.js"></script>
	<script src="resources/assets/demo/chart-bar-demo.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"
		crossorigin="anonymous"></script>
	<script src="resources/assets/demo/datatables-demo.js"></script>
	
</body>
</html>