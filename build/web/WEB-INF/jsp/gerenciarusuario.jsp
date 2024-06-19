<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <link href="css/gerenciar.css" rel="stylesheet" type="text/css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <body>
        <div class="container">
            <div id="title">
                <h1>Historico de Usuario</h1>
            </div>
            <div class="table">
                <div id="tb-header">
                    <span>ID</span>
                    <span>Nome</span>
                    <span>Email</span>
                    <span>Senha</span>
                </div>
                <c:forEach items="${usuarioInfos}" var="user">
                    <div id="row">
                        <span>${user.idUsuario}</span>
                        <span>${user.nome}</span>
                        <span>${user.email}</span>
                        <span>*****</span>

                        <a href="./remover-usuario?id="><i class="fa-solid fa-trash"></i></a>
                    </div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>