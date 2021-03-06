﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ include file="../page/tag.jsp" %>
<!DOCTYPE html>

<html>

<head>
    <meta charset="utf-8">
    <title>腾龙太阳光眼睛护理平台</title>

    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-com.eu.dss.web-app-status-bar-style" content="black">
    <meta name="apple-mobile-com.eu.dss.web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">

    <link rel="stylesheet" href="${baseurl}/public/common/layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="${baseurl}/css/global.css" media="all">
    <link rel="stylesheet" href="${baseurl}/plugins/font-awesome/css/font-awesome.min.css">
    <script type="text/javascript" src="${baseurl}/js/myjs/jquery.min.js"></script>
    <script type="text/javascript" src="${baseurl}/plugins/layui/layui.js"></script>
    <script type="text/javascript" class="nav_script"></script>
    <script src="${baseurl}/js/index.js"></script>

</head>
<script type="text/javascript">
    let imgName;
    var rank;
    $(function () {
        //判断session是否存在
        $.post("${pageContext.request.contextPath}/session",
            function (data) {
                if (!data.haveSession) {
                    window.location.href = "${baseurl}";
                }
            }
        )

        //权限设置
        $.post("${pageContext.request.contextPath}/userInfo",
            function (data) {
            console.log(data)
                let user = data.user[0];
                rank = user.empRank;
                var src = "${baseurl}/datas/nav" + rank + ".js";
                $(".nav_script").attr({src: src});
            }
        )
        //显示头像及图片
        $.post("${pageContext.request.contextPath}/userInfo",
            function (data) {
                let user = data.user[0];
                $("#Name").html(user.empName);
            }
        )


    });
    //退出登录
    function out() {
        $.post("${pageContext.request.contextPath}/outSession",
            function (data) {
                layer.msg(data.msg, {
                    time: 1000
                }, function () {
                    window.location.href = "${baseurl}";
                });

            }
        )
    }
    function preview() {
        $.post("${pageContext.request.contextPath}/userInfo",
            function (data) {
                let user = data.user[0];
                $("#empName").val(user.empName);
                $("#empSex").val(user.empSex);
                $("#empPhone").val(user.empPhone);
                $("#empState").val("可用");
                $("#empTime").val(user.empTime);
                $("#empRank").val(user.empRank == 1 ? "经理" : "普通员工");

            }
        )
        layer.open({
            type: 1,
            title: '我的信息'
            , content: $("#preview"),
            area: ['100%', '100%']
        });

    }
</script>
<body>
<div class="layui-layout layui-layout-admin" style="border-bottom: solid 1px #1aa094;">
    <div class="layui-header header header-demo">
        <div class="layui-main">
            <div class="admin-login-box">
                <a class="logo" style="left: 0;width: 240px;">
                    <span style="font-size: 20px;font-weight: bold;color: #FFFFFF">腾龙太阳光眼睛护理后台</span>
                </a>

            </div>
            <ul class="layui-nav admin-header-item">
                <li class="layui-nav-item">
                    <a href="javascript:;" class="admin-header-user">
                        <img id="images" src="${baseurl}/img/user.png"/>
                        <span id="Name" style="color: #FFFFFF">管理员</span>
                    </a>
                    <dl
                            class="layui-nav-child">
                        <dd>
                            <a style="cursor:pointer" onclick="preview()"><i class="fa fa-user-circle"
                                                                             aria-hidden="true"></i> 我的信息</a>
                        </dd>
                        <dd>
                            <a style="cursor:pointer" onclick="out()"><i class="fa fa-sign-out" aria-hidden="true"></i>
                                退出登录</a>
                        </dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
    <div class="layui-side layui-bg-black" id="admin-side">
        <div class="layui-side-scroll" id="admin-navbar-side" lay-filter="side"></div>
    </div>
    <div class="layui-body" style="bottom: 0;border-left: solid 2px #F2F2F2;" id="admin-body">
        <div class="layui-tab admin-nav-card layui-tab-brief" style="margin-top: 1px" lay-filter="admin-tab">
            <ul class="layui-tab-title">
                <li class="layui-this">
                    <i class="fa fa-fax" aria-hidden="true"></i>
                    <cite>简介</cite>
                </li>
            </ul>
            <div class="layui-tab-content" style="min-height: 150px; padding: 5px 0 0 0;">
                <div class="layui-tab-item layui-show">
                    <iframe src="${baseurl}/page/main.jsp"></iframe>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-footer footer footer-demo">
        <div class="layui-main">
            <p><br></p>
            <p>
                <a href="#" target="_blank">腾龙太阳光眼睛护理后台 © 2017</a>
            </p>
        </div>
    </div>
    <div class="site-tree-mobile layui-hide">
        <i class="layui-icon">&#xe602;</i>
    </div>
    <div class="site-mobile-shade"></div>
</div>
</body>
<div id="preview" style="display: none">
    <fieldset class="layui-elem-field layui-field-title">
        <legend>我的信息</legend>
    </fieldset>
    <div style="padding-left: 25%;padding-top: 2%;">
            <div class="layui-form-item">
                <label class="layui-form-label">帐号:</label>
                <div class="layui-input-inline">
                    <input readonly="readonly" type="text" id="empName" lay-verify="required"
                           autocomplete="off" class="layui-input">
                </div>
                <label class="layui-form-label">性别：</label>
                <div class="layui-input-inline">
                    <input type="text" id="empSex" lay-verify="required" placeholder="请输入" autocomplete="off"
                           class="layui-input" readonly="readonly">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">手机号：</label>
                <div class="layui-input-inline">
                    <input type="text" id="empPhone" lay-verify="required" placeholder="请输入" autocomplete="off"
                           class="layui-input" readonly="readonly">
                </div>
                <label class="layui-form-label">状态：</label>
                <div class="layui-input-inline">
                    <input type="text" id="empState" lay-verify="required" placeholder="请输入" autocomplete="off"
                           class="layui-input" readonly="readonly">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">账号创建时间：</label>
                <div class="layui-input-inline">
                    <input type="text" id="empTime" lay-verify="required" placeholder="请输入" autocomplete="off"
                           class="layui-input" readonly="readonly">
                </div>
                <label class="layui-form-label">权限：</label>
                <div class="layui-input-inline">
                    <input type="text" id="empRank" lay-verify="required" placeholder="请输入" autocomplete="off"
                           class="layui-input" readonly="readonly">
                </div>
            </div>
    </div>
</div>
</html>