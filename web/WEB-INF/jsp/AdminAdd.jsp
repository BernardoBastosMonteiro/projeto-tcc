
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <link href="css/addAdmin.css" rel="stylesheet" type="text/css"/>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>admin add</title>
</head>
<body>
    <main>
        <div class="container">
            <form id="frmSignUp" action="./adicionar-usuario" method="post">
                <div id="title">
                    <p>Adicionar Administrador</p>
                </div>
                <div id="inputs-container">
                    <div id="left-block">
                        <label for="nome">Nome:</label>
                        <input name="nome" id="inName" type="text" placeholder="Digite aqui">
                        <label for="email">Email:</label>
                        <input name="email" id="inEmail" type="email" placeholder="Digite aqui">
                        <label for="senha">Senha:</label>
                        <input name="senha" id="inPassword" type="password" placeholder="Digite aqui">
                    </div>
                    <a href="#"><button>Adicionar</button></a>
                </div>
                
            </form>
        </div>
    </main>
</body>
</html>