<%-- 
    Document   : Contact
    Created on : Jan 29, 2021, 4:29:56 AM
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
                        Contact
                    </div>
                    <div class="contact_info">
                        <h3>Construction Machinery</h3>
                        <p>Address: <br>
                            City<br>
                            Country: <br>
                            Tel: ${company.tel}<br>
                            Email: ${company.email}
                        </p>
                    </div>
                    <div class="form">
                        <form action="" method="get">
                            <div class="row">
                                <p>Write your message here. Fill out the form:</p>
                                <div class="span6">
                                    <input id="name" name="name" placeholder="Write your name here" value="${name}" required=""/>
                                </div>
                                <div class="span6">
                                    <input id="email" name="email" placeholder="Write your email here" type="email" value="${email}" required=""/>
                                </div>
                            </div>
                            <div class="message row">
                                <textarea id="msg"  name="message" placeholder="Write your message here" required="">${message}</textarea>
                                <div class="buttonright">
                                    <button class="buttton" type="submit">Send - Click here</button>
                                </div>
                            </div>

                        </form>
                        <div class="showsubmit_notification">
                            <div class="notification">
                                <c:if test="${noti == 'Send successfully'}" >
                                    <h3 style="color: green">${noti}</h3>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
