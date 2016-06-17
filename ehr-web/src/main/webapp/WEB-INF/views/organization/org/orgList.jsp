<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="ctx" value="${pageContext.request.contextPath}" />
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>组织信息</title>

    <link href="${ctx}/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="${ctx}/font-awesome/css/font-awesome.css" type="text/css" rel="stylesheet">
    <link href="${ctx}/css/animate.css" type="text/css" rel="stylesheet">
    <link href="${ctx}/css/style.css" type="text/css" rel="stylesheet">
    <link rel="stylesheet" href="${ctx}/css/zTreeStyle/zTreeStyle.css" type="text/css" rel="stylesheet">
    <!-- table css,未来更换jqtable可以去掉该css-->
    <link href="${ctx}/css/plugins/iCheck/custom.css" rel="stylesheet" rel="stylesheet">
    <link href="${ctx}/css/plugins/jqGrid/ui.jqgrid.css" rel="stylesheet" rel="stylesheet">
    <link href="${ctx}/css/plugins/jQueryUI/jquery-ui-1.10.4.custom.min.css" rel="stylesheet" rel="stylesheet">

    <!-- Mainly scripts -->
    <script src="${ctx}/js/jquery-2.1.1.js"></script>
    <script src="${ctx}/js/bootstrap.min.js"></script>
    <script src="${ctx}/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="${ctx}/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>


    <!-- Custom and plugin javascript -->
    <%--<script src="${ctx}/js/inspinia.js"></script>--%>
    <script src="${ctx}/js/plugins/pace/pace.min.js"></script>

    <!--table js 未来更换jqtable可以去掉此js -->
    <!-- Peity -->
    <script src="${ctx}/js/plugins/peity/jquery.peity.min.js"></script>
    <!-- iCheck -->
    <script src="${ctx}/js/plugins/iCheck/icheck.min.js"></script>
    <!-- Peity -->
    <script src="${ctx}/js/demo/peity-demo.js"></script>
    <script src="${ctx}/js/zTree/jquery.ztree.core-3.5.js"></script>
    <script src="${ctx}/js/plugins/layer/layer.js"></script>

    <script src="${ctx}/js/jquery-ui.custom.min.js"></script>
    <script src="${ctx}/js/plugins/jqGrid/i18n/grid.locale-cn.js"></script>
    <script src="${ctx}/js/plugins/jqGrid/jquery.jqGrid.min.js"></script>
</head>

