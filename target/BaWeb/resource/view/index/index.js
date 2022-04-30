$(".display_userinfo").click(function () {
    $.ajax({
        type: "POST",
        url: basePath+"/cuser/getUserInfo",
        data: {

        },
        dataType: "json",
        success: function(data){
            alert(data[0].name+"-"+data[0].password);
        },
        error:function (data) {
            alert("error");
        }
    });
});