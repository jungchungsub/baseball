<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container mt-3">


	<h2>선수 등록 페이지</h2>
	<form id="form">
		구단: <select name="stadiumId" id="stadiumId">
			<c:forEach var="stadium" items="${stadium}">
				<option value="${stadium.id}">${stadium.name}</option>
			</c:forEach>
		</select> 타자: <select name="stadiumId" id="team">
			<c:forEach var="stadium" items="${team}">
				<option value="${stadium.id}">${stadium.name}</option>
			</c:forEach>
		</select> 
		선수 이름 : <input id="teamName" type="text" name="name" value="" />
		<button id="InsertTeam" type="button" onclick="teamSave()">등록</button>
	
	</form>

</div>

<script>
	$("#teamName").click(()=>{
		let data ={
				stadiumId : $("#stadiumId").val(),
				teamName : $("#teamName").val()
					
		};
		
		console.log(data);
		$.ajax("/team/insert",{
			type: "POST",
			dataType: "JSON",// 응답 타입
			data: JSON.stringify(data),// 전달 타입 
			headers: { 
				"Content-Type" : "application/json; charset=utf-8"
			}
		}).done((res)=>{
			if(res.code ==1){
				alert("등록 성공");
			}
			else{
				alert("등록 실패 ");
			}
		});
	});
</script>




<%@ include file="../layout/footer.jsp"%>