package org.apache.jsp.js;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <!--[if IE 6]>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/main_style_ie6.css\" />\n");
      out.write("<![endif]-->\n");
      out.write("                \n");
      out.write("        \n");
      out.write("                           \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"description\" content=\"Bangladesh Railway, e-Ticket, CNS, Rail, Internet Tickets\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Bangladesh Railway, e-Ticket, CNS, Rail, Internet Tickets\" />\n");
      out.write("        <meta name=\"author\" content=\"CNS LIMITED\" />\n");
      out.write("        <meta name=\"robots\" content=\"INDEX,NOFOLLOW\" />\n");
      out.write("        \n");
      out.write("        <link href=\"/css/main_style.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("<link href=\"/css/style_seat.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" > \n");
      out.write("                <link rel=\"stylesheet\" href=\"../css/smoothness/jquery-ui-1.10.0.custom.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-1.9.0.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-ui-1.10.0.custom.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link id=\"page_favicon\" href=\"/images/favicon.ico\" rel=\"icon\" type=\"image/icon\" />\n");
      out.write("        <title>Bangladesh Railway</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("  var _gaq = _gaq || [];\n");
      out.write("  _gaq.push(['_setAccount', 'UA-29871770-1']);\n");
      out.write("  _gaq.push(['_trackPageview']);\n");
      out.write("\n");
      out.write("  (function() {\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("  })();\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body onLoad=\"if (self != top) top.location = self.location\">\n");
      out.write("        <!-------------------HEADER START---------------------->\n");
      out.write("                <!-------------------HEADER START---------------------->\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"header1\"><img src=\"/images/logo.png\" width=\"95\" height=\"100\" /></div>\n");
      out.write("            <div id=\"header_tab2\">\n");
      out.write("                <div id=\"header2\">\n");
      out.write("                    BANGLADESH RAILWAY<br/>\n");
      out.write("                    <small style=\"font-size:14px; color:#797979\">BANGLADESH RAILWAY E-TICKETING SERVICE</small>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"header3\"><img src=\"/images/cns.png\" width=\"170\" height=\"55\" />\n");
      out.write("                    <font style=\"padding-top:15px;\"><br/>\n");
      out.write("                    <a class=\"link2\" style=\"color:#0070a3; text-transform: none \" href=\"#\">Signed-In as mohsin.bd008@gmail.com</a>\n");
      out.write("                    </font>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-------------------HEADER START---------------------->        <!-------------------HEADER START---------------------->\n");
      out.write("        <!-------------------BODY START---------------------->\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("        \n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery.validate.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    jQuery.validator.addMethod(\n");
      out.write("    \"selectNone\",\n");
      out.write("    function(value, element) {\n");
      out.write("        if (element.value == \"0\")\n");
      out.write("        {\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        else return true;\n");
      out.write("    },\n");
      out.write("    \"\"\n");
      out.write(");\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        $(\"#purchase_tckt\").validate({\n");
      out.write("            rules: {\n");
      out.write("                journey_date: {\n");
      out.write("                    selectNone: true\n");
      out.write("                },\n");
      out.write("                station_from: {\n");
      out.write("                    selectNone: true\n");
      out.write("                },\n");
      out.write("                station_to: {\n");
      out.write("                    selectNone: true\n");
      out.write("                },\n");
      out.write("                route_class: {\n");
      out.write("                    selectNone: true\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script tpye=\"text/javascript\">\n");
      out.write("              \n");
      out.write("        \n");
      out.write("    function get_stn_to(stn_from)\n");
      out.write("    {\n");
      out.write("        //alert(stn_from);\n");
      out.write("        var link = document.getElementById('stn_to').value;\n");
      out.write("        var type = \"TR\"; // TR for Train Route\n");
      out.write("            \n");
      out.write("        $.ajax({\n");
      out.write("            type: \"POST\",\n");
      out.write("            url: link,\t\n");
      out.write("            data: \"stn_from=\"+stn_from+\"&type=\"+type,\n");
      out.write("            async: true,\n");
      out.write("            success: function(msg){\n");
      out.write("                $('#stn_to_list').html(msg);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        // for advance date \n");
      out.write("          var link2 = \"/ajax/getadvancedate\";\n");
      out.write("            \n");
      out.write("        $.ajax({\n");
      out.write("            type: \"POST\",\n");
      out.write("            url: link2,\t\n");
      out.write("            data: \"stn_from=\"+stn_from,\n");
      out.write("            async: true,\n");
      out.write("            success: function(msg){\n");
      out.write("                $('#j_date').html(msg);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("\t\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    function get_trn_class(stn_from, stn_to)  {\n");
      out.write("        //alert(stn_to);\n");
      out.write("        var link = document.getElementById('train_route_class').value;\n");
      out.write("            \n");
      out.write("        $('#loading').show();\n");
      out.write("        $('#route_class_list').hide();\n");
      out.write("            \n");
      out.write("        $.ajax({\n");
      out.write("            type: \"POST\",\n");
      out.write("            url: link,\t\n");
      out.write("            data: \"stn_from=\"+stn_from+\"&stn_to=\"+stn_to,\n");
      out.write("            async: true,\n");
      out.write("            success: function(msg){\n");
      out.write("                $('#route_class_list').html(msg);\n");
      out.write("                $('#loading').hide();\n");
      out.write("                $('#route_class_list').show();\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("       \n");
      out.write("</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    .account_body{\n");
      out.write("        font-size:14px;\n");
      out.write("    }\n");
      out.write("    .table td{padding-left: 7px;}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<div id=\"signup_body\" class=\"account_body\" style=\"padding-top:  0px;\">\n");
      out.write("    <!-------------------------------------------        main menu     ------------------------------------------->\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("    //<![CDATA[\n");
      out.write("    jQuery(function() {\n");
      out.write("        jQuery('.mainmenu li').each(function() {\n");
      out.write("            var href = jQuery(this).find('a').attr('href');\n");
      out.write("            if (href === window.location.pathname) {\n");
      out.write("                jQuery(this).addClass('current');\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });  \n");
      out.write("    //]]>\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<ul class=\"mainmenu\">\n");
      out.write("    <li><a href=\"/account/index\">Dashboard</a></li>\n");
      out.write("    <li><a href=\"/train/farequery\">Fare Query</a></li>\n");
      out.write("    <li><a href=\"/train/routelist\">Train Route</a></li>\n");
      out.write("    <li><a href=\"/train/purchaseticket\">Purchase Ticket</a></li>\n");
      out.write("    <li><a href=\"/account/changepassword\">Change Password</a></li>\n");
      out.write("    <li><a href=\"/account/contactus\">Contact Us</a></li>\n");
      out.write("    \n");
      out.write("    <div style=\"float: right;  \">\n");
      out.write("<!--        <a id=\"signout\" href=\"/index/signout\" style=\"float:right; padding: 0px 5px 0 0; text-decoration: none\"><img width=\"23px\" height=\"23px\" title=\"SIGN-OUT\" src=\"/images/signout.png\"></a>-->\n");
      out.write("      <a id=\"signout\" href=\"/index/signout\" style=\"float:right; padding: 0px 5px 0 0; text-decoration: none\">\n");
      out.write("          Sign-Out\n");
      out.write("      </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("        <!-------------------------------------------        main menu     ------------------------------------------->\n");
      out.write("    <input type=\"hidden\" name=\"stn_to\" value=\"/ajax/getstnto\" size=\"20\" id=\"stn_to\">    <input type=\"hidden\" name=\"train_route_class\" value=\"/ajax/getrouteclass\" size=\"20\" id=\"train_route_class\">    <!-- DIV start for purchase ticket -->\n");
      out.write("    <div id=\"purchase_ticket\" style=\"margin-top: 30px; \">\n");
      out.write("        <form class=\"box login\" id='purchase_tckt' action='purchaseticket' method='post' accept-charset='UTF-8'>\n");
      out.write("            <div id=\"train_route_div\">\n");
      out.write("                <fieldset class=\"signup_fieldset\">\n");
      out.write("                    <legend id=\"legend\">&nbsp;PURCHASE TICKET &nbsp;</legend>\n");
      out.write("                    <table width=\"80%\"  id=\"\" style=\"margin:auto; font-size: 16px;\">\n");
      out.write("                       \n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" id=\"label\">\n");
      out.write("                                <label for='station_from' >Station From :</label></td>\n");
      out.write("                            <td>\n");
      out.write("                                <div id=\"select\">\n");
      out.write("                                    <select name=\"station_from\" id=\"station_from\" class=\"input_train_info\" tabindex=\"2\" required=\"required\" onchange=\"get_stn_to(this.value)\">\n");
      out.write("    <option value=\"0\" label=\" ===SELECT STATION===\"> ===SELECT STATION===</option>\n");
      out.write("    <option value=\"AUP\" label=\"ABDULPUR\">ABDULPUR</option>\n");
      out.write("    <option value=\"AHG\" label=\"AHASANGANG\">AHASANGANG</option>\n");
      out.write("    <option value=\"AKA\" label=\"AKHAURA\">AKHAURA</option>\n");
      out.write("    <option value=\"ADG\" label=\"ALAMDANGA\">ALAMDANGA</option>\n");
      out.write("    <option value=\"ASZ\" label=\"ASHUGANJ\">ASHUGANJ</option>\n");
      out.write("    <option value=\"BTPX\" label=\"BAJITPUR\">BAJITPUR</option>\n");
      out.write("    <option value=\"BNNI\" label=\"BANANI\">BANANI</option>\n");
      out.write("    <option value=\"BBE\" label=\"BBSETU_E\">BBSETU_E</option>\n");
      out.write("    <option value=\"BCI\" label=\"BHAIRAB_BAZAR\">BHAIRAB_BAZAR</option>\n");
      out.write("    <option value=\"BYM\" label=\"BHAIRAMARA\">BHAIRAMARA</option>\n");
      out.write("    <option value=\"DABB\" label=\"BIMAN_BANDAR\">BIMAN_BANDAR</option>\n");
      out.write("    <option value=\"BARP\" label=\"BIRAMPUR\">BIRAMPUR</option>\n");
      out.write("    <option value=\"BNRP\" label=\"BONAR_PARA\">BONAR_PARA</option>\n");
      out.write("    <option value=\"BRBE\" label=\"BORAL_BRIDGE\">BORAL_BRIDGE</option>\n");
      out.write("    <option value=\"BHRA\" label=\"BRAHMAN_BARIA\">BRAHMAN_BARIA</option>\n");
      out.write("    <option value=\"CDR\" label=\"CHANDPUR\">CHANDPUR</option>\n");
      out.write("    <option value=\"CMO\" label=\"CHATMOHAR\">CHATMOHAR</option>\n");
      out.write("    <option value=\"CTG\" label=\"CHITTAGONG\">CHITTAGONG</option>\n");
      out.write("    <option value=\"CO\" label=\"CHUADANGA\">CHUADANGA</option>\n");
      out.write("    <option value=\"CML\" label=\"COMILLA\">COMILLA</option>\n");
      out.write("    <option value=\"DSNH\" label=\"DARSANA_HALT\">DARSANA_HALT</option>\n");
      out.write("    <option value=\"DACT\" label=\"DA_CANTONMENT\">DA_CANTONMENT</option>\n");
      out.write("    <option value=\"DWB\" label=\"DEWANGANJ_BAZAR\">DEWANGANJ_BAZAR</option>\n");
      out.write("    <option value=\"DA\" label=\"DHAKA\">DHAKA</option>\n");
      out.write("    <option value=\"DGP\" label=\"DINAJPUR\">DINAJPUR</option>\n");
      out.write("    <option value=\"FNI\" label=\"FENI\">FENI</option>\n");
      out.write("    <option value=\"GFN\" label=\"GAFARGAON\">GAFARGAON</option>\n");
      out.write("    <option value=\"GBH\" label=\"GAIBANDHA\">GAIBANDHA</option>\n");
      out.write("    <option value=\"GRPM\" label=\"GOURIPUR_MYN\">GOURIPUR_MYN</option>\n");
      out.write("    <option value=\"ISD\" label=\"ISHURDI\">ISHURDI</option>\n");
      out.write("    <option value=\"IPB\" label=\"ISLAMPUR_BAZAR\">ISLAMPUR_BAZAR</option>\n");
      out.write("    <option value=\"JLX\" label=\"JAMALPUR_TOWN\">JAMALPUR_TOWN</option>\n");
      out.write("    <option value=\"JYR\" label=\"JAYDEBPUR\">JAYDEBPUR</option>\n");
      out.write("    <option value=\"JS\" label=\"JESSORE\">JESSORE</option>\n");
      out.write("    <option value=\"JY\" label=\"JOYPURHAT\">JOYPURHAT</option>\n");
      out.write("    <option value=\"KLN\" label=\"KHULNA\">KHULNA</option>\n");
      out.write("    <option value=\"KFJ\" label=\"KISHOREGANJ\">KISHOREGANJ</option>\n");
      out.write("    <option value=\"KRF\" label=\"KULAURA\">KULAURA</option>\n");
      out.write("    <option value=\"KJB\" label=\"KULIARCHAR\">KULIARCHAR</option>\n");
      out.write("    <option value=\"LKM\" label=\"LAKSAM\">LAKSAM</option>\n");
      out.write("    <option value=\"LMH\" label=\"LALMONIR_HAT\">LALMONIR_HAT</option>\n");
      out.write("    <option value=\"MIZ\" label=\"MAIZGAON\">MAIZGAON</option>\n");
      out.write("    <option value=\"MGJN\" label=\"MOHONGANJ\">MOHONGANJ</option>\n");
      out.write("    <option value=\"MYN\" label=\"MYMENSINGH\">MYMENSINGH</option>\n");
      out.write("    <option value=\"NRC\" label=\"NARSINGDI\">NARSINGDI</option>\n");
      out.write("    <option value=\"NTE\" label=\"NATORE\">NATORE</option>\n");
      out.write("    <option value=\"NRQ\" label=\"NETROKONA\">NETROKONA</option>\n");
      out.write("    <option value=\"PBT\" label=\"PARBATIPUR\">PARBATIPUR</option>\n");
      out.write("    <option value=\"PDB\" label=\"PORADAHA\">PORADAHA</option>\n");
      out.write("    <option value=\"QSBA\" label=\"QOSBA\">QOSBA</option>\n");
      out.write("    <option value=\"RJHI\" label=\"RAJSHAHI\">RAJSHAHI</option>\n");
      out.write("    <option value=\"RNP\" label=\"RANGPUR\">RANGPUR</option>\n");
      out.write("    <option value=\"SDP\" label=\"SAIDPUR\">SAIDPUR</option>\n");
      out.write("    <option value=\"STU\" label=\"SANTAHER\">SANTAHER</option>\n");
      out.write("    <option value=\"SSI\" label=\"SARISHA_BARI\">SARISHA_BARI</option>\n");
      out.write("    <option value=\"SMA\" label=\"SH M MONSUR ALI\">SH M MONSUR ALI</option>\n");
      out.write("    <option value=\"SSJ\" label=\"SHAISTAGONJ\">SHAISTAGONJ</option>\n");
      out.write("    <option value=\"SRG\" label=\"SRIMANGAL\">SRIMANGAL</option>\n");
      out.write("    <option value=\"SYT\" label=\"SYLHET\">SYLHET</option>\n");
      out.write("    <option value=\"TAGL\" label=\"TANGAIL\">TANGAIL</option>\n");
      out.write("    <option value=\"ULP\" label=\"ULLAPARA\">ULLAPARA</option>\n");
      out.write("</select>                                </div>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                         <tr>\n");
      out.write("                            <td colspan=\"2\" id=\"label\" width=\"130px\">\n");
      out.write("                                <label for='journey_date' >Journey Date :</label>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div id=\"select\">\n");
      out.write("                                    <font id=\"j_date\">\n");
      out.write("                                    <select class=\"input_train_info\" name=\"journey_date\">\n");
      out.write("                                        <option value=\"0\" />===NONE===</option>\n");
      out.write("                                    </select>\n");
      out.write("                                    </font>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" id=\"label\">\n");
      out.write("                                <label for='station_to' >Station To :</label></td>\n");
      out.write("                            <td>\n");
      out.write("                                <div id=\"select\">\n");
      out.write("                                    <font id=\"stn_to_list\">\n");
      out.write("                                    <select class=\"input_train_info\" name=\"stn_to_list\" tabindex=\"1\">\n");
      out.write("                                        <option value=\"0\" />===NONE===</option>\n");
      out.write("                                    </select>\n");
      out.write("                                    </font>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" id=\"label\">\n");
      out.write("                                <label for='class' >Class :</label></td>\n");
      out.write("                            <td>\n");
      out.write("                                <div id=\"select\">\n");
      out.write("                                    <font id=\"route_class_list\">\n");
      out.write("                                    <select class=\"input_train_info\" name=\"route_class_list\">\n");
      out.write("                                        <option value=\"0\"  />===NONE===</option>\n");
      out.write("                                    </select>\n");
      out.write("                                    </font>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"loading\" style=\"display:none;\"> <img width=\"15\" height=\"15\" src=\"/images/loading141.gif\" /> Please Wait ... </div>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    <div align=\"center\">\n");
      out.write("                        <input type=\"submit\" name=\"purchase_ticket\" value=\"Search Train\" id=\"button1\" tabindex=\"4\" />\n");
      out.write("                    </div>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <!-- DIV end for purchase ticket -->\n");
      out.write("\t\n");
      out.write("    <fieldset class=\"signup_fieldset\" style=\"text-align: center; color: #cd0a0a; width: 95%\">\n");
      out.write("         <legend id=\"legend\">&nbsp;REFUND POLICY &nbsp;</legend>\n");
      out.write("        ***  The unsuccessful purchases will be refunded to respective cards/mobile wallet within 8 working days by the respective issuer bank.  ***\n");
      out.write("        \n");
      out.write("    </fieldset>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("        <!-------------------FOOTER START---------------------->\n");
      out.write("        \n");
      out.write("<!--<script type=\"text/javascript\">\n");
      out.write("                    \n");
      out.write("            $(document).ready(function(){\n");
      out.write("                if ( $.browser.msie ) {\n");
      out.write("                    //alert( $.browser.version );\n");
      out.write("                    if($.browser.version <= 6.0) {\n");
      out.write("                        //alert( $.browser.version );\n");
      out.write("                        window.location.href=\"/browser/index\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>-->\n");
      out.write("\n");
      out.write("<!-------------------FOOTER START---------------------->\n");
      out.write("<div style=\"height:10px;\"></div>\n");
      out.write("<div id=\"footer_woh\" style=\"padding:5px 0 5px 0\">\n");
      out.write("\n");
      out.write("    <div id=\"float__\" style=\"float: left; padding-left: 10px;\">\n");
      out.write("        <span id=\"siteseal\"><script type=\"text/javascript\" src=\"https://seal.godaddy.com/getSeal?sealID=9h8mAVoHUwcM7THVpqMqYsyTWwNmwtXrL5nmjRn1baQGrbngiSQtk4NR\"></script></span>        \n");
      out.write("        <img src=\"/images/visa.jpg\" title=\"WE ACCEPT VISA CARD\"/>&nbsp;&nbsp;&nbsp;\n");
      out.write("        <img src=\"/images/macrd.jpg\" title=\"WE ACCEPT MASTER CARD\"/>&nbsp;&nbsp;&nbsp;\n");
      out.write("        <img src=\"/images/duchb.png\" title=\"WE ACCEPT DUCH BANGLA BANK\" />&nbsp;&nbsp;&nbsp;\n");
      out.write(" <img src=\"/images/duchbm.png\" title=\"WE ACCEPT DUCH BANGLA BANK MOBILE BANKING\" />&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("        <img src=\"/images/bracb.png\" title=\"WE ACCEPT BRAC BANK\" />&nbsp;&nbsp;&nbsp;\n");
      out.write("        <img src=\"/images/amex.png\" title=\"WE ACCEPT CITY BANK\" />\n");
      out.write("</div>\n");
      out.write("    <footer id=\"copyright\" style=\"padding:10px;\"><a class=\"link2\" style=\"color:#363; text-transform: none \">&COPY;</a> <a class=\"link2\" style=\"color:#363 ; text-transform: none \" href=\"http://www.cnsbd.com\" target=\"_blank\">Computer Network Systems Limited</a><a class=\"link2\" style=\"color:#363; text-transform: none \"> 2012-2016</a></footer>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-------------------FOOTER END---------------------->        <!-------------------FOOTER END---------------------->\n");
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
}
