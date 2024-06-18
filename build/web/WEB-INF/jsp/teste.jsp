<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="css/carinho.css" rel="stylesheet" type="text/css"/>
    <script src="https://kit.fontawesome.com/ca900a5c2d.js" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/feather-icons"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Document</title>
</head>
<body>
    <header class="site">
      <i class="fa-solid fa-cart-shopping" id="openCarrinho"></i>

      <div id="carrinho">
        <div id="background-carrinho"></div>
        <div id="carrinho-container">
          <div class="carrinho-header">
              <i id="closeCarrinho" class="fa-solid fa-xmark"></i>
          </div>
          <div id="carrinho-main"></div>
          <div class="carrinho-footer">
            <button class="btn btn-finalizar">FINALIZAR COMPRA</button>
          </div>
        </div>
      </div>
        </header>
</body>
<script src="js/carrinho.js"></script>
</html>