<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>컨텐츠 상세보기 페이지</title>
</head>
<body>
<table border="1" style="width:1000px;">
<colgroup>
	<col width="10%" />
	<col width="10%" />
	<col width="10%" />
	<col width="10%" />
	<col width="15%" />
	<col width="15%" />
	<col width="20%" />
	<col width="10%" />
</colgroup>
<tr>
      <td>컨텐츠 번호</td><td>컨텐츠명</td><td>컨텐츠 가격</td><td>연령구분</td>
	  <td>발급일</td><td>유효기간</td><td>등급</td></tr>
	   <tr>
	   <td>${contents.contentsNo }</td>
	   <td>${contents.contentsName }</td>
	   <td>${contents.contentsPrice }</td>
	   <td>${contents.divPeople }</td>
	   <td>${contents.issueDate }</td>
	   <td>${contents.validity }</td>
	   <td>${contents.grade }</td>
	   </tr>
	   <tr><td colspan="7">
		<input type="button" value="수정" onclick="javascript:location.href='contentsModify?contentsNo=${contents.contentsNo }'" />
		<input type="button" value="삭제" onclick="Del();" />
	</td></tr>
</table>
<script type="text/javascript">
   function Del(){
      if(confirm(' 정말 삭제하시겠습니까? ')){
         location.href = 'contentsDelete?contentsNo=' + ${contents.contentsNo };
      }
   }
</script>
</body>
</html>