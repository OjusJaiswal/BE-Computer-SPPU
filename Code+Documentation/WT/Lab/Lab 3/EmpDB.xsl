<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	
		<html>
			
			<body>
				
				<h2 align="center">Employee Database</h2>
				
				<table border="1" align="center">
					
					<tr bgcolor="Red">
						<th>EmpID</th>
						<th>Name</th>
						<th>Gender</th>
						<th>Age</th>
						<th>Address</th>
						<th>Salary</th>
					</tr>
					
					<xsl:for-each select="EmpDB/Employee">
					<tr bgcolor="Green">
						<td><xsl:value-of select="@EmpID"/></td>
						<td><xsl:value-of select="Name"/></td>
						<td><xsl:value-of select="Gender"/></td>
						<td><xsl:value-of select="Age"/></td>
						<td><xsl:value-of select="Address"/></td>
						<td><xsl:value-of select="Salary"/></td>
					</tr>
					</xsl:for-each>
				
				</table>
				
			</body>
		
		</html>
		
	</xsl:template>
</xsl:stylesheet>