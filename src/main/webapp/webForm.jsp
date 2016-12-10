<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <title>Shopping</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="Shortcut icon" href="http://1.bp.blogspot.com/_qxNvBPirDY4/S6SogyHzSYI/AAAAAAAAACI/1LaUy9AAilc/s320/shopping.jpg" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <style>
        .navbar {
            margin-bottom: 0;
            border-radius: 0;
        }
        footer {
            background-color: #f2f2f2;
            padding: 25px;
        }
        .carousel-inner img {
            width: 100%; /* Set width to 100% */
            margin: auto;
            min-height:200px;
        }
        @media (max-width: 600px) {
            .carousel-caption {
                display: none;
            }
        }
    </style>
</head>


<body>

 <%--Navbar--%>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Logo</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Questionnaire</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
        </div>
    </div>
</nav>

<%--Just text container--%>
<div class="container text-center">
    <h3>Please answer following questions</h3><br>
    </div>
</div><br>


 <form method="post" action="/webForm">
 <table class="item-table">
     <input type="hidden" name="size" value=${questionList.size()} />
     <c:forEach items="${questionList}" var="item" varStatus="i">
     <tr>
         <div class="container-fluid bg-2 text-center">
             <div class="col-sm-6">
             <h3>${item.title} </h3>
                 <input type="hidden" name="question-${i.index}" value="${item.title}" />

                 <INPUT TYPE="radio" NAME="radios-${i.index}" VALUE="${item.options.get(0).label}" CHECKED> ${item.options.get(0).label}
                 <BR>
                 <INPUT TYPE="radio" NAME="radios-${i.index}" VALUE="${item.options.get(1).label}"> ${item.options.get(1).label}
                 <BR>
             </div>
         </div>
     </tr>
     </c:forEach>
     <div class="col-sm-6">
     <input type="submit" value="Submit"  onclick="localhost:8080/searchProducts" />
     </div>
 </table>
 </form>



</body>
</html>