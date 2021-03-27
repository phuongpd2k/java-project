<%-- 
    Document   : Detail
    Created on : Mar 5, 2021, 4:53:43 AM
    Author     : Zuy Fun
--%>

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
                    <div class="left_title">
                        ${machine.name}
                    </div>
                    <div class="company_content">
                        <div class="detail_image">
                            <img src="image/${machine.image}"/>
                        </div>
                        <p>${machine.shortDes}</p>
                        ${machine.longDes}
                    </div>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
