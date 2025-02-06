<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!doctype html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User Detail ${users}</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>    <title>Document</title>

</head>
<body>
<div class="container mt-5">
    <div class="row">
        <div class="col-12 mx-auto">
            <div class="d-flex justify-content-between mb-3 ">
                <h3>Table Detail</h3>
            </div>
        </div>
        <hr/>
        <div class="card" style="width: 60%">
            <c:forEach var="user" items="${id}">
            <div class="card-header">
                User information ${user.fullName}
            </div>

                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">Eamil : ${user.email}</li>
                        <li class="list-group-item">Họ Và Tên :${user.fullName}</li>
                        <li class="list-group-item">Địa Chỉ : ${user.address}</li>
                        <li class="list-group-item">Số Điện Thoại : ${user.phone}</li>


                    </ul>

            </c:forEach>

        </div>

    </div>
    <a href="/admin/user" class="btn btn-success mt-n1" style="margin-top: 50px;">Back</a>
</div>





</body>
</html>