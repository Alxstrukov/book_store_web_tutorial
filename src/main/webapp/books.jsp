<%@ page import="java.util.List" %>
<%@ page import="com.bookstore.models.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Books</title>
</head>
<body>
    <%List<Book> books = (List<Book>) request.getAttribute("books");
        for (int i = 0; i < books.size(); i++) { %>
            <p><%= books.get(i).getNameBook()%></p>
    <%}%>
</body>
</html>
