<div class="bs-example">
    <nav role="navigation" class="navbar navbar-default">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand">RTD App</a>
        </div>
        <!-- Collection of nav links, forms, and other content for toggling -->
        <div id="navbarCollapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
            	<li class="active"><a href="../admin/adminDashBoardpage.htm">User</a></li>
            	
                <li class="active">
	                <form action="../admin/adminDashBoardpage.htm" method="post" class="navbar-form navbar-left" id="adminDashBoardpage">
	                	<div class="form-group">
	                		<a class="btn btn-link" href="javascript:{}" onclick="document.getElementById('adminDashBoardpage').submit();">User</a>
			            </div>
	                </form>
                </li>
                
                <li>
                <form action="../admin/locationhomepage.htm" method="post" class="navbar-form navbar-left" id="locationhomepage">
                	<a class="btn btn-link" href="javascript:{}" onclick="document.getElementById('locationhomepage').submit();">Location</a> 
                </form>
                </li>
                       
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Other <b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href="#">Permissions</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Assignments</a></li>
                    </ul>
                </li>
                 
            </ul>
            <form role="search" action="../admin/search.htm" class="navbar-form navbar-left" method="POST">
                <div class="form-group">
                    <input type="text" placeholder="Search" class="form-control" name="search">
                </div>
            </form> 
            <ul class="nav navbar-nav navbar-right">
            	<li><a>Welcome: ${loggedInUser.firstname}</a></li>
                <li><a href="../user/logout.htm">Logout</a></li>
            </ul>
        </div>
    </nav>
</div>                               		