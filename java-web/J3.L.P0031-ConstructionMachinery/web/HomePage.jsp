<%-- 
    Document   : HomePage
    Created on : Jan 27, 2021, 7:44:18 AM
    Author     : Zuy Fun
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="content">
                <div class="left">
                    <div class="infor">
                        <div class="left_title">
                            ${company.title}
                        </div>
                        <div class="infor_shortDes">
                            ${company.shortDes}
                        </div>
                        <div class="infor_longDes">
                            ${company.longDes}
                        </div>
                        <div class="infor_image">
                            <img src="image/${company.image}"/>
                        </div>
                    </div>
                    <div class="machine">
                        <c:forEach items="${listM}" var="i">
                            <div class="listmachine">
                                <div class="listmachine_img">
                                    <img src="image/${i.image}"/>
                                </div>
                                <div class="listmachine_title">
                                    <a href="DetailController?machineID=${i.id}">
                                        ${i.name}
                                    </a>
                                </div>
                                <div class="listmachine_des">
                                    ${i.shortDes}
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="paging">
                        <c:if test="${maxPage > 1}">
                            <c:forEach begin="1" end="${maxPage}" var="i">
                                <a href="HomeController?pageIndex=${i}">${i}</a>
                            </c:forEach>
                        </c:if> 
                    </div>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