<body class="">

    <!-- 配置菜单放上边先加载 start-->
    <div class="theme-config">
        <div class="theme-config-box">
            <div class="spin-icon">
                <i class="fa fa-cogs fa-spin"></i>
            </div>
            <div class="skin-setttings">
                <div class="title">Configuration</div>
                <div class="setings-item">
                        <span>
                            Collapse menu
                        </span>

                    <div class="switch">
                        <div class="onoffswitch">
                            <input type="checkbox" name="collapsemenu" class="onoffswitch-checkbox" id="collapsemenu">
                            <label class="onoffswitch-label" for="collapsemenu">
                                <span class="onoffswitch-inner"></span>
                                <span class="onoffswitch-switch"></span>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="setings-item">
                        <span>
                            Fixed sidebar
                        </span>

                    <div class="switch">
                        <div class="onoffswitch">
                            <input type="checkbox" name="fixedsidebar" class="onoffswitch-checkbox" id="fixedsidebar">
                            <label class="onoffswitch-label" for="fixedsidebar">
                                <span class="onoffswitch-inner"></span>
                                <span class="onoffswitch-switch"></span>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="setings-item">
                        <span>
                            Top navbar
                        </span>

                    <div class="switch">
                        <div class="onoffswitch">
                            <input type="checkbox" name="fixednavbar" class="onoffswitch-checkbox" id="fixednavbar">
                            <label class="onoffswitch-label" for="fixednavbar">
                                <span class="onoffswitch-inner"></span>
                                <span class="onoffswitch-switch"></span>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="setings-item">
                        <span>
                            Boxed layout
                        </span>

                    <div class="switch">
                        <div class="onoffswitch">
                            <input type="checkbox" name="boxedlayout" class="onoffswitch-checkbox" id="boxedlayout">
                            <label class="onoffswitch-label" for="boxedlayout">
                                <span class="onoffswitch-inner"></span>
                                <span class="onoffswitch-switch"></span>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="setings-item">
                        <span>
                            Fixed footer
                        </span>

                    <div class="switch">
                        <div class="onoffswitch">
                            <input type="checkbox" name="fixedfooter" class="onoffswitch-checkbox" id="fixedfooter">
                            <label class="onoffswitch-label" for="fixedfooter">
                                <span class="onoffswitch-inner"></span>
                                <span class="onoffswitch-switch"></span>
                            </label>
                        </div>
                    </div>
                </div>

                <div class="title">Skins</div>
                <div class="setings-item default-skin">
                        <span class="skin-name ">
                             <a href="#" class="s-skin-0">
                                 Default
                             </a>
                        </span>
                </div>
                <div class="setings-item blue-skin">
                        <span class="skin-name ">
                            <a href="#" class="s-skin-1">
                                Blue light
                            </a>
                        </span>
                </div>
                <div class="setings-item yellow-skin">
                        <span class="skin-name ">
                            <a href="#" class="s-skin-3">
                                Yellow/Purple
                            </a>
                        </span>
                </div>
                <div class="setings-item ultra-skin">
                        <span class="skin-name ">
                            <a  href="#" class="md-skin">
                                Material Design
                            </a>
                        </span>
                </div>
            </div>
        </div>
    </div>
    <!-- 配置菜单放上边先加载 end-->

    <div id="wrapper">

    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav metismenu" id="side-menu">
                <li class="nav-header">
                    <div class="dropdown profile-element"> <span>
                            <img alt="image" class="img-circle" src="${ctx}/img/profile_small.jpg" />
                             </span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">David Williams</strong>
                             </span> <span class="text-muted text-xs block">Art Director <b class="caret"></b></span> </span> </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <li><a href="profile.html">Profile</a></li>
                            <li><a href="contacts.html">Contacts</a></li>
                            <li><a href="mailbox.html">Mailbox</a></li>
                            <li class="divider"></li>
                            <li><a href="login.html">Logout</a></li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        IN+
                    </div>
                </li>
                <li>
                    <a href="${ctx}/sysconfig/desktop.html"><i class="fa fa-desktop"></i> <span class="nav-label">我的工作台</span></a>
                </li>
                <li>
                    <a href="${ctx}/index.html"><i class="fa fa-diamond"></i> <span class="nav-label">DashBoard</span></a>
                </li>
                <li class="active">
                    <a href="#"><i class="fa fa-sitemap"></i> <span class="nav-label">组织人事</span> <span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li class="active"><a href="orgList.jsp">组织信息</a></li>
                        <li ><a href="../employee/employee_list.html">岗位信息</a></li>
                        <li ><a href="../employee/employee_list.html">员工信息</a></li>
                        <li><a href="dashboard_2.html">虚拟组织</a></li>
                        <li><a href="dashboard_3.html">虚拟组织角色管理</a></li>
                        <li><a href="dashboard_4_1.html">虚拟组织成员管理</a></li>
                        <li><a href="dashboard_5.html">职位管理</a> </li>
                    </ul>
                </li>
                <li class="">
                    <a href="${ctx}/404.html"><i class="fa fa-globe"></i> <span class="nav-label">社保管理</span> <span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="#">社保规则设置</a></li>
                        <li ><a href="#">账户登记核算</a></li>
                        <li><a href="#">审核核算结果</a></li>
                    </ul>
                </li>
                <li class="">
                    <a href="${ctx}/404.html"><i class="fa fa-cny"></i> <span class="nav-label">薪酬管理</span> <span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="#">薪酬方案</a></li>
                        <li ><a href="#">日常核算</a></li>
                        <li><a href="#">薪酬档案</a></li>
                        <li><a href="#">薪酬报表</a></li>
                        <li><a href="#">工资条</a></li>
                    </ul>
                </li>
                <li class="">
                    <a href="${ctx}/404.html"><i class="fa fa-key"></i> <span class="nav-label">权限管理</span> <span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="#">角色管理</a></li>
                        <li ><a href="#">用户管理</a></li>
                    </ul>
                </li>
                <li class="">
                    <a href="${ctx}/sysconfig/configmenu.html" title="系统设置"><i class="fa fa-cog"></i> <span class="nav-label">系统设置</span></a>
                </li>
            </ul>

        </div>
    </nav>

        <div id="page-wrapper" class="gray-bg">
        <div class="row border-bottom">
        <nav class="navbar navbar-static-top  " role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
            <form role="search" class="navbar-form-custom" action="search_results.html">
                <div class="form-group">
                    <input type="text" placeholder="Search for something..." class="form-control" name="top-search" id="top-search">
                </div>
            </form>
        </div>
            <ul class="nav navbar-top-links navbar-right">

                <li class="dropdown">
                    <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope"></i>  <span class="label label-warning">16</span>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <div class="dropdown-messages-box">
                                <a href="profile.html" class="pull-left">
                                    <img alt="image" class="img-circle" src="${ctx}/img/a7.jpg">
                                </a>
                                <div class="media-body">
                                    <small class="pull-right">46h ago</small>
                                    <strong>Mike Loreipsum</strong> started following <strong>Monica Smith</strong>. <br>
                                    <small class="text-muted">3 days ago at 7:58 pm - 10.06.2014</small>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="dropdown-messages-box">
                                <a href="profile.html" class="pull-left">
                                    <img alt="image" class="img-circle" src="${ctx}/img/a4.jpg">
                                </a>
                                <div class="media-body ">
                                    <small class="pull-right text-navy">5h ago</small>
                                    <strong>Chris Johnatan Overtunk</strong> started following <strong>Monica Smith</strong>. <br>
                                    <small class="text-muted">Yesterday 1:21 pm - 11.06.2014</small>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="dropdown-messages-box">
                                <a href="profile.html" class="pull-left">
                                    <img alt="image" class="img-circle" src="${ctx}/img/profile.jpg">
                                </a>
                                <div class="media-body ">
                                    <small class="pull-right">23h ago</small>
                                    <strong>Monica Smith</strong> love <strong>Kim Smith</strong>. <br>
                                    <small class="text-muted">2 days ago at 2:30 am - 11.06.2014</small>
                                </div>
                            </div>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="text-center link-block">
                                <a href="mailbox.html">
                                    <i class="fa fa-envelope"></i> <strong>Read All Messages</strong>
                                </a>
                            </div>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
                        <i class="fa fa-bell"></i>  <span class="label label-primary">8</span>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">
                        <li>
                            <a href="mailbox.html">
                                <div>
                                    <i class="fa fa-envelope fa-fw"></i> You have 16 messages
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="profile.html">
                                <div>
                                    <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                    <span class="pull-right text-muted small">12 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="grid_options.html">
                                <div>
                                    <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <div class="text-center link-block">
                                <a href="notifications.html">
                                    <strong>See All Alerts</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </div>
                        </li>
                    </ul>
                </li>


                <li>
                    <a href="login.html">
                        <i class="fa fa-sign-out"></i> Log out
                    </a>
                </li>
            </ul>

        </nav>
        </div>
        <div class="row wrapper border-bottom white-bg page-heading">
            <div class="col-sm-4" style="padding-top: 25px;font-size: 15px;">
                <ol class="breadcrumb">
                    <li>
                        <a href="${ctx}/index.html"><i class="fa fa-home fa-2x"></i></a>
                    </li>
                    <li>
                        组织人事
                    </li>
                    <li >
                        <a>组织信息</a>
                    </li>
                </ol>
            </div>
            <div class="col-sm-8">
                <div class="title-action tooltip-demo m-t">
                    <button class="btn btn-info btn-circle btn-lg"   type="button"  data-toggle="tooltip" data-placement="bottom" title="新增组织" onclick="javascript:window.location.href='add_orginfo.html'"><i class="fa fa-plus"></i>
                    </button>
                    &nbsp;&nbsp;
                    <button class="btn btn-info btn-circle btn-lg" type="button" data-toggle="tooltip" data-placement="bottom" title="批量导入"><i class="fa fa-upload"></i>
                    </button>
                </div>
            </div>
        </div>
        <div class="wrapper wrapper-content  animated fadeInRight">
            <div class="row">
                <div class="col-lg-3 white-bg">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="ibox float-e-margins">
                                <div  class="ibox-title boder0">
                                    <div class="row">
                                        <div class="col-sm-12">

                                        </div>
                                    </div>
                                </div>
                                <div class="ibox-content float-e-margins " id="testDiv">
                                    <div class="ibox-content mailbox-content">
                                        <div class="zTreeDemoBackground left ">
                                            <ul id="treeDemo" class="ztree"></ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-9 white-bg border-left">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="ibox float-e-margins">
                                <div class="ibox-title boder0">
                                    <div class="row">
                                        <div class="col-sm-5 ">
                                        </div>
                                        <div class="col-sm-3 ">
                                        </div>
                                        <div class="col-sm-4">
                                            <div class="input-group">
                                                <input type="text" placeholder="搜索组织名称、简称、点击下拉可高级搜索" class="input-sm form-control">
                                                <span class="input-group-addon"  data-toggle="dropdown" title="高级搜索">
                                                    <span class="fa fa-sort-desc" ></span>
                                               </span>
                                                <div class="dropdown-menu input-sm"  style="width:400px;height:300px;">
                                                    dddd
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="ibox-content">
                                    <div class="row">
                                        <div class="col-sm-5 ">

                                        </div>
                                        <div class="col-sm-7">
                                            <div class="title-action2 tooltip-demo">
                                                <button  class="btn btn-warning btn-circle" type="button" data-toggle="tooltip" data-placement="bottom" title="编辑">
                                                    <i class="fa fa-edit"></i>
                                                </button>
                                                &nbsp;&nbsp;
                                                <button  class="btn btn-danger btn-circle" type="button"  data-toggle="tooltip" data-placement="bottom" title="删除">
                                                    <i class="fa fa-times"></i>
                                                </button>
                                                &nbsp;&nbsp;
                                                <div class="btn-group"  data-toggle="tooltip" data-placement="top" title="更多操作">
                                                    <button data-toggle="dropdown" class="btn btn-success btn-sm dropdown-toggle btn-rounded">
                                                        <i class="fa fa-wrench"></i></button>
                                                    <ul class="dropdown-menu">
                                                        <li><a   data-toggle="modal" data-target="#myModal1" >复制</a></li>
                                                        <li class="divider"></li>
                                                        <li><a href="#"  data-toggle="modal" data-target="#myModal2" >合并</a></li>
                                                        <li class="divider"></li>
                                                        <li><a href="javascript:void(0);" data-toggle="modal" data-target="#myModal3" >划转</a></li>
                                                        <li class="divider"></li>
                                                        <li><a href="#">撤销</a></li>
                                                    </ul>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="modal inmodal fade" id="myModal1" tabindex="-1" role="dialog"  aria-hidden="true">
                                        <div class="modal-dialog modal-lg">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                                    <h1 class="modal-title" style="font-size:12px;text-align: left;"><b>复制组织信息</b></h1>
                                                </div>
                                                <div class="modal-body">
                                                    <form method="get" class="form-horizontal">
                                                        <div class="form-group"><label class="col-sm-2 control-label">名称</label>

                                                            <div class="col-sm-10"><input type="text" class="form-control"></div>
                                                        </div>
                                                        <div class="hr-line-dashed"></div>
                                                        <div class="form-group"><label class="col-sm-2 control-label">复制后的隶属上级</label>
                                                            <div class="col-sm-10"><input type="text" class="form-control">
                                                                <span class="help-block m-b-none">A block of help text that breaks onto a new line and may extend beyond one line.</span>
                                                            </div>
                                                        </div>
                                                        <div class="hr-line-dashed"></div>
                                                        <div class="form-group"><label class="col-sm-2 control-label">生效日期</label>
                                                            <div class="col-sm-10"><input type="text" class="form-control"></div>
                                                        </div>
                                                        <div class="hr-line-dashed"></div>
                                                        <div class="form-group"><label class="col-sm-2 control-label"> <br/>
                                                            <small class="text-navy"> </small></label>

                                                            <div class="col-sm-10">
                                                                <div><label> <input type="checkbox" value=""> 复制默认维度中当前组织单元及其所有下级组织单位以及他们的隶属关系 </label></div>
                                                                <div><label> <input type="checkbox" value=""> 复制所选组织单元的岗位信息 </label></div>
                                                            </div>
                                                        </div>

                                                    </form>
                                                </div>

                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-primary">保存</button>
                                                    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="modal inmodal fade" id="myModal2" tabindex="-1" role="dialog"  aria-hidden="true">
                                        <div class="modal-dialog modal-lg">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                                    <h1 class="modal-title" style="font-size:12px;text-align: left;"><b>合并组织信息</b></h1>
                                                </div>
                                                <div class="modal-body">
                                                    <form method="get" class="form-horizontal">
                                                        <div class="form-group"><label class="col-sm-2 control-label">合并后编码</label>

                                                            <div class="col-sm-10">
                                                                <div class="col-lg-10 m-l-n">
                                                                    <select class="form-control" multiple="">
                                                                        <option>请选择合并后代码及名称</option>
                                                                        <option>(010107)北京分公司</option>
                                                                        <option>(010109)上海分公司</option>
                                                                        <option>(010139)新代码</option>
                                                                </select></div>
                                                            </div>
                                                        </div>
                                                        <div class="hr-line-dashed"></div>
                                                        <div class="form-group"><label class="col-sm-2 control-label">合并后名称</label>
                                                            <div class="col-sm-10"><input type="text" class="form-control"> <span class="help-block m-b-none">A block of help text that breaks onto a new line and may extend beyond one line.</span>
                                                            </div>
                                                        </div>
                                                        <div class="hr-line-dashed"></div>
                                                        <div class="form-group"><label class="col-sm-2 control-label">合并代码</label>
                                                            <div class="col-sm-10"><input type="text" class="form-control"></div>
                                                        </div>
                                                        <div class="hr-line-dashed"></div>
                                                        <div class="form-group"><label class="col-sm-2 control-label">合并日期</label>
                                                            <div class="col-sm-10"><input type="text" class="form-control"></div>
                                                        </div>

                                                    </form>
                                                </div>

                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-primary">保存</button>
                                                    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="modal inmodal fade" id="myModal3" tabindex="-1" role="dialog"  aria-hidden="true">
                                        <div class="modal-dialog modal-lg">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                                    <h1 class="modal-title" style="font-size:12px;text-align: left;"><b>划转组织信息</b></h1>
                                                </div>
                                                <div class="modal-body">
                                                    <form method="get" class="form-horizontal">
                                                        <div class="form-group"><label class="col-sm-2 control-label">目标机构</label>
                                                            <div class="col-sm-10"><input type="text" class="form-control"> <span class="help-block m-b-none">A block of help text that breaks onto a new line and may extend beyond one line.</span>
                                                            </div>
                                                        </div>
                                                        <div class="hr-line-dashed"></div>
                                                        <div class="form-group"><label class="col-sm-2 control-label">划转日期</label>
                                                            <div class="col-sm-10"><input type="text" class="form-control"></div>
                                                        </div>

                                                    </form>
                                                </div>

                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-primary">保存</button>
                                                    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div >
                                        <table id ="orgTable">

                                        </table>
                                        <!-- jqGrid 分页 div gridPager -->
                                        <div id="gridPager"></div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer fixed">
            <div class="pull-right">
                 <strong>TEL：400-820-820</strong>
            </div>
            <div>
                <strong>Copyright</strong> 北京fusion云福科技 &copy; 2015-2016
            </div>
        </div>

        </div>
        </div>


    <script>
        $(document).ready(function(){


            $("#orgTable").jqGrid({
                url:"${ctx}/org/orgList.do",
                datatype:"json", //数据来源，本地数据
                mtype:"GET",//提交方式
                height:420,//高度，表格高度。可为数值、百分比或'auto'
                //width:1000,//这个宽度不能为百分比
                autowidth:true,//自动宽
                colNames:['组织编码', '组织名称', '状态','创建时间'],
                colModel:[
                    //{name:'id',index:'id', width:'10%', align:'center' },
                    {name:'orgCode',index:'orgCode', width:'20%',align:'center'},
                    {name:'name',index:'name', width:'15%',align:'center'},
                    {name:'status',index:'status', width:'20%', align:"center"},
                    {name:'registerDate',index:'registerDate',width:'10%',align:"center", sortable:false}
                ],
                rownumbers:true,//添加左侧行号
                altRows:true,//设置为交替行表格,默认为false
                //sortname:'createDate',
                //sortorder:'asc',
                viewrecords: true,//是否在浏览导航栏显示记录总数
                rowNum:2,//每页显示记录数
                rowList:[2,20,25],//用于改变显示行数的下拉列表框的元素数组。
                jsonReader:{
                    id: "blackId",//设置返回参数中，表格ID的名字为blackId
                    repeatitems : false
                },
                pager:$('#gridPager')
            });


            $('#testDiv').slimscroll({

                height: '500px' //可滚动区域高度
                //width: 'auto', //可滚动区域宽度
               /* size: '10px', //组件宽度
                color: '#000', //滚动条颜色
                position: 'right', //组件位置：left/right
                distance: '0px', //组件与侧边之间的距离
                start: 'top', //默认滚动位置：top/bottom
                opacity: .4, //滚动条透明度
                alwaysVisible: true, //是否 始终显示组件
                disableFadeOut: false, //是否 鼠标经过可滚动区域时显示组件，离开时隐藏组件
                railVisible: true, //是否 显示轨道
                railColor: '#333', //轨道颜色
                railOpacity: .2, //轨道透明度
                railDraggable: true, //是否 滚动条可拖动
                railClass: 'slimScrollRail', //轨道div类名
                barClass: 'slimScrollBar', //滚动条div类名
                wrapperClass: 'slimScrollDiv', //外包div类名
                allowPageScroll: true, //是否 使用滚轮到达顶端/底端时，滚动窗口
                wheelStep: 20, //滚轮滚动量
                //touchScrollStep: 200, //滚动量当用户使用手势
                // borderRadius: '7px', //滚动条圆角
               // railBorderRadius: '7px' //轨道圆角*/

            });


        });
    </script>


    <!--jquery layer start -->
    <script>

        function actionOrg(actionType,actionUrl)
        {	//function content

            //获取页面内容

            //parent.aa();
            parent.layer.open({

                type:2,
                //skin:'layui-layer-lan',
                title:[actionType,'font-size:12px;'],
                title:false,
                area:['670px','580px'],
                //offset:['20px','20px'],

                shade:0.6,

                //shadeClose:true,
                shift:0,
                closeBtn:2,
                maxmin:false,
                scrollbar:true,
                move:false,

                content:actionUrl


            });

        }
    </script>
    <!--jquery layer end -->

    <!-- jQuery ztree start-->
    <SCRIPT type="text/javascript">
        var setting = {
            data: {
                simpleData: {
                    enable: true
                }
            }
        };

        var zNodes ='';
