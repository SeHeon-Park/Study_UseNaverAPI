(function ($) {

    // 검색 결과 vue object
    var search_result = new Vue({
        el: '#search-result',
        data: {
            search_result : {}
        },
        method: {
            wishButton: function (event) {
                console.log("add");
            }
        }
    });

    // search
    $("#searchButton").click(function () {
        const query = $("#searchBox").val();
        $.get(`/api/restaurant/search?query=${query}`, function (response) {
            search_result.search_result = response;
            $('#search-result').attr('style','visible');
        });
    });

    // Enter
    $("#searchBox").keydown(function(key) {
        if (key.keyCode === 13) {
            const query = $("#searchBox").val();
            $.get(`/api/restaurant/search?query=${query}`, function (response) {
                search_result.search_result = response;
                $('#search-result').attr('style','visible');
            });
        }
    });

    $(document).ready(function () {
        console.log("init")
    });

})(jQuery);