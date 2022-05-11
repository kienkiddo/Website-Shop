<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="container" style="margin-top: 35px">
	<div class="row">
		<div class="col">
			<h3 class="text-center">ĐẶT HÀNG THÀNH CÔNG</h3>
			<hr style="width: 10%; height: 2px" class="color-main">
			<div class="container pt-4">
				<p class="mb-0">
					Mã đơn hàng: <span class="font-weight-bold">#${history.id}</span>
				</p>
					<p class="mb-0">
					Thời gian: <span class="font-weight-bold">${history.timecreat}</span>
				</p>
				<p class="mb-0">
					Họ tên: <span class="font-weight-bold">${history.name}</span>
				</p>
				<p class="mb-0">
					Số điện thoại: <span class="font-weight-bold">${history.phone}</span>
				</p>
				<p class="mb-0">
					Địa chỉ: <span class="font-weight-bold">${history.address}</span>
				</p>
				<p class="mb-0"><span class="text-danger">(*)</span> Bạn sẽ nhận được cuộc gọi xác nhận đơn hàng (30 phút)</p>
			</div>
		</div>
	</div>
</div>