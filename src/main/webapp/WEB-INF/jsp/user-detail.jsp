
<%@ include file="../layout/taglib.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: Pajut
  Date: 1.11.2016
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<h1>${user.name}</h1>

<c:forEach items="${user.blogs}" var="blog">
    <h1>${blog.name}</h1>
    <p>${blog.url}</p>
<table class="table table-bordered table-hover table-striped">
    <thead>
    <tr>
        <th>Title</th>
        <th>Link</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${blog.items}" var="item">
        <tr>
            <td>${item.title}</td>
            <td>${item.link}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</c:forEach>