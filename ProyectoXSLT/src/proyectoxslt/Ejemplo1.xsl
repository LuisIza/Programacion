<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        Este texto se muestra....
        <xsl:apply-templates/>
    </xsl:template>

  <!--  
<xsl:template match="libro">
    Valores del nodo
    autores
    <xsl:value-of select="autor"/>
    valor atributo titulo
     <xsl:value-of select="titulo/@lang"/>
    valor atributo libro 
     <xsl:value-of select="@categoria"/>
</xsl:template>
-->
<xsl:template match="autor">
    <p>Nombre: <xsl:value-of select="."/></p>
    
</xsl:template>

</xsl:stylesheet>
