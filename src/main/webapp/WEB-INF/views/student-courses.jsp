<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>${ message }</h1>
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
	<form class="form-inline" action="/course/enroll" autocomplete="on" method=POST>
	  	<label class="sr-only" for="keyword">Keyword</label>
	    	<input type="text" value="${param.keyword}" class="form-control mb-2 mr-sm-2" id="keyword" name="keyword" placeholder="Keyword">
	 	<button type="submit">Enroll in a new class?</button>
	 </form>

</body>
</html>