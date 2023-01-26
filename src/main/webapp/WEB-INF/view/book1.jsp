<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red">下記の本の登録に成功</h1>
<%
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
String tyosya = request.getParameter("tyosya");
String syuppan = request.getParameter("syuppan");
int Isbn= Integer.parseInt(request.getParameter("Isbn"));
%>
<p>図書名:<%= name %><br>
<p>著者名： <%= tyosya %><br> 
<p>出版社： <%= syuppan %><br>
<p>ISBN: <%= Isbn %><br>
<form><INPUT type="button" value="戻る" onClick="history.go(-2)"></FORM>
<a href="Regitertouroku">もう一度登録</a><br>
</body>
</html>