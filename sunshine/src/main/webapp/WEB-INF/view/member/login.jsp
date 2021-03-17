<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" >
<title>로그인페이지</title>
</head>
<body>
<c:if test="${empty authInfo }"  >
<form:form action="loginPro" name="frm" method="post" id="frm" 
           modelAttribute="loginCommand">
           <table border="1">
            <tr><td>아이디</td>
                 <td><form:input path="loginId" id="loginId"/>
                       <form:errors path="loginId"/>
                       </td>
                <td rowspan="2">
                    <input type="submit" value="전송" />
                    </td>
                
                </tr>
                   <tr><td>비밀번호</td>
                         <td><input type="password" name="loginPw" id="loginPw"/>
                               <form:errors path="loginPw" />
                               </td>
                               </tr>    
           </table>
</form:form>
       </c:if>
        
        
        
        

</body>
</html>