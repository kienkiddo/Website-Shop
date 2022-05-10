<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
  .img-small {
    margin-bottom: 7px;
  }
</style>
<div class="container" style="margin-top: 35px">
  <h3 class="text-center">CHI TIẾT SẢN PHẨM</h3>
  <hr style="width: 10%; height: 2px" class="color-main">
  <div class="container pt-4">
    <div class="row">
      <div class="col-6">
        <div class="row">
          <div class="col-2 p-0">
            <img class="img-thumbnail img-small"
              src="https://product.hstatic.net/1000230642/product/dsm072033doo__3__8fce31cb70d042eeb130f10095764882_master.jpg"
              alt="">
            <img class="img-thumbnail img-small"
              src="https://product.hstatic.net/1000230642/product/dsm072033doo__3__8fce31cb70d042eeb130f10095764882_master.jpg"
              alt="">
            <img class="img-thumbnail img-small"
              src="https://product.hstatic.net/1000230642/product/dsm072033doo__3__8fce31cb70d042eeb130f10095764882_master.jpg"
              alt="">
            <img class="img-thumbnail img-small"
              src="https://product.hstatic.net/1000230642/product/dsm072033doo__3__8fce31cb70d042eeb130f10095764882_master.jpg"
              alt="">
          </div>
          <div class="col-10">
            <img class="img-thumbnail"
              src="https://product.hstatic.net/1000230642/product/dsm072033doo__3__8fce31cb70d042eeb130f10095764882_master.jpg"
              alt="">
          </div>
        </div>
      </div>
      <div class="col-6">
        <p class="font-weight-bold font-weight-bolder mb-0">${item.name}</p>
        <small>Mã sản phẩm: ${item.id }</small></br>
        <p class="text-danger font-weight-bold" style="font-size: 23px;">Giá: 20.000đ</p>
        <hr>
        <div class="row">
          <div class="col">
            <div class="form-inline">
              <label>Kích thước: &ensp;</label>
              <select class="form-control">
                <option value="-1" disabled selected>Chọn kích thước</option>
                <option>35</option>
                <option>36</option>
                <option>37</option>
                <option>38</option>
                <option>39</option>
                <option>40</option>
                <option>41</option>
                <option>42</option>
                <option>43</option>
              </select>
            </div>
          </div>
        </div>
        <p style="margin-bottom: 10px; font-size: 13px;" class="mt-2">Còn 10 sản phẩm</p>

        <div class="row">
          <div class="col">
            <div class="form-inline">
              <label>Số lượng: &ensp;</label>
              <input type="number" class="form-control" value="1" style="width: 60%">
            </div>
          </div>
          <div class="col">
            <button class="form-control btn-primary btn-sm font-weight-bold"><i class="fas fa-cart-arrow-down"></i> THÊM
              VÀO GIỎ HÀNG</button>
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col">
        <div class="bg-light mt-5 p-3">
          Mô tả sản phẩm
        </div>
      </div>
    </div>
  </div>
</div>