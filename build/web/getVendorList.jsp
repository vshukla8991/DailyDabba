<%-- 
    Document   : getVendorList
    Created on : Oct 20, 2013, 3:20:00 AM
    Author     : HR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<table style="width: 250px;">
    <c:forEach items="${vendorList}" var="vendor">
        <tr>
            <td>
                <a href="Controller?action=getVendor&vendorUN=${vendor.userName}"><font color="#2fbbb2"><c:out value="${vendor.vendorName}"/></font></a>
                <br/>
                <font size="2">Rating : <c:out value="${vendor.rating}" /></font>
        </tr>
    </c:forEach>
</table>