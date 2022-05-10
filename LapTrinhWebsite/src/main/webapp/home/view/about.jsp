<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
	td, th{
	padding: 10px 15px;
	}
</style>

<div class="container pt-5">
	<h3 class="text-center">THÔNG TIN CỦA BẠN</h3>
	<hr style="width: 10%; height: 2px" class="color-main">
	<div class="row mt-5">
		<div class="col">
			<table class="table">
				<tr>
					<th>Họ tên:</th>
					<td>${user.name}</td>
				</tr>
				<tr>
					<th>Email:</th>
					<td>${user.email}</td>
				</tr>
				<tr>
					<th>Phone</th>
					<td>${user.phone}</td>
				</tr>
				<tr>
					<th>Tham gia:</th>
					<td>${user.timecreat}</td>
				</tr>
			</table>
		</div>
	</div>
</div>

