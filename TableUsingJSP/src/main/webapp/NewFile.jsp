<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<style>
		* {
			margin: 0;
			padding: 0;
			box-sizing: border-box;
		}

		body {
			width: 100%;
			height: 100vh;
			color: black;
			display: flex;
			flex-direction: column;
			justify-content: center;
			align-items: center;
			font-family: Verdana, Geneva, Tahoma, sans-serif;
		}

		.main {
			width: 100%;
			height: fit-content;
			display: flex;
			flex-direction: column;
			justify-content: center;
			align-items: center;
		}

		.table {
			border: 0;
			background-color: grey;
			width: 90%;
			text-transform: uppercase;
			border-radius: 10px;
		}

		.tr {
			background-color: white;
			width: 100%;
			height: 80px;
			text-align: center;
		}

		.td {
			transition: all .4s;
		}

		.td:hover {
			background-color: black;
			color: white;
			transform: scale(1.1);
			border-radius: 10px;
		}
	</style>

	<%!int i,j; %>

		<% int numberOfRows=Integer.parseInt(request.getParameter("rows")); int
			numberOfColumns=Integer.parseInt(request.getParameter("columns")); String
			colorFirst=request.getParameter("color_first"); String colorSecond=request.getParameter("color_second");
			String colorBackground=request.getParameter("color_background"); if (colorBackground=="#000000" ) {
			out.println("<body style='background-color:white;'>");
			} else {
			out.println("

			<body style='background-color:" + colorBackground + ";'>");
				}

				out.println("<main class='main'>");

					out.println("<table style='background-color:"+colorBackground+";' class='table'>");

						for (i = 0; i < numberOfRows; i++) { if ((i + 1) % 2==0) { if (colorFirst=="#000000" ) {
							out.println("<tr style='background-color:white;' class='tr'>");
							} else {
							out.println("<tr style='background-color:" + colorFirst + ";' class='tr'>");
								}
								} else {
								if (colorSecond == "#000000") {
								out.println("
							<tr style='background-color:#eee;'> class='tr'");
								} else {
								out.println("
							<tr style='background-color:" + colorSecond + ";' class='tr'>");
								}
								}
								for (j = 0; j < numberOfColumns; j++) { if (i==0 && j==0) { out.println("<td
									style='border-radius:10px 0 0 0;' class='td'>");
									} else if (i == 0 && j == numberOfColumns - 1) {
									out.println("<td style='border-radius:0 10px 0 0;' class='td'>");

										} else if (i == numberOfRows - 1 && j == numberOfColumns - 1) {
										out.println("
									<td style='border-radius:0 0 10px 0;' class='td'>");

										} else if (i == numberOfRows - 1 && j == 0) {
										out.println("
									<td style='border-radius:0 0 0 10px;' class='td'>");
										} else {
										out.println("
									<td class='td'>");
										}
										out.println("row : " + (i+1) + ", column :" + (j+1));
										out.println("</td>");
									}
									out.println("</tr>");
							}
							%>

	</html>