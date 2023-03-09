<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--begin of menu-->
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="home">Trang menu</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
             <ul class="navbar-nav m-auto">
                <c:if test="${sessionScope.acc.username == 'admin'}">
                <li class="nav-item">
                    <a class="nav-link" href="edit">Chỉnh sửa menu</a>
                </li>
                </c:if>
               
                <c:if test="${sessionScope.acc!=null}">
                 <li class="nav-item">
                    <a class="nav-link" href="#">Hello ${sessionScope.acc.username}</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="dangxuatcontrol">Đăng xuất</a>
                </li>
                </c:if>
                <c:if test="${sessionScope.acc==null}">
                <li class="nav-item">
                    <a class="nav-link" href="login.jsp">Đăng nhập</a>
                </li>
                 </c:if>
            </ul>

            <form action="Searchcontrol" method="post" class="form-inline my-2 my-lg-0">
                <div class="input-group input-group-sm">
                    <input value="${txtS}" name="txt" type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-secondary btn-number">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </div>
                 <c:if test="${sessionScope.acc.username != 'admin'}">
                <a class="btn btn-success btn-sm ml-3" href="print">
                    <i class="fa fa-shopping-cart"></i> Cart
                    <span class="badge badge-light"></span>
                </a>
                 </c:if>
            </form>
        </div>
    </div>
</nav>
<section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading">Bún đậu Trần Uy</h1>
        <p class="lead text-muted mb-0">hãy đến với bún đậu Trần Uy để được qua môn bạn nhé!</p>
    </div>
</section>
<!--end of menu-->