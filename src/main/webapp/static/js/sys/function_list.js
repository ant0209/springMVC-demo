layui.use(['btable', 'form'], function () {
    var btable = layui.btable(),
        $ = layui.jquery,
        layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
        layer = layui.layer,//获取当前窗口的layer对象;
        form = layui.form();

    btable.set({
        openWait: true,//开启等待框
        elem: '#content',//div对象
        url: '../../function/query', //数据源地址
        pageSize: 10,//页大小
        params: {//额外的请求参数

        },
        columns: [{ //配置数据列
            fieldName: '功能名称', //显示名称
            field: 'name', //字段名
            sortable: true //是否显示排序
        }, {
            fieldName: '类型',
            field: 'type',
            sortable: true,
            format: function (id, rowObj) {
                if (rowObj.type == 1) {
                    return '菜单';
                }
                return '按钮';
            }
        }, {
            fieldName: '请求路径',
            field: 'uri',
            sortable: false
        }, {
            fieldName: '父节点名称',
            field: 'parentName',
            sortable: true
        },{
            fieldName: '状态',
            field: 'status',
            sortable: true,
            format: function (id, rowObj) {
                if (rowObj.status == 1) {
                    return '有效';
                }
                return '无效';
            }
        }, {
            fieldName: '操作',
            field: 'id',
            format: function (val,obj) {
                var html = '<input type="button" value="编辑" data-action="edit" data-id="' + val + '" class="layui-btn layui-btn-mini" /> ' +
                    '<input type="button" value="删除" data-action="del" data-id="' + val + '" class="layui-btn layui-btn-mini layui-btn-danger" />';
                return html;
            }
        }],
        even: true,//隔行变色
        field: 'id', //主键ID
        //skin: 'row',
        checkbox: false,//是否显示多选框
        paged: true, //是否显示分页
        singleSelect: false, //只允许选择一行，checkbox为true生效
        onSuccess: function ($elem) { //$elem当前窗口的jq对象
            $elem.children('tr').each(function () {
                $(this).children('td:last-child').children('input').each(function () {
                    var $that = $(this);
                    var action = $that.data('action');
                    var id = $that.data('id');
                    $that.on('click', function () {
                        switch (action) {
                            case 'edit':
                                layerTips.msg(action + ":" + id);
                                break;
                            case 'del': //删除
                                var name = $that.parent('td').siblings('td[data-field=name]').text();
                                //询问框
                                layerTips.confirm('确定要删除[ <span style="color:red;">' + name + '</span> ] ？', { icon: 3, title: '系统提示' }, function (index) {
                                    $that.parent('td').parent('tr').remove();
                                    layerTips.msg('删除成功.');
                                });
                                break;
                        }
                    });
                });
            });
        }
    });
    btable.render();
    //监听搜索表单的提交事件
    form.on('submit(search)', function (data) {
        btable.get(data.field);
        return false;
    });
    $(window).on('resize', function (e) {
        var $that = $(this);
        $('#content').height($that.height() - 92);
    }).resize();

    var addBoxIndex = -1;
    $('#add').on('click', function() {
        //本表单通过ajax加载 --以模板的形式，当然你也可以直接写在页面上读取
        $.get('../../v/sys/function_add', null, function(form) {
            if(addBoxIndex !== -1)
                return;
            addBoxIndex = layer.open({
                type: 1,
                title: '新增功能',
                content: form,
                btn: ['保存', '取消'],
                shade: false,
                offset: ['100px', '30%'],
                area: ['600px', '400px'],
                zIndex: 19950924,
                maxmin: true,
                yes: function(index) {
                    //触发表单的提交事件
                    $('form.layui-form').find('button[lay-filter=edit]').click();
                },
                full: function(elem) {
                    var win = window.top === window.self ? window : parent.window;
                    $(win).on('resize', function() {
                        var $this = $(this);
                        elem.width($this.width()).height($this.height()).css({
                            top: 0,
                            left: 0
                        });
                        elem.children('div.layui-layer-content').height($this.height() - 95);
                    });
                },
                success: function(layero, index) {
                    //弹出窗口成功后渲染表单
                    var form = layui.form();
                    form.render();
                    form.on('submit(edit)', function(data) {
                        console.log(data.elem) //被执行事件的元素DOM对象，一般为button对象
                        console.log(data.form) //被执行提交的form对象，一般在存在form标签时才会返回
                        console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
                        //调用父窗口的layer对象
                        layerTips.open({
                            title: '这里面是表单的信息',
                            type: 1,
                            content: JSON.stringify(data.field),
                            area: ['500px', '300px'],
                            btn: ['关闭并刷新', '关闭'],
                            yes: function(index, layero) {
                                layerTips.msg('你点击了关闭并刷新');
                                layerTips.close(index);
                                location.reload(); //刷新
                            }

                        });
                        //这里可以写ajax方法提交表单
                        return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
                    });
                    //console.log(layero, index);
                },
                end: function() {
                    addBoxIndex = -1;
                }
            });
        });
    });



});