<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enroll in a new Course</title>
</head>
<body>
	<div class="container">
        <form method="post">
        	<h2>Enrollment</h2>
        	
        	<!-- remember to make variable called student in controller -->
            <input type="hidden" name="id" value="${ student.id }" />
            <input type="hidden" name="category" value="${ student.category }" />
            <div class="form-group">
                <label for="name">Name</label>
                <input class="form-control" id="name" name="name" required min="2" autocomplete="off">
            </div>
            <div class="form-group">
                <label for="category">Category</label>
                <input class="form-control" id="category" name="category" required>
            </div>
            <div class="form-group">
                <label for="description">Description</label>
                <input class="form-control" id="description" name="description" required min="3">
            </div>
            <div class="form-group">
                <label for="description">Price</label>
                <input class="form-control" id="price" name="price" required min="3">
            </div>
            <button type="submit" class="btn btn-dark">Submit</button>
            <a href="/admin/menu" class="btn btn-outline-dark">Cancel</a>
        </form>
    </div>
</body>
</html>