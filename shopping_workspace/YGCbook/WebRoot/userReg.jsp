<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>课后练习题</title>

<style>
 		#username{
		    outline-style: none ;
		    border: 1px solid #ccc; 
		    border-radius: 1px;
		    padding: 3px 8px;
		    width: 200px;
		    font-size: 14px;
		    font-weight: 700;
		    font-family: "Microsoft soft";
		}
		
		#password{
		    outline-style: none ;
		    border: 1px solid #ccc; 
		    border-radius: 1px;
		    padding: 3px 8px;
		    width: 200px;
		    font-size: 14px;
		    font-weight: 700;
		    font-family: "Microsoft soft";
		}
		
		.buttonStyle{
			width:100px;
		     text-align:center;
		     line-height:100%;
		     padding:0.3em;
		     font:16px Arial,sans-serif bold;
		     font-style:normal;
		     text-decoration:none;
		     margin:2px;
		     vertical-align:text-bottom;
		     zoom:1;
		     outline:none;
		     font-size-adjust:none;
		     font-stretch:normal;
		     border-radius:50px;
		     box-shadow:0px 1px 2px rgba(0,0,0,0.2);
		     text-shadow:0px 1px 1px rgba(0,0,0,0.3);
		     color:black;
		     border:0.2px solid #2299ff;
		     background-repeat:repeat;
		     background-size:auto;
		     background-origin:padding-box;
		     background-clip:padding-box;
		     background-color:#87CEEB;
		     background: linear-gradient(to bottom, #eeeff9 0%,#3399ff 100%);
		}

</style>
</head>

<body>
	<form action="register" method="get">
		姓名:<input type="text" id="username" name="username"><br>
		密码:<input type="password" id="password" name="password"><br>
		性别:<input type="radio" name="sex" checked  id="sex1" value="0">男
		<input type="radio"  name="sex" id="sex2"  value="1">女<br>
		爱好:<input type="checkbox" name="hobby" value="0">足球
		<input type="checkbox" name="hobby" value="1">篮球
		<input type="checkbox" name="hobby" value="2">网球<br>
		专业:<select id="major" name="major">
			<option value="0">软件工程</option>
			<option value="1">英语</option>
			<option value="2">数学</option>
		</select><br>
		简介:<br><textarea id="intro" name="intro">abcd</textarea><br>
		
		<input type="submit" class="buttonStyle" value="注册用户">
		<input type="button" class="buttonStyle" value="重置">
	</form>
</body>
</html>