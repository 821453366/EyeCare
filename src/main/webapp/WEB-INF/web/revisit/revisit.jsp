<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ include file="../../../page/tag.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Table</title>
    <link rel="stylesheet" href="${baseurl}/public/common/layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="${baseurl}/public/common/css/global.css" media="all">
    <link rel="stylesheet" href="${baseurl}/public/css/global.css" media="all">
    <link rel="stylesheet" href="${baseurl}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${baseurl}/public/css/table.css"/>
    <script type="text/javascript" src="${baseurl}/js/myjs/jquery.min.js"></script>
    <link rel="stylesheet" href="${baseurl}/public/css/eu_manage.css" media="all">
    <script type="text/javascript" src="${baseurl}/public/js/button_js.js" charset="utf-8"></script>
</head>
<style>
    .layui-table td, .layui-table th {
        text-align: center;
    }
</style>
<script type="text/javascript" src="${baseurl}/public/common/layui/layui.js"></script>

<body>
<div class="admin-main">
    <blockquote class="layui-elem-quote">

        <a class="refer layui-btn " onclick="cl.addUser()">
            <i class="layui-icon">&#xe61f;</i>添加
        </a>
    </blockquote>

    <fieldset class="layui-elem-field">
        <legend>产品</legend>
        <div style="margin: 20px;">
            <table class="site-table layui-table table-hover ">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>员工ID</th>
                    <th>订单ID</th>
                    <th>回访次数</th>
                    <th>回访信息</th>
                    <th>回访时间</th>
                    <th>回访备注</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody class="tr_1">

                </tbody>
            </table>
        </div>
        <div style="margin: 25px;" id="demo1"></div>
        <ul id="biuuu_city_list"></ul>
    </fieldset>
