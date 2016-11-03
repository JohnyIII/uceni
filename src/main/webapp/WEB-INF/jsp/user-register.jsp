<%@ include file="../layout/taglib.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: Pajut
  Date: 30.10.2016
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<form:form commandName="user" cssClass="form-horizontal">

    <div class="form-group">
        <label for="name" class="col-sm-2 control-label"> Name:</label>
        <div class="col-sm-10">
            <form:input path="name" cssClass="form-control"/>
        </div>
    </div>

    <div class="form-group">
        <label for="email" class="col-sm-2 control-label"> Email:</label>
        <div class="col-sm-10">
            <form:input path="email" cssClass="form-control"/>
        </div>
    </div>

    <div class="form-group">
        <label for="password" class="col-sm-2 control-label"> Password:</label>
        <div class="col-sm-10">
            <form:password path="password" cssClass="form-control"/>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-2">
            <input type="submit" value="Save" class="btn btn-lg btn-primary">
        </div>
    </div>
</form:form>
