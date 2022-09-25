<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container mt-3">
	<h2>팀 목록 페이지</h2>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>번호</th>
					<th>경기장이름</th>
					<th>팀이름</th>
					<th>창단일</th>
					<th>삭제</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach var="TeamListDto" items="${teamlist}">
					<tr>
						<td>${TeamListDto.id}</td>
						<td>${TeamListDto.stadiumName}</td>
						<td>${TeamListDto.name}</td>
						<td>${TeamListDto.createdAt}</td>
						<td><button id = "DeleteTeam" type="button"  class="btn btn-danger">삭제</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</div>
	<script>
	$("#DeleteTeam").click(()=>{		
		let id = $("#id").val();
		
		$.ajax("/team/delete",{
			type: "DELETE",
			dataType: "json" // 응답 데이터
		}).done((res)=>{
			if(res.code == 1){
				alert("팀삭제 완료");
				location.href = "/teamList";
			}else{
				alert("팀삭제 실패"); 
			}
		});
	});
</script>


<%@ include file="../layout/footer.jsp"%>