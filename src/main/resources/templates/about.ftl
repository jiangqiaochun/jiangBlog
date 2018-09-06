<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="utf-8"/>
	<title>一枚渣渣程序媛</title>
	<link rel="stylesheet" type="text/css" href="index/css/common.css">
	<link rel="stylesheet" href="index/css/about.css">
	<link rel="stylesheet" href="index/css/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<link rel="stylesheet" href="admin/editor/css/editormd.preview.min.css" />
	<link rel="stylesheet" href="admin/editor/css/editormd.css"/>
</head>
<body>
<header>
	<div class="header-top">
		<div class="header-left"></div>
		<div calss="header-contener">
			<ul class="box">
				<li><a class="linking" href="/jiang">HOME</a></li>
				<li><a class="linking" href="/blog">BLOGS</a></li>
				<li><a class="linking" href="/about">ABOUT ME</a></li>

			</ul>
		</div>
	</div>
	<div class="inner-header">
		<div class="header-img">
			<img src="index/images/header.jpg">
		</div>
	</div>
</header>
<!-- 因为我们使用了dark主题，所以在容器div上加上dark的主题类，实现我们自定义的代码样式 -->
<div class="con">
	<div class="content" id="content">
		<div id="test-editormd">
			　　<textarea style="display:none;" placeholder="markdown语言">${about!''}</textarea>
		</div>

	</div>
</div>
<script src="admin/editor/examples/js/jquery.min.js"></script>
<script src="admin/editor/lib/marked.min.js"></script>
<script src="admin/editor/lib/prettify.min.js"></script>
<script src="admin/editor/lib/raphael.min.js"></script>
<script src="admin/editor/lib/underscore.min.js"></script>
<script src="admin/editor/lib/sequence-diagram.min.js"></script>
<script src="admin/editor/lib/flowchart.min.js"></script>
<script src="admin/editor/lib/jquery.flowchart.min.js"></script>
<script src="admin/editor//editormd.js"></script>
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