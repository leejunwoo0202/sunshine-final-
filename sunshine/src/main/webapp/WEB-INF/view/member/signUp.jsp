<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="memberSignUpComplete" name="frm" id="frm"  method="post"
		 modelAttribute ="memberCommand"  > 
<table>

    <tr><th>이름</th>
           <td><form:input path="memName" id="memName"/>
                    <form:errors path="memName" />
                    </td>
                    </tr>
	<tr><th>아이디</th>
		<td><form:input path="memId" id = "memId" />
			<form:errors path="memId"/>
		</td>
	</tr>
	<tr><th>비밀번호</th>
		<td><form:password path="memPw" id = "memPw" />
			<form:errors path="memPw"/>
			</td>
	</tr>
	<tr><th>비밀번호 확인</th>
		<td><form:password path="memPwCon" id = "memPwCon" />
			<form:errors path="memPwCon"/>
		</td>
	</tr>
	<tr><th>연락처</th>
		<td><form:input path="memPhone" id = "memPhone" 
						placeholder="123-123-1234,123-1234-1234"/>
			<form:errors path="memPhone" /></td>
	</tr>
	<tr><th>이메일</th>
		<td><form:input path="memEmail" id = "memEmail" />
			<form:errors path="memEmail" /> </td>
	</tr>
	<tr><th>주소</th>
		<td><form:input path="memAddr" id = "memAddr" />
		<form:errors path="memAddr" /> </td>
	</tr>
	<tr><th>주민등록번호</th>
		<td><input type="date" name="memResidentNum" id = "memResidentNum" 
			placeholder="1999-12-12"/>
			<form:errors path="memResidentNum" />
			</td>
	</tr>
	
	
	
	
	
	<tr>
	<th colspan="2">
		<input type="submit" value="가입완료" />
		<input type="reset" value="다시작성" />
		<input type="button" value="메인으로" onclick="javascript:location.href='../main'"/>
	</th>
	</tr>
</table>
</form:form>
</body>
</html>   