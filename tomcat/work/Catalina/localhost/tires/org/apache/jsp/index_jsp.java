package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/page/header.html");
    _jspx_dependants.add("/page/footer.html");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      			"/page/error.jsp?from=index.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Tire Application</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/PAGE/style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <center>\r\n");
      out.write("        ");
      out.write("<!--\n");
      out.write("Header\n");
      out.write("\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("        <td><h2><b>Tire System</b></h2></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><a href=\"index.jsp\">Home</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"addNewTire.do\">Add New Tire</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"addNewTireBrand.do\">Add New Tire Brand</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"addNewTirePattern.do\">Add New Tire Pattern</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"addNewTireStatus.do\">Add New Tire Status</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"addNewTireSupplier.do\">Add New Tire Supplier</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"addNewTireType.do\">Add New Tire Type</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"addNewVehicle.do\">Add New Vehicle</a></td>    \t\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"addNewVehicleConfiguration.do\">Add New Vehicle Configuration</a></td>    \t    \t    \n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><a href=\"services.jsp\">Services</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"\">Edit Tire</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"\">Edit Tire Brand</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"\">Edit Tire Pattern</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"\">Edit Tire Status</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"\">Edit Tire Supplier</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"\">Edit Tire Type</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"\">Edit Vehicle</a></td>    \t    \t    \t    \t    \t\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"\">Edit Vehicle Configuration</a></td>  \n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    \t<td><a href=\"company.jsp\">Company</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"viewAllTires.do\">All Tires</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"viewAllTireBrands.do\">All TireBrands</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"viewAllTirePatterns.do\">All TirePatterns</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"viewAllTireStatuses.do\">All TireStatuses</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"viewAllTireSuppliers.do\">All TireSuppliers</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"viewAllTireTypes.do\">All TireTypes</a></td>  \n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td><a href=\"viewAllVehicles.do\">All Vehicles</a></td>\n");
      out.write("    \t<td></td>    \t\n");
      out.write("    \t<td><a href=\"viewAllVehicleConfigurations.do\">All Vehicle Configurations</a></td>  \t    \t    \t\n");
      out.write("    </tr>\n");
      out.write("    <tr>        \n");
      out.write("    \t<td><a href=\"login.jsp\">Login</a></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    \t<td></td>\n");
      out.write("    </tr>\t\n");
      out.write("</table>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("<!--\n");
      out.write("Footer\n");
      out.write("-->\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>           \n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("<center>\n");
      out.write("    <font face=\"Arial\" size=\"2\"> Copyright 2011, Tires Tracking</font>\n");
      out.write("</center>\n");
      out.write("            \r\n");
      out.write("        </center>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
