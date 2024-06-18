function payWithPix() {
    const pixValue = document.getElementById("pix").value;
    document.getElementById("paymentResult").innerText = `Pagamento de ${pixValue} via Pix realizado com sucesso!`;
  }
  function payWithCreditCard() {
    const creditCardNumber = document.getElementById("creditCard").value;
    const expiryDate = document.getElementById("expiryDate").value;
    const cvv = document.getElementById("cvv").value;
    document.getElementById("paymentResult").innerText = `Pagamento com cartão de crédito realizado com sucesso!`;
  }
  