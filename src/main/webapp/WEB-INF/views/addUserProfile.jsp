<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>
<head>
<mytags:jquery />
<mytags:style />
</head>
<body>
<mytags:menu />
<h4>New Person</h4>
<c:if test="${errors.errorCount gt 0}">
	Errors!<br/>
	<c:forEach var="error" items="${errors.allErrors}">
		<span class="error">${error.objectName} ${error.code}</span>
		<br />
	</c:forEach>
</c:if>
<form method="post" action="addUser.htm">
<label for="name">Name:</label><input type="text" name="name" /><br />
<label for="name">Gender:</label><input type="text" name="gender" /><br />
<label for="name">Email:</label><input type="text" name="email" /><br />
<label for="name">Telephone:</label><input type="text" name="telephone" /><br />
<input type="submit" /><input type="reset" /></form>
<mytags:footer/>
</body>
</html>