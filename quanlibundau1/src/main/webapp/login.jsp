<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Trang đăng nhập</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

<style>
@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap');
 *{
   margin: 0;
   padding: 0;
   box-sizing: border-box;
   font-family: 'Roboto', sans-serif;
 }
 html,body{
   display: grid;
   height: 100%;
   place-items: center;
  background-color: #FBAB7E;
 background-image: linear-gradient(62deg, #FBAB7E 0%, #F7CE68 100%);
 }
 .container{
   position: relative;
   height: 55px;
   width: 320px;
   border-radius: 5px;
   box-shadow: 0px 3px 3px rgba(0,0,0,0.1);
 }
 .container input{
   width: 100%;
   height: 100%;
   border: 1px solid #8e44ad;
   padding-left: 15px;
   font-size: 18px;
   outline: none;
   border-radius: 5px;
 }
 .container input::placeholder{
   font-size: 17px;
 }
 .container span{
   position: absolute;
   right: 15px;
   top: 50%;
   transform: translateY(-50%);
   font-size: 20px;
   color: #8e44ad;
   cursor: pointer;
   display: none;
 }
 .container input:valid ~ span{
   display: block;
 }
 .container span i.hide-btn::before{
   content: "f070";
 }
.login-form {
    width: 340px;
    margin: 50px auto;
  	font-size: 15px;
}
.login-form form {
    margin-bottom: 15px;
    background: #f7f7f7;
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    padding: 30px;
}
.login-form h2 {
    margin: 0 0 15px;
}
.form-control, .btn {
    min-height: 38px;
    border-radius: 2px;
}
.btn {        
    font-size: 15px;
    font-weight: bold;
}

</style>
</head>
<body>
<div class="login-form">
    <form action="logincontrol" method="post">
        <h2 class="text-center">Đăng nhập</h2>       
        
      
          <p class="text-danger">${mess }</p>
     
        <div class="form-group">
            <input type="text" name="username" class="form-control" placeholder="username" required="required">
        </div>
        <div class="form-group">
            <input type="password" name="password" class="form-control" placeholder="password" required="required">
         
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">Đăng nhập</button>
        </div>
        <div class="clearfix">
           
        </div>        
    </form>
    <p class="text-center"><a href="dangky.jsp">Tạo tài khoản mới</a></p>
</div>
<script type="text/javascript">
const passField = document.querySelector("input");
const showBtn = document.querySelector("span i");
showBtn.onclick = (()=>{
  if(passField.type === "password"){
    passField.type = "text";
    showBtn.classList.add("hide-btn");
  }else{
    passField.type = "password";
    showBtn.classList.remove("hide-btn");
  }
});</script>
</body>

</html>
