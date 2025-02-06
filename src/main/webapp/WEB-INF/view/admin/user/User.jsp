<%@ page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!doctype html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Danh Sách Người Dùng</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>    <title>Document</title>

</head>
<body>
    <div class="container mt-5">
        <div class="row">
            <div class="col-12 mx-auto">
                <div class="d-flex justify-content-between mb-3 ">
                    <h3>Table User</h3>
                    <a href="/admin/user/create" class="btn btn-primary">Create a user</a>
                </div>
            </div>
            <hr/>
            <table class="table table-bordered table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Email</th>
                        <th>fullName</th>
                        <th>Action</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${users1}">
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.email}</td>
                            <td>${user.fullName}</td>
                            <td>
                                <a href="/admin/user/${user.id}" class="btn btn-success">View</a>
                                <a href="/admin/user/update/${user.id}" class="btn btn-warning mx-2">Update</a>
                                <button class="btn btn-danger">Delete</button>
                            </td>
                        </tr>

                    </c:forEach>
                    
                </tbody>

            </table>
        </div>
    </div>



</body>
</html>