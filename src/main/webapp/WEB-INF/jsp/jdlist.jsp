<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Solr+redis+SSM</title>
</head>
<body>
<table>
 <c:forEach items="${jdlist }" var="jdlist">
 <tr>
  <td><a href="http://127.0.0.1:8080/SolrRedissolrdemo/findjdbyid?id=${jdlist.id}">${jdlist.title}</a></td>
  <td>${jdlist.link}</td>
  <td>${jdlist.price}</td>
  <td>${jdlist.comment}</td>
  <td>${jdlist.goodcomment}</td>
  <td>${jdlist.poorcountstr}</td>
  <td>${jdlist.aftercount}</td>
  <td><a href="http://127.0.0.1:8080/SolrRedissolrdemo/deleteproduct?id=${jdlist.id}">删除</a></td>
 </tr>
 </c:forEach>
 <div>总的记录数:${number }</div>
</table>
</body>
</html>