<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
<body>
  <h2>Employee Details</h2>
  <table border="1">
    <tr bgcolor="Red">
      <th style="text-align:left">Emp_Name</th>
      <th style="text-align:left">Address</th>
       
    </tr>
    <xsl:for-each select="catalog/cd">
    <tr>
      <td><xsl:value-of select="Emp_Name"/></td>
      <td><xsl:value-of select="Address"/></td>
      
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>