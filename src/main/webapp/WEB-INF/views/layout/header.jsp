<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Blog</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/List">Baseball</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="/stadiumList">야구장
							목록보기</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/stadiumSaveForm">야구장 등록</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/teamList">팀 목록보기</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/teamSaveForm">팀 등록</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/player">선수 목록보기</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/playerSaveForm">선수 등록</a></li>
				</ul>
			</div>
		</div>
	</nav>