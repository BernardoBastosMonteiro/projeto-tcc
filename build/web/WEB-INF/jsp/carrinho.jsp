<!DOCTYPE html>
<html lang="en">
<head>
    <link href="css/carrinho.css" rel="stylesheet" type="text/css"/>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <title>Carrrinho</title>
</head>
<body>
    <div class="container">
        <h1>Confirme seu pagamento</h1>
        <div class="first-row">
            <div class="owner">
                <h3>Nome Completo</h3>
                <div class="input-field">
                    <input type="text">
                </div>
            </div>
            <div class="cvv">
                <h3>CVV</h3>
                <div class="input-field">
                    <input type="password">
                </div>
            </div>
        </div>
        <div class="second-row">
            <div class="card-number">
                <h3>Numero do cartao</h3>
                <div class="input-field">
                    <input type="text">
                </div>
            </div>
        </div>
        <div class="second-row">
            <div class="card-number">
                <h3>Endereco de cobranca</h3>
                <div class="input-field">
                    <input type="Email ou Telefone">
                </div>
            </div>
        </div>
        <div class="third-row">
            <h3>Data de Validade</h3>
            <div class="selection">
                <div class="date">
                    <select name="months" id="months">
                        <option value="Jan">Jan</option>
                        <option value="Feb">Feb</option>
                        <option value="Mar">Mar</option>
                        <option value="Apr">Apr</option>
                        <option value="May">May</option>
                        <option value="Jun">Jun</option>
                        <option value="Jul">Jul</option>
                        <option value="Aug">Aug</option>
                        <option value="Sep">Sep</option>
                        <option value="Oct">Oct</option>
                        <option value="Nov">Nov</option>
                        <option value="Dec">Dec</option>
                      </select>
                      <select name="years" id="years">
                        <option value="2025">2025</option>
                        <option value="2024">2024</option>
                        <option value="2023">2023</option>
                        <option value="2022">2022</option>
                        <option value="2021">2021</option>
                        <option value="2020">2020</option>
                      </select>
                </div>
                <div class="cards">
                    <img src="assets/mc.png" alt="">
                    <img src="assets/vi.png" alt="">
                    <img src="assets/pp.png" alt="">
                </div>
            </div>    
        </div>
        <a href="./PedidoController">Confirmar</a>
    </div>

</html>