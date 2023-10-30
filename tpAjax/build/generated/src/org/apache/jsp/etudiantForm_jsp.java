package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import ma.school.beans.Etudiant;
import ma.school.service.EtudiantService;

public final class etudiantForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/template/header.jsp");
    _jspx_dependants.add("/template/menu.jsp");
    _jspx_dependants.add("/template/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script src=\"script/script.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"script/jsonExemple.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"style/css1.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<div class=\"header\" style=\"height:110px;width: 100%;\">\r\n");
      out.write("    <img src=\"../images/Logo_Ensaj.png\" alt=\"\"/>\r\n");
      out.write("    <img id=\"logo\" src=\"images/Logo_Ensaj.png\" alt=\"logo\" style=\"width:100px;height:100px;\"/>     \r\n");
      out.write("    <span id=\"horloge\" style=\"font-family: Courier New;text-align: center; width:100%;\"></span>\r\n");
      out.write("    <link href=\"../style/css1.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"script/horloge.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Menu</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write("        .navbar {\r\n");
      out.write("            background-color: #444;\r\n");
      out.write("            padding: 10px 0;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar ul {\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar li {\r\n");
      out.write("            display: inline;\r\n");
      out.write("            margin: 0 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar a {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar a:hover {\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"navbar\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a class=\"active\" href=\"graphe.jsp\">Graphe Machine par marques</a></li>\r\n");
      out.write("                <li><a href=\"etudiantForm.jsp\">Gestion des etudiants</a></li>\r\n");
      out.write("                <li><a href=\"marqueForm.jsp\">Gestion des marques</a></li>\r\n");
      out.write("                <li><a href=\"machineForm.jsp\">Gestion des machines</a></li>\r\n");
      out.write("                <li><a href=\"machineByMarqueForm.jsp\">Machines par marque</a></li>\r\n");
      out.write("                <li><a href=\"machineByReferenceForm.jsp\">Machines par reference</a></li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("<!--<ul>\r\n");
      out.write("    <li><a class=\"active\" href=\"#home\">Home</a></li>\r\n");
      out.write("    <li><a href=\"etudiantForm.jsp\">Gestion des etudiants</a></li>\r\n");
      out.write("    <li><a href=\"marqueForm.jsp\">Gestion des marques</a></li>\r\n");
      out.write("    <li><a href=\"machineForm.jsp\">Gestion des machines</a></li>\r\n");
      out.write("    <li><a href=\"machineByMarqueForm.jsp\">Machines par marque</a></li>\r\n");
      out.write("\r\n");
      out.write("</ul>-->");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <link href=\"../style/css1.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <foot>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </foot>\r\n");
      out.write("    <body>\r\n");
      out.write("        <img src=\"../images/Logo_Ensaj.png\" alt=\"\"/>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <form method=\"GET\" action=\"EtudiantController\">\r\n");
      out.write("                ");

                    EtudiantService es = new EtudiantService();
                
      out.write("\r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                        <legend>Informations Etudiant</legend>\r\n");
      out.write("                               \r\n");
      out.write("                        \r\n");
      out.write("                    <table border=\"0\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            \r\n");
      out.write("                                \r\n");
      out.write("                                <td>Nom</td>\r\n");
      out.write("                                <td><input id=\"nom\" type=\"text\" name=\"nom\" value=\"\"  required=\"\"/></td>\r\n");
      out.write("                               \r\n");
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          \r\n");
      out.write("                              \r\n");
      out.write("                                <td>Prenom</td>\r\n");
      out.write("                                <td><input id=\"prenom\" type=\"text\" name=\"prenom\" value=\"\" required=\"\" /></td>\r\n");
      out.write("                           \r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                           \r\n");
      out.write("                               \r\n");
      out.write("                                <td>Ville</td>\r\n");
      out.write("                                <td><select id=\"ville\" name=\"ville\">\r\n");
      out.write("                                        <option value=\"Rabat\">Rabat</option>\r\n");
      out.write("                                        <option value=\"Fes\">Fes</option>\r\n");
      out.write("                                        <option value=\"Marakech\">Marrakech</option>\r\n");
      out.write("\r\n");
      out.write("                                    </select></td>\r\n");
      out.write("                                \r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            \r\n");
      out.write("                                \r\n");
      out.write("                                <td>Date de Naissance</td>\r\n");
      out.write("                                <td><input id=\"date\" type=\"date\" name=\"dateNaissance\" value=\"\" required=\"\" /></td>\r\n");
      out.write("\r\n");
      out.write("                          \r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Sexe</td>\r\n");
      out.write("                            <td>M<input id=\"m\" type=\"radio\" name=\"sexe\" value=\"homme\" />\r\n");
      out.write("                                F<input id=\"f\" type=\"radio\" name=\"sexe\" value=\"femme\" checked=\"checked\" /></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                           \r\n");
      out.write("                            \r\n");
      out.write("                                    <input name=\"op\" type=\"submit\" value=\"Envoyer\" />\r\n");
      out.write("                               </td>\r\n");
      out.write("                          <td>\r\n");
      out.write("                                    <input name=\"op\" type=\"submit\" value=\"Apply\" />\r\n");
      out.write("                               </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </fieldset>\r\n");
      out.write("            </form>\r\n");
      out.write("         \r\n");
      out.write("            <fieldset>\r\n");
      out.write("                <legend>Liste des étudiants</legend>\r\n");
      out.write("\r\n");
      out.write("                <table border=\"1\" class=\"tab\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Id</th>\r\n");
      out.write("                            <th>Nom <br>\r\n");
      out.write("                            <th>Prenom</th>\r\n");
      out.write("                            <th>Ville</th>\r\n");
      out.write("                            <th>Date de naissance</th>\r\n");
      out.write("                            <th>Sexe</th>\r\n");
      out.write("                            <th>Supprimer</th>\r\n");
      out.write("                            <th>Modifier</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");
                            for (Etudiant e : es.findAll()) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.print(e.getId());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(e.getNom());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(e.getPrenom());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(e.getVille());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(e.getDateNaissance());
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print(e.getSexe());
      out.write("</td>\r\n");
      out.write("                            <td><a class=\"bndelete\" href=\"javascript:void(0);\" onclick=\"confirmDel('");
      out.print(e.getId());
      out.write("', '");
      out.print(e.getNom() + " " + e.getPrenom());
      out.write("','Etudiant')\">Supprimer</a></td>\r\n");
      out.write("                            <td><a class=\"bnupdate\" href=\"EtudiantController?op=update&id=");
      out.print(e.getId());
      out.write("\">Modifier</a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("            </fieldset>\r\n");
      out.write("        </div>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <input name=\"userId\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" />\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
