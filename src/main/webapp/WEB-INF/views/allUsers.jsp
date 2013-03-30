<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>
<head>
<mytags:jquery />
<mytags:style />
</head>
<body>
<mytags:menu/>
<h3>Persons</h3>
<c:choose>
	<c:when test="${fn:length(userProfiles) gt 0}">
		<table border=1>
			<tr>
				<th>Name</th>
				<th>Gender</th>
				<th>Email</th>
				<th>Phone</th>
			</tr>
			<c:forEach var="userProfile" items="${userProfiles}">
				<tr class="">
					<td><c:out value="${userProfile.name}"/></td>
					<td>${userProfile.gender}</td>
					<td>${userProfile.email}</td>
					<td>${userProfile.telephone}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>No persons</c:otherwise>
</c:choose>
<mytags:footer/>

</body>
</html>
