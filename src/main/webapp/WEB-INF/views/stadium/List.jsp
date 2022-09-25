<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container mt-3">
	<h2>경기장 목록 페이지</h2>
	<div class="container mt-3">

		<table class="table table-striped">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>지역</th>
					<th>개장일</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="stadium" items="${List}">
					<tr>
						<td>${stadium.id}</td>
						<td>${stadium.name}</td>
						<td>${stadium.area}</td>
						<td>${stadium.createdAt}</td>
						<td><button id="DeleteStadium" type="button"
								class="btn btn-danger">삭제</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script>
	$("#DeleteStadium").click(()=>{		
		let id = $("#id").val();
		
		$.ajax("/stadium/delete",{
			type: "DELETE",
			dataType: "json" // 응답 데이터
		}).done((res)=>{
			if(res.code == 1){
				alert("구장삭제 완료");
				location.href = "/";
			}else{
				alert("구장삭제 실패"); 
			}
		});
	});
</script>



	<%@ include file="../layout/footer.jsp"%>