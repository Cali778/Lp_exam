<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Bienvenido a la cadena de hotel PeruInka

<br>
<a href="frmPerson">Nuevo Hotel </a>
<br>
<display:table name="${listPerson}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombre" property="businessName" />
	<display:column title="RUC" property="ruc" />
	<display:column title="Direccion" property="address" />
	<display:column title="Telefono" property="phone" />
<%-- 	<display:column title="Numero Documento" property="numDocument" /> --%>
	<display:column title="Estado" property="statusHotel.description" />
	<display:column title="OPC">
		<a href="editPerson?id_=${item.id}">Modificar</a>
		<a href="deletePerson?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>