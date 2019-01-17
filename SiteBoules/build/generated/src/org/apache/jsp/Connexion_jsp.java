package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Connexion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/config.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"fr\">\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <title>Connexion</title>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"resources/css/headfoot.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Fixed navbar -->\r\n");
      out.write("\r\n");
      out.write("  <nav class=\"navbar navbar-expand-md navbar-light fixed-top \">\r\n");
      out.write("\t<a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("            <img src=\"resources/images/boulepetanque3.png\" class=\"logo\" alt=\"logo\">\r\n");
      out.write("        </a>\r\n");
      out.write("            \r\n");
      out.write("\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t  <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t</button>\r\n");
      out.write("\t<div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("\t  <ul class=\"navbar-nav m-auto\">\r\n");
      out.write("\t\t<li class=\"nav-item active\">\r\n");
      out.write("\t\t  <a class=\"nav-link\" href=\"#\">Julian<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t  <a class=\"nav-link\" href=\"#\">Gérard</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t  <a class=\"nav-link\" href=\"#\">Roger</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t  </ul>\r\n");
      out.write("\t  \r\n");
      out.write("\t</div>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- Begin page content -->\r\n");
      out.write("        <main role=\"main\" class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("            <!-- Formulaire de connexion -->\r\n");
      out.write("            <form method =\"post\" action=\"Controleur\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-group\"> \r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"hidden\" name =\"todo\" value=\"Connexion\"/>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"email\">Identifiant :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"identifiant\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"pwd\">Mot de passe :</label>\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name =\"mdp\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type =\"submit\" class=\"btn btn-dark\" value =\"Connexion\"/>\r\n");
      out.write("                \r\n");
      out.write("                </div>\r\n");
      out.write("             </form>\r\n");
      out.write("        </main>\r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("        <footer class=\"footer\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<span class=\"text-muted\">MesBoules.com - © Tous droits réservés.</span>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("        </footer>\r\n");
      out.write("        \r\n");
      out.write("        <!-- JavaScript mis à la fin pour charger la page plus vite -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
