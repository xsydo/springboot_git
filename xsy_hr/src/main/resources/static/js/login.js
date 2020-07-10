$(function () {
    $("#login").click(function () {
        $.ajax({
            type: 'GET',
            url: "/user/login",
            contentType: "application/json",//如果想以json格式把数据提交到后台的话，这个必须有，否则只会当做表单提交
            dataType: "text",//期待返回的数据类型
            data: {"userName": $("#username").val(), "password": $("#password").val()},
            success: function (data) {
                if(data == "0"){
                    alert("登录失败，账号或密码不正确");
                }else {
                    window.location.replace(data);
                }

            },
            error: function (data) {
                alert("error");
            }
        });
    })
})