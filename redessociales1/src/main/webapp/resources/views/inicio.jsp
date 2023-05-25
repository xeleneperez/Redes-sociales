<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%><!DOCTYPE html>
<html lang="es">

  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1,
      shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>contraseña</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/assets/css/estilos.css" rel="stylesheet">
  </head>
  <header>

  </header>
  <main>
  
    <div class="title">
      <a class="in" href="direc?accion=index"><h1>Inicio</h1></a>
    </div>

    <div class="crud">
      <div class="titl-logo">
        <img src="resources/assets/img/inst.svg" class="logo">
      </div>
      <form action="direc" method="post" >
        <input type="text" placeholder="usuario" name="usuario" required>
        <input type="password" placeholder="Password" name="contrasena" required>
        <button type="submit" name="enviar" value="inicio">inicio</button>
      </form>
    </div>
  </div>
  </main>

  <footer>


  </footer>
</html>