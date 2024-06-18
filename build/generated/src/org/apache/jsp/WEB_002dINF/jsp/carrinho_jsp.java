package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carrinho_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <link href=\"css/carrinho.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Carrrinho</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t<p>Metodos de pagamento</p>\r\n");
      out.write("\t\t\t<hr style=\"border:1px solid #ccc; margin: 0 15px;\">\r\n");
      out.write("\t\t\t<div class=\"methods\">\r\n");
      out.write("\t\t\t\t<div onclick=\"doFun()\" id=\"tColorA\" style=\"color: greenyellow;\"><i class=\"fa-solid fa-credit-card\" style=\"color: greenyellow;\"></i> pagamento com cartao </div>\r\n");
      out.write("\t\t\t\t<div onclick=\"doFunA()\" id=\"tColorB\"><i class=\"fa-solid fa-building-columns\"></i> Banco</div>\r\n");
      out.write("\t\t\t\t<div onclick=\"doFunB()\" id=\"tColorC\"><i class=\"fa-solid fa-wallet\"></i> Apple/Google pay</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr style=\"border:1px solid #ccc; margin: 0 15px;\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t<a href=\"https://www.shift4shop.com/credit-card-logos.html\"><img alt=\"Credit Card Logos\" title=\"Credit Card Logos\" src=\"https://www.shift4shop.com/images/credit-card-logos/cc-lg-4.png\" width=\"250\" height=\"auto\"/></a>\r\n");
      out.write("\t\t\t<hr style=\"border:1px solid #ccc; margin: 0 15px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"card-details\">\r\n");
      out.write("\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t<p>Numero de cartao</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"c-number\" id=\"c-number\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"number\" class=\"cc-number\" placeholder=\"Numero do cartao\" maxlength=\"19\" required>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa-solid fa-credit-card\" style=\"margin: 0;\"></i>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"c-details\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Data de expiracao</p>\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"e-date\" class=\"cc-exp\" placeholder=\"MM/YY\" required maxlength=\"5\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<p>CVV</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cvv-box\" id=\"cvv-box\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"cvv\" class=\"cc-cvv\" placeholder=\"CVV\" required maxlength=\"3\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa-solid fa-circle-question\" title=\"3 digits on the back of the card\" style=\"cursor: pointer;\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"email\">\r\n");
      out.write("\t\t\t\t\t\t<p>Email</p>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" placeholder=\"example@email.com\" id=\"email\" required>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button>PAGAR AGORA</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t<p>InformaÃ§Ãµes do pedido</p>\r\n");
      out.write("\t\t\t<hr style=\"border:1px solid #ccc; margin: 0 15px;\">\r\n");
      out.write("\t\t\t<div class=\"details\">\r\n");
      out.write("\t\t\t\t<div style=\"font-weight: bold; padding: 3px 0;\">DescriÃ§Ã£o do pedido</div>\r\n");
      out.write("\t\t\t\t<div style=\"padding: 3px 0;\">Pagamento de teste</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr style=\"border:1px solid #ccc; margin: 0 15px;\">\r\n");
      out.write("\t\t\t<a href=\"https://www.shift4shop.com/credit-card-logos.html\"><img alt=\"Credit Card Logos\" title=\"Credit Card Logos\" src=\"https://www.shift4shop.com/images/credit-card-logos/cc-lg-4.png\" width=\"100%\" height=\"auto\" /></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
