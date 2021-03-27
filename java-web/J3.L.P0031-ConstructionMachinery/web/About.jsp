<%-- 
    Document   : About
    Created on : Jan 28, 2021, 2:41:21 AM
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
                        About your company
                    </div>
                    <div class="company_content">
                        <div class="company_image">
                            <img src="image/${company.image}"/>
                        </div>
                        <div class="company_des">
                            ${company.longDes}
                        </div>
                    </div>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
