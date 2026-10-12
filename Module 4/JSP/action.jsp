<%-- action.jsp - JSP Actions Demo (Roll 27, Q2) --%>
<%-- Demonstrates jsp:include, jsp:forward, jsp:useBean --%>

<%@ page contentType="text/html" %>

<html>
<head>
    <title>JSP Actions</title>
</head>
<body>

<h2>JSP Actions Demo</h2>

<%-- 1. jsp:useBean - Creates/finds a JavaBean --%>
<h3>1. jsp:useBean, jsp:setProperty, jsp:getProperty</h3>

<jsp:useBean id="student" class="Student" scope="page" />

<jsp:setProperty name="student" property="id" value="101" />
<jsp:setProperty name="student" property="name"
                 value="Achyuth" />
<jsp:setProperty name="student" property="marks"
                 value="88.5" />

<p>ID: <jsp:getProperty name="student" property="id" /></p>
<p>Name: <jsp:getProperty name="student"
          property="name" /></p>
<p>Marks: <jsp:getProperty name="student"
           property="marks" /></p>

<hr>

<%-- 2. jsp:include - Includes page at request time --%>
<h3>2. jsp:include</h3>
<p>Including student.jsp below:</p>
<jsp:include page="student.jsp" />

<hr>

<%-- 3. jsp:forward - Forwards to another page --%>
<h3>3. jsp:forward</h3>
<p>Syntax: &lt;jsp:forward page="target.jsp" /&gt;</p>
<p>Uncomment below to test forward:</p>
<%-- <jsp:forward page="marks.jsp" /> --%>

<%-- 4. jsp:param - Passes parameters --%>
<h3>4. jsp:param</h3>
<p>Used with jsp:include or jsp:forward:</p>
<p>Syntax: &lt;jsp:param name="key" value="val" /&gt;</p>

</body>
</html>

<%--
Note: For jsp:useBean to work, Student.java must be
compiled and placed in WEB-INF/classes/

Use the Student.java from MVC CRUD folder:
  - Must have a no-arg constructor
  - Must have getter/setter methods
--%>
