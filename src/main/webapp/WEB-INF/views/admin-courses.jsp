<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
</head>
<body>
	
	<h1>Admin Course List</h1>
	
	<table class="table table-striped">
	 	<thead class="thead-dark" style="background-color:#4B4237">
		 	<tr>
		     	<th>Course Name</th>
		        <th>Course Semester</th>
		        <th>Final Grade</th>
		   	</tr>
	  	</thead>
	    <tbody>
	    	<!-- change variable name -->
			<c:forEach items="${ courseList }" var="course">
			 	<tr>
			     	<td><a href="/courses/${ course.id }">${ course.name }</a></td>
			      	<td>${ course.semester }</td>
			      	<td>${ course.grade }</td>
				</tr>    
			</c:forEach>
		</tbody>
	</table>
	
	<!-- search bar for new course enrollment including category, name and semester -->
	<form class="form-inline" action="/index" autocomplete="on" method=POST>
	  	<label class="sr-only" for="keyword">Keyword</label>
	    	<input type="text" value="${param.keyword}" class="form-control mb-2 mr-sm-2" id="keyword" name="keyword" placeholder="Keyword">
	 	<button type="submit">Enroll a Student</button>
	 </form>

</body>
</html>