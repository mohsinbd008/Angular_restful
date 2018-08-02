
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>

        <!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="/css/main_style_ie6.css" />
<![endif]-->
                
        
                           
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="description" content="Bangladesh Railway, e-Ticket, CNS, Rail, Internet Tickets" />
        <meta name="keywords" content="Bangladesh Railway, e-Ticket, CNS, Rail, Internet Tickets" />
        <meta name="author" content="CNS LIMITED" />
        <meta name="robots" content="INDEX,NOFOLLOW" />
        
        <link href="/css/main_style.css" media="screen" rel="stylesheet" type="text/css" >
<link href="/css/style_seat.css" media="screen" rel="stylesheet" type="text/css" > 
                <link rel="stylesheet" href="../css/smoothness/jquery-ui-1.10.0.custom.css" type="text/css" media="screen">

<script type="text/javascript" src="../js/jquery-1.9.0.js"></script>
<script type="text/javascript" src="../js/jquery-ui-1.10.0.custom.js"></script>


<link id="page_favicon" href="/images/favicon.ico" rel="icon" type="image/icon" />
        <title>Bangladesh Railway</title>
        <script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-29871770-1']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
    </head>

    <body onLoad="if (self != top) top.location = self.location">
        <!-------------------HEADER START---------------------->
                <!-------------------HEADER START---------------------->
        <div id="header">
            <div id="header1"><img src="/images/logo.png" width="95" height="100" /></div>
            <div id="header_tab2">
                <div id="header2">
                    BANGLADESH RAILWAY<br/>
                    <small style="font-size:14px; color:#797979">BANGLADESH RAILWAY E-TICKETING SERVICE</small>
                </div>
                <div id="header3"><img src="/images/cns.png" width="170" height="55" />
                    <font style="padding-top:15px;"><br/>
                    <a class="link2" style="color:#0070a3; text-transform: none " href="#">Signed-In as mohsin.bd008@gmail.com</a>
                    </font>
                </div>
            </div>
        </div>
        <!-------------------HEADER START---------------------->        <!-------------------HEADER START---------------------->
        <!-------------------BODY START---------------------->
        
            
            

        
<script type="text/javascript" src="/js/jquery.validate.js"></script>
<script type="text/javascript">
    jQuery.validator.addMethod(
    "selectNone",
    function(value, element) {
        if (element.value == "0")
        {
            return false;
        }
        else return true;
    },
    ""
);
    $(document).ready(function() {
        $("#purchase_tckt").validate({
            rules: {
                journey_date: {
                    selectNone: true
                },
                station_from: {
                    selectNone: true
                },
                station_to: {
                    selectNone: true
                },
                route_class: {
                    selectNone: true
                }
            }
        });
    });
</script>
<script tpye="text/javascript">
              
        
    function get_stn_to(stn_from)
    {
        //alert(stn_from);
        var link = document.getElementById('stn_to').value;
        var type = "TR"; // TR for Train Route
            
        $.ajax({
            type: "POST",
            url: link,	
            data: "stn_from="+stn_from+"&type="+type,
            async: true,
            success: function(msg){
                $('#stn_to_list').html(msg);
            }
        });
        
        // for advance date 
          var link2 = "/ajax/getadvancedate";
            
        $.ajax({
            type: "POST",
            url: link2,	
            data: "stn_from="+stn_from,
            async: true,
            success: function(msg){
                $('#j_date').html(msg);
            }
        });
        
	
    }
        
    function get_trn_class(stn_from, stn_to)  {
        //alert(stn_to);
        var link = document.getElementById('train_route_class').value;
            
        $('#loading').show();
        $('#route_class_list').hide();
            
        $.ajax({
            type: "POST",
            url: link,	
            data: "stn_from="+stn_from+"&stn_to="+stn_to,
            async: true,
            success: function(msg){
                $('#route_class_list').html(msg);
                $('#loading').hide();
                $('#route_class_list').show();
            }
        });
    }
       
</script>
<style type="text/css">
    .account_body{
        font-size:14px;
    }
    .table td{padding-left: 7px;}

</style>

</style>
<div id="signup_body" class="account_body" style="padding-top:  0px;">
    <!-------------------------------------------        main menu     ------------------------------------------->
    <script type="text/javascript" charset="utf-8">
    //<![CDATA[
    jQuery(function() {
        jQuery('.mainmenu li').each(function() {
            var href = jQuery(this).find('a').attr('href');
            if (href === window.location.pathname) {
                jQuery(this).addClass('current');
            }
        });
    });  
    //]]>
</script>

<ul class="mainmenu">
    <li><a href="/account/index">Dashboard</a></li>
    <li><a href="/train/farequery">Fare Query</a></li>
    <li><a href="/train/routelist">Train Route</a></li>
    <li><a href="/train/purchaseticket">Purchase Ticket</a></li>
    <li><a href="/account/changepassword">Change Password</a></li>
    <li><a href="/account/contactus">Contact Us</a></li>
    
    <div style="float: right;  ">
