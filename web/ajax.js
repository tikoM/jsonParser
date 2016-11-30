var users = { "id": "1", "name": "FI" };

$(document).ready(function() {
    $.post("/jsonServlet", {jsonName: JSON.stringify(users)}, function(result){
    });
});
