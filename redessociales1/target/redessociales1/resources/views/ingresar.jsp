<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/assets/css/estilos.css">
    <title>consultar</title>
</head>
<form action="direc">
    <div class="in1">
        <label for="comentario">Ingrese un comentario para subir a la pagina</label>
        <br>
        <br>
         <input type="text" name="comentario"  value="comentario" >
         <label for="reaccion">Ingrese la reaccion del comentario</label>
         <input type="text" name="reaccion" value="reaccion">
         <button type="submit" name="enviar" value="btn">publicar</button>
    </div>
    <p> 
        <%=request.getAttribute("ingresar")%>
    </p>
 <br>
</form>
<body>
</body>
</html>