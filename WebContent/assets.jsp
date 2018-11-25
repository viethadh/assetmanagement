<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách tài sản</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Mã tài sản</th>
			<th>Tên tài sản</th>
			<th>Nguyên giá</th>
			<th>Năm bắt đầu</th>
		</tr>
		<s:iterator value="assets" status="status">
			<tr>
				<td>
					<s:property value="code" />
				</td>
				<td>
					<s:property value="name" />
				</td>
				<td>
					<s:property value="price" />
				</td>
				<td>
					<s:property value="startYear" />
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>