<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href='<c:url value="./resources/css/styles.css"/>'>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
      <div>
          <jsp:include page="menu.jsp"/>
      </div>
</body>
</html>