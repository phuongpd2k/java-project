<%-- 
    Document   : Sale
    Created on : Jan 27, 2021, 5:10:49 PM
    Author     : Zuy Fun
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/sale.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="content">
                <div class="left">
                    <div class="salemachine">
                        <div class="left_title">
                            Machines for Sale
                        </div>
                        <div class="listsalemachine">
                            <c:forEach items="${listM}" var="i">
                                <div class="each_machine">
                                    <div class="each_machine_img">
                                        <img src="image/${i.image}"/>
                                    </div>
                                    <div class="each_machine_content">
                                        <div class="each_machine_title">
                                            <a href="DetailController?machineID=${i.id}">
                                                ${i.name}
                                            </a>
                                        </div>
                                        <div class="each_machine_des">
                                            ${i.longDes}
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <div class="paging">
                            <c:if test="${maxPage > 1}">
                                <c:forEach begin="1" end="${maxPage}" var="i">
                                    <a href="SaleController?pageIndex=${i}">${i}</a>
                                </c:forEach>
                            </c:if>
                        </div>
                    </div>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
