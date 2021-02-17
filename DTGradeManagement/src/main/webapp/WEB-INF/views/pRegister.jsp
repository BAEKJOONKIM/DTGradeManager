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
.semester{margin-bottom: 5px;}
.subSave{margin-top: 20px;}
.subRTitle{padding-top:5px;}
.subRatio{padding-top:15px;padding-bottom:15px;}
.subAttr{padding-top:10px;padding-bottom:10px;}
.subCode{padding-top:10px;padding-bottom:10px;}
.subName{padding-top:10px;padding-bottom:10px;}
.subCnt{padding-top:10px;padding-bottom:10px;}
.profName{padding-top:10px;padding-bottom:10px;}
.totalScore{padding-top:10px;padding-bottom:10px;}
.plan-title{padding-top:10px;padding-bottom:10px;}
.plan-file{padding-top:10px;padding-bottom:10px;}
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
			<form action="./pSubjectRegisterAction" method="post">
			<div class="container-fluid">
				<div class="main-title">과목등록</div>
				<div class="semester">2021년 1학기</div>
				<div class="register-box row">
					<div class="col-4 subAttr">
						<div class="subCode">과목코드 : <input type="text" name="subjectCode"></div>
						<div class="subCnt">수강인원 : <input type="text" name="headCount"></div>
						<div class="totalScore">과목총점 : <input type="text" name="totalScore"></div>
					</div>
					<div class="col-4 subAttr">
						<div class="subName">과목명 : <input type="text" name="subjectName"></div>
						<div class="profName">교수명 : ${user.name }</div>
						<div class="subName">학점 : <input type="text" name="point"></div>
					</div>
					<div class="col-4"></div>
				</div>
				<div class="row">
					<div class="col">
					<div class="row subRTitle">성적비율</div>
					<div class="row subRatio">
						A:<input type="text" style="margin-right:20px;" name="aRatio">  B:<input type="text" name="bRatio"> 
					</div>
					<div class="row subRatio">
						C:<input type="text" style="margin-right:20px;" name="cRatio">  D:<input type="text" name="dRatio">
					</div>
					<div class="row subRatio">
						요일1:<input type="text" style="margin-right:20px;" name="day1">  교시1:<input type="text" name="period1">
					</div>
					<div class="row subRatio">
						요일2:<input type="text" style="margin-right:20px;" name="day2">  교시2:<input type="text" name="period2">
					</div>
					</div>
				</div>
				<div class="subSave"><input type="submit" value="저장"></div>
			</div>
			</form>
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