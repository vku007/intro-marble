<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html lang="en">
<head>
    <title>Greeting request</title>
</head>
<body>
Request for greeting
    <form:form method="POST" action="/getgreeting" modelAttribute="nameHolder">
    <table>
        <tr>
            <td><form:label path="name">Get greetings:</form:label></td>
            <td><form:input path="name"/></td>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>


    </form:form>

received:

search results:
${resultgreeting.id}
${resultgreeting.content}
${resultgreeting.errorMessage}
ty</html>
