<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   isELIgnored="false"%>
    <%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" >
<title>로그인페이지</title>
</head>
<body>
<form:form action="loginPro" name="frm" method="post" id="frm"   modelAttribute="loginCommand">
           <table border="1" >
            <tr><td>아이디</td>
                 <td><form:input path="loginId" id="loginId"/>
                       	 <div>${userFail }</div>
                       </td>
                <td rowspan="2">
                    <input type="submit" value="전송" />
                    </td>
                
                </tr>
                   <tr><td>비밀번호</td>
                         <td><input type="password" name="loginPw" id="loginPw"/>
                               <div>${pwFail }</div>
                               </td>
                               </tr>    
           </table>
</form:form>

        
        
        

</body>
</html>