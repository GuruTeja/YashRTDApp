<div class="container"
	style="margin-top: 40px; width: auto; max-width: 100%">
	<div class="row">
		<div class="col-sm-8 col-md-10 col-md-offset-1">
			<div class="panel panel-default panel-table">
				<div class="panel-heading">
					<div class="row">
						<div class="col col-xs-6 text-left">
							<h3 class="panel-title">
								<strong>Student List</strong>
							</h3>
						</div>
						<div class="col col-xs-6 text-right">
							<form action="../admin/adminDashBoardpage.htm" method="post">
								<button type="submit" class="btn btn-sm btn-primary btn-create">Back</button>
							</form>
						</div>
					</div>
				</div>
				<div class="panel-body" style="overflow: auto;">
					<table id="userdetailtable"
						class="table table-striped table-bordered table-list">
						<thead>
							<tr>
								<th><span style="white-space: nowrap"><em
										class="fa fa-cog"></em>ID</span></th>
								<th>First&nbsp;Name</th>
								<th>Last&nbsp;Name</th>
								<th>Select</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${studentList}" var="student">
								<tr>
									<form action="../student/viewStudentDetails.htm" method="post" name="form1">
										<td>${student.id}</td>
										<input type="hidden" name="id" value='${student.id}'>
										<td>${student.firstname}</td>
										<input type="hidden" name="firstname" value='${student.firstname}'>
										<td>${student.lastname}</td>
										<input type="hidden" name="lastname" value='${student.lastname}'>
										<td align="center">
											<button id="edit" class="btn btn-success" type="submit"><em class="glyphicon glyphicon-ok"></em></button>			
										</td>
									</form>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="panel-footer clearfix">
					<div class="pull-right">
						<button type="button" class="btn btn-sm btn-primary btn-create"
							onclick="exportPDF()">PDF</button>
						<button type="button" class="btn btn-sm btn-primary btn-create"
							onclick="exportExcel()">Excel</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>