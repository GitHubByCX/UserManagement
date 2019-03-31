<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.UM.entity.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="#" />
<link rel="stylesheet" type="text/css" href="css/jquery.dataTables.min.css">
<script type="text/javascript" charset="utf8" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" charset="utf8" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" charset="utf8" src="js/getRootPath.js"></script>
<style>
	#content>tbody>tr>td{
        text-align:center;
	}
</style>
<script>
	var change = true;
	var data = "${list}";
	//console.log(data);
	var datas = [];
	var arr = data.split("Student");
	//console.log(arr);
	for(var i = 0; i<arr.length;i++){
			if(i == 0){
				arr[i] = "";
			}else if (i == arr.length-1){
				arr[i] = arr[i].substring(2,arr[i].length-2);
			}else{
				arr[i] = arr[i].substring(2,arr[i].length-3);
			}
	}
	//console.log(arr);
	for(var i = 1;i<arr.length;i++){
		var s = parseStrObjByRegExp(arr[i]);
		datas.push(s);
		change = false;
	}
	//console.log(datas);
	
	function parseStrObjByRegExp(str){
		var obj = {};
		str.replace(/(\w+)(?:=([^,]*))?/g,function(str2, key, value){
		obj[key] = value;
		});
		return obj;
	}
	
	$(function(){
		console.log(change);
		if (change){
			window.location.href=getRootPath()+"/toindex";
		}
		
		$("#content").DataTable({
			data:datas,
			columns:[
				{"data":"studentId",title:"学号"},
				{"data":"name",title:"姓名"},
				{"data":"phoneNumber",title:"手机"},
				{"data":"className",title:"班级"},
				{"data":"hostel",title:"宿舍"},
				{"data":"id",title: "操作", sortable: false,render: function(data) { return '<a href="'+getRootPath()+'/toupdate?id='+data+'">修改</a>'; } }
			],
			oLanguage: {
				"sLengthMenu": "每页显示 _MENU_ 条数据",
				"sZeroRecords": "抱歉， 没有找到",
				"sInfo": "共 _TOTAL_ 条数据",
				"sInfoEmpty": "暂无数据",
				"sInfoFiltered": "(从 _MAX_ 条数据中检索)",
				"oPaginate": {
					"sFirst": "首页",
					"sPrevious": "",
					"sNext": "",
					"sLast": "尾页"
				},
				"sZeroRecords": "没有检索到数据",
			}
		});
	}) 
</script>
</head>
<body>
	<table id="content" class="display">
	    <thead>
	        <tr>
	            <th>学号</th>
	            <th>姓名</th>
	            <th>手机</th>
	            <th>班级</th>
	            <th>宿舍</th>
	            <th>操作</th>
	        </tr>
	    </thead>
	    <tbody>
	    	<tr>
	            <td></td>
	            <td></td>
	            <td></td>
	            <td></td>
	            <td></td>
	        </tr>
	    </tbody>
	</table>
</body>
</html>