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
        <legend>管理员</legend>
        <div style="margin: 20px;">
            <table class="site-table layui-table table-hover ">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>用户ID</th>
                    <th>性别</th>
                    <th>手机号</th>
                    <th>状态</th>
                    <th>权限</th>
                    <th>创建时间</th>
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
        <th>{{item.emp_name == undefined ? "暂无" : item.emp_name}}</th>
        <th>{{item.emp_sex == undefined ? "暂无" : item.emp_sex}}</th>
        <th>{{item.emp_phone == undefined ? "暂无" : item.emp_phone}}</th>
        <th>{{"可用"}}</th>
        <th>{{item.emp_rank == undefined ? "暂无" : (item.emp_rank == '1'?'管理员':'普通员工')}}</th>
        <th>{{item.emp_time == undefined ? "暂无" : item.emp_time}}</th>
        <td>
            <a class="layui-btn layui-btn-small layui-btn-normal  layui-icon "
               onclick="cl.preview('{{item.emp_id}}')">
                &#xe60a; 预览
            </a>
            <button class='layui-btn layui-btn-small layui-icon' onclick="cl.updateInfo('{{item.emp_id}}')">&#xe642;编辑</button>
            <button data-id='1' data-opt='del' class='layui-btn layui-btn-danger layui-btn-small layui-icon'
                    onclick="cl.delete('{{item.emp_id}}')">
                &#xe640;删除
            </button>
        </td>
    </tr>
    {{# }); }}
</script>

</body>
<div id="addUser" style="display: none">
    <form class="layui-form layui-form-pane" id="update-form" style="padding-left: 25%;padding-top: 10%;">

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">用户ID：</label>
                <div class="layui-input-inline">
                    <input type="text" name="empName" autocomplete="off" class="layui-input" placeholder="登录账号">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">密码：</label>
                <div class="layui-input-inline">
                    <input type="password" name="empPassword" autocomplete="off" class="layui-input"
                           placeholder="登录密码">
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">性别：</label>
            <div class="layui-input-block">
                <input type="radio" name="empSex" value="男" title="男" checked>
                <input type="radio" name="empSex" value="女" title="女">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">权限：</label>
            <div class="layui-input-block">
                <input type="radio" name="empRank" value="1" title="管理员" checked>
                <input type="radio" name="empRank" value="2" title="普通员工">
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
    <div style="padding-left: 25%;padding-top: 2%;">
        <form class="layui-form layui-form-pane" action="">

            <div class="layui-form-item">
                <label class="layui-form-label">用户ID：</label>
                <div class="layui-input-inline">
                    <input readonly="readonly" type="text" id="adminNamePreview" lay-verify="required"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">性别：</label>
                <div class="layui-input-inline">
                    <input type="text" id="adminSexPreview" lay-verify="required" placeholder="待完善" autocomplete="off"
                           class="layui-input" readonly="readonly">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">手机号：</label>
                <div class="layui-input-inline">
                    <input type="text" id="adminPhonePreview" lay-verify="required" placeholder="待完善" autocomplete="off"
                           class="layui-input" readonly="readonly">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">状态：</label>
                <div class="layui-input-inline">
                    <input type="text" id="" lay-verify="required"value="可用" autocomplete="off"
                           class="layui-input" readonly="readonly">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">权限：</label>
                <div class="layui-input-inline">
                    <input type="text" id="adminRankPreview" lay-verify="required" placeholder="请输入" autocomplete="off"
                           class="layui-input" readonly="readonly">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">账号创建日期：</label>
                <div class="layui-input-inline">
                    <input type="text" id="adminDatePreview" lay-verify="required" placeholder="请输入" autocomplete="off"
                           class="layui-input" readonly="readonly">
                </div>
            </div>

        </form>
    </div>
</div>
<div id="updateInfo" style="display: none">
    <fieldset class="layui-elem-field layui-field-title" >
        <legend>修改信息</legend>
    </fieldset>
    <div style="padding-left: 25%;padding-top: 2%;">
        <form class="layui-form layui-form-pane" action="" id="updateUserInfo">
            <input  type="text" id="empIdUpdate" name = "empId" lay-verify="required"
                    autocomplete="off" class="layui-input" style="display: none">
            <div class="layui-form-item">
                <label class="layui-form-label">用户ID:</label>
                <div class="layui-input-inline">
                    <input  type="text" id="adminRealnameUpdate" name = "empName" lay-verify="required"
                           autocomplete="off" class="layui-input" readonly>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">手机号：</label>
                <div class="layui-input-inline">
                    <input type="text" name="empPhone" id ="adminPhoneUpdate"lay-verify="required" placeholder="待完善" autocomplete="off"
                           class="layui-input" >
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">性别：</label>
                <div class="layui-input-block">
                    <input type="radio" name="empSex" value="男" title="男" checked>
                    <input type="radio" name="empSex" value="女" title="女">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">权限：</label>
                <div class="layui-input-block">
                    <input type="radio" name="empRank" value="1" title="管理员" checked>
                    <input type="radio" name="empRank" value="2" title="普通用户">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">账号创建日期：</label>
                <div class="layui-input-inline">
                    <input type="text" name="empTime" id ="adminDateUpdate" lay-verify="required" placeholder="请输入" autocomplete="off"
                           class="layui-input" readonly="readonly">
                </div>
            </div>
            <button style="margin-left: 80px; width: 150px;margin-bottom: 50px;" class="layui-btn"
                    onclick="cl.updateInfoAjax()"><i class="layui-icon">&#xe61f;</i>
                完成修改
            </button>
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
                $.post("${pageContext.request.contextPath}/user/findUser", {
                        currentIndex: currentIndex,
                        pageSize: pageSize,
                        empName:empName
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
                $.post("${pageContext.request.contextPath}/user/userInfo",
                    {id:id},
                    function (data) {
                        let user = data.user[0];
                        $("#adminNamePreview").val(user.empName);
                        $("#adminSexPreview").val(user.empSex);
                        $("#adminPhonePreview").val(user.empPhone);
                        $("#adminRankPreview").val(user.empRank == 1 ?"管理员":"普通员工");
                        $("#adminDatePreview").val(user.empTime);
                    }
                )
                layer.open({
                    type: 1,
                    title: '管理员信息'
                    , content: $("#preview"),
                    area: ['40%', '70%']
                });

            },
            //用户信息
            updateInfo: function (id) {
            $.post("${pageContext.request.contextPath}/user/userInfo",{id:id},
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
            $.post("${pageContext.request.contextPath}/user/updateInfoAjax",
                eyeEmp,
                function (data) {
                    layer.msg(data.msg);
                }
            )
        },
            addUser: function () {
                layer.open({
                    type: 1,
                    title: '添加用户'
                    , content: $("#addUser"),
                    area: ['40%', '70%']
                });
            },
            addUserAjax: function () {
                let eyeEmp = $("#update-form").serialize();
                $.post("${pageContext.request.contextPath}/user/addUser", eyeEmp, function (data) {
                    layer.msg(data.msg, {time: 500});
                    if (data.result) {
                        setTimeout("location.reload()", 1000);
                    }
                });
            },
            delete:function (id) {
                layer.confirm('确定删除？', {icon: 3, title: '提示'}, function (index) {
                    layer.close(index);
                    $.post("${pageContext.request.contextPath}/user/deleteUser", {id: id},
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