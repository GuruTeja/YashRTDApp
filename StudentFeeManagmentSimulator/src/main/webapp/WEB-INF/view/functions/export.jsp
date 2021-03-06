<!-- For Pagination -->   
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></link>
<link rel="stylesheet" href="http://cdn.datatables.net/buttons/1.2.2/css/buttons.dataTables.min.css"></link>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.2.2/js/dataTables.buttons.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js"></script>
<script type="text/javascript" src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.2.2/js/buttons.html5.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.2.2/js/buttons.print.min.js"></script>
<script type="text/javascript">
	var table;
	
	function initTable(tableId, tableTitle) {
		return $(tableId).DataTable({
			buttons: [{
				extend: 'excel',
				filename: tableTitle.toLowerCase(),
				title: tableTitle,
				exportOptions: {
					columns: ':not(:last-child)',
					format: {
						body: function(data, column, row) {
							return data.replace(/<[^<>]*>/g, "").trim().replace(/\s{2}.*/g, "");
						}
					}
				}
			},
			{
				extend: 'pdf',
				filename: tableTitle.toLowerCase(),
				title: tableTitle,
				exportOptions: {
					columns: ':not(:last-child)',
					format: {
						body: function(data, column, row) {
							return data.replace(/<[^<>]*>/g, "").trim().replace(/\s{2}.*/g, "");
						}
					}
				}
			}]
		});
	}
	
	function exportExcel() {
		table.button(0).trigger();
	}
	
	function exportPDF() {
		table.button(1).trigger();
	}
</script>