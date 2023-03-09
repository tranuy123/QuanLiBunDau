<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang đăng ký</title>
<link rel="stylesheet" href="css/dangky.css">
</head>
<body>
<form action="dangkycontrol" method="post" >
   <div class="container">
     <h1> Đăng Ký tài khoản</h1>
      
     <p>Xin hãy nhập biểu mẫu bên dưới để đăng ký.</p>
     <hr>
    <label for="email"><b>Tên đăng nhập</b></label>
     <input type="text" placeholder="Nhập Tên đăng nhập" name="username" required>
    <label for="psw"><b>Mật Khẩu</b></label>
     <input type="password" placeholder="Nhập Mật Khẩu" name="password" required>
    <label for="psw-repeat"><b>Nhập Lại Mật Khẩu</b></label>
     <input type="password" placeholder="Nhập Lại Mật Khẩu" name="password1" required>
    <label>
    <center><p class="text-danger">${mess1 }</p></center>
    <center><p class="text-danger">${mess2 }</p></center>
     </label>
    <div class="clearfix">
       <button type="submit" class="signupbtn">Đăng ký</button>
     </div>
   </div>
 </form>
 

</body>
</html>