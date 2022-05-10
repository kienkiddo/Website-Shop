-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 10, 2022 lúc 06:04 PM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ltweb`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bill`
--

CREATE TABLE `bill` (
  `id` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `itemId` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `info` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL CHECK (json_valid(`info`)),
  `status` int(11) NOT NULL DEFAULT 0,
  `timecreat` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cart`
--

CREATE TABLE `cart` (
  `id` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `hashkey` varchar(255) NOT NULL,
  `data` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `timeupdate` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `color`
--

CREATE TABLE `color` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `color`
--

INSERT INTO `color` (`id`, `name`) VALUES
(1, 'WHITE'),
(2, 'BLACK'),
(3, 'RED'),
(4, 'BLUE'),
(5, 'GREEN'),
(6, 'YELLOW'),
(7, 'BROWN');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `item`
--

CREATE TABLE `item` (
  `id` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(1024) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `price` int(11) NOT NULL,
  `colorId` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `new` tinyint(1) NOT NULL,
  `sale` int(11) NOT NULL,
  `infos` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT '[]',
  `thump` varchar(255) NOT NULL,
  `image` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT '[]'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `item`
--

INSERT INTO `item` (`id`, `type`, `name`, `description`, `price`, `colorId`, `status`, `new`, `sale`, `infos`, `thump`, `image`) VALUES
(1, 0, 'Giày Thể Thao Nam Biti\'s DSM072033DOO (Trắng)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSM072033DOO', 110000, 1, 1, 1, 0, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump.jpg', '[\"thump.jpg\",\"thump.jpg\",\"thump.jpg\"]'),
(2, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 120000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(3, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 130000, 1, 1, 0, 0, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(4, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 140000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(5, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 150000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(6, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 160000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(7, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 170000, 1, 1, 1, 0, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(8, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 180000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(9, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 190000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(10, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 200000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(11, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 210000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(12, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 220000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(13, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 230000, 1, 1, 0, 0, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(14, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 240000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(15, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 250000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(16, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 260000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(17, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 270000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(18, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 280000, 1, 1, 1, 0, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(19, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 290000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(20, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 300000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(21, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 310000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(22, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 320000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(23, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 330000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(24, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 340000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(25, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 350000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(26, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 360000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(27, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 370000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(28, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 380000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]'),
(29, 0, 'Giày Thể Thao Bé Gái Biti\'s Hunter Junior DSGH00100CAM (Cam)', 'Mô tả của Giày Thể Thao Nam Biti\'s DSGH00100CAM', 390000, 1, 1, 0, 20, '[{\"size\":35,\"quantity\":100},{\"size\":36,\"quantity\":10}]', 'thump-01.jpg', '[\"image-01-01.jpg\",\"image-01-02.jpg\",\"image-01-03.jpg\",\"image-01-04.jpg\"]');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `level` int(11) NOT NULL DEFAULT 0,
  `timecreat` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`id`, `name`, `phone`, `email`, `password`, `level`, `timecreat`) VALUES
(1, 'Bui Anh Quan', '0123123123', '123123@gmail.com', '4297f44b13955235245b2497399d7a93', 0, '2022-05-10 15:06:30'),
(2, 'Truong Quang Kien', '0123123123', 'tqkien@gmail.com', '4297f44b13955235245b2497399d7a93', 0, '2022-05-10 15:12:15'),
(3, 'Bui Anh Quuang', '03123321', 'auanabn@gmail.com', '4297f44b13955235245b2497399d7a93', 0, '2022-05-10 15:27:02'),
(4, 'Bùi Anh Quân', '0123123123', 'buianhquang@gmail.com', '4297f44b13955235245b2497399d7a93', 0, '2022-05-10 15:54:31');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `color`
--
ALTER TABLE `color`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`id`),
  ADD KEY `colorId` (`colorId`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `bill`
--
ALTER TABLE `bill`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `cart`
--
ALTER TABLE `cart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `color`
--
ALTER TABLE `color`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `item`
--
ALTER TABLE `item`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `item_ibfk_1` FOREIGN KEY (`colorId`) REFERENCES `color` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;