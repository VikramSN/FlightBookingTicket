package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbarhead_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/merastyle.css\" />\n");
      out.write("        <script src=\"js/sweetalert.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/sweetalert.css\">  \n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("          \n");
      out.write("            .navstyle {\n");
      out.write("\n");
      out.write("                font-size: 10px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"images/backas.jpg\");\n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("  function checkForm(form)\n");
      out.write("  {\n");
      out.write("    if(form.pass.value != \"\" && form.pass.value == form.repass.value) {\n");
      out.write("      if(form.pass.value.length < 6) {\n");
      out.write("        swal(\n");
      out.write("      'Error!',\n");
      out.write("      'Password must contain at least six characters!',\n");
      out.write("      'error'\n");
      out.write("    )\n");
      out.write("        form.pass.focus();\n");
      out.write("        return false;\n");
      out.write("      }\n");
      out.write("      re = /[0-9]/;\n");
      out.write("      if(!re.test(form.pass.value)) {\n");
      out.write("           swal(\n");
      out.write("      'Error!',\n");
      out.write("      'Password must contain at least one number (0-9)!',\n");
      out.write("      'error'\n");
      out.write("  )\n");
      out.write("        form.pass.focus();\n");
      out.write("        return false;\n");
      out.write("      }\n");
      out.write("      re = /[a-z]/;\n");
      out.write("      if(!re.test(form.pass.value)) {\n");
      out.write("        swal(\n");
      out.write("      'Error!',\n");
      out.write("      'Password must contain at least one lowercase letter (a-z)!',\n");
      out.write("      'error'\n");
      out.write("    )\n");
      out.write("        form.pass.focus();\n");
      out.write("        return false;\n");
      out.write("      }\n");
      out.write("      re = /[A-Z]/;\n");
      out.write("      if(!re.test(form.pass.value)) {\n");
      out.write("        swal(\n");
      out.write("      'Error!',\n");
      out.write("      'Password must contain at least one uppercase letter (A-Z)!',\n");
      out.write("      'error'\n");
      out.write("    )\n");
      out.write("        form.pass.focus();\n");
      out.write("        return false;\n");
      out.write("      }\n");
      out.write("    } else {\n");
      out.write("      swal(\n");
      out.write("      'Error!',\n");
      out.write("      'Paassword not Match!',\n");
      out.write("      'error'\n");
      out.write("    )\n");
      out.write("      form.pass.focus();\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("    swal(\n");
      out.write("  'Success!',\n");
      out.write("  'Registration Successfully\\nYour Password has sent on your Email-id.',\n");
      out.write("  'success'\n");
      out.write(")\n");
      out.write("    return true;\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!---- start navbar ------------------------------------ -->\n");
      out.write("        <nav class=\"navbar navbar-inverse\" style=' background-color: #1C2C64; border: none'>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <img class=\"navbar-brand\" src='images/webicon.png' />\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">PhoenixAirways</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav navstyle\">\n");
      out.write("                    <li><a href=\"HomePage.jsp\"><b>HOME</b></a></li>      \n");
      out.write("                    <li><a href=\"Product.jsp\"><b>PRODUCTS</b></a></li>\n");
      out.write("                    <li><a href=\"faq.jsp\"><b>FAQ's</b></a></li>\n");
      out.write("                    <li><a href=\"Contact_Us.jsp\"><b>CONTACT US</b></a></li>\n");
      out.write("                    <li><a href=\"About_us.jsp\"><b>ABOUT US</b></a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- User Login Form Started -->\n");
      out.write("                    <div id=\"id01\" class=\"modal\">\n");
      out.write("\n");
      out.write("                        <form class=\"modal-content animate\" action=\"logincheck.jsp\">\n");
      out.write("                            <div class=\"imgcontainer\">\n");
      out.write("                                <span onclick=\"document.getElementById('id01').style.display = 'none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("                                <img src=\"images/myprofile.png\" alt=\"Login Pic\" class=\"avatar\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Login Form Started -->\n");
      out.write("                            <div class=\"container \">\n");
      out.write("\n");
      out.write("                                <label><b>Email Id</b></label><br>\n");
      out.write("                                <input type=\"email\" placeholder=\"Enter Email-Id\" name=\"email\" required><br><br>\n");
      out.write("\n");
      out.write("                                <label><b>Password</b></label><br>\n");
      out.write("                                <input type=\"password\" placeholder=\"Enter Password\" name=\"pass\" required><br><br>\n");
      out.write("\n");
      out.write("                                <button type=\"submit\" onclick=\"log(this.form)\">Login</button><br><br>\n");
      out.write("                                <a href=\"#\" onclick=\"document.getElementById('id02').style.display = 'block', document.getElementById('id01').style.display = 'none'\" ><b>Click for Registration</b></a><br><br>\n");
      out.write("                                <input type=\"checkbox\" checked=\"checked\"> Remember me<br><br>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div  style=\"background-color:#f1f1f1\">\n");
      out.write("                                <button type=\"button\" onclick=\"document.getElementById('id01').style.display = 'none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("                                <span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--User Login Form End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--           User Logged UserName Button \n");
      out.write("                    <li id=\"hi4\"><a href=\"#\" ><span class=\"glyphicon glyphicon-user\"></span> Vikram Singh Negi</a></li>\n");
      out.write("                     User Logout Button \n");
      out.write("                    <li id=\"hi5\"><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Log Out</a></li>-->\n");
      out.write("\n");
      out.write("                    <div id=\"id02\" class=\"modal\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- User Registration Form Started -->                    \n");
      out.write("                        <form class=\"modal-content animate\" action=\"RegisSuccess.jsp\"  method=\"POST\" onsubmit=\"return checkForm(this)\">\n");
      out.write("                            <div class=\"imgcontainer\">\n");
      out.write("                                <span onclick=\"document.getElementById('id02').style.display = 'none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <label><b>Name</b></label><br>\n");
      out.write("                                <input type=\"text\" placeholder=\"Enter Name\" name=\"name\" required><br>\n");
      out.write("\n");
      out.write("                                <label><b>Mobile</b></label><br>\n");
      out.write("                                <input type=\"text\" placeholder=\"Enter Mobile Number\" name=\"contact\" onchange=\"CheckIndianNumber(this.value)\"  required maxlength=\"10\"><br>\n");
      out.write("\n");
      out.write("                                <script>\n");
      out.write("                                    function CheckIndianNumber(IndianNumber)\n");
      out.write("                                    {\n");
      out.write("                                        var IndNum = /^([0|\\+[0-9]{1,5})?([7-9][0-9]{9})$/;\n");
      out.write("                                        if (IndNum.test(IndianNumber))\n");
      out.write("                                        {\n");
      out.write("                                            swal(\n");
      out.write("                                                    'Success!',\n");
      out.write("                                                    'Valid Mobile Number',\n");
      out.write("                                                    'success'\n");
      out.write("                                                    )\n");
      out.write("                                        } else\n");
      out.write("                                        {\n");
      out.write("                                            swal(\n");
      out.write("                                                    'Error!',\n");
      out.write("                                                    'Mobile number is not valid!',\n");
      out.write("                                                    'error'\n");
      out.write("                                                    )\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <label><b>Email</b></label><br>\n");
      out.write("                                <input type=\"email\" placeholder=\"Enter Email\" name=\"email\" onchange=\"myFunction(this.value)\" pattern=\"[a-z0-9._%+-]+@gmail\\.com$\"  id=\"emailid\" required><br>\n");
      out.write("\n");
      out.write("                                <script>\n");
      out.write("                                    function myFunction(val)\n");
      out.write("                                    {\n");
      out.write("                                        var email_id = document.getElementById(\"emailid\").value;\n");
      out.write("                                        console.log(email_id);\n");
      out.write("                                        $.ajax({\n");
      out.write("                                            type: \"post\",\n");
      out.write("                                            url: \"mailChecking\",\n");
      out.write("                                            data: {email: email_id},\n");
      out.write("                                            success: function (data, textStatus, jqXHR) {\n");
      out.write("                                                var result = data;\n");
      out.write("                                                swal({\n");
      out.write("                                                    title: result,\n");
      out.write("                                                    width: 600,\n");
      out.write("                                                    padding: 100,\n");
      out.write("                                                })\n");
      out.write("                                            }\n");
      out.write("                                        });\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                </script>   \n");
      out.write("                                <label><b>Password</b></label><br>\n");
      out.write("                                <input type=\"password\" placeholder=\"Enter Password\" name=\"pass\" required id=\"pass\" ><br>\n");
      out.write("\n");
      out.write("                                <label><b>Repeat Password</b></label><br>\n");
      out.write("                                <input type=\"password\" placeholder=\"Repeat Password\" name=\"repass\" id=\"repass\" required ><br>\n");
      out.write("\n");
      out.write("                                <div class=\"clearfix\">\n");
      out.write("                                    <button type=\"submit\" class=\"signupbtn\" >Sign Up</button><br><br>\n");
      out.write("                                    <button type=\"button\" onclick=\"document.getElementById('id02').style.display = 'none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("                                    <a href=\"#\" onclick=\"document.getElementById('id01').style.display = 'block', document.getElementById('id02').style.display = 'none'\" ><b class=\"alrbtn\">Already Register? Click for Login</b></a>      \n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("income");
      _jspx_th_c_set_0.setScope("session");
      _jspx_th_c_set_0.setValue( request.getSession().getAttribute("userdb"));
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      out.write("  \n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!---- stop navbar ------------------------------------ -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${income==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                        <!-- User Login Button -->\n");
        out.write("                        <li id=\"hi2\"><a href=\"#\" onclick=\"document.getElementById('id01').style.display = 'block'\"><span class=\"glyphicon glyphicon-user navstyle\"></span> Login</a></li>\n");
        out.write("\n");
        out.write("\n");
        out.write("                        <!-- User Registration Button -->\n");
        out.write("                        <li id=\"hi3\"><a href=\"#\" onclick=\"document.getElementById('id02').style.display = 'block'\"><span class=\"glyphicon glyphicon-registration-mark navstyle\"></span> Registration</a></li>\n");
        out.write("                        \n");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${income!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("\n");
        out.write("                        <li class=\"dropdown\">\n");
        out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><img src=\"images/profilepic.png\"><b style=\"color:white\"> ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("</b>\n");
        out.write("                                <span class=\"caret\"></span></a>\n");
        out.write("                            <ul class=\"dropdown-menu navstyle\">\n");
        out.write("                            <li><a href=\"View_Profile.jsp\"><img src=\"images/user.png\"><b> View Profile</b></a></li>\n");
        out.write("                        <li><a href=\"UserTickets.jsp\"><img src=\"images/product.png\"><b> View Tickets</b></a></li>\n");
        out.write("                                <li><a href=\"LoginInvalidate.jsp\"><img src=\"images/logout.png\"><b> Logout</b></a></li>\n");
        out.write("                            </ul>\n");
        out.write("                        </li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${income}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
