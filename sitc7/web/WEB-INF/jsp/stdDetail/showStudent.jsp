<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="qin.sitc7.domain.Student" %>

<head>
    <jsp:include page="/include/include_easyui15.jsp"></jsp:include>
</head>

<body class="easyui-layout">
<jsp:include page="/include/navigator.jsp"></jsp:include>
<div data-options="region:'center',title:'showStudent'" style="padding:5px;background:#eee;">
    <%
        SessionFactory hbSessionFactory = (SessionFactory) new
                ClassPathXmlApplicationContext("applicationContext.xml")
                .getBean("sessionFactory");
        Session hbSession = hbSessionFactory.openSession();

        String studentName = (String) request.getAttribute("studentName");
        //out.println(studentName);

        //search by studentName
        Student student = (Student) hbSession
                .createQuery
                        (
                                new StringBuilder()
                                        .append("from Student s where s.studentName = '")
                                        .append(studentName)
                                        .append("'").toString()
                        )
                .list()
                .get(0);

        String start = "&nbsp;<font style=\"font-size: 20px; color: #990000; font-weight: bold;\">";
        String end = "</font>";
    %>

    <table border="10" style="width: 100%; border-color: #5f5e98; " id="tb_student">
        <tr align="center">
            <td colspan="2">学籍基本信息</td>
        </tr>
        <tr align="center">
            <td>学籍号:<%out.println(start + student.getStudentId() + end);%></td>
            <td>姓名:<%out.println(start + student.getStudentName() + end);%></td>
        </tr>
        <tr align="center">
            <td>英文名:<%out.println(start + student.getStudentEnglishName() + end);%></td>
            <td>年级:<%out.println(start + student.getStudentGrade() + end);%></td>
        </tr>
        <tr align="center">
            <td>院系:<%out.println(start + student.getStudentFaculty() + end);%></td>
            <td>专业:<%out.println(start + student.getStudentMajor().getStudentMajorName() + end);%></td>
        </tr>
        <tr align="center">
            <td>专业方向:<%out.println(start + student.getStudentMajorDirection() + end);%></td>
            <td>学历:<%out.println(start + student.getStudentRecord().getStudentRecordName() + end);%></td>
        </tr>
        <tr align="center">
            <td>校区:<%out.println(start + student.getStudentCampus().getStudentCampusName() + end);%></td>
            <td>学制:<%out.println(start + student.getStudentLengthOfSchooling() + end);%></td>
        </tr>
        <tr align="center">
            <td>是否在校:</td>
            <td>是否在籍:</td>
        </tr>
        <tr align="center">
            <td>学号:<%out.println(start + student.getStudentNoId() + end);%></td>
            <td>班级:<%out.println(start + student.getStudentClass() + end);%></td>
        </tr>
        <tr align="center">
            <td>历史班级:<%out.println(start + student.getStudentHistoryClass() + end);%></td>
            <td>入校时间:<%out.println(start + student.getStudentInSchoolTime() + end);%></td>
        </tr>
        <tr align="center">
            <td>预毕业时间:<%out.println(start + student.getStudentGradeSchoolTime() + end);%></td>
            <td>曾用名:<%out.println(start + student.getStudentOldUsingName() + end);%></td>
        </tr>
        <tr align="center">
            <td>民族:<%out.println(start + student.getStudentNation() + end);%></td>
            <td>政治面貌:<%out.println(start + student.getStudentPoliticalStatus().getStudentPoliticalStatusName() + end);%></td>
        </tr>
        <tr align="center">
            <td>出生年月:<%out.println(start + student.getStudentBirthDate() + end);%></td>
            <td>身份证:<%out.println(start + student.getStudentIdCard() + end);%></td>
        </tr>
        <tr align="center">
            <td>籍贯:<%out.println(start + student.getStudentNativePlace().getStudentNativePlaceName() + end);%></td>
            <td>婚姻状况:</td>
        </tr>
        <tr align="center">
            <td>性别:<%out.println(start + student.getStudentGender() + end);%></td>
            <td>&nbsp;</td>
        </tr>
        <tr align="center">
            <td colspan="2">联系方式</td>
        </tr>
        <tr align="center">
            <td>电子邮件:<%out.println(start + student.getStudentEmail() + end);%></td>
            <td>通信地址:<%out.println(start + student.getStudentAddress() + end);%></td>
        </tr>
        <tr align="center">
            <td>通信地址电话:<%out.println(start + student.getStudentAddressTelephone() + end);%></td>
            <td>通信地址邮编:<%out.println(start + student.getStudentEmail() + end);%></td>
        </tr>
    </table>

</div>
</body>