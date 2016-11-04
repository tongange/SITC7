<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <jsp:include page="/include/include_bootstrap.jsp"></jsp:include>
</head>

<body>

<%--  <img src="imgs/title_zgcb.gif" alt=""><br><br> --%>

<style type="text/css">
    #container
    {
        font-family: 微软雅黑;
    }
</style>

<script type="text/javascript">
    function basicInfo()
    {
        window.location = "/yunyi/basicInfo.jsp";
    }
</script>

<div class="container" id="container" style="width: 100%;">
    <div class="row clearfix"><!-- 0 -->
        <div class="col-md-12 column"><!-- 1 -->
            <nav class="navbar navbar-default" role="navigation">
                <img src="imgs/title_zgcb.gif" alt=""><br><br>
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav" style="margin-left: 20%;">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown">
                                首页<br>HOME
                            </a>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown">
                                公司介绍<br>Introduction
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="yunyi/basicInfo.jsp">基本信息</a>
                                </li>
                                <li>
                                    <a>检查更新</a>
                                </li>
                                <li>
                                    <a>法律信息</a>
                                </li>
                                <li>
                                    <a>关于</a>
                                </li>
                            </ul>
                        </li>
                        <%-- end <li class="dropdown"> --%>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown">
                                集团情况<br>About
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a>集团简介</a>
                                </li>
                                <li>
                                    <a>组织机构</a>
                                </li>
                                <li>
                                    <a>集团领导</a>
                                </li>
                                <li>
                                    <a>集团企业</a>
                                </li>
                                <li>
                                    <a>集团荣誉</a>
                                </li>
                                <li>
                                    <a>集团资质</a>
                                </li>
                                <li>
                                    <a>大事记</a>
                                </li>
                            </ul>
                        </li>
                        <%-- end <li class="dropdown"> --%>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown">
                                人力资源<br>HR
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a>校园招聘</a>
                                </li>
                                <li>
                                    <a>人员招聘</a>
                                </li>
                                <li>
                                    <a>内部转岗</a>
                                </li>
                                <li>
                                    <a>人才介绍</a>
                                </li>
                                <li>
                                    <a>教育培训</a>
                                </li>
                                <li>
                                    <a>培养理念</a>
                                </li>
                            </ul>
                        </li>
                        <%-- end <li class="dropdown"> --%>
                    </ul>
                </div>
                <%-- end <div class="collapse navbar-collapse"> --%>
            </nav>
        </div><!-- 1 -->
    </div><!-- 0 -->

    <%-- mainContent --%>
    <div class="container" style="width: 100%;">
        <div class="row clearfix">
            <div class="col-md-4 column">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            公司介绍
                        </h3>
                    </div>
                    <div class="panel-body">
                        <div style="font-size: 16px; color: firebrick">
                            <font style="font-size: 60px;color: black;">中</font>　
                            国船舶工业集团公司组建于1999年7月1日，
                            是在原中国船舶工业总公司所属部门企事业单位基础上组建的中央直属特大型国有企业，
                            是国家授权投资机构，由中央直接管理。截至2014年底，
                            中船集团共拥有包括总部在内的56家下属企事业单位（其中，3家上市公司），
                            分布在
                            <font style="font-size: 28px; color: red;">
                                北京、上海、广东、江苏、江西、安徽、广西、香港等地，在美国、俄罗斯、 泰国
                            </font>
                            等8个国家和地区设有驻外机构。
                        </div>
                    </div>
                </div>
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            左边第二个
                        </h3>
                    </div>
                    <div class="panel-body">
                    </div>
                </div>
            </div>
            <div class="col-md-4 column">
                <div class="panel panel-success">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            新闻
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="">...更多</a>
                        </h3>
                    </div>
                    <div class="panel-body" style="overflow: scroll">
                        <button type="button" class="btn btn-link">中船集团党组传达学习十八届六中全会精神</button>
                        <button type="button" class="btn btn-link">中船集团召开党组中心组学习会专题学习打造法治央企</button>
                        <button type="button" class="btn btn-link">中船集团党组召开“增强‘四个意识’ 严守政治纪律政治规矩”专题民主生活会</button>
                        <button type="button" class="btn btn-link">中船集团与进出口银行举行融资签约仪式</button>
                        <button type="button" class="btn btn-link">加强党的建设 全面从严治党</button>
                        <button type="button" class="btn btn-link">吴永杰赴中船租赁、华联公司调研</button>
                        <button type="button" class="btn btn-link">吴永杰率团赴华润集团、招商局集团访问交流</button>
                        <button type="button" class="btn btn-link">南大庆出席中船集团船海业务四季度生产和经营工作专题会</button>
                        <button type="button" class="btn btn-link">孙伟出席中船集团2016年度信息化培训班结业仪式</button>
                        <button type="button" class="btn btn-link">陈琪出席中船集团安全生产工作培训班开班仪式</button>
                    </div>
                </div>
                <div class="panel panel-warning">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            企业动态
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="">...更多</a>
                        </h3>
                    </div>
                    <div class="panel-body" style="overflow: scroll">
                        <button type="button" class="btn btn-link">中国第一艘南极磷虾船花落黄埔文冲</button>
                        <button type="button" class="btn btn-link">黄埔文冲召开CATIA V6软件实船应用阶段总结会</button>
                        <button type="button" class="btn btn-link">九江科技研发中心召开生产流程讨论会</button>
                        <button type="button" class="btn btn-link">九江科技研发中心开展新《职业病防治法》宣贯学习活动</button>
                        <button type="button" class="btn btn-link">七○八所所长邢文华参加第七届泛亚海事学会联盟会议</button>
                        <button type="button" class="btn btn-link">七○八所与浪潮集团开展财务管理交流</button>
                        <button type="button" class="btn btn-link">黄埔文冲交付第二艘深水综合勘察船</button>
                        <button type="button" class="btn btn-link">中船动力成功开发国内功率最大的海洋工程柴油发电机组</button>
                    </div>
                </div>
            </div>
            <div class="col-md-4 column">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Panel title
                        </h3>
                    </div>
                    <div class="panel-body">
                        Panel content
                    </div>
                    <div class="panel-footer">
                        Panel footer
                    </div>
                </div>
                <div class="panel panel-warning">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Panel title
                        </h3>
                    </div>
                    <div class="panel-body">
                        Panel content
                    </div>
                    <div class="panel-footer">
                        Panel footer
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%-- mainContent --%>

</div>

</body>
</html>










