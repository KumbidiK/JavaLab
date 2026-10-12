<%-- el.jsp - Expression Language Demo (Roll 28, Q3) --%>
<%-- Uses EL to access bean properties and request params --%>

<%@ page contentType="text/html" %>

<html>
<head>
    <title>Expression Language Demo</title>
</head>
<body>

<h2>JSP Expression Language (EL) Demo</h2>

<%-- Set up a JavaBean --%>
<jsp:useBean id="student" class="Student" scope="request" />
<jsp:setProperty name="student" property="id" value="101" />
<jsp:setProperty name="student" property="name"
                 value="Achyuth" />
<jsp:setProperty name="student" property="marks"
                 value="88.5" />

<%-- 1. Accessing Bean Properties using EL --%>
<h3>1. Accessing Bean Properties</h3>
<p>ID: ${student.id}</p>
<p>Name: ${student.name}</p>
<p>Marks: ${student.marks}</p>

<%-- 2. EL Arithmetic Operators --%>
<h3>2. Arithmetic Operations</h3>
<p>Marks + 10 = ${student.marks + 10}</p>
<p>Marks * 2 = ${student.marks * 2}</p>
<p>10 / 3 = ${10 / 3}</p>
<p>10 mod 3 = ${10 % 3}</p>

<%-- 3. EL Comparison Operators --%>
<h3>3. Comparison Operators</h3>
<p>Marks > 80: ${student.marks > 80}</p>
<p>Marks == 88.5: ${student.marks == 88.5}</p>
<p>Marks < 50: ${student.marks < 50}</p>

<%-- 4. EL Logical Operators --%>
<h3>4. Logical Operators</h3>
<p>Marks > 80 AND Marks < 100:
   ${student.marks > 80 && student.marks < 100}</p>
<p>Marks < 40 OR Marks > 90:
   ${student.marks < 40 || student.marks > 90}</p>

<%-- 5. Accessing Request Parameters --%>
<h3>5. Request Parameters</h3>
<p>Try: el.jsp?name=John&age=25</p>
<p>Name: ${param.name}</p>
<p>Age: ${param.age}</p>

<%-- 6. Accessing Scope Variables --%>
<h3>6. Scope Variables</h3>
<%
    session.setAttribute("course", "MCA");
    application.setAttribute("college", "MCA College");
%>
<p>Session - Course: ${sessionScope.course}</p>
<p>Application - College:
   ${applicationScope.college}</p>

<%-- 7. Empty Operator --%>
<h3>7. Empty Operator</h3>
<p>Is name empty: ${empty param.name}</p>
<p>Is student empty: ${empty student}</p>

</body>
</html>

<%--
Note: For jsp:useBean to work, Student.java must be
compiled and placed in WEB-INF/classes/

Use the Student.java from MVC CRUD folder
--%>
