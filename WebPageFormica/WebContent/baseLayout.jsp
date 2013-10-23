<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- JSP odpowiedzialny na utworzenie konstrukcji strony WWW -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/default.css" />
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>

	<div id="CONTAINER">
		<div id="HEADER">
			<div id="TOP">
				<tiles:insertAttribute name="header" />
			</div>

		</div>
		<div id="MENU" class="center">
			<tiles:insertAttribute name="menu" />
		</div>
		<div id="TBAR"></div>
		<div id="MAIN">
			<div id="LEFT" class="fleft">Ogloszenia</div>
			<div id="RIGHT">
				<tiles:insertAttribute name="body" />
			</div>

		</div>
		<div id="FOOTER">
			<tiles:insertAttribute name="footer" />
		</div>
		<!-- stat.4u.pl NiE KaSoWaC -->

	</div>


	<%-- <table border="1" cellpadding="2" cellspacing="2" align="center">
		<tr>
			<td height="30" colspan="2"><tiles:insertAttribute name="header" /></td>
		</tr>
		<tr>
			<td height="250"><tiles:insertAttribute name="menu" /></td>
			<td width="350"><tiles:insertAttribute name="body" /></td>
		</tr>
		<tr>
			<td height="30" colspan="2"><tiles:insertAttribute name="footer" /></td>
		</tr>
	</table> --%>
</body>
</html>