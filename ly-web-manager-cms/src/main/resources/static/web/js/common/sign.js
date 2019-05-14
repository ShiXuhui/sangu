$('.h-line:last').remove();
$(function () {
    $('.modal_backdrop').hide();
    $('.modal').hide();
})
function ly_sign() {
    var sign = "<div class=\"ajax_login\">\n" +
        "    <div class=\"title\">\n" +
        "        <div class=\"logo\">骑士人才系统&nbsp;·&nbsp;登录</div>\n" +
        "        <div class=\"close J_btncancel\" onclick=\"ly_sign_close()\"></div>\n" +
        "    </div>\n" +
        "    <div class=\"lmain\">\n" +
        "        <div class=\"frombox\">\n" +
        "            <div class=\"tab\">\n" +
        "                <div class=\"li select J_switch\" data=\"J_type2\">用户名登录</div>\n" +
        "                <div class=\"clear\"></div>\n" +
        "            </div>\n" +
        "            <div class=\"login_type J_type2\" style=\"display:block\">\n" +
        "                <form action=\"\" id=\"topLoginForm\" method=\"get\">\n" +
        "                    <div class=\"ce\">\n" +
        "                        <div class=\"imgbg\"></div>\n" +
        "                        <input name=\"username\" type=\"text\" maxlength=\"16\" id=\"username\" class=\"linput\" placeholder=\"请输入用户名/手机号\" onblur=\"checkout_phone()\" autocomplete=\"off\">\n" +
        "                    </div>\n" +
        "                    <div class=\"ce\">\n" +
        "                        <div class=\"imgbg pwd\"></div>\n" +
        "                        <input name=\"password\" type=\"password\" id=\"password\" value=\"\" class=\"linput pwd\" placeholder=\"请输入密码\" autocomplete=\"off\">\n" +
        "                    </div>\n" +
        "                    <div class=\"err\"><!--错误提示 --></div>\n" +
        "                    <div class=\"ce\">\n" +
        "                        <input class=\"btn\" type=\"button\" name=\"submit\" id=\"topLoginBtn\" value=\"登录\">\n" +
        "                    </div>\n" +
        "                    <div class=\"ce\">\n" +
        "                        <div class=\"imgchecked_txt expLoginBtn\"><input name=\"expire\" type=\"hidden\" value=\"0\">自动登录</div>\n" +
        "                        <div class=\"getpwd link_gray3\"><a href=\"/74cms_v4.2.111/upload/index.php?m=&amp;c=members&amp;a=user_getpass\">忘记密码?</a></div>\n" +
        "                    </div>\n" +
        "                </form>\n" +
        "            </div>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"rmain\">\n" +
        "        <div class=\"tit\">使用第三方账号登录</div>\n" +
        "        <div class=\"api_login\">\n" +
        "            <a class=\"uu_api_login_btn sina\" href=\"/74cms_v4.2.111/upload/index.php?m=&amp;c=callback&amp;a=index&amp;mod=sina&amp;type=login\" title=\"新浪微博账号登录\"></a><a class=\"uu_api_login_btn qq\" href=\"/74cms_v4.2.111/upload/index.php?m=&amp;c=callback&amp;a=index&amp;mod=qq&amp;type=login\" title=\"腾讯QQ账号登录\"></a>            <div class=\"clear\"></div>\n" +
        "        </div>\n" +
        "        <div class=\"btnbox\">\n" +
        "            <div class=\"btn_green_api btn_inline  btn_border J_top_loging_user_reg\">注册账号</div>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"clear\"></div>\n" +
        "    <input type=\"button\" id=\"btnTopCheck\" style=\"display:none;\">\n" +
        "    <input type=\"button\" id=\"btnTopLoginMobile\" style=\"display:none;\">\n" +
        "    <input type=\"button\" id=\"btnTopLoginName\" style=\"display:none;\">\n" +
        "    <div id=\"topCaptchaBox\"></div>\n" +
        "    <div id=\"topCaptchaBoxLog\"></div>\n" +
        "    <div id=\"topCaptchaBoxLogMobile\"></div>\n" +
        "</div>"
    $('.modal_body').html(sign)
    $('.modal_backdrop').show();

    $('.modal').show();
}
function ly_sign_close() {
    $('.modal_backdrop').hide();
    $('.modal').hide();
}
function ly_signup() {
    var signup ="<div class=\"ajax_reg\">\n" +
        "    <div class=\"title\">\n" +
        "        <div class=\"logo\">骑士人才系统&nbsp;·&nbsp;注册</div>\n" +
        "        <div class=\"close J_btncancel\" onclick=\"ly_sign_close()\"></div>\n" +
        "    </div>\n" +
        "    <div class=\"reg_select_box J_reg_select_box\">\n" +
        "        <div class=\"tit\">请选择注册类型</div>\n" +
        "        <div class=\"sbox\">\n" +
        "            <div class=\"slisit1 J_hoverbut\" id=\"J_reg_select_com\" onclick=\"ly_signup_per(1)\">\n" +
        "                <div class=\"stitle\">企业注册</div>\n" +
        "                <div class=\"stxt\">\n" +
        "                    √&nbsp;发布招聘信息<br>\n" +
        "                    √&nbsp;收取简历投递<br>\n" +
        "                    √&nbsp;多种职位分享\n" +
        "                </div>\n" +
        "            </div>\n" +
        "            <div class=\"slisitc\">&nbsp;</div>\n" +
        "            <div class=\"slisit2 J_hoverbut\" id=\"J_reg_select_per\" onclick=\"ly_signup_per(2)\">\n" +
        "                <div class=\"stitle\">个人注册</div>\n" +
        "                <div class=\"stxt\">\n" +
        "                    √&nbsp;免费创简历<br>\n" +
        "                    √&nbsp;职位海量淘<br>\n" +
        "                    √&nbsp;简历轻松投<br>\n" +
        "                </div>\n" +
        "            </div>\n" +
        "            <div class=\"clear\"></div>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"do_box J_do_box\">\n" +
        "        <div class=\"lmain\">\n" +
        "            <div class=\"frombox J_reg_per_box\">\n" +
        "                <div class=\"tit link_blue\"><span class=\"J_top_reg_type_txt\">企业</span>注册 <a class=\"change_type J_top_change_reg_type\" href=\"javascript:signup_change(2)\">切换为个人注册</a></div>\n" +
        "                <div class=\"ce\">\n" +
        "                    <div class=\"input_text_inside t5 reginput\">\n" +
        "                        <div class=\"inputtit\">输入手机号：</div>\n" +
        "                        <input name=\"mobile\" type=\"text\" class=\"minput reginput\" onblur=\"checkout_phone()\" maxlength=\"11\">\n" +
        "                    </div>\n" +
        "                </div>\n" +
        "                <div class=\"err link_blue J_top_has_remind\">\n" +
        "                    该手机号已存在，可以使用此手机号 <a id=\"J_site_login\" href=\"javascript:;\">立即登录</a>\n" +
        "                </div>\n" +
        "                <div class=\"ce\">\n" +
        "                    <div class=\"input_text_inside t5 reginput\">\n" +
        "                        <div class=\"inputtit\">手机验证码：</div>\n" +
        "                        <input name=\"mobile_vcode\" type=\"text\" class=\"minput reginput\" maxlength=\"4\">\n" +
        "                        <div class=\"sendbtn\" id=\"J_top_get_code\"  onclick=\"getcode()\">获取验证码</div>\n" +
        "                    </div>\n" +
        "                </div>\n" +
        "                <div class=\"J_reg_com_box\">\n" +
        "                    <div class=\"ce\">\n" +
        "                        <div class=\"input_text_inside t5 reginput\">\n" +
        "                            <div class=\"inputtit\">企业名称：</div>\n" +
        "                            <input name=\"companyname\" type=\"text\" class=\"minput reginput\" maxlength=\"30\">\n" +
        "                        </div>\n" +
        "                    </div>\n" +
        "                    <div class=\"ce\">\n" +
        "                        <div class=\"input_text_inside t5 reginput\">\n" +
        "                            <div class=\"inputtit\">企业联系人：</div>\n" +
        "                            <input name=\"contact\" type=\"text\" class=\"minput reginput\" maxlength=\"11\">\n" +
        "                        </div>\n" +
        "                    </div>\n" +
        "                </div>\n" +
        "                                <div class=\"ce\">\n" +
        "                    <input type=\"hidden\" name=\"reg_type\" value=\"1\">\n" +
        "                    <input type=\"hidden\" name=\"utype\" class=\"J_u_type\" value=\"2\">\n" +
        "                    <input class=\"btn\" type=\"button\" name=\"submit\" id=\"J_top_reg_btn\" value=\"立即注册\">\n" +
        "                </div>\n" +
        "            </div>\n" +
        "        </div>\n" +
        "        <div class=\"rmain\">\n" +
        "            <div class=\"tit\">使用第三方账号登录</div>\n" +
        "            <div class=\"api_login\">\n" +
        "                <a class=\"uu_api_login_btn sina\" href=\"/74cms_v4.2.111/upload/index.php?m=&amp;c=callback&amp;a=index&amp;mod=sina&amp;type=login\"></a><a class=\"uu_api_login_btn qq\" href=\"/74cms_v4.2.111/upload/index.php?m=&amp;c=callback&amp;a=index&amp;mod=qq&amp;type=login\"></a>                <div class=\"clear\"></div>\n" +
        "            </div>\n" +
        "            <div class=\"btnbox\">\n" +
        "                <div class=\"btn_yellow_api btn_inline  btn_border J_top_reg_user_log\">有账号？直接登录</div>\n" +
        "            </div>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"clear\"></div>\n" +
        "    <div id=\"topCaptchaBox\"></div>\n" +
        "    <input type=\"button\" id=\"btnTopCheck\" style=\"display:none;\">\n" +
        "</div>";
    $('.modal_body').html(signup)
    $('.modal_backdrop').show();

    $('.modal').show();
}
function ly_signup_per(a) {
    var signup;
    if(a==2){
        signup_per = "<div class=\"ajax_reg\">\n" +
            "    <div class=\"title\">\n" +
            "        <div class=\"logo\">骑士人才系统&nbsp;·&nbsp;注册</div>\n" +
            "        <div class=\"close J_btncancel\" onclick=\"ly_sign_close()\" ></div>\n" +
            "    </div>\n" +
            "    <div class=\"reg_select_box J_reg_select_box\" style=\"display: none;\">\n" +
            "        <div class=\"tit\">请选择注册类型</div>\n" +
            "        <div class=\"sbox\">\n" +
            "            <div class=\"slisit1 J_hoverbut\" id=\"J_reg_select_com\">\n" +
            "                <div class=\"stitle\">企业注册</div>\n" +
            "                <div class=\"stxt\">\n" +
            "                    √&nbsp;发布招聘信息<br>\n" +
            "                    √&nbsp;收取简历投递<br>\n" +
            "                    √&nbsp;多种职位分享\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"slisitc\">&nbsp;</div>\n" +
            "            <div class=\"slisit2 J_hoverbut\" id=\"J_reg_select_per\">\n" +
            "                <div class=\"stitle\">个人注册</div>\n" +
            "                <div class=\"stxt\">\n" +
            "                    √&nbsp;免费创简历<br>\n" +
            "                    √&nbsp;职位海量淘<br>\n" +
            "                    √&nbsp;简历轻松投<br>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"clear\"></div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "    <div class=\"do_box J_do_box\" style=\"display: block;\">\n" +
            "        <div class=\"lmain\">\n" +
            "            <div class=\"frombox J_reg_per_box\">\n" +
            "                <div class=\"tit link_blue\"><span class=\"J_top_reg_type_txt\">个人</span>注册 <a class=\"change_type J_top_change_reg_type\" href=\"javascript:signup_change(1)\">切换为企业注册</a></div>\n" +
            "                <div class=\"ce\">\n" +
            "                    <div class=\"input_text_inside t5 reginput\">\n" +
            "                        <div class=\"inputtit\">输入手机号：</div>\n" +
            "                        <input name=\"mobile\" type=\"text\" class=\"minput reginput\" onblur=\"checkout_phone()\" >\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"err link_blue J_top_has_remind\">\n" +
            "                    该手机号已存在，可以使用此手机号 <a id=\"J_site_login\" href=\"javascript:;\">立即登录</a>\n" +
            "                </div>\n" +
            "                <div class=\"ce\">\n" +
            "                    <div class=\"input_text_inside t5 reginput\">\n" +
            "                        <div class=\"inputtit\">手机验证码：</div>\n" +
            "                        <input name=\"mobile_vcode\" type=\"text\" class=\"minput reginput\" maxlength=\"4\">\n" +
            "                        <div class=\"sendbtn\" id=\"J_top_get_code\" onclick=\"getcode()\">获取验证码</div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"J_reg_com_box\" style=\"display: none;\">\n" +
            "                    <div class=\"ce\">\n" +
            "                        <div class=\"input_text_inside t5 reginput\">\n" +
            "                            <div class=\"inputtit\">企业名称：</div>\n" +
            "                            <input name=\"companyname\" type=\"text\" class=\"minput reginput\" maxlength=\"30\">\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                    <div class=\"ce\">\n" +
            "                        <div class=\"input_text_inside t5 reginput\">\n" +
            "                            <div class=\"inputtit\">企业联系人：</div>\n" +
            "                            <input name=\"contact\" type=\"text\" class=\"minput reginput\" maxlength=\"11\">\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                                <div class=\"ce\">\n" +
            "                    <input type=\"hidden\" name=\"reg_type\" value=\"1\">\n" +
            "                    <input type=\"hidden\" name=\"utype\" class=\"J_u_type\" value=\"2\">\n" +
            "                    <input class=\"btn\" type=\"button\" name=\"submit\" id=\"J_top_reg_btn\" value=\"立即注册\">\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"rmain\">\n" +
            "            <div class=\"tit\">使用第三方账号登录</div>\n" +
            "            <div class=\"api_login\">\n" +
            "                <a class=\"uu_api_login_btn sina\" href=\"/74cms_v4.2.111/upload/index.php?m=&amp;c=callback&amp;a=index&amp;mod=sina&amp;type=login\"></a><a class=\"uu_api_login_btn qq\" href=\"/74cms_v4.2.111/upload/index.php?m=&amp;c=callback&amp;a=index&amp;mod=qq&amp;type=login\"></a>                <div class=\"clear\"></div>\n" +
            "            </div>\n" +
            "            <div class=\"btnbox\">\n" +
            "                <div class=\"btn_yellow_api btn_inline  btn_border J_top_reg_user_log\">有账号？直接登录</div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "    <div class=\"clear\"></div>\n" +
            "    <div id=\"topCaptchaBox\"></div>\n" +
            "    <input type=\"button\" id=\"btnTopCheck\" style=\"display:none;\">\n" +
            "</div>";
    }
    if(a==1){
        signup_per ="<div class=\"ajax_reg\">\n" +
            "    <div class=\"title\">\n" +
            "        <div class=\"logo\">骑士人才系统&nbsp;·&nbsp;注册</div>\n" +
            "        <div class=\"close J_btncancel\" onclick=\"ly_sign_close()\" ></div>\n" +
            "    </div>\n" +
            "    <div class=\"reg_select_box J_reg_select_box\" style=\"display: none;\">\n" +
            "        <div class=\"tit\">请选择注册类型</div>\n" +
            "        <div class=\"sbox\">\n" +
            "            <div class=\"slisit1 J_hoverbut\" id=\"J_reg_select_com\">\n" +
            "                <div class=\"stitle\">企业注册</div>\n" +
            "                <div class=\"stxt\">\n" +
            "                    √&nbsp;发布招聘信息<br>\n" +
            "                    √&nbsp;收取简历投递<br>\n" +
            "                    √&nbsp;多种职位分享\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"slisitc\">&nbsp;</div>\n" +
            "            <div class=\"slisit2 J_hoverbut\" id=\"J_reg_select_per\">\n" +
            "                <div class=\"stitle\">个人注册</div>\n" +
            "                <div class=\"stxt\">\n" +
            "                    √&nbsp;免费创简历<br>\n" +
            "                    √&nbsp;职位海量淘<br>\n" +
            "                    √&nbsp;简历轻松投<br>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"clear\"></div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "    <div class=\"do_box J_do_box\" style=\"display: block;\">\n" +
            "        <div class=\"lmain\">\n" +
            "            <div class=\"frombox J_reg_per_box\">\n" +
            "                <div class=\"tit link_blue\"><span class=\"J_top_reg_type_txt\">企业</span>注册 <a class=\"change_type J_top_change_reg_type\" href=\"javascript:signup_change(2)\">切换为个人注册</a></div>\n" +
            "                <div class=\"ce\">\n" +
            "                    <div class=\"input_text_inside t5 reginput\">\n" +
            "                        <div class=\"inputtit\">输入手机号：</div>\n" +
            "                        <input name=\"mobile\" type=\"text\" class=\"minput reginput\" onblur=\"checkout_phone()\" >\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"err link_blue J_top_has_remind\" style=\"display: none;\">\n" +
            "                    该手机号已存在，可以使用此手机号 <a id=\"J_site_login\" href=\"javascript:;\">立即登录</a>\n" +
            "                </div>\n" +
            "                <div class=\"ce\">\n" +
            "                    <div class=\"input_text_inside t5 reginput\">\n" +
            "                        <div class=\"inputtit\">手机验证码：</div>\n" +
            "                        <input name=\"mobile_vcode\" type=\"text\" class=\"minput reginput\" maxlength=\"4\">\n" +
            "                        <div class=\"sendbtn\" id=\"J_top_get_code\" onclick=\"getcode()\">获取验证码</div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"J_reg_com_box\">\n" +
            "                    <div class=\"ce\">\n" +
            "                        <div class=\"input_text_inside t5 reginput\">\n" +
            "                            <div class=\"inputtit\">企业名称：</div>\n" +
            "                            <input name=\"companyname\" type=\"text\" class=\"minput reginput\" maxlength=\"30\">\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                    <div class=\"ce\">\n" +
            "                        <div class=\"input_text_inside t5 reginput\">\n" +
            "                            <div class=\"inputtit\">企业联系人：</div>\n" +
            "                            <input name=\"contact\" type=\"text\" class=\"minput reginput\" maxlength=\"11\">\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                                <div class=\"ce\">\n" +
            "                    <input type=\"hidden\" name=\"reg_type\" value=\"1\">\n" +
            "                    <input type=\"hidden\" name=\"utype\" class=\"J_u_type\" value=\"1\">\n" +
            "                    <input class=\"btn\" type=\"button\" name=\"submit\" id=\"J_top_reg_btn\" value=\"立即注册\">\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"rmain\">\n" +
            "            <div class=\"tit\">使用第三方账号登录</div>\n" +
            "            <div class=\"api_login\">\n" +
            "                <a class=\"uu_api_login_btn sina\" href=\"/74cms_v4.2.111/upload/index.php?m=&amp;c=callback&amp;a=index&amp;mod=sina&amp;type=login\"></a><a class=\"uu_api_login_btn qq\" href=\"/74cms_v4.2.111/upload/index.php?m=&amp;c=callback&amp;a=index&amp;mod=qq&amp;type=login\"></a>                <div class=\"clear\"></div>\n" +
            "            </div>\n" +
            "            <div class=\"btnbox\">\n" +
            "                <div class=\"btn_yellow_api btn_inline  btn_border J_top_reg_user_log\">有账号？直接登录</div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "    <div class=\"clear\"></div>\n" +
            "    <div id=\"topCaptchaBox\"></div>\n" +
            "    <input type=\"button\" id=\"btnTopCheck\" style=\"display:none;\">\n" +
            "</div>"
    }
    $('.modal_body').html(signup_per)
}
function signup_change(a) {
    if(a==1){
        ly_signup_per(1)
    }
    if(a==2){
        ly_signup_per(2)
    }
}
function checkout_phone() {
    $.ajax({
        url:'/checkout_phone',
        type:'post',
        data:{
            phoneMumber:$("#username").val()
        },
        success:function (msg) {
            if(msg != "ok"){
                alert(msg)
                $(".err").text(msg)
            }
        }
    })
}
function getcode() {
    alert($("#username").val());
    $.ajax({
        url: '/getCode',
        type: 'post',
        data: {
            phoneNumber: $("#username").val()
        },
        success: function (code) {
            console.info(code)
        }
    })
}