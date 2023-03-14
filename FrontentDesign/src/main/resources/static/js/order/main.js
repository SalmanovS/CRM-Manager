
function endLocation() {
    var start = $(".startLocation").val();
    var end = $(".endLocation").val();
    $.ajax({
    url:'directions',
    dataType: 'json',
    type: 'get',
    cache: false,
    data: ({startLocation: start, endLocation: end}),
    success: function(data){
        $(".routeLength").val(data);

        }
    });
}
