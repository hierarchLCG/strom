<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Hello World!</h2>
<h2 id="success" style="display: none;">success !</h2>
<button onclick="save()">插入用户</button>
<script type="text/javascript">
	function save(){
		window.location= "${pageContext.request.contextPath}/user/insert";//请求的网址
	}
</script>
</body>
</html>
