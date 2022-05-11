<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="container" style="margin-top: 35px">
  <div class="row">
    <div class="col">
      <h3 class="text-center">XÁC NHẬN ĐƠN HÀNG</h3>
      <hr style="width: 10%; height: 2px" class="color-main">
      <div class="container pt-4">
        <div class="row">
          <div class="col-6 offset-3">
            <form class="mt-1" method="POST" action="xac-nhan-don-hang">
              <div class="input-group form-group">
                <span class="input-group-prepend">
                  <div class="input-group-text bg-light border-right-0"><i class="fa fa-user"></i>
                  </div>
                </span>
                <input class="form-control py-2 border-left-0 border" id="name" name="name"
                  placeholder="Họ và tên" value="${user.name}">
              </div>
              <div class="input-group form-group">
                <span class="input-group-prepend">
                  <div class="input-group-text bg-light border-right-0"><i class="fas fa-phone"></i>
                  </div>
                </span>
                <input class="form-control py-2 border-left-0 border"  id="phone" name="phone"
                  placeholder="Số điện thoại" value="${user.phone}">
              </div>
              <div class="input-group form-group">
                <span class="input-group-prepend">
                  <div class="input-group-text bg-light border-right-0"><i class="fas fa-address-book"></i>
                  </div>
                </span>
                <input class="form-control py-2 border-left-0 border"  id="address" name="address"
                  placeholder="Địa chỉ" value="" required>
              </div>
              <div class="input-group form-group">
                <span class="input-group-prepend">
                  <div class="input-group-text bg-light border-right-0"><i class="fa fa-coins"></i>
                  </div>
                </span>
                <input class="form-control py-2 border-left-0 border"
              value="Tổng: <fmt:formatNumber value="${cart.price}" type="currency" />" readonly>
              </div>
              <div class="input-group form-group mb-0">
                <span class="input-group-prepend">
                  <div class="input-group-text bg-light border-right-0"><i class="fas fa-wallet"></i>
                  </div>
                </span>
                <select class="form-control">
                    <option>Tiền mặt</option>
                </select>
              </div>
              <small><span class="text-danger">(*)</span> Kiểm tra hàng trước khi thanh toán</small></br>
              <button class="btn btn-primary btn-sm font-weight-bold form-control mt-3" ><span class="fas fa-key"></span> XÁC NHẬN</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>

