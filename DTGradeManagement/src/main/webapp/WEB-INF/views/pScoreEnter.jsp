<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>메타넷 대우정보</title>
<link href="resources/css/styles.css" rel="stylesheet" />
<link
	href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css"
	rel="stylesheet" crossorigin="anonymous" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"
	crossorigin="anonymous"></script>
<style type="text/css">
.main-title {
	padding-top: 20px;
	padding-bottom: 20px;
	font-size: 30px;
}
.semester{padding-top:10px;padding-bottom:10px;}
.subInfo{padding-top:10px;padding-bottom:10px;}
.scoreSave{margin-top: 20px;}
.studentName{padding-top:10px;padding-bottom:10px;}
.middle{padding-top:10px;padding-bottom:10px;}
.report{padding-top:10px;padding-bottom:10px;}
.studentCode{padding-top:10px;padding-bottom:10px;}
.final{padding-top:10px;padding-bottom:10px;}
.attendence{padding-top:10px;padding-bottom:10px;}
.total-score{padding-top:10px;padding-bottom:10px;}

</style>
</head>
<body class="sb-nav-fixed">
	<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
		<a class="navbar-brand" href="index.html">메타넷 대우정보</a>
		<button class="btn btn-link btn-sm order-1 order-lg-0"
			id="sidebarToggle" href="#">
			<i class="fas fa-bars"></i>
		</button>
		<!-- Navbar Search-->
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
					<a class="dropdown-item" href="login.html">로그아웃</a>
				</div></li>
		</ul>
	</nav>
	<div id="layoutSidenav">
		<div id="layoutSidenav_nav">
			<nav class="sb-sidenav accordion sb-sidenav-dark"
				id="sidenavAccordion">
				<div class="sb-sidenav-menu">
					<div class="nav">
						<div class="sb-sidenav-menu-heading">학사정보</div>
						<a class="nav-link collapsed" href="#" data-toggle="collapse"
							data-target="#collapseLayouts" aria-expanded="false"
							aria-controls="collapseLayouts"> 과목등록
							<div class="sb-sidenav-collapse-arrow">
								<i class="fas fa-angle-down"></i>
							</div>
						</a>
						<div class="collapse" id="collapseLayouts"
							aria-labelledby="headingOne" data-parent="#sidenavAccordion">
							<nav class="sb-sidenav-menu-nested nav">
								<a class="nav-link" href="pSubjectRegister.html">과목등록</a>
							</nav>
						</div>
						<a class="nav-link collapsed" href="#" data-toggle="collapse"
							data-target="#collapsePages" aria-expanded="false"
							aria-controls="collapsePages"> 담당과목
							<div class="sb-sidenav-collapse-arrow">
								<i class="fas fa-angle-down"></i>
							</div>
						</a>
						<div class="collapse" id="collapsePages"
							aria-labelledby="headingTwo" data-parent="#sidenavAccordion">
							<nav class="sb-sidenav-menu-nested nav"
								id="sidenavAccordionPages">
								<a class="nav-link" href="pSubjectList.html"> 담당과목조회 </a> <a
									class="nav-link collapsed" href="pScoreEnter.html"> 성적입력 </a>

							</nav>
						</div>
						<div class="sb-sidenav-menu-heading">기타</div>
						<a class="nav-link" href="faq.html"> 자주 묻는 질문 </a>
					</div>
				</div>
				<div class="sb-sidenav-footer">
					<div class="small">2조 :</div>
					김백준, 임다운
				</div>
			</nav>
		</div>
		<div id="layoutSidenav_content">
			<main>
			<div class="container-fluid">
			<form action="./pScoreEnterAction">
			<input type="hidden" name="studentId" value="${student.studentId }">
			<input type="hidden" name="teachNo" value="${teachNo }">
				<div class="main-title">성적입력</div>
				<div class="semester">2021년 1학기</div>
				<div class="subInfo">| 과목코드: ${code } |</div>
				<div class="register-box row">
					<div class="col-4 subAttr">
						<div class="studentName">학생명  : ${student.name }</div>
						<div class="middle">중간고사 : <input type="text" name="middle"></div>
						<div class="report">과제   : <input type="text" name="report"></div>
					</div>
					<div class="col-4 subAttr">
						<div class="studentCode">학번 : ${student.studentId }</div>
						<div class="final">기말고사 : <input type="text" name="finals"></div>
						<div class="attendence">출석 : <input type="text" name="attend"></div>
					</div>
					<div class="col-4"></div>
				</div>
				<div class="scoreSave"><input type="submit" value="저장"></div>
			</form>
			</div>
			</main>
			<footer class="py-4 bg-light mt-auto">
				<div class="container-fluid">
					<div
						class="d-flex align-items-center justify-content-between small">
						<div class="text-muted">Copyright &copy; LIM DAUN 2021</div>
						<div>
							<a href="#">Privacy Policy</a> &middot; <a href="#">Terms
								&amp; Conditions</a>
						</div>
					</div>
				</div>
			</footer>
		</div>
	</div>
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
		src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"
		crossorigin="anonymous"></script>
	<script src="resources/assets/demo/datatables-demo.js"></script>
</body>
</html>