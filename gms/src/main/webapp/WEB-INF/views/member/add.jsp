<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<body>
	<h1>Join</h1>
	<form id="joinForm" name="joinForm">
		Name : <input type="text" name="name" required/><br>
		User ID : <input type="text" name="userid" required/> <br>
		 Password : <input	type="text" name="password" required/><br>
		 SSN : <input type="text" name="ssn" required/>
		 <input id="joinFormBtn" type="button" value="제출" />  
		  

		  <br>소속팀
		  <input type="radio" name="teamid"  value="none" checked="checked"/> 없음
		  <input type="radio" name="teamid"  value="nolja"/>놀자
		  <input type="radio" name="teamid"  value="jieunHouse"/>지은하우스
		  <input type="radio" name="teamid"  value="turtleking"/>거북왕
		  <input type="radio" name="teamid"  value="coddingZzang"/>코딩짱
		  
		  <br>프로젝트역할
		  <select name="roll" id="roll">
		  <option value="leader">팀장</option>
		  <option value="front">프론트개발</option>
		  <option value="back">백단개발</option>
		  <option value="android">안드로이드개발</option>
		  <option value="minfe">민폐</option>
		  </select>
		  
		  <br>수강과목
		  <input type="checkbox" name="subject"
		  value="java" checked="checked"/> Java
		  <input type="checkbox" name="subject" value="clang"/> C언어
		  <input type="checkbox" name="subject" value="jsp"/> JSP
		  <input type="checkbox" name="subject" value="php"/> PHP
		  <input type="checkbox" name="subject" value="nodejs"/> NodsJS
		  <input type="checkbox" name="subject" value="linux"/> Linux
		  <input type="checkbox" name="subject" value="html"/> HTML
		  <input type="checkbox" name="subject" value="spring"/> Spring
	</form>

</body>
</html>


<!--  var node1 = document.createElement('input');
						node1.innerHTML = 
						'<input type="hidden" name="age"/>';
						form.appendChild(node1);
						
						var node2 = document.createElement('input');
						node2.innerHTML =
						'<input type="hidden" name="gender"/>';
						form.appendChild(node2);
						
						var node3 = document.createElement('input');
						node3.innerHTML = 
						'<input type="hidden" name="action" value="login"/>';
						form.appendChild(node3);
						
						var node4 = document.createElement('input');
						node4.innerHTML =
						'<input type="hidden" name="page" value="mypage"/>';
						form.appendChile(node4);  -->
