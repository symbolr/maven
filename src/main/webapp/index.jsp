<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<html>
<body>
<script type="text/javascript" src="jquery.js" ></script>
<script type="text/javascript">
$.ajax({
	url: "http://210.33.60.25:8085/service.asmx/Get_CheckOut_History_List_2?sRd_Number=20121032&nMode=1&nPage=1&sOrder=1",
	traditional:true,
	type: "GET",
	dataType: "json",
	cache: false,
	jsonp: "callbackparam", 
	success: function(message) {
		if (message.type == 'success') {
			console.log(message)
		} else {
		}
	}
});
</script>
<h2>Hello maven!</h2>
</body>
</html>
