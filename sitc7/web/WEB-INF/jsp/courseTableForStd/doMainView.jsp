<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <jsp:include page="/include/include_easyui15.jsp"></jsp:include>
    <script type="text/javascript" src="<c:url value="/js/course/qin.course.js"/> "></script>
    <link rel="stylesheet" href="<c:url value="/css/qin.course.css"/> ">
</head>

<body class="easyui-layout">
<jsp:include page="/include/navigator.jsp"></jsp:include>
<div data-options="region:'center',title:'courseTableForStd'" style="padding:5px;background:#eee;">
</div>
</body>