</div>
<script id="list-tpl" type="text/html">
    {{# layui.each(d.user, function(index, item){ }}
    <tr>
        <td>{{ index+1}}</td>
        <th>{{item.emp_id == undefined ? "暂无" : item.emp_id}}</th>
        <th>{{item.order_id == undefined ? "暂无" : item.order_id}}</th>
        <th>{{item.re_count == undefined ? "暂无" : item.re_count}}</th>
        <th>{{item.re_info == undefined ? "暂无" : item.re_info}}</th>
        <th>{{item.re_time == undefined ? "暂无" : item.re_time}}</th>
        <th>{{item.order_desc == undefined ? "暂无" : item.order_desc}}</th>
        <td>
            <button data-id='1' data-opt='del' class='layui-btn layui-btn-danger layui-btn-small layui-icon'
                    onclick="cl.delete('{{item.re_id}}')">
                &#xe640;删除
            </button>
        </td>
    </tr>
    {{# }); }}
</script>

</body>
<div id="addUser" style="display: none">
    <form class="layui-form layui-form-pane" id="update-form" style="padding-left: 35%;">
        <div class="layui-form-item">
            <label class="layui-form-label">员工ID：</label>
            <div class="layui-input-inline">
                <input  type="text" id = "empid" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">订单ID：</label>
            <div class="layui-input-inline">
                <input type="text" id = "orderid" lay-verify="required"  autocomplete="off"
                       class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">回访次数：</label>
            <div class="layui-input-inline">
                <input type="text" id = "recount" lay-verify="required"  autocomplete="off"
                       class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">回访信息：</label>
            <div class="layui-input-inline">
                <%--<input type="text" id = "reinfo" lay-verify="required" autocomplete="off"--%>
                       <%--class="layui-input" >--%>
                <textarea name=" " id = "reinfo" cols="30" rows="10"></textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">回访时间：</label>
            <div class="layui-input-inline">
                <input type="text" id = "reTime" lay-verify="required" autocomplete="off"
                       class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">回访备注：</label>
            <div class="layui-input-inline">
                <textarea name=" " id = "orderDesc" cols="30" rows="10"></textarea>
                <%--<input type="text" id = "orderDesc" lay-verify="required" autocomplete="off"--%>
                       <%----%>
                       <%--class="layui-input" >--%>
            </div>
        </div>
        <div class="layui-input-block">
            <button class="layui-btn" onclick="cl.addUserAjax()">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>

    </form>
</div>
<script type="text/javascript">
    let totalSize = 10;
    let currentIndex = 1;
    let pageSize = 10;
    let cl;
    let imgName;
    layui.use(['jquery', 'layer', 'element', 'laypage', 'form', 'laytpl', 'tree','upload'], function () {
        window.jQuery = window.$ = layui.jquery;
        window.layer = layui.layer;
        var element = layui.element(),
            form = layui.form(),
            laytpl = layui.laytpl;

        cl = {
            page: function () {
                layui.laypage({
                    cont: 'demo1',
                    pages: totalSize, //总页数
                    curr: currentIndex,
                    groups: 5,//连续显示分页数
                    skin: '#1E9FFF',
                    jump: function (obj, first) {
                        currentIndex = obj.curr;
                        if (!first) {
                            cl.list();
                        }
                    }
                });
            },
            list: function () {
                let empName = $("#empName").val();
                $.post("${pageContext.request.contextPath}/revisit/findRevist", {
                        currentIndex: currentIndex,
                        pageSize: pageSize,
                        proName:empName
                    },
                    function (data) {
                        if (data.result) {
                            currentIndex = data.page.currentIndex;
                            totalSize = data.page.totalSize;
                            cl.page();
                            laytpl($("#list-tpl").text()).render(data, function (html) {
                                $(".tr_1").html(html);
                            });
                            form.render();
                        }
                    },
                    "json"
                );
            },
            preview: function (id) {
                $.post("${pageContext.request.contextPath}/revisit/userInfo",
                    {id:id},
                    function (data) {
                        let user = data.user[0];
                        $("#imagesInfo").text("").attr("src", HEAD_IMAGE_PREFIX + user.file);
                        imgName = user.img;
                        $("#updateproName").val(user.proName);
                        $("#updateproOprice").val(user.proOprice);
                        $("#updateproNprice").val(user.proNprice);
                        $("#updateproAmount").val(user.proAmount);
                        $("#updatecategoryId").val(user.categoryId);
                        $("#updateproState").val(user.proState);
                        $("#updateproType").val(user.proType);
                    }
                )
                layer.open({
                    type: 1,
                    title: '管理员信息'
                    , content: $("#preview"),
                    area: ['100%', '100%']
                });

            },
            //用户信息
            updateInfo: function (id) {
            $.post("${pageContext.request.contextPath}/revisit/userInfo",{id:id},
                function (data) {
                    let user = data.user[0];
                    $("#empIdUpdate").val(user.empId);
                    $("#adminRealnameUpdate").val(user.empName);
                    $("#adminPhoneUpdate").val(user.empPhone);
                    $("#adminDateUpdate").val(user.empTime);
                    layer.open({
                        type: 1,
                        title: "修改信息",
                        area:['40%', '70%'],
                        closeBtn: 1,
                        content: $("#updateInfo")
                    })
                }
            )
        },
            //用户信息
            updateInfoAjax: function () {
                let eyeEmp = $("#updateUserInfo").serialize();
            $.post("${pageContext.request.contextPath}/revisit/updateInfoAjax",
                eyeEmp,
                function (data) {
                    layer.msg(data.msg);
                }
            )
        },
            addUser: function () {
                layer.open({
                    type: 1,
                    title: '添加商品信息'
                    , content: $("#addUser"),
                    area: ['100%', '100%']
                });
            },
            addUserAjax: function () {
                let empid = $("#empid").val();
                let orderid = $("#orderid").val();
                let recount = $("#recount").val();
                let reinfo = $("#reinfo").val();
                let reTime = $("#reTime").val();
                let orderDesc = $("#orderDesc").val();
                $.post("${baseurl}/revisit/addRevist",{
                    empId:empid,
                    orderId:orderid,
                    reCount:recount,
                    reInfo:reinfo,
                    reTime:reTime,
                    orderDesc:orderDesc
                }, function (data) {

                    layer.msg(data.msg, {time: 500});
                    if (data.result) {
                        setTimeout("location.reload()", 1000);
                    }
                });
            },
            delete:function (id) {
                layer.confirm('确定删除？', {icon: 3, title: '提示'}, function (index) {
                    layer.close(index);
                    $.post("${pageContext.request.contextPath}/revisit/deleteRevist", {id: id},
                        function (data) {
                            layer.msg(data.msg, {time: 500});
                            if (data.result) {
                                setTimeout("location.reload()", 500);
                            }
                        });
                });
            },
        }
        $(function () {
            cl.list();
        });
    });
</script>

</html>