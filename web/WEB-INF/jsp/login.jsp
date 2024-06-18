<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
  <link href="css/index.css" rel="stylesheet" type="text/css"/>
  <script src="https://kit.fontawesome.com/cf6fa412bd.js" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <input type="checkbox" id="flip">
        <div class="cover">
          <div class="front">
            <img src="assets/backimages.jpg" alt="">
            <div class="text">
            </div>
          </div>
          <div class="back">
            <img class="backImg" src="assets/backimages.jpg" alt="">
            <div class="text">
            </div>
          </div>
        </div>
        <div class="forms">
            <div class="form-content">
              <div class="login-form">
                <div class="title">Login</div>
              <form action="./signin" method="post">
                <div class="input-boxes">
                  <div class="input-box">
                    <i class="fas fa-envelope"></i>
                    <input name="email" type="text" placeholder="Enter your email" required>
                  </div>
                  <div class="input-box">
                    <i class="fas fa-lock"></i>
                    <input name="senha" type="password" placeholder="Enter your password" required>
                  </div>
                  <div class="text"><a href="#">Esqueceu sua senha?</a></div>
                  <div class="button input-box">
                    <button type="submit">Entrar</button>
                    
                  </div>
                  <div class="text sign-up-text">Nao tem uma conta? <label for="flip">registre-se</label></div>
                </div>
            </form>
          </div>
            <div class="signup-form">
              <div class="title">Cadastre-se</div>
              <form action="./signup" method="post">
                <div class="input-boxes">
                  <div class="input-box">
                    <i class="fas fa-user"></i>
                    <input name="nome" type="text" placeholder="Enter your name" required>
                  </div>
                  <div class="input-box">
                    <i class="fas fa-envelope"></i>
                    <input name="email" type="text" placeholder="Enter your email" required>
                  </div>
                  <div class="input-box">
                    <i class="fas fa-lock"></i>
                    <input name="senha" type="password" placeholder="Enter your password" required>
                  </div>
                  <div class="button input-box">
                      <button type="submit">Cadastrar</button>
                    
                  </div>
                  <div class="text sign-up-text">Ja tem uma conta? <label for="flip">faca seu login</label></div>
                </div>
          </form>
        </div>
        </div>
        </div>
      </div>
    <script src="js/app.js" type="text/javascript"></script>
</body>
</html>