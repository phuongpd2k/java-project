<%-- 
    Document   : Right
    Created on : Jan 27, 2021, 7:36:37 AM
    Author     : Zuy Fun
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/right.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="right">
            <div class="share_box">
                <div class="share_header">Share this page</div>
                <div class="share_content">
                        <div class="link">
                            <a href="${listS.url}">
                                <img src="image/${listS.icon}" alt=""/>
                                Share on ${listS.socialNetwork}
                            </a>
                        </div>
                    
                </div>
            </div>
        </div>
    </body>
</html>
