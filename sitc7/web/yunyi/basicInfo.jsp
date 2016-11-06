<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- 基本信息 -->
<head>
    <title>中国船舶基本信息页面</title>
    <jsp:include page="/include/include_bootstrap.jsp"></jsp:include>
</head>

<body>
<div class="container" style="width: 100%;" id="container">

    <%-- --%>
    <div class="row clearfix"><!-- 0 -->
        <div class="col-md-12 column"><!-- 1 -->
            <nav class="navbar navbar-default" role="navigation">
                <img src="title_zgcb.gif" alt=""><br><br>
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
    <%-- --%>

    <!--
    <div class="row clearfix">
        <div class="col-md-6 column">
            <div class="list-group" style="width: 100px;">
                <a href="#" class="list-group-item list-group-item-info">集团概况</a>
                <a href="#" class="list-group-item list-group-item-text">集团简介</a>
                <a href="#" class="list-group-item list-group-item-success">组织机构</a>
                <a href="#" class="list-group-item list-group-item-info">集团领导</a>
                <a href="#" class="list-group-item list-group-item-success">集团企业</a>
                <a href="#" class="list-group-item list-group-item-info">集团荣誉</a>
                <a href="#" class="list-group-item list-group-item-danger">集团资质</a>
            </div>
        </div>
        <div class="col-md-6 column" style="width: 400px;">
            <div class="panel panel-default">
                <div class="panel-body">
                    进阶
                </div>
            </div>
        </div>
    </div>
    -->

    <div class="container" style="width: 90%;">
        <div class="row clearfix">
            <div class="col-md-6 column" style="width: 200px;">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="list-group">
                            <a href="#" class="list-group-item list-group-item-info">集团概况</a>
                            <a href="#" class="list-group-item list-group-item-text">集团简介</a>
                            <a href="#" class="list-group-item list-group-item-success">组织机构</a>
                            <a href="#" class="list-group-item list-group-item-info">集团领导</a>
                            <a href="#" class="list-group-item list-group-item-success">集团企业</a>
                            <a href="#" class="list-group-item list-group-item-info">集团荣誉</a>
                            <a href="#" class="list-group-item list-group-item-danger">集团资质</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6 column" style="width:800px;">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div align="center">
                            <strong>
                                <font style="font-size: 60px; color: black;">
                                    集团简介
                                </font>
                            </strong>
                        </div>
                        <br>

                        <!-- -->
                        &nbsp;&nbsp;&nbsp;
                        <font style="font-size: 36px; font-style: italic; color: red;">
                            中
                        </font>
                        国船舶工业集团公司组建于1999年7月1日，是在原中国船舶工业总公司所属部门企事业单位基础上组建的中央直属特大型国有企业，
                        是国家授权投资机构，由中央直接管理。截至2014年底，中船集团共拥有包括总部在内的56家下属企事业单位（其中，3家上市公司），
                        分布在北京、上海、广东、江苏、江西、安徽、广西、香港等地，在美国、俄罗斯、泰国等8个国家和地区设有驻外机构。<br>
                        　　&nbsp;&nbsp;&nbsp;近年来，中船集团紧紧围绕国家"发展海洋经济、建设海洋强国和强大国防"的战略部署，推进全面转型发展，在业务上形成了以军工为核心主线，
                        贯穿船舶造修、海洋工程、动力装备、机电设备、信息与控制、生产性现代服务业六大产业板块协调发展的产业格局，在海洋防务装备、海洋运输装备、
                        海洋开发装备、海洋科考装备四大领域拥有雄厚实力。<br>
                        　　 &nbsp;&nbsp;&nbsp;通过多年潜心发展，目前，中船集团旗下已聚集了一批中国最具实力的骨干海洋装备造修企业、顶层总体研究设计院所、高端动力机电装备制造企业、
                        先进电子信息技术企业，以及成套物流、国际贸易、金融服务、工程总包、高端咨询等生产性现代服务业企业，成为我国海军舰艇以及海警、渔政、
                        海关缉私、武警边防等公务船研制的中坚力量，能够设计、建造符合世界上任何一家船级社规范、满足国际通用技术标准和安全公约要求、
                        适航于任一海区的现代船舶及海洋工程装备，产品种类从普通的油船、散货船、集装箱船到具有当前国际先进水平的超大型油船（VLCC）、
                        超大型集装箱船、大型矿砂船（VLOC ）、各类大型液化气船（VLGC）、各类滚装船、远洋科考船、远洋渔船、化学品及成品油船，
                        以及超深水半潜式钻井平台、自升式钻井平台、大型海上浮式生产储油船（FPSO）、多缆物探船、深水工程勘察船、大型半潜船、海底铺管船等，
                        形成了多品种、多档次的产品系列，产品已出口到150多个国家和地区。
                        <!-- -->

                        <div align="center">
                            <strong>
                                <font style="font-size: 60px; color: brown;">
                                    发展历程
                                </font>
                            </strong>
                        </div>
                        <!-- -->
                        <p class="css">
                            　　中国船舶工业集团公司源于1950年10月1日成立的中央人民政府重工业部船舶工业局，历经第一机械工业部船舶工业管理局、第三机械工业部第九工业管理局、第六机械工业部、中国船舶工业总公司，1999年7月1日，经国务院批准正式组建成立<br><br>
                            一、 船舶工业（管理）局时期（1950.10～1953.1）<br>
                            　　1950年10月1日，重工业部船舶工业局成立，1953年1月，船舶工业局划归第一机械工业部，改名为船舶工业管理局，程望、邓存伦先后任局长。<br><br>
                            二、 第九工业管理局时期（1958.2～1963.8）<br>
                            　　1958年2月，第一、二机械工业部合为第一机械工业部，船舶工业管理局改名为第九工业管理局。1960年9月13日，第一机械工业部分为第一、三机械工业部，
                            九局归第三机械工业部领导，12月，第九工业管理局改名为第九工业管理总局。邓存伦、赵启民、边疆先后任局（总局）长。<br><br>

                            三、 第六机械工业部时期（1963.9～1982.5）<br>
                            　　1963年9月17日，第九工业总局从第三工业机械部分出，成立第六机械工业部，方强、边疆、柴树藩、安志文先后任部长。<br><br>

                            四、中国船舶工业总公司时期（1982.5～1999.6）<br>
                            　　1982年5月4日，中国船舶工业总公司成立，第六机械工业部建制同时撤销，柴树藩任董事长，冯直、胡传治、张寿、王荣生、徐鹏航先后任总经理<br><br>

                            五、 中国船舶工业集团公司（1999.7～）<br>
                            　　1999年7月1日，经国务院批准，中国船舶工业集团公司正式成立。国务院任命陈小津为中国船舶工业集团公司总经理。2008年7月，谭作钧任中国船舶工业集团公司总经理、
                            党组副书记，李宏任党组书记、副总经理。2010年7月，胡问鸣任党组书记、副总经理。2012年5月29日，经中央领导同意，
                            胡问鸣主持集团公司全面工作。2012年7月，胡问鸣任中国船舶工业集团公司董事长、党组书记。2015年3月，董强任中国船舶工业集团公司董事长、
                            党组书记，吴强任中国船舶工业集团公司董事、总经理、党组副书记
                            。
                        </p>
                        <!-- -->
                        <br>
                        <img src="92501.jpg" alt="">
                        &nbsp;
                        <img src="92502.jpg" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="container" style="width: 90%;">
        版权一栏
    </div>

</div>
</body>


<!-- 基本信息 -->




















