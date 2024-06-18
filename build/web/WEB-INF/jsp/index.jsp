<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>VIAGELES</title>
  <script src="https://kit.fontawesome.com/ca900a5c2d.js" crossorigin="anonymous"></script>
  <link href="css/viagens.css" rel="stylesheet" type="text/css"/>
  <link href="css/pacotes.css" rel="stylesheet" type="text/css"/>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
  <script src="https://unpkg.com/feather-icons"></script>
  

</head>
<body>
    
    <header class="site">

        <div id="menu-btn" class="fas fa-bars"></div>

        <a href="#" class="logo">VIAGELES</a>

        <nav class="navbar">
            <div id="close-navbar" class="fas fa-times"></div>
            <a href="#home">home</a>
            <a href="#about">sobre</a>
            <a href="#pacotes">servicos</a>
            <a href="#packages">viagens</a>
            <a href="#gallery">galerias</a>  
        </nav>
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
        <main>
            
            
            <div class="search-container">
                <label for="search-input" class="search-icon"></label>
                <input type="text" class="search-input" id="search-input" required />
            </div>
        </main>
        

   
    <section class="home" id="home">

        <div class="content">
            <p>Embarque em viagens emocionantes conosco</p>
            
        </div>

        <div class="video-container">
            <video src="assets/192649-892970391_small.mp4" id="video" loop autoplay muted></video>
        </div>

    </section>

   
    <section class="about" id="about">

        <h1 class="heading">sobre nos</h1>

        <div class="container">

            <div class="image-container">
                <img src="assets/106616793-1594805802117gettyimages-900809876-scaled.jpg" alt="" class="image">
                <div class="controls">
                    <span class="control-btn" data-src="images/about-1.jpg"></span>
                    <span class="control-btn" data-src="images/about-2.jpg"></span>
                    <span class="control-btn" data-src="images/about-3.jpg"></span>
                </div>
            </div>

            <div class="content">
                <span>Bem-vindo a nossa jornada</span>
                <h3>Embarque em jornadas inesqueciveis</h3>
                <p>Mergulhe na arte da exploracao conosco. Nossa missao e criar produtos unicos e
                    Experiencias de viagem enriquecedoras para todos os aventureiros. Guiado por uma guia pela descoberta,
                    Convidamos voces a se juntar a nossa em uma jornada onde cada destino se torna um capitulo em sua
                    Propria historia de viagem.</p>
                <a href="#" class="btn"> saiba mais</a>    
            </div>

        </div>

    </section>

   
    <section class="services" id="services">

        <h1 class="heading"></h1>

        <div class="box-container">

            <div class="box">
                <img src="assets/services-2.png" alt="">
                <h3>aventuras</h3>
                <p>A empresa em si sera uma empresa de muito sucesso.</p>
                <a href="#" class="btn">saiba mais</a>
            </div>

            <div class="box">
               <img src="assets/services-3.png" alt="">
                <h3>comida & bebidas</h3>
                <p>A empresa em si sera uma empresa de muito sucesso.</p>
                <a href="#" class="btn">saiba mais</a>
            </div>

        </div>

    </section>

    

    <section id="pacotes" class="pacotes">
		<h1 class="pacotes-title">Conheca nossos pacotes</h1>
		<div class="pacotes-cards">
			<div class="card">
				<div class="card-tag card-tag-top">
					<p>Promocao</p>
				</div>
				<div class="card-tag card-tag-bottom">
					<p>10x R$ 500,00</p>
				</div>
				<img class="card-image" src="assets/RiodeJaneiro11A.jpg" alt="Toronto">
				<div class="card-content">
					<h1>Rio de Janeiro, Brasil</h1>
					<ul>
						<li><i data-feather="check"></i>7 diarias;</li>
						<li><i data-feather="coffee"></i>Cafe da manha incluso;</li>
						<li><i data-feather="map-pin"></i>Hotel bem localizado;</li>
                        <a href="./PagamentoControler" class="button">Adicionar</a>
                        
					</ul>
				</div>
			</div>

			<div class="card">
                <div class="card-tag card-tag-top">
					<p>Promocao</p>
				</div>
				<div class="card-tag card-tag-bottom">
					<p>10x R$ 899,00</p>
				</div>
				<img class="card-image" src="assets/jericoacoara.jpg" alt="Sydney">
				<div class="card-content">
					<h1>jericoacoara, Ceara</h1>
					<ul>
						<li><i data-feather="check"></i>7 diarias;</li>
						<li><i data-feather="coffee"></i>Cafe da manha incluso;</li>
						<li><i data-feather="truck"></i>Translado incluso;</li>
                        <a href="./PagamentoControler" class="button">Adicionar</a>
					</ul>
				</div>
			</div>

			<div class="card">
                <div class="card-tag card-tag-top">
					<p>Promocao</p>
				</div>
				<div class="card-tag card-tag-bottom">
					<p>8x R$ 1199,00</p>
				</div>
				<img class="card-image" src="assets/maranhao.jpg" alt="Hong Kong">
				<div class="card-content">
					<h1>Maranhao, Nordeste</h1>
					<ul>
						<li><i data-feather="check"></i>10 diarias;</li>
						<li><i data-feather="coffee"></i>Cafe da manhe incluso;</li>
						<li><i data-feather="map-pin"></i>Hotel bem localizado;</li>
                        <a href="./PagamentoControler" class="button">Adicionar</a>
					</ul>
				</div>
			</div>

			<div class="card">
                <div class="card-tag card-tag-top">
					<p>Promocao</p>
				</div>
				<div class="card-tag card-tag-bottom">
					<p>12x R$ 630,00</p>
				</div>
				<img class="card-image" src="assets/copacabana.jpg" alt="Nova York">
				<div class="card-content">
					<h1>copacabana, Rio de Janeiro</h1>
					<ul>
						<li><i data-feather="check"></i>7 diarias;</li>
						<li><i data-feather="coffee"></i>Cafe da manha incluso;</li>
						<li><i data-feather="flag"></i>Guia turistico incluso;</li>
                        <a href="./PagamentoControler" class="button">Adicionar</a>
					</ul>
				</div>
			</div>

			<div class="card">
                <div class="card-tag card-tag-top">
					<p>Promocao</p>
				</div>
				<div class="card-tag card-tag-bottom">
					<p>12x R$ 598,00</p>
				</div>
				<img class="card-image" src="assets/51ba19a2-a05f-462d-8edf-2e8f1b2662d5.jpg" alt="Londres">
				<div class="card-content">
					<h1>Balneario Camburiu,  Santa Catarina</h1>
					<ul>
						<li><i data-feather="check"></i>7 diarias;</li>
						<li><i data-feather="coffee"></i>Cafe da manha incluso;</li>
						<li><i data-feather="flag"></i>Guia turistico incluso;</li>
                        <a href="./PagamentoControler" class="button">Adicionar</a>
					</ul>
				</div>
			</div>

			<div class="card">
                <div class="card-tag card-tag-top">
					<p>Promocao</p>
				</div>
				<div class="card-tag card-tag-bottom">
					<p>10x R$ 723,00</p>
				</div>
				<img class="card-image" src="assets/milao.jpg" alt="Milão">
				<div class="card-content">
					<h1>Milao, Italia</h1>
					<ul>
						<li><i data-feather="check"></i>7 diarias;</li>
						<li><i data-feather="coffee"></i>Cafe da manha incluso;</li>
						<li><i data-feather="flag"></i>Guia turistico incluso;</li>
                        <a href="./PagamentoControler" class="button">Adicionar</a>
                        
					</ul>
				</div>
			</div>

		</div>
	</section>

   

    <section class="gallery" id="gallery">

        <h1 class="heading">nossa galeria</h1>

        <div class="box-container">

            <div class="box">
                <img src="assets/copacabana.jpg" alt="">
            </div>

            <div class="box">
                <img src="assets/jericoacoara.jpg" alt="">
            </div>

            <div class="box">
                <img src="assets/maranhao.jpg" alt="">
            </div>

            <div class="box">
                <img src="assets/turismo.jpg" alt="">
            </div>



        </div>

    </section>

    

    <section class="book" id="book">

        <div class="row">

           

            

        </div>

    </section>

  
    <section class="newsletter">

        <div class="content">
            <h3>cadastre-se </h3>
            <p>A empresa em si sera uma empresa de muito sucesso. Portanto, de fato, com as necessidades do corpo, esses prazeres da mente!</p>
            <form action="">
                <input type="email" placeholder="Entrar com seu email" class="email">
                <input type="submit" value="sign up" class="btn">
            </form> 
            <p>Ja tem uma conta? <a href="./ControlerLogin">Entrar</a></p>
        </div>

    </section>


    <section class="footer">

        <div class="box-container">

            <div class="box">
                <h3>Meu Contato</h3>
                <a href="#"> <i class="fas fa-phone"></i> +5543988173824</a>
                <a href="#"><i class="fas fa-envelope"></i> thaga0499@gmail.com</a>
                <a href="#"><i class="fas fa-map"></i> Londrina, Parana</a>
            </div>

            <div class="box">
                <h3>Links Rapidos</h3>
                <a href="#"><i class="fas fa-arrow-right"></i>destinos populares</a>
               
            </div>

            <div class="box">
                <h3>recursos de viagem</h3>
                <a href="#"><i class="fas fa-arrow-right"></i> guia de viagem</a>
                
            </div>

            <div class="box">
                <h3>informacoes legal</h3>
                <a href="./termosController"><i class="fas fa-arrow-right"></i> termos e Condicoes</a>
               
            </div>

        </div>

    </section>
    <script>
        feather.replace();
      </script>
    <script src="https://unpkg.com/feather-icons"></script>
   <script src="js/script.js" type="text/javascript"></script>
   <script src="./js/carrinho.js"></script>
</body>
</html>