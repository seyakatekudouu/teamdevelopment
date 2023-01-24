<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>本の登録ページ</title>
</head>
<body>
<form action="Bookservlet1" method="post">
<h1>本の登録ページ</h1>
図書名: <input type="text" name="name"><br>
著者:<input type="text" name="tyosya"><br>
出版社:<input type="text" name="syuppan"><br>
ISBN：<input type="text"  name="Isbn"><br>
<input type="submit" value="登録">
</form>
</body>
</html>