<!--        <a id="signout" href="/index/signout" style="float:right; padding: 0px 5px 0 0; text-decoration: none"><img width="23px" height="23px" title="SIGN-OUT" src="/images/signout.png"></a>-->
      <a id="signout" href="/index/signout" style="float:right; padding: 0px 5px 0 0; text-decoration: none">
          Sign-Out
      </a>
        </div>

</ul>
        <!-------------------------------------------        main menu     ------------------------------------------->
    <input type="hidden" name="stn_to" value="/ajax/getstnto" size="20" id="stn_to">    <input type="hidden" name="train_route_class" value="/ajax/getrouteclass" size="20" id="train_route_class">    <!-- DIV start for purchase ticket -->
    <div id="purchase_ticket" style="margin-top: 30px; ">
        <form class="box login" id='purchase_tckt' action='purchaseticket' method='post' accept-charset='UTF-8'>
            <div id="train_route_div">
                <fieldset class="signup_fieldset">
                    <legend id="legend">&nbsp;PURCHASE TICKET &nbsp;</legend>
                    <table width="80%"  id="" style="margin:auto; font-size: 16px;">
                       
                        <tr>
                            <td colspan="2" id="label">
                                <label for='station_from' >Station From :</label></td>
                            <td>
                                <div id="select">
                                    <select name="station_from" id="station_from" class="input_train_info" tabindex="2" required="required" onchange="get_stn_to(this.value)">
    <option value="0" label=" ===SELECT STATION==="> ===SELECT STATION===</option>
    <option value="AUP" label="ABDULPUR">ABDULPUR</option>
    <option value="AHG" label="AHASANGANG">AHASANGANG</option>
    <option value="AKA" label="AKHAURA">AKHAURA</option>
    <option value="ADG" label="ALAMDANGA">ALAMDANGA</option>
    <option value="ASZ" label="ASHUGANJ">ASHUGANJ</option>
    <option value="BTPX" label="BAJITPUR">BAJITPUR</option>
    <option value="BNNI" label="BANANI">BANANI</option>
    <option value="BBE" label="BBSETU_E">BBSETU_E</option>
    <option value="BCI" label="BHAIRAB_BAZAR">BHAIRAB_BAZAR</option>
    <option value="BYM" label="BHAIRAMARA">BHAIRAMARA</option>
    <option value="DABB" label="BIMAN_BANDAR">BIMAN_BANDAR</option>
    <option value="BARP" label="BIRAMPUR">BIRAMPUR</option>
    <option value="BNRP" label="BONAR_PARA">BONAR_PARA</option>
    <option value="BRBE" label="BORAL_BRIDGE">BORAL_BRIDGE</option>
    <option value="BHRA" label="BRAHMAN_BARIA">BRAHMAN_BARIA</option>
    <option value="CDR" label="CHANDPUR">CHANDPUR</option>
    <option value="CMO" label="CHATMOHAR">CHATMOHAR</option>
    <option value="CTG" label="CHITTAGONG">CHITTAGONG</option>
    <option value="CO" label="CHUADANGA">CHUADANGA</option>
    <option value="CML" label="COMILLA">COMILLA</option>
    <option value="DSNH" label="DARSANA_HALT">DARSANA_HALT</option>
    <option value="DACT" label="DA_CANTONMENT">DA_CANTONMENT</option>
    <option value="DWB" label="DEWANGANJ_BAZAR">DEWANGANJ_BAZAR</option>
    <option value="DA" label="DHAKA">DHAKA</option>
    <option value="DGP" label="DINAJPUR">DINAJPUR</option>
    <option value="FNI" label="FENI">FENI</option>
    <option value="GFN" label="GAFARGAON">GAFARGAON</option>
    <option value="GBH" label="GAIBANDHA">GAIBANDHA</option>
    <option value="GRPM" label="GOURIPUR_MYN">GOURIPUR_MYN</option>
    <option value="ISD" label="ISHURDI">ISHURDI</option>
    <option value="IPB" label="ISLAMPUR_BAZAR">ISLAMPUR_BAZAR</option>
    <option value="JLX" label="JAMALPUR_TOWN">JAMALPUR_TOWN</option>
    <option value="JYR" label="JAYDEBPUR">JAYDEBPUR</option>
    <option value="JS" label="JESSORE">JESSORE</option>
    <option value="JY" label="JOYPURHAT">JOYPURHAT</option>
    <option value="KLN" label="KHULNA">KHULNA</option>
    <option value="KFJ" label="KISHOREGANJ">KISHOREGANJ</option>
    <option value="KRF" label="KULAURA">KULAURA</option>
    <option value="KJB" label="KULIARCHAR">KULIARCHAR</option>
    <option value="LKM" label="LAKSAM">LAKSAM</option>
    <option value="LMH" label="LALMONIR_HAT">LALMONIR_HAT</option>
    <option value="MIZ" label="MAIZGAON">MAIZGAON</option>
    <option value="MGJN" label="MOHONGANJ">MOHONGANJ</option>
    <option value="MYN" label="MYMENSINGH">MYMENSINGH</option>
    <option value="NRC" label="NARSINGDI">NARSINGDI</option>
    <option value="NTE" label="NATORE">NATORE</option>
    <option value="NRQ" label="NETROKONA">NETROKONA</option>
    <option value="PBT" label="PARBATIPUR">PARBATIPUR</option>
    <option value="PDB" label="PORADAHA">PORADAHA</option>
    <option value="QSBA" label="QOSBA">QOSBA</option>
    <option value="RJHI" label="RAJSHAHI">RAJSHAHI</option>
    <option value="RNP" label="RANGPUR">RANGPUR</option>
    <option value="SDP" label="SAIDPUR">SAIDPUR</option>
    <option value="STU" label="SANTAHER">SANTAHER</option>
    <option value="SSI" label="SARISHA_BARI">SARISHA_BARI</option>
    <option value="SMA" label="SH M MONSUR ALI">SH M MONSUR ALI</option>
    <option value="SSJ" label="SHAISTAGONJ">SHAISTAGONJ</option>
    <option value="SRG" label="SRIMANGAL">SRIMANGAL</option>
    <option value="SYT" label="SYLHET">SYLHET</option>
    <option value="TAGL" label="TANGAIL">TANGAIL</option>
    <option value="ULP" label="ULLAPARA">ULLAPARA</option>
