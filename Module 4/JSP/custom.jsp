<%-- custom.jsp - Custom Tag Library Demo (Roll 28, Q2) --%>
<%-- Uses a custom tag to display student information --%>

<%@ page contentType="text/html" %>
<%@ taglib uri="/WEB-INF/studenttag.tld" prefix="st" %>

<html>
<head>
    <title>Custom Tag Demo</title>
</head>
<body>

<h2>Custom Tag Library Demo</h2>

<h3>Student Information (Custom Tag)</h3>

<%-- Using custom tag --%>
<st:studentInfo name="Achyuth" rollNo="23" course="MCA" />

<br>

<st:studentInfo name="Naveen" rollNo="24" course="MCA" />

</body>
</html>

<%--
=== Files needed for Custom Tag ===

1. StudentTagHandler.java (Tag Handler Class)
   Place compiled class in WEB-INF/classes/

--- StudentTagHandler.java ---

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class StudentTagHandler extends SimpleTagSupport {

    private String name;
    private String rollNo;
    private String course;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();

        out.println("<table border='1' cellpadding='5'>");
        out.println("<tr><th>Field</th><th>Value</th></tr>");
        out.println("<tr><td>Name</td><td>" +
                    name + "</td></tr>");
        out.println("<tr><td>Roll No</td><td>" +
                    rollNo + "</td></tr>");
        out.println("<tr><td>Course</td><td>" +
                    course + "</td></tr>");
        out.println("</table>");
    }
}

---

2. studenttag.tld (Tag Library Descriptor)
   Place in WEB-INF/

--- WEB-INF/studenttag.tld ---

<?xml version="1.0" encoding="UTF-8"?>
<taglib version="2.0"
    xmlns="http://java.sun.com/xml/ns/j2ee">

    <tlib-version>1.0</tlib-version>
    <short-name>StudentTag</short-name>
    <uri>/WEB-INF/studenttag.tld</uri>

    <tag>
        <name>studentInfo</name>
        <tag-class>StudentTagHandler</tag-class>
        <body-content>empty</body-content>

        <attribute>
            <name>name</name>
            <required>true</required>
        </attribute>
        <attribute>
            <name>rollNo</name>
            <required>true</required>
        </attribute>
        <attribute>
            <name>course</name>
            <required>true</required>
        </attribute>
    </tag>
</taglib>

--%>
