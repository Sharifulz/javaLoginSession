package org.apache.jsp;

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>JSP Form Validation</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"img/check.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("      \n");
      out.write("        <script type=\"text/javascript\" src=\"sweetalert.js\"></script>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"js/bootbox.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/myform.js\"></script>\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/sweetalert.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/sweetalert.js\"></script>\n");
      out.write("            \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <input type=\"submit\" name=\"submit\" value=\"WELCOME\" class=\"btn btn-primary btn-block\" onclick=\"m1()\" />\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4\"></div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                    <img src=\"img/img.png\" class=\"card-img-top\" alt=\"\" style=\"margin-top: 10px\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary btn-block\" data-target=\"#mymodal\" data-toggle=\"modal\">Log In</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\"></div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <hr>\n");
      out.write("        <!-- **************************MODAL STARTS*************************-->\n");
      out.write("        <div class=\"modal\" id=\"mymodal\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h3 class=\"text-primary\" style=\"margin-left: 180px;\">Log In</h3>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <!--FORMS*******************-->\n");
      out.write("                        <form action=\"loggin\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" name=\"user\" class=\"form-control\" id=\"users\" placeholder=\"Enter User\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" name=\"pass\" class=\"form-control\" id=\"passWord\" placeholder=\"Password\">\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"submit\" name=\"submit\" value=\"Submit\" class=\"btn btn-primary btn-block\" onclick=\"invalid()\"/>\n");
      out.write("                            <input type=\"reset\" name=\"reset\" value=\"Clear\" class=\"btn btn-danger btn-block\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function m1() {\n");
      out.write("               swal(\"Log In Please!\", \"Log In Go Admin Page!\", \"warning\");\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script> \n");
      out.write("    </body>\n");
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
