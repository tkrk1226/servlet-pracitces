<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>EL 02 Test</h1>

<h4>scope(객체의 저장범위)</h4>
\${ vo.no }: ${ vo.no } <br/>
\${ vo.name }: ${ vo.name } <br/>

\${ requestScope.vo.no } : ${ requestScope.vo.no } <br/>
\${ requestScope.vo.name } : ${ requestScope.vo.name } <br/>

\${ sessionScope.vo.no } : ${ sessionScope.vo.no } <br/>
\${ sessionScope.vo.name } : ${ sessionScope.vo.name } <br/>


</body>
</html>