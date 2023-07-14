<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import= "java.util.List" %>
<%@ page import="entity.user" %>
<jsp:include page="/index.jsp" ></jsp:include>

<div class="container mtb">
    <div class="row">
        <div class="col-lg-6 d-flex flex-column align-items-center justify-content-center">
            <h1 style="margin-bottom: 100px;">Error page</h1>
            <p style="margin-top: 10px;">Error page</p>
            <strong>Listing users</strong>
            <hr/>
            <table border="1">
                <thead>
                    <th>UserID</th>
                    <th>Username</th>
                    <th>Email</th>
                </thead>
                <%
                List<user> listuser = (List)request.getAttribute("listuser");
                for (int i=0;i<listuser.size(); i++){
                    out.print("<tr>");
                    out.print("<td>"+listuser.get(i).getUser_ID()+"</td>");
                    out.print("<td>"+listuser.get(i).getUsername()+"</td>");
                    out.print("<td>"+listuser.get(i).getEmail()+"</td>");
                    out.print("</tr>");
                }
                %>
            </table>
        </div>
    </div>
</div>
