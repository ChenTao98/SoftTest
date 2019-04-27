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
            "<td class='list'><span class='label label-success btn-add' data-id='" + i + "' onclick='addQuestion("+ question.questionId + ")'>添加</span></td>" +
            "<td class='list'><span class='label label-info btn-preview' data-id='" + i + "' data-toggle='modal' data-target='#displayDetail'>预览</span></td>" +
            "</tr>";
        $("#result-body").append(row);
    });
}

function addQuestion(questionId) {
    $.ajax({
        url: "/api/question/"+questionId,
        type: "POST",
        dataType: "json",
        success: function (question) {
            console.log(question);
            window.type2Questions[question.type].push(question);
            console.log(window.type2Questions);
        }
    });
}

window.onload = function () {
    // 获取所有题型，并创建表
    // window.type2Questions 是一个字典， key时typeName， 值为被选中的问题。
    $.ajax({
        url: "/api/type/getAllTypes",
        type: "POST",
        dataType: "json",
        success: function(data) {
            console.log("Type Data: ");
            console.log(data);
            window.type2Questions = {};
            $.each(data, function (i, type) {
                window.type2Questions[type.name] = [];
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

    //预览某一题目具体信息
    $('#displayDetail').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget);
        var id = button.data('id');//在上面自定义的 [data-id] 中传入
        //TODO 使用ajax获取题目信息
        var modal = $(this);
        modal.find('.modal-type').text("单选题");//题目类型
        modal.find('#title').text("1 + 1 = ?");//题干
        modal.find('#answer').text("王");//答案
        modal.find('#analysis').text("这是一道语文题");//解析
    });

    //预览试卷
    $('#displayPaper').on('show.bs.modal', function (event) {
        // window.type2Questions
        var button = $(event.relatedTarget);
        //TODO 获取所有被添加的题目信息
        var modal = $(this);
        modal.find('#title').text("复旦大学2019年《软件测试与质量保证》期末试卷");//试卷名
        //if multiple-choice-question-list.length > 0 display else display none
        //TODO
        console.log("被选中的问题如下： ");
        console.log(window.type2Questions);


        if (true) {
            modal.find('#multiple-choice-question h1').text("一、单选题");//单选题，如果所添加的题目中有此类型，则显示，否则其 display = none
            //具体题目信息……
            //例如：
            var problem = modal.find('#multiple-choice-question .problem');
            problem.find('h3').text("1、选择你认为正确的答案");
            problem.find('.choice-one').html("<span>A、选我</span><br><span>B、不要选我</span><br><span>C、都选C</span><br><span>D、根本没有D选项好吧～</span>");
            problem.find('#problem-solving .well').text("我也不知道正确答案是什么～～");
        } else
            modal.find('#multiple-choice-question').css('display', 'none');
        //其他各种体型……
        modal.find('#multiple-choice-questions');
    });
};