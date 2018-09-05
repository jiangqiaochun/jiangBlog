<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8"/>
    <title>jiang's blog后台</title>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" href="css/about.css">
    <link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="editor/css/editormd.preview.min.css" />
    <link rel="stylesheet" href="editor/css/editormd.css"/>
</head>
<body>
<header>
    <div class="header-top">
        <div class="header-left"></div>
        <div calss="header-contener">
            <ul class="box">
                <li><a class="linking" href="/admin/index">INDEX</a></li>
                <li><a class="linking" href="/admin/blog.html">BLOGS</a></li>
                <li><a class="linking" href="/admin/about">ABOUT ME</a></li>

            </ul>
        </div>
    </div>
    <div class="inner-header">
        <div class="header-img">
            <img src="images/header.jpg">
        </div>
    </div>
</header>
<!-- 因为我们使用了dark主题，所以在容器div上加上dark的主题类，实现我们自定义的代码样式 -->
<div class="about-bar">
    <div class="about-bto" >
        <a href="/admin/editAbout">修改</a>
    </div>
</div>
<div class="content editormd-preview-theme" id="content">
    <div id="test-editormd">
        　　<textarea style="display:none;" placeholder="markdown语言">${user.about!''}</textarea>
    </div>

</div>
<script src="editor/examples/js/jquery.min.js"></script>
<script src="editor/lib/marked.min.js"></script>
<script src="editor/lib/prettify.min.js"></script>
<script src="editor/lib/raphael.min.js"></script>
<script src="editor/lib/underscore.min.js"></script>
<script src="editor/lib/sequence-diagram.min.js"></script>
<script src="editor/lib/flowchart.min.js"></script>
<script src="editor/lib/jquery.flowchart.min.js"></script>
<script src="editor//editormd.js"></script>
<script type="text/javascript">
    editormd.markdownToHTML("test-editormd",{
        htmlDecode      : "style,script,iframe",  // you can filter tags decode
        emoji           : true,
        taskList        : true,
        tex             : true,  // 默认不解析
        flowChart       : true,  // 默认不解析
        sequenceDiagram : true // 默认不解析
    });
</script>
</body>
</html>