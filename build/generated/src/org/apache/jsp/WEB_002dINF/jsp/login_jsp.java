package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Login</title>\r\n");
      out.write("  <link href=\"css/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("  <script src=\"https://kit.fontawesome.com/cf6fa412bd.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"buttonsForm\">\r\n");
      out.write("      <div class=\"btnColor\"></div>\r\n");
      out.write("      <button id=\"btnSignin\">Sign in</button>\r\n");
      out.write("      <button id=\"btnSignup\">Sign up</button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <form id=\"signin\">\r\n");
      out.write("      <input type=\"text\" placeholder=\"Email\" required />\r\n");
      out.write("      <i class=\"fas fa-envelope iEmail\"></i>\r\n");
      out.write("      <input type=\"password\" placeholder=\"Password\" required />\r\n");
      out.write("      <i class=\"fas fa-lock iPassword\"></i>\r\n");
      out.write("      <div class=\"divCheck\">\r\n");
      out.write("        <input type=\"checkbox\" />\r\n");
      out.write("        <span>Relembrar Senha</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <button type=\"submit\">Sign in</button>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <form id=\"signup\">\r\n");
      out.write("      <input type=\"text\" placeholder=\"Email\" required />\r\n");
      out.write("      <i class=\"fas fa-envelope iEmail\"></i>\r\n");
      out.write("      <input type=\"password\" placeholder=\"Password\" required />\r\n");
      out.write("      <i class=\"fas fa-lock iPassword\"></i>\r\n");
      out.write("      <input type=\"password\" placeholder=\"Password\" required />\r\n");
      out.write("      <i class=\"fas fa-lock iPassword2\"></i>\r\n");
      out.write("      <div class=\"divCheck\">\r\n");
      out.write("        <input type=\"checkbox\" required />\r\n");
      out.write("        <span>Aceitar Termos</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <button type=\"submit\">Sign up</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <script src=\"js/index.js\" type=\"text/javascript\"></script>\r\n");
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
