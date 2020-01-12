
<%-- <%@page import="java.util.*" %> --%>

<%--  <%//read request attribute 
   List<Map<String,Object>> list=(List<Map<String,Object>>)request.getAttribute("result"); 
    if(list!=null){ %> --%>
<!--      <table> -->
<!--       <tr> -->
<!--          <th>NO</th><th>NAMe</th><th>JOB</th><th>Salary</th>  -->
<!--       </tr> -->
    
<%--    <% for(Map map:list){  %> --%>
<!--       <tr> -->
<%--        <td><%=map.get("EMPNO") %></td> --%>
<%--        <td><%=map.get("ENAME") %></td> --%>
<%--        <td><%=map.get("JOB") %></td> --%>
<%--        <td><%=map.get("SAL") %></td> --%>
<!--        </tr> -->
<%--  <%    } //for --%>
//    }//if
<%--    %> --%>
<!--    </table>  -->

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
 <c:when test="${not empty result}">
    <table> 
       <tr> 
          <th>NO</th><th>NAMe</th><th>JOB</th><th>Salary</th>  
       </tr> 
    <c:forEach var="map" items="${result}">
       <tr>
         <td> <c:out value="${map.EMPNO}"/></td>
         <td> <c:out value="${map.ENAME}"/></td>
         <td> <c:out value="${map.JOB}"/></td>
         <td> <c:out value="${map.SAL}"/></td>
       </tr>
  </c:forEach>    
    </table>       
 </c:when>
 <c:otherwise>
      No Employee Found
 </c:otherwise>
</c:choose>







    