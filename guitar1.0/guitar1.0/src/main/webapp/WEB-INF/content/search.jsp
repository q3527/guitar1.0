<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Find Guitar</title>
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.2/css/bootstrap-select.min.css">
		<link rel="stylesheet" href="https://cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css">
		
<!-- 		<script src="//code.jquery.com/jquery-1.12.4.js"></script> -->
		<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
		
		<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
		
		<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.2/js/bootstrap-select.min.js"></script>
		
		<style type="text/css">
			table tr td {
				padding:5px;
			}
			table tr thead {
				padding:5px;
			}
		</style>
		
		
</head>
<body>
		<div style="padding: 100px 100px 10px;">
		    <div class="span12">
					<form method="post" action="search1">
						<fieldset>
							<input type="text" name="receivertel" />
							  <button type="submit" class="btn">搜索</button>
						</fieldset>
					</form>
				</div>
				<hr>
				<div class="row-fluid">
					<div class="span12">
						<div class="row-fluid">
							<div class="span12">
								<div class="page-header">
									<h1>
										<small>查询结果：</small>
									</h1>
								</div>
							</div>
						</div>
						<div class="row-fluid">
							<div class="span12">
								<table class="table">
									<thead>
										<tr>
											<th>
												serialNumber
											</th>
											<th>
												price
											</th>
											<th>
												builder
											</th>
											<th>
												type
											</th>
										</tr>
									</thead>
						
						
									
									<tbody>
										<tr>
											<td>
											    ${requestScope.a}
											</td>
											<td>
												${requestScope.b}
											</td>
											<td>
												${requestScope.c}
											</td>
											<td>
												${requestScope.d}
											</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		
		
</body>
</html>