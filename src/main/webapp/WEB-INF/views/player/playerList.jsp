<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container mt-3">
	<h2>선수 목록 페이지</h2>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>소속팀</th>
					<th>포지션</th>
					<th>소속일자</th>
					<th>삭제</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach var="PlayerListDto" items="${playerlist}">
					<tr>
						<td>${PlayerListDto.id}</td>
						<td>${PlayerListDto.name}</td>
						<td>${PlayerListDto.teamName}</td>
						<td>${PlayerListDto.position}</td>
						<td>${PlayerListDto.createdAt}</td>
						<td><button id = "DeleteTeam" type="button"  class="btn btn-danger">삭제</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</div>

<%@ include file="../layout/footer.jsp"%>