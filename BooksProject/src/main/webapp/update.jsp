<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.chary.database.Book"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
Book b = (Book)request.getAttribute("book");

%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Details Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f4f4f9;
        }
        .form-container {
            background: #ffffff;
            padding: 20px;
            border: 2px solid #ccc;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        .form-container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }
        .form-group input {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .form-group input:focus {
            border-color: #007bff;
            outline: none;
        }
        .form-actions {
            text-align: center;
        }
        .form-actions button {
            background-color: #007bff;
            color: #ffffff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .form-actions button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Book Details</h2>
        <form action="edit" method="post">
            <div class="form-group">
                <label for="bookId">Book ID</label>
                <input type="text" id="bookId" name="bookId" value=<%=b.getBookId() %> required>
            </div>
            <div class="form-group">
                <label for="bookName">Book Name</label>
                <input type="text" id="bookName" name="bookName" value=<%=b.getBookName() %> required>
            </div>
            <div class="form-group">
                <label for="bookAuthor">Book Author</label>
                <input type="text" id="bookAuthor" name="bookAuthor"  value=<%=b.getBookAuthor() %> required>
            </div>
            <div class="form-group">
                <label for="bookCost">Book Cost</label>
                <input type="number" id="bookCost" name="bookCost"  value=<%=b.getBookPrice() %> required>
            </div>
            <div class="form-group">
                <label for="bookQty">Book Quantity</label>
                <input type="number" id="bookQty" name="bookQty"  value=<%=b.getBookQty() %> required>
            </div>
            <div class="form-actions">
                <button type="submit">Submit</button>
            </div>
        </form>
    </div>
</body>
</html>


</body>
</html>