<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>tada</title>
    <link rel="stylesheet" type="text/css" href="../../resources/css/style.css"/>
    <link rel="stylesheet" type="text/css" href="../../resources/bootstrap/css/bootstrap.css"/>
    <script src="../../resources/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="../../resources/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="resources/js/FieldItemAdd.js"></script>>
    <script type="text/javascript"></script>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top ">
    <div class="container">
        <a class="navbar-brand" href="/">Tada</a>
    </div>
</nav>
<div class="conteiner ">
    <div class="row">
        <div class="col-lg-4"></div>
        <div class="col-lg-4 main">
            <div class="center">
                <p>
                <c:forEach items="${listTodo}" var="dd">
                    <h2><p>${dd.todo_name}</p></h2>
                </c:forEach>
                </p>
            </div>
            <button id="add_btn_id" type="button"  class="btn b1" href="javascript:void(0)"  onclick="showHide('addItem'), style.display='none'">Add a to-do</button>
            <div class="addItemsField" id="addItem" >
                <ul>
                    <form name="REDStAR" class="form">
                        <div class="inForm">
                            <form id="addNewItem">
                                <p><input id="qwe" class="int_style" name="textfield" type="text" placeholder="Add a new to-do..."></p>
                            </form>
                        </div>
                    </form>
                </ul>
                <button type="button" id="qqq" class="btn b_add_item">Add this item</button>
                <button type="button" class="btn b_cansel" onclick="showHide('addItem'),showHide('add_btn_id')">Cancel</button>


            </div>


            <p></p>
        </div>
    </div>
</div>

</div>
</body>
</html>