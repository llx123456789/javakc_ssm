<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>数据字典添加页面</title>
		<%@ include file="../../common/jsp/header.jsp"%>
		<link href="${path }/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div>
				<div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
			</div>
			<div class="ibox float-e-margins">
				<form action="${path }/test/insert.do" method="post" class="form-horizontal" role="form">
                    <fieldset>
                        <legend>测试基本信息</legend>
                       <div class="form-group">
                          <label class="col-sm-2 control-label" for="names">姓名</label>
                          <div class="col-sm-4">
                             <input class="form-control" type="text" name="name" id="names" placeholder="姓名"/>
                          </div>
                       </div>
                        <div class="form-group">
                          <label class="col-sm-2 control-label" for="ages">年龄</label>
                          <div class="col-sm-4">
                             <input class="form-control" type="text" name="age" placeholder="年龄" id="ages"/>
                          </div>
                       </div>
                       <div class="form-group">
                          <label class="col-sm-2 control-label" >性别</label>
                          <div class="col-sm-4">
                             <!--<input class="form-control" type="text"  name="sex" />-->
                              <zhg:select codeTp="sex" name="sex" cls="form-control"></zhg:select>
                          </div>
                       </div>
                        <div class="form-group">
                           <label class="col-sm-2 control-label" >日期</label>
                           <div class="col-sm-4">
                               <input class="form-control" type="date" name="birthday" placeholder="日期"/>
                           </div>
                       </div>
                    </fieldset>
                    <fieldset>
                        <div class="form-group">
                        	<label class="col-sm-2 control-label" for="ds_host"></label>
                           	<div class="col-sm-4">
                              	<input type="submit" value="提交" class="btn btn-primary"/>
                           	</div>
                           	<label class="col-sm-2 control-label" for="ds_host"></label>
                           	<div class="col-sm-4">
                              	<input type="reset" value="重置" class="btn btn-danger" id="resetForm"/>
                           	</div>
                        </div>
                    </fieldset>
                </form>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="${path }/static/js/plugins/file-input/fileinput.min.js"></script>
	<script type="text/javascript" src="./js/dictionary.js"></script>
</html>