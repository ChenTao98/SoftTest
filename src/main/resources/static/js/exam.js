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
    var body = $("#result-body");
    body.html("");//清空上次查询结果
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
            "<td class='list'>" + question.type + "</td>";
        if ($.isEmptyObject(window.type2Questions[question.type][question.questionId])) {
            row += "<td class='list'><span class='label label-success btn-add' data-id='" + question.questionId + "'>添加</span></td>";
        } else {
            row += "<td class='list'><span class='label label-danger btn-add' data-id='" + question.questionId + "'>移除</span></td>";
        }
        row += "<td class='list'><span class='label label-info btn-preview' data-id='" + question.questionId + "' data-toggle='modal' data-target='#displayDetail'>预览</span></td></tr>";
        $("#result-body").append(row);
    });
}

window.onload = function () {
    // 获取所有题型，并创建表
    // window.type2Questions 是一个字典， key时typeName， 值为被选中的问题。
    $.ajax({
        url: "/api/type/getAllTypes",
        type: "POST",
        dataType: "json",
        success: function (data) {
            console.log("Type Data: ");
            console.log(data);
            window.type2Questions = {};
            $.each(data, function (i, type) {
                window.type2Questions[type.name] = {};
            });
        }
    });
    // window.selfDefinedData.QuestionRow = [0, 1, 2, 3, 4, 5]
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

    $("#result-body").on('click', '.btn-add', function () {
        var id = $(this).data('id');
        if ($(this).hasClass("label-success")) {
            $.ajax({
                url: "/api/question/" + id,
                type: "POST",
                dataType: "json",
                success: function (question) {
                    window.type2Questions[question.type][question.questionId] = question;
                    console.log(window.type2Questions);
                }
            });
            $(this).removeClass('label-success').addClass('label-danger').text("移除")
        } else {
            $.ajax({
                url: "/api/question/" + id,
                type: "POST",
                dataType: "json",
                success: function (question) {
                    delete window.type2Questions[question.type][question.questionId];
                    console.log(window.type2Questions[question.type]['count']);
                }
            });
            $(this).removeClass('label-danger').addClass('label-success').text("添加")
        }
    });

    //预览某一题目具体信息
    $('#displayDetail').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget);
        var id = button.data('id');//在上面自定义的 [data-id] 中传入
        var modal = $(this);
        $.ajax({
            url: "/api/question/" + id,
            type: "POST",
            dataType: "json",
            success: function (question) {
                modal.find('.modal-type').text(question.type);//题目类型
                modal.find('#title').html(question.stem);//题干
                modal.find('#answer').text("答案：无");//答案
                modal.find('#analysis').text("解析：无");//解析
            }
        });
    });

    //预览试卷
    $('#displayPaper').on('show.bs.modal', function (event) {
        // window.type2Questions
        var modal = $(this);
        modal.find('#title').text("复旦大学2019年《软件测试与质量保证》期末试卷");//试卷名
        console.log("被选中的问题如下： ");
        var body = modal.find(".modal-body");
        body.html("");
        console.log(window.type2Questions);
        $.each(window.type2Questions, function (type, questions) {
            console.log(type);
            if (!$.isEmptyObject(questions)) {
                body.append(
                    "<div class='.'>" +
                    "<h1>" + type + "</h1>"
                );
                var idx = 1;
                $.each(questions, function (id, question) {
                    console.log(question);
                    body.append(parseToQuestion(question, idx++))
                });
                body.append("</div>")
            }

        });
    });

    function parseToQuestion(question, idx) {
        return "<div class='question'>" +
            "<h3>" + question.stem + "<span>[" + question.score + "分]</span></h3>" +
            "<a class='btn btn-primary' role='button' data-toggle='collapse'\n href='#problem-solving-" + idx + "' " +
            "aria-expanded='false' aria-controls='collapseExample'>答案解析：</a>" +
            "<div id='problem-solving-" + idx + "' class='collapse'><div class='well'>无</div></div></div>"
    }

};