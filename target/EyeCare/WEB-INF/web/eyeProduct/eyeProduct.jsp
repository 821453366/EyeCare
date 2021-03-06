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
        <div class="layui-inline">
            <div class="layui-input-inline">
                <input type="text" name="title" id="empName" lay-verify="title" autocomplete="off"
                       placeholder="用户ID" class="layui-input">
            </div>
            <a class="layui-btn" onclick="cl.list()"><i class="layui-icon">&#xe615;</i>搜索</a>

        </div>
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
                    <th>产品名称</th>
                    <th>产品原价</th>
                    <th>销售价格</th>
                    <th>库存</th>
                    <th>分类</th>
                    <th>状态</th>
                    <th>类型</th>
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
        <th>{{item.pro_name == undefined ? "暂无" : item.pro_name}}</th>
        <th>{{item.pro_oprice == undefined ? "暂无" : item.pro_oprice}}</th>
        <th>{{item.pro_nprice == undefined ? "暂无" : item.pro_nprice}}</th>
        <th>{{item.pro_amount == undefined ? "暂无" : item.pro_amount}}</th>
        <th>{{item.category_id == undefined ? "暂无" : item.category_id}}</th>
        <th>{{item.pro_state == undefined ? "暂无" : item.pro_state}}</th>
        <th>{{item.pro_type == undefined ? "暂无" : item.pro_type}}</th>
        <td>
            <a class="layui-btn layui-btn-small layui-btn-normal  layui-icon "
               onclick="cl.preview('{{item.pro_id}}')">
                &#xe60a; 预览
            </a>
            <button data-id='1' data-opt='del' class='layui-btn layui-btn-danger layui-btn-small layui-icon'
                    onclick="cl.delete('{{item.pro_id}}')">
                &#xe640;删除
            </button>
        </td>
    </tr>
    {{# }); }}
</script>

</body>
<div id="addUser" style="display: none">
    <form class="layui-form layui-form-pane" id="update-form" style="padding-left: 35%;">
        <div>
            <div style="width:100px; height: 140px;margin-left: 50px;">
                <img id="imagesToUpdate" class="site-demo-upload"/>
            </div>
            <div style="margin-top: 100px;">
                <input type="file" name="file" id="file" class="layui-upload-file" style="width: auto"
                       lay-title="头像上传">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">产品名称：</label>
            <div class="layui-input-inline">
                <input  type="text" id = "proName" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">原价：</label>
            <div class="layui-input-inline">
                <input type="text" id = "proOprice" lay-verify="required"  autocomplete="off"
                       class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">售价：</label>
            <div class="layui-input-inline">
                <input type="text" id = "proNprice" lay-verify="required"  autocomplete="off"
                       class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">库存：</label>
            <div class="layui-input-inline">
                <input type="text" id = "proAmount" lay-verify="required" autocomplete="off"
                       class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">分类：</label>
            <div class="layui-input-inline">
                <input type="text" id = "categoryId" lay-verify="required" autocomplete="off"
                       class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">状态：</label>
            <div class="layui-input-inline">
                <input type="text" id = "proState" lay-verify="required" autocomplete="off"
                       class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">产品类型：</label>
            <div class="layui-input-inline">
                <input type="text" id = "proType" lay-verify="required" autocomplete="off"
                       class="layui-input" >
            </div>
        </div>
        <div class="layui-input-block">
            <button class="layui-btn" onclick="cl.addUserAjax()">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>

    </form>
</div>
<div id="preview" style="display: none">
    <fieldset class="layui-elem-field layui-field-title" >
        <legend>管理员信息</legend>
    </fieldset>
    <div style="padding-left: 35%;padding-top: 2%;">
        <form class="layui-form layui-form-pane" action="">
            <div >
                <div style="width:100px; height: 140px;margin-left: 50px;">
                    <img id="imagesInfo" class="site-demo-upload"/>
                </div>
                <div style="margin-top: 100px;">

                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">产品名称：</label>
                <div class="layui-input-inline">
                    <input  type="text" id = "updateproName" lay-verify="required"
                            autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">原价：</label>
                <div class="layui-input-inline">
                    <input type="text" id = "updateproOprice" lay-verify="required"  autocomplete="off"
                           class="layui-input" >
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">售价：</label>
                <div class="layui-input-inline">
                    <input type="text" id = "updateproNprice" lay-verify="required"  autocomplete="off"
                           class="layui-input" >
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">库存：</label>
                <div class="layui-input-inline">
                    <input type="text" id = "updateproAmount" lay-verify="required" autocomplete="off"
                           class="layui-input" >
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">分类：</label>
                <div class="layui-input-inline">
                    <input type="text" id = "updatecategoryId" lay-verify="required" autocomplete="off"
                           class="layui-input" >
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">状态：</label>
                <div class="layui-input-inline">
                    <input type="text" id = "updateproState" lay-verify="required" autocomplete="off"
                           class="layui-input" >
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">产品类型：</label>
                <div class="layui-input-inline">
                    <input type="text" id = "updateproType" lay-verify="required" autocomplete="off"
                           class="layui-input" >
                </div>
            </div>

        </form>
    </div>
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

        //图片上传
        layui.upload({
            url: '${baseurl}/eyeProduct/updateImage' //上传接口
            , success: function (res) { //上传成功后的回调
                if (res.result) {
                    $("#imagesToUpdate").text("").attr("src", HEAD_IMAGE_PREFIX + res.data);
                    imgName = res.data;
                }
            }
        });
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
                $.post("${pageContext.request.contextPath}/eyeProduct/findUser", {
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
                $.post("${pageContext.request.contextPath}/eyeProduct/userInfo",
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
            $.post("${pageContext.request.contextPath}/eyeProduct/userInfo",{id:id},
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
            $.post("${pageContext.request.contextPath}/eyeProduct/updateInfoAjax",
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
                let proName = $("#proName").val();
                let proOprice = $("#proOprice").val();
                let proNprice = $("#proNprice").val();
                let proAmount = $("#proAmount").val();
                let categoryId = $("#categoryId").val();
                let proState = $("#proState").val();
                let proType = $("#proType").val();
                $.post("${baseurl}/eyeProduct/addUser",{
                    proName:proName,
                    proOprice:proOprice,
                    proNprice:proNprice,
                    proAmount:proAmount,
                    categoryId:categoryId,
                    proState:proState,
                    proType:proType,
                    file:imgName
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
                    $.post("${pageContext.request.contextPath}/eyeProduct/deleteUser", {id: id},
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