var ctx="${ctx}";

        $(document).ready(function(){
            $.ajax({
                url:ctx+"/menu/siteMenu.do",
                dataType: 'json',
                type: 'get',
                success: function (result)
                {
                    zNodes=result;
                    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
                },
                error : function() {
                    alert("菜单信息加载失败");
                }
            });



        });
    </SCRIPT>
    <style type="text/css">
        .ztree li span.button.pIcon01_ico_open{margin-right:2px; background: url(${ctx}/css/zTreeStyle/img/diy/1_open.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.pIcon01_ico_close{margin-right:2px; background: url(${ctx}/css/zTreeStyle/img/diy/1_close.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.pIcon02_ico_open, .ztree li span.button.pIcon02_ico_close{margin-right:2px; background: url(${ctx}/css/zTreeStyle/img/diy/2.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.icon01_ico_docu{margin-right:2px; background: url(${ctx}/css/zTreeStyle/img/diy/folder.gif) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}

        .ztree li span.button.icon02_ico_docu{margin-right:2px; background: url(${ctx}/css/zTreeStyle/img/diy/4.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.icon03_ico_docu{margin-right:2px; background: url(${ctx}/css/zTreeStyle/img/diy/5.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.icon04_ico_docu{margin-right:2px; background: url(${ctx}/css/zTreeStyle/img/diy/6.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.icon05_ico_docu{margin-right:2px; background: url(${ctx}/css/zTreeStyle/img/diy/7.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.icon06_ico_docu{margin-right:2px; background: url(${ctx}/css/zTreeStyle/img/diy/8.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
    </style>
    <!-- jQuery ztree end-->
    <script>
        $(document).ready(function(){
            $('.i-checks').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green'
            });
        });
    </script>
    <script>
        // Config box

        // Enable/disable fixed top navbar
        $('#fixednavbar').click(function () {
            if ($('#fixednavbar').is(':checked')) {
                $(".navbar-static-top").removeClass('navbar-static-top').addClass('navbar-fixed-top');
                $("body").removeClass('boxed-layout');
                $("body").addClass('fixed-nav');
                $('#boxedlayout').prop('checked', false);

                if (localStorageSupport) {
                    localStorage.setItem("boxedlayout",'off');
                }

                if (localStorageSupport) {
                    localStorage.setItem("fixednavbar",'on');
                }
            } else {
                $(".navbar-fixed-top").removeClass('navbar-fixed-top').addClass('navbar-static-top');
                $("body").removeClass('fixed-nav');

                if (localStorageSupport) {
                    localStorage.setItem("fixednavbar",'off');
                }
            }
        });

        // Enable/disable fixed sidebar
        $('#fixedsidebar').click(function () {
            if ($('#fixedsidebar').is(':checked')) {
                $("body").addClass('fixed-sidebar');
                $('.sidebar-collapse').slimScroll({
                    height: '100%',
                    railOpacity: 0.9
                });

                if (localStorageSupport) {
                    localStorage.setItem("fixedsidebar",'on');
                }
            } else {
                $('.sidebar-collapse').slimscroll({destroy: true});
                $('.sidebar-collapse').attr('style', '');
                $("body").removeClass('fixed-sidebar');

                if (localStorageSupport) {
                    localStorage.setItem("fixedsidebar",'off');
                }
            }
        });

        // Enable/disable collapse menu
        $('#collapsemenu').click(function () {
            if ($('#collapsemenu').is(':checked')) {
                $("body").addClass('mini-navbar');
                SmoothlyMenu();

                if (localStorageSupport) {
                    localStorage.setItem("collapse_menu",'on');
                }

            } else {
                $("body").removeClass('mini-navbar');
                SmoothlyMenu();

                if (localStorageSupport) {
                    localStorage.setItem("collapse_menu",'off');
                }
            }
        });

        // Enable/disable boxed layout
        $('#boxedlayout').click(function () {
            if ($('#boxedlayout').is(':checked')) {
                $("body").addClass('boxed-layout');
                $('#fixednavbar').prop('checked', false);
                $(".navbar-fixed-top").removeClass('navbar-fixed-top').addClass('navbar-static-top');
                $("body").removeClass('fixed-nav');
                $(".footer").removeClass('fixed');
                $('#fixedfooter').prop('checked', false);

                if (localStorageSupport) {
                    localStorage.setItem("fixednavbar",'off');
                }

                if (localStorageSupport) {
                    localStorage.setItem("fixedfooter",'off');
                }


                if (localStorageSupport) {
                    localStorage.setItem("boxedlayout",'on');
                }
            } else {
                $("body").removeClass('boxed-layout');

                if (localStorageSupport) {
                    localStorage.setItem("boxedlayout",'off');
                }
            }
        });

        // Enable/disable fixed footer
        $('#fixedfooter').click(function () {
            if ($('#fixedfooter').is(':checked')) {
                $('#boxedlayout').prop('checked', false);
                $("body").removeClass('boxed-layout');
                $(".footer").addClass('fixed');

                if (localStorageSupport) {
                    localStorage.setItem("boxedlayout",'off');
                }

                if (localStorageSupport) {
                    localStorage.setItem("fixedfooter",'on');
                }
            } else {
                $(".footer").removeClass('fixed');

                if (localStorageSupport) {
                    localStorage.setItem("fixedfooter",'off');
                }
            }
        });

        // SKIN Select
        $('.spin-icon').click(function () {
            $(".theme-config-box").toggleClass("show");
        });

        // Default skin
        $('.s-skin-0').click(function () {
            $("body").removeClass("skin-1");
            $("body").removeClass("skin-2");
            $("body").removeClass("skin-3");
        });

        // Blue skin
        $('.s-skin-1').click(function () {
            $("body").removeClass("skin-2");
            $("body").removeClass("skin-3");
            $("body").addClass("skin-1");
        });

        // Inspinia ultra skin
        $('.s-skin-2').click(function () {
            $("body").removeClass("skin-1");
            $("body").removeClass("skin-3");
            $("body").addClass("skin-2");
        });

        // Yellow skin
        $('.s-skin-3').click(function () {
            $("body").removeClass("skin-1");
            $("body").removeClass("skin-2");
            $("body").addClass("skin-3");
        });

       /* if (localStorageSupport) {
            var collapse = localStorage.getItem("collapse_menu");
            var fixedsidebar = localStorage.getItem("fixedsidebar");
            var fixednavbar = localStorage.getItem("fixednavbar");
            var boxedlayout = localStorage.getItem("boxedlayout");
            var fixedfooter = localStorage.getItem("fixedfooter");

            if (collapse == 'on') {
                $('#collapsemenu').prop('checked','checked')
            }
            if (fixedsidebar == 'on') {
                $('#fixedsidebar').prop('checked','checked')
            }
            if (fixednavbar == 'on') {
                $('#fixednavbar').prop('checked','checked')
            }
            if (boxedlayout == 'on') {
                $('#boxedlayout').prop('checked','checked')
            }
            if (fixedfooter == 'on') {
                $('#fixedfooter').prop('checked','checked')
            }
        }*/
    </script>

</body>

</html>
