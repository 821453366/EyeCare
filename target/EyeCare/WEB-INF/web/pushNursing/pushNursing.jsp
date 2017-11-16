<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../../../page/tag.jsp" %>
<html>
<head>
    <title></title>
    <script type="text/javascript" src="${baseurl}/public/common/js/jquery-3.2.0.min.js"></script>
    <script src="${baseurl}/public/common/layui/layui.js" charset="utf-8"></script>
    <script src="${baseurl}/js/separator.js" charset="utf-8"></script>
    <link rel="stylesheet" href="${baseurl}/public/common/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="${baseurl}/public/common/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="${baseurl}/public/common/bootstrap/css/bootstrap.min.css" media="all">
    <link rel="stylesheet" type="text/css" href="${baseurl}/public/common/css/global.css" media="all">
    <link rel="stylesheet" type="text/css" href="${baseurl}/public/css/common.css" media="all">
    <link rel="stylesheet" type="text/css" href="${baseurl}/public/css/personal.css" media="all">
    <script type="text/javascript" src="${baseurl}/js/searchJs.js"></script>

</head>
<body style=" background: #fff;">
<section class=" layui-form">
    <div class="larry-personal" style="width: 95% ">
        <form>
            <div class="layui-tab">
                <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
                    <legend>发布护理推送</legend>
                </fieldset>
                <div class="layui-form-item">

                    <div class="layui-input-block" style="    margin-left: 0px;">
                        <input type="text" id="title" name="title" lay-verify="title" autocomplete="off"
                               placeholder="请输入标题" class="layui-input">
                    </div>
                </div>
                <textarea class="layui-textarea" id="LAY_demo1" style="display: none">
                </textarea>

                <div class="site-demo-button" style="margin-top: 20px;">
                    <p class="layui-btn site-demo-layedit" data-type="content">发布</p>
                </div>

            </div>
        </form>
    </div>
</section>
<fieldset class="layui-elem-field layui-field-title"
          style="margin-top: 10px;width: 95%;margin: 10px auto;margin-bottom: 10px;">
    <legend>已经推送的护理信息</legend>
</fieldset>
<div class="" style="width: 95%;margin: 0 auto;font-size: 16px; ">
    <div class="layui-collapse " id="notice" lay-filter="test">

    </div>
</div>

</div>
<script>
    //注意：折叠面板 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function () {
        var element = layui.element;

        //…
    });
</script>

</body>
<script type="text/javascript" src="${baseurl}/public/common/layui/layui.js"></script>
<script type="text/javascript">
    let notice;
    layui.use(['jquery', 'layer', 'element', 'laypage', 'form', 'laytpl', 'tree'], function () {
        window.jQuery = window.$ = layui.jquery;
        window.layer = layui.layer;
        var element = layui.element(),
            form = layui.form(),
            laytpl = layui.laytpl;

        notice = {
            add: function (title, content) {
                var date = new Date();
                var year = date.getFullYear();
                var month = date.getMonth() + 1;
                var day = date.getDate();
                var hour = date.getHours();
                var minute = date.getMinutes();
                var second = date.getSeconds();
                let time = year + '年' + month + '月' + day + '日 ' + hour + ':' + minute + ':' + second
                $.post(baseUrl + "/pushNursing/add", {
                    catName: title,
                    catBrand: content,
                    catDate: time
                }, function (data) {
                        setTimeout("location.reload()", 1000);
                })
            },

            list: function () {
                $.post(baseUrl + "/pushNursing/query", function (data) {
                    notice.showMassage(data.user);
                    element.init();
                });
            },
            showMassage: function (data) {
                $("#notice").html("");
                for (var i = 0; i < data.length; i++) {
                    $("#notice").append(`
                <div class="layui-colla-item">
                <h2 class="layui-colla-title" style="height: 90px; font-size: 16px">
                    护理推送：` + data[i].cat_name + `<span style="font-size: 12px;color: darkgray;float: right"></span><br>
                    <p style="font-size: 12px;color: darkgray;text-indent: 2em;">发布人：管理员<span style="margin-left: 20px;"> 发时间： ` + data[i].cat_date + `</span>


                    </p>
                    <i class="layui-icon layui-colla-icon"></i>

                </h2>
                <div class="layui-colla-content ">
                    <p style="font-size: 14px;">` + data[i].cat_brand + `</p>
                </div>
                </div>`);
                }
            }
        }
        $(function () {
            notice.list();
        });
    });
</script>
<script>
    layui.use('layedit', function () {
        var layedit = layui.layedit
            , $ = layui.jquery;

        //构建一个默认的编辑器
        var index = layedit.build('LAY_demo1', {
            tool: [
                'strong' //加粗
                , 'italic' //斜体
                , 'underline' //下划线
                , 'del' //删除线

                , '|' //分割线

                , 'left' //左对齐
                , 'center' //居中对齐
                , 'right' //右对齐
                , 'link' //超链接
                , 'unlink' //清除链接
                , 'face' //表情
            ]
        });

        //编辑器外部操作
        var active = {
            content: function () {
                var content = layedit.getContent(index);
                notice.add($("#title").val(), content);
            }
        };

        $('.site-demo-layedit').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

    });
</script>

<script>
    layui.use(['form', 'layedit', 'laydate'], function () {
        var form = layui.form()
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate;

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            title: function (value) {
                if (value.length < 5) {
                    return '标题至少得5个字符啊';
                }
            }
            , pass: [/(.+){6,12}$/, '密码必须6到12位']
            , content: function (value) {
                layedit.sync(editIndex);
            }
        });

    });
</script>

</html>
