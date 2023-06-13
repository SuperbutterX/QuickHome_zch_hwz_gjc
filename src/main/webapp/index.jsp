<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="${pageContext.request.contectPath}/homeInf/getAllHomeInf">
    <input name="submit" type="submit">
    <c:if test="${not empty param.homeInf_zch_hwz_gjc}">
        <table>
            <c:forEach items="${param.homeInf_zch_hwz_gjc}" var="homeList">
                <tr>
                    <td>
                            ${param.homeInf_zch_hwz_gjc}
                    </td>
<%--                    <td>--%>
<%--                        <input type="button" window.location.href='ApprovalServ_hwz?act_hwz=dismissedReason&id_hwz=${sessionScope.app_hwz.id_hwz}>--%>
<%--                    </td>--%>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</form>
</body>
</html>