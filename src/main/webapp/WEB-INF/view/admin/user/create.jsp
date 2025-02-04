<%@ page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!doctype html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Thêm Mới Người Dung</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>    <title>Document</title>
</head>
<body>
    <div class="container mt-5">
        <div class="row">
            <div class="col-md-6 col-12 mx-auto">
                <h3>Create a User</h3>
                <hr/>
                <form:form action="/admin/user/create1" method="post" modelAttribute="newUser">
                     <div class="mb-3">
                         <label class="form-label">Email:</label>
                         <form:input type="email" class="form-control" path="email"/>
                         <input type="hidden" name="_csrf" value="${_csrf.token}"/>
                     </div>
                    <div class="mb-3">
                        <label class="form-label">Password:</label>
                        <form:input type="password" class="form-control" path="password" />
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Phone Number:</label>
                        <form:input type="text" class="form-control" path="phone"/>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Full Name</label>
                        <form:input type="text" class="form-control" path="fullName"/>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Address</label>
                        <form:input type="text" class="form-control" path="address"/>
                    </div>
                    <button type="submit" class="btn btn-primary" >Submit</button>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>