

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-sm-3">
    <div class="card bg-light mb-3">
        <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Món ngon nhà Trần Uy</div>
        <ul class="list-group category_block">
            <c:forEach items="${listCC}" var="o">
                <li class="list-group-item text-white ${tag == o.idpl ? "active":""}"><a href="phanloaicontrol?idpl=${o.idpl}">${o.namephanloai}</a></li>
            </c:forEach>

        </ul>
    </div>
</div>