</select>                                </div>
                            </td>
                        </tr>
                        
                         <tr>
                            <td colspan="2" id="label" width="130px">
                                <label for='journey_date' >Journey Date :</label>
                            </td>
                            <td>
                                <div id="select">
                                    <font id="j_date">
                                    <select class="input_train_info" name="journey_date">
                                        <option value="0" />===NONE===</option>
                                    </select>
                                    </font>
                                </div>
                            </td>
                        </tr>
                        
                        
                        <tr>
                            <td colspan="2" id="label">
                                <label for='station_to' >Station To :</label></td>
                            <td>
                                <div id="select">
                                    <font id="stn_to_list">
                                    <select class="input_train_info" name="stn_to_list" tabindex="1">
                                        <option value="0" />===NONE===</option>
                                    </select>
                                    </font>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" id="label">
                                <label for='class' >Class :</label></td>
                            <td>
                                <div id="select">
                                    <font id="route_class_list">
                                    <select class="input_train_info" name="route_class_list">
                                        <option value="0"  />===NONE===</option>
                                    </select>
                                    </font>

                                </div>
                                <div id="loading" style="display:none;"> <img width="15" height="15" src="/images/loading141.gif" /> Please Wait ... </div>
                            </td>
                        </tr>
                    </table>
                    <div align="center">
                        <input type="submit" name="purchase_ticket" value="Search Train" id="button1" tabindex="4" />
                    </div>
                </fieldset>
            </div>
        </form>
        <!-- DIV end for purchase ticket -->
	
    <fieldset class="signup_fieldset" style="text-align: center; color: #cd0a0a; width: 95%">
         <legend id="legend">&nbsp;REFUND POLICY &nbsp;</legend>
        ***  The unsuccessful purchases will be refunded to respective cards/mobile wallet within 8 working days by the respective issuer bank.  ***
        
    </fieldset>
    </div>
</div>

    

        <!-------------------FOOTER START---------------------->
        
<!--<script type="text/javascript">
                    
            $(document).ready(function(){
                if ( $.browser.msie ) {
                    //alert( $.browser.version );
                    if($.browser.version <= 6.0) {
                        //alert( $.browser.version );
                        window.location.href="/browser/index";
                    }
                }

            });
        </script>-->

<!-------------------FOOTER START---------------------->
<div style="height:10px;"></div>
<div id="footer_woh" style="padding:5px 0 5px 0">

    <div id="float__" style="float: left; padding-left: 10px;">
        <span id="siteseal"><script type="text/javascript" src="https://seal.godaddy.com/getSeal?sealID=9h8mAVoHUwcM7THVpqMqYsyTWwNmwtXrL5nmjRn1baQGrbngiSQtk4NR"></script></span>        
        <img src="/images/visa.jpg" title="WE ACCEPT VISA CARD"/>&nbsp;&nbsp;&nbsp;
        <img src="/images/macrd.jpg" title="WE ACCEPT MASTER CARD"/>&nbsp;&nbsp;&nbsp;
        <img src="/images/duchb.png" title="WE ACCEPT DUCH BANGLA BANK" />&nbsp;&nbsp;&nbsp;
 <img src="/images/duchbm.png" title="WE ACCEPT DUCH BANGLA BANK MOBILE BANKING" />&nbsp;&nbsp;&nbsp;

        <img src="/images/bracb.png" title="WE ACCEPT BRAC BANK" />&nbsp;&nbsp;&nbsp;
        <img src="/images/amex.png" title="WE ACCEPT CITY BANK" />
</div>
    <footer id="copyright" style="padding:10px;"><a class="link2" style="color:#363; text-transform: none ">&COPY;</a> <a class="link2" style="color:#363 ; text-transform: none " href="http://www.cnsbd.com" target="_blank">Computer Network Systems Limited</a><a class="link2" style="color:#363; text-transform: none "> 2012-2016</a></footer>

</div>
<!-------------------FOOTER END---------------------->        <!-------------------FOOTER END---------------------->
    </body>
</html>
