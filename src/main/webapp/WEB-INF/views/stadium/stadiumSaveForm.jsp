<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container mt-3">


	<h2>경기장 추가 페이지</h2>
	<div class="mb-3 mt-3">

		<span class="input-group-text">경기장 이름</span> <input id="name"
			type="text" class="form-control" placeholder="경기장 이름을 넣어주세요">
					<span class="input-group-text">지역 이름</span> <input id="area"
			type="text" class="form-control" placeholder="지역 이름을 넣어주세요">
			<button id="btnInsert" type="button" class="btn btn-primary">등록</button>

	</div>
	
</div>



<script>
	$("#btnInsert").click(()=>{
		let data ={
				name : $("#name").val(),
				area : $("#area").val()
		};
		console.log(data);
		$.ajax("/stadium",{
			type: "POST",
			dataType: "JSON",// 응답 타입
			data: JSON.stringify(data),// 전달 타입 
			headers: { 
				"Content-Type" : "application/json; charset=utf-8"
			}
		}).done((res)=>{
			if(res.code ==1){
				alert("등록 성공");
				location.href = "/stadiumList";
			}
			else{
				alert("등록 실패 ");
			}
		});
	});
</script>
<%@ include file="../layout/footer.jsp"%>