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
            <a href="#" class="navbar-brand">STUDENT FEE MANAGEMENT</a>
        </div>
        <!-- Collection of nav links, forms, and other content for toggling -->
        <div id="navbarCollapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="../student/homepage.htm">Student</a></li>
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Courses <b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href="../admin/addCourses.htm">Add Courses</a></li>
                        <li class="divider"></li>
                        <li><a href="../admin/viewCourses.htm">View Courses</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Reports <b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href="../admin/addCourses.htm">Report1</a></li>
                        <li class="divider"></li>
                        <li><a href="../admin/viewCourses.htm">Report2</a></li>
                    </ul>
                </li>
            </ul>
            <form role="search" action="../student/freesearch.htm" class="navbar-form navbar-left" method="POST">
                <div class="form-group">
                    <input type="text" placeholder="Search" class="form-control" name="searchText">
                </div>
            </form>
            <ul class="nav navbar-nav navbar-right">
            	<li><a style="text-transform: uppercase">Welcome: ${loggedInUser.firstname} ${loggedInUser.lastname}</a></li>
                <li><a href="../user/logout.htm">Logout</a></li>
            </ul>
        </div>
    </nav>
</div>                               		