function showHide(element_id) {
    var obj = document.getElementById(element_id);
    if (obj.style.display != "block") {
        obj.style.display = "block";
    }
    else obj.style.display = "none";
}

// $(document).ready(function () {
//     $('#qqq').click(function () {
//         $.ajax({
//             url: "/addItem",
//             data:$('#qwe').value,
//             success:function (data) {
//                 $('#id_todo').append($("<li>").text(data.getName()));
//             },
//             error: function (result) {
//                 alert("Error" + result);}
//         })
//     })
// })