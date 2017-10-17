
$("#addMovie").click(function (e) {
    e.preventDefault();
    $("#movieModal").modal("toggle");

});

getAll();

function getAll() {
    $.get("/api/movie/", function (result) {
        table.clear();
        for (var i = 0; i < result.length; i++) {
            table.row.add([
                result[i].movieName,
                result[i].movieseen]);
        }
        table.draw();
    });
}

$("#btnAddMovie").click(function (e) {
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



