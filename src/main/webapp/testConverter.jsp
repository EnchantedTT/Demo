<%--
  Created by IntelliJ IDEA.
  User: lichangjie
  Date: 02/12/2015
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<div id="resp"></div><input type="button" onclick="req();" value="请求"/>
<script src="Scripts/jquery-1.9.1.js" type="text/javascript"></script>
<script>
    function req(){
        $.ajax({
            url: "/convert2",
            data: "li~y~c",
            type:"POST",
            contentType:"application/text",
            success: function(data){
                $("#resp").html(data);
            }
        });
    }
</script>
</body>
</html>
