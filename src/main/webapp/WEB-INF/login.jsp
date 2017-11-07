<%--
  Created by IntelliJ IDEA.
  User: yvettee
  Date: 2017/10/16
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/page/tag.jsp" %>
<html>
<head>
    <title>登录界面</title>
    <link href="${baseurl}/css/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container demo-1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas">
            </canvas>
            <div class="logo"><h1>腾龙太阳光<sup>2017</sup></h1></div>
            <div class="login" style="margin-top:50px;">
                <div class="header">
                    <div class="switch" id="switch">
                        <a class="switch_btn_focus" id="switch_qlogin" href="javascript:void(0);" tabindex="7">快速登录</a>
                        <a class="switch_btn" id="switch_login" href="javascript:void(0);" tabindex="8">快速注册</a>
                        <div class="switch_bottom" id="switch_bottom"
                             style="position: absolute; width: 64px; left: 0px;"></div>
                    </div>
                </div>

                <div class="web_qr_login" id="web_qr_login" style="display: block; height: 235px;">
                    <!--登录-->
                    <div class="web_login" id="web_login">
                        <div class="login-box">
                            <div class="login_form">
                                <form action="" name="loginform" accept-charset="utf-8" id="login_form"
                                      class="loginForm" method="post">
                                    <input type="hidden" id="userName" name="did" value="0"/>
                                    <input type="hidden" id="password" name="to" value="log"/>
                                    <div class="uinArea" id="uinArea">
                                        <label class="input-tips" for="u">帐号：</label>
                                        <div class="inputOuter" id="uArea">

                                            <input type="text" id="u" name="username" class="inputstyle"/>
                                        </div>
                                    </div>
                                    <div class="pwdArea" id="pwdArea">
                                        <label class="input-tips" for="p">密码：</label>
                                        <div class="inputOuter" id="pArea">

                                            <input type="password" id="p" name="p" class="inputstyle"/>
                                        </div>
                                    </div>

                                    <div style="padding-left:50px;margin-top:20px;">
                                        <input type="submit" value="登 录" style="width:150px;"  onclick="login()" class="button_blue"/></div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!--登录end-->
                </div>

                <!--注册-->
                <div class="qlogin" id="qlogin" style="display: none; ">
                    <div class="web_login">
                        <form name="form2" id="regUser" accept-charset="utf-8" action="" method="post">
                            <input type="hidden" name="to" value="reg"/>
                            <input type="hidden" name="did" value="0"/>
                            <ul class="reg_form" id="reg-ul">
                                <div id="userCue" class="cue">快速注册请注意格式</div>
                                <li>
                                    <label for="user" class="input-tips2">用户名：</label>
                                    <div class="inputOuter2">
                                        <input type="text" id="user" name="user" maxlength="16" class="inputstyle2"/>
                                    </div>
                                </li>
                                <li>
                                    <label for="passwd" class="input-tips2">密码：</label>
                                    <div class="inputOuter2">
                                        <input type="password" id="passwd" name="passwd" maxlength="16"
                                               class="inputstyle2"/>
                                    </div>
                                </li>
                                <li>
                                    <label for="passwd2" class="input-tips2">确认密码：</label>
                                    <div class="inputOuter2">
                                        <input type="password" id="passwd2" name="" maxlength="16" class="inputstyle2"/>
                                    </div>
                                </li>
                                <li>
                                    <div class="inputArea">
                                        <input type="button" id="reg" style="margin-top:10px;margin-left:85px;"
                                               class="button_blue" value="同意协议并注册"/>
                                        <a href="#" class="zcxy" target="_blank">注册协议</a>
                                    </div>
                                </li>
                                <div class="cl"></div>
                            </ul>
                        </form>
                    </div>
                </div>
                <!--注册end-->
            </div>
            <div class="jianyi">*推荐使用ie8或以上版本ie浏览器或Chrome内核浏览器访问本网站</div>
        </div>
    </div>
</div>
<!-- /container -->
<script type="text/javascript" src="${baseurl}/js/TweenLite.min.js"></script>
<script type="text/javascript" src="${baseurl}/js/EasePack.min.js"></script>
<script type="text/javascript" src="${baseurl}/js/rAF.js"></script>
<script type="text/javascript" src="${baseurl}/js/demo-1.js"></script>
<script type="text/javascript" src="${baseurl}/js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="${baseurl}/js/login.js"></script>
<div style="text-align:center;">
</div>
<script>
    function login() {
        let adminName = $("#userName").val();
        let adminPassword = $("#password").val();
        $.ajax({
            url: "${baseurl}/login",
            data: {adminName: adminName, adminPassword: adminPassword},
            success: function (data) {
                if (data.result) {
                    location.href = "${baseurl}/index";
                } else {
                    layui.use('layer', function () {
                        var layer = layui.layer;
                        layer.msg('登录失败:用户名或密码错误', {icon: 5, time: 2000});
                    });
                }
            }
        });
    }

</script>
</body>
</html>
