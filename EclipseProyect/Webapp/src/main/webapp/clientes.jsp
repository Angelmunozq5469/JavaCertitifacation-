<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
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
                List<user> listuser = (List<user>) request.getAttribute("listuser");
                if (listuser != null && !listuser.isEmpty()) {
                    for (user u : listuser) {
                %>
                <tr>
                    <td><%= u.getUser_ID() %></td>
                    <td><%= u.getUsername() %></td>
                    <td><%= u.getEmail() %></td>
                </tr>
                <% 
                    }
                } else {
                %>
                <tr>
                    <td colspan="3">No users found.</td>
                </tr>
                <% 
                }
                %>
            </table>
        </div>
    </div>
</div>
