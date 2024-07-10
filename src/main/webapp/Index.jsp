<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body class="bg-dark">

<div class="container mt-5 text-white">

<h1>Calculadora</h1>

		<form action="CalculadoraServlet" method="post">
			<div class="mb-3 my-5">
				<input type="text" class="form-control" id="numUno" name="numUno" placeholder="Numero 1" required pattern="\d+">
			</div>
			<div class="mb-3">
				<input type="text" class="form-control" id="numDos" name="numDos" placeholder="Numero 2" required pattern="\d+">
			</div>
			<div class="mb-3">
				<select id="operacion" name="operacion" class="form-select">
					<option value="sumar">Suma</option>
					<option value ="restar">Resta</option>
					<option value="multiplicar">Multiplicación</option>
					<option value="dividir">División</option>
					<option value="ordenar">Ordenar el número</option>
					<option value="parImpar">Cuál es par e impar</option>
				</select>
			</div>
			<button type="submit" class="btn btn-primary col-md-12" id="botonCalcular">Calcular</button>
		</form>

	</div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>