<script>
function goBack() {
    window.history.back();
}
</script>
<div class="container" style="margin-top: 40px">
	<div class="row">
		<div class="col-sm-8 col-md-10 col-md-offset-1">
			<div class="panel panel-default panel-table">
				<div class="panel-heading">
					<div class="row">
						<div class="col col-xs-6 text-left">
							<h3 class="panel-title">User List</h3>
						</div>
						<div class="col col-xs-6 text-right">
							<button type="button" class="btn btn-sm btn-primary btn-create" onclick="goBack()">Back</button>
						</div>
					</div>
				</div>
				<div class="panel-body" style="overflow:scroll;">
					<table id="myTable"
						class="table table-striped table-bordered table-list">
						<thead>
							<tr>
								<th><em class="fa fa-cog"></em>EmpID</th>
								<th>FirstName</th>
								<th>LastName</th>
								<th>Email</th>
								
							</tr>
						</thead>
						<tbody>
							<tr>
								<td class="hidden-xs">1</td>
								<td>John Doe</td>
								<td>johndoe@example.comcomasfjashfjashfjhasjfhjashjfhasjhfjashjfhsajfjohndoe@example.comasfjashfjashfjhasjfhjashjfhasjhfjashjfhsajfjohndoe@example.comasfjashfjashfjhasjfhjashjfhasjhfjashjfhsajf</td>
								<td align="center">
									<a class="btn btn-default"><em class="fa fa-pencil"></em></a> 
									<a class="btn btn-danger"><em class="fa fa-trash"></em></a>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>

		</div>
	</div>
</div>