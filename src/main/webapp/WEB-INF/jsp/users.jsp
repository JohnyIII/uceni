
<%--
  Created by IntelliJ IDEA.
  User: Pajut
  Date: 1.11.2016
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="../layout/taglib.jsp"%>
<table class="table table-bordered table-hover table-striped">
    <thead>
    <tr>
        <th>user name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>
                <a href="<spring:url value="/users/${user.id}.html"/>"> ${user.name}</a>

            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>