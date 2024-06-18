document.addEventListener("DOMContentLoaded", function() {
    console.log("asdas")
   
    const abrirCarrinho = document.getElementById("openCarrinho");
    const fecharCarrinho = document.getElementById("closeCarrinho");
    const background = document.getElementById("background-carrinho");
    const carrinho = document.getElementById("carrinho");

    abrirCarrinho.addEventListener("click", function() {
        carrinho.classList.add("aberto");
    });

    
    function fechar() {
        carrinho.classList.remove("aberto");
    };

    
    fecharCarrinho.addEventListener("click", fechar);
    background.addEventListener("click", fechar);
});
