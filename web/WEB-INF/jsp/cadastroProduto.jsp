<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/cadastro.css" rel="stylesheet" type="text/css"/>
    <title>Document</title>
    /by bruno
</head>
<body>
    <main>
        
        <div class="main-container">
            <form action="./cadastrar-produto" method="post" enctype="multipart/form-data">
                <div class="title">
                    <h1>Cadastro de Viagem</h1>
                </div>
                <p>Nome do produto:</p>
                <input type="text" name="nome" placeholder="Nome do produto">
                <p>Categoria:</p>
                <select id="selectCategoria" name="categoria">
                    <option>Selecione a categoria</option>
                    <option value="1">Rio de janeiro</option>
                    <option value="2">Sao paulo</option>
                    <option value="3">Jeriquaquara</option>
                    <option value="4">Guaratuba</option>
                    <option value="5">Balneario</option>
                </select>
                <p>data:</p>
                <input type="date">
                    
                </select>
                <p>Preco:</p>
                <input type="text" id="inPreco" name="preco" step="0.01" min="0.00" placeholder="Preco do Produto">
                <p>Descricao:</p>
                <input type="text" id="inDesc" name="desc" placeholder="Escreva uma breve descricao do produto">
                <p>Imagem:</p>
                <input type="file" name="imagem" placeholder="Selecione a imgem do produto">
                <button type="submit">ADICIONAR</button>
            </form>
        </div>
    </main>
</body>
</html>