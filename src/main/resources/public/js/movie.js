
var table = $("#table").DataTable();

//filmmodal openen
$("#addMovie").click(function (e) {
    e.preventDefault();
    $("#movieModal").modal("toggle");

});

 getAll();

//films ophalen
function getAll() {
    $.get("/api/movie/", function (result) {
        table.clear();
        for (var i = 0; i < result.length; i++) {
            table.row.add([
                result[i].movieName,
                result[i].movieSeen]);
        }
        table.draw();
    });
}
    //knop film toevoegen
$("#btnAddMovie").click(function (e) {
    console.log("test1");
    var obj = getObject();
    $.ajax({
        url: "/api/movie/",
        type: "POST",
        data: JSON.stringify(obj),
        contentType: "application/json; charset=utf-8"
    }).done(function () {
        $("#movieModal").modal("toggle");
        $("#movieModal input").val("");
        getAll();
    });
});


function getObject() {
    var obj = {};
    obj.movieName = $("#movieName").val();
    obj.movieSeen =  $("#movieSeen").val();
    return obj;
}



