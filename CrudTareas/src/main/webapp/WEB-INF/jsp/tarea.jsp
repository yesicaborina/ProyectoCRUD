<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administracion de Tareas</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<style>

.titulo {
	text-align:center;
	font-size:50px;
	text-shadow: 0px 4px 3px rgba(0,0,0,0.4),
	             0px 8px 13px rgba(0,0,0,0.1),
	             0px 18px 23px rgba(0,0,0,0.1);
}

.botones {
	width:50%;
}

</style>


</head>
<body>

	<div class="row titulo">
		<div class="col-md-4 col-md-offset-4"><h1 class="titulo">Administración de Tareas</h1></div>		
	</div>
	
	<div class="row">
	
		<div class="col-md-4 col-md-offset-4">		
			
			<form:form action="tarea.do" method="POST" commandName="tarea">
				
				<div class="form-group">
			   		 <label>ID</label>
			   		 <form:input path="id_tareas" class="form-control"/>
		  		</div>
		  				
				<div class="form-group">
			   		 <label>Descripcion</label>
			   		 <form:input path="descripcion" class="form-control"/>
		  		</div>
					
				<div class="form-group">
			   		 <label>Asignado</label>
			   		 <form:input path="asignado" class="form-control"/>
		  		</div>
							
				<div class="form-group">
			   		 <label>Fecha Inicio</label>
			   		 <form:input path="fecha_Inicio" class="form-control"/>
		  		</div>
				
				<div class="form-group">
			   		 <label>Fecha Fin</label>
			   		 <form:input path="fecha_fin" class="form-control"/>
		  		</div>
				
				<div class="botones">
					<button type="submit" class="btn btn-default btn-lg btn-block" name="action" value="Agregar">Agregar</button>
					<button type="submit" class="btn btn-default btn-lg btn-block" name="action" value="Modificar">Modificar</button>
					<button type="submit" class="btn btn-default btn-lg btn-block" name="action" value="Borrar">Borrar</button>
					<button type="submit" class="btn btn-default btn-lg btn-block" name="action" value="Buscar">Buscar</button>
				</div>
				
				
			</form:form>
		
			<br>			
				
			<table class="table table-condensed">		
				<th>ID</th>		
				<th>Descripcion</th>
				<th>Asignado</th>
				<th>Fecha Inicio</th>
				<th>Fecha Fin</th>
				<c:forEach items="${tareaList}" var="tarea">
					<tr>					
						<td>${tarea.id_tareas}</td>	
						<td>${tarea.descripcion}</td>
						<td>${tarea.asignado}</td>
						<td>${tarea.fecha_Inicio}</td>
						<td>${tarea.fecha_fin}</td>
					</tr>		
				</c:forEach>	
			</table>
			
		</div>
		
	</div>
	
</body>
</html>