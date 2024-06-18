<%--
Views should be stored under the WEB-INF folder so that
they are not accessible except through controller process.

This JSP is here to provide a redirect to the dispatcher
servlet but should be the only JSP outside of WEB-INF.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% response.sendRedirect("index.htm"); %>


<video width="320" height="240" controls>
    <source src="assets/home.mp4" type="video/mp4">
    Your browser does not support the <code>video</code> tag.
</video>

<script src="js/index.js" type="text/javascript"></script>
<link href="css/serch-box.css" rel="stylesheet" type="text/css"/>
<link href="css/stilos.css" rel="stylesheet" type="text/css"/>
<link href="css/styles2.css" rel="stylesheet" type="text/css"/>
<script src="js/app.js" type="text/javascript"></script>
<script src="js/app.js" type="text/javascript"></script>
<script src="js/carrinho.js" type="text/javascript"></script>
<link href="css/carinho.css" rel="stylesheet" type="text/css"/>
<link href="css/carrinho.css" rel="stylesheet" type="text/css"/>
<script src="js/carrinho.js" type="text/javascript"></script>
<link href="css/cadastro.css" rel="stylesheet" type="text/css"/>
<link href="css/concluido.css" rel="stylesheet" type="text/css"/>
<link href="css/avaliacoes.css" rel="stylesheet" type="text/css"/>
<link href="css/termos.css" rel="stylesheet" type="text/css"/>
<script src="js/pagamento.js" type="text/javascript"></script>
<link href="css/acompanhar.css" rel="stylesheet" type="text/css"/>