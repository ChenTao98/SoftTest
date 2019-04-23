function showData(data) {
    $("#result-info").html("共" + data.length + "条结果！");
    $("#result-head").html("<tr>\n" +
        "                <th scope='col' class='head-item'>#</th>\n" +
        "                <th scope='col' class='head-item'>作者</th>\n" +
        "                <th scope='col' class='head-item'>难度</th>\n" +
        "                <th scope='col' class='head-item'>知识点</th>\n" +
        "                <th scope='col' class='head-item'>语言</th>\n" +
        "                <th scope='col' class='head-item'>项目</th>\n" +
        "                <th scope='col' class='head-item'>分数</th>\n" +
        "                <th scope='col' class='head-item'>题干</th>\n" +
        "                <th scope='col' class='head-item'>类型</th>\n" +
        "                <th scope='col' class='head-item'>添加</th>\n" +
        "                <th scope='col' class='head-item'>预览</th>\n" +
        "            </tr>");
    $("#result-body").html("");//清空上次查询结果
    if (data.length === 0) {
        return;
    }
    $.each(data, function (i, question) {
        var row = "<tr>" +
            "<th scope='row'>" + i + 1 + "</th> " +
            "<td class='list'>" + question.author + "</td>" +
            "<td class='list'>" + question.difficulty + "</td>" +
            "<td class='list'>" + question.knowledgePoint + "</td>" +
            "<td class='list'>" + question.language + "</td>" +
            "<td class='list'>" + question.project + "</td>" +
            "<td class='list'>" + question.score + "</td>" +
            "<td class='list'>" + question.stem + "</td>" +
            "<td class='list'>" + question.type + "</td>" +
            "<td class='list'><span class='label label-success btn-add'>添加</span></td>" +
            "<td class='list'><span class='label label-info btn-preview' data-toggle='modal' data-target='#displayDetail'>预览</span></td>" +
            "</tr>";
        $("#result-body").append(row);
    });
}

window.onload = function () {
    $.ajax({
        url: "/api/type/17",
        type: "POST",
        dataType: "json",
        success: function (data) {
            console.log(data);
            showData(data);
            // data = jQuery.parseJSON(data);  //dataType指明了返回数据为json类型，故不需要再反序列化
        }
    });

    $("#typeSelect").click(function () {
        var typeId = $("#typeSelect option:selected").val();
        console.log(typeId);
        // 获取文本用 $("#typeSelect option:selected").text()
        $.ajax({
            url: "/api/type/" + typeId,
            type: "POST",
            dataType: "json",
            success: function (data) {
                console.log(data);
                showData(data);
                // data = jQuery.parseJSON(data);  //dataType指明了返回数据为json类型，故不需要再反序列化
            }
        });
    });

    $("#knowledgePointSelect").click(function () {
        var knowledgeId = $("#knowledgePointSelect option:selected").val();
        $.ajax({
            url: "/api/knowledgePoint/" + knowledgeId,
            type: "POST",
            dataType: "json",
            success: function (data) {
                console.log(data);
                showData(data);
            }
        });
    });

    $("#projectSelect").click(function () {
        var projectId = $("#projectSelect option:selected").val();
        $.ajax({
            url: "/api/project/" + projectId,
            type: "POST",
            dataType: "json",
            success: function (data) {
                console.log(data);
                showData(data);
            }
        });
    });

    $("#authorSelect").click(function () {
        var authorId = $("#authorSelect option:selected").val();
        $.ajax({
            url: "/api/author/" + authorId,
            type: "POST",
            dataType: "json",
            success: function (data) {
                console.log(data);
                showData(data);
            }
        });
    });

    $("#languageSelect").click(function () {
        var languageId = $("#languageSelect option:selected").val();
        $.ajax({
            url: "/api/language/" + languageId,
            type: "POST",
            dataType: "json",
            success: function (data) {
                console.log(data);
                showData(data);
            }
        });
    });
};