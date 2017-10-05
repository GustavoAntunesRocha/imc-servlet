<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    
    <head>
    	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <title>Cálculo do IMC</title>
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <div class="jumbotron">
            <div class="container">
                <h1>Cálculo do IMC!</h1>
                <p>Insira as informações nos campos</p>
            </div>
        </div>
        <div class="container">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Seu IMC</h3>
            </div><!-- fim .panel-heading -->
            <div class="panel-body">
            <form>
                <dl>
                <dt>Peso:</dt>
                <input type="number" id="pesoId" placeholder="Peso" required="required" name="peso" step="0.01" min="0"/>
                
                <dt>Altura:</dt>
                <input type="number" id="alturaId" placeholder="Altura" required="required" name="altura" step="0.01" min="0"/>
            
                <dt>Sexo:</dt>
                <p>
                    <input type="radio" id="masculinoId" name="sexo"/>
                    <label for="masculinoId">Masculino</label>
                </p>
                <p>
                    <input type="radio" id="femininoId" name="sexo"/>
                    <label for="femininoId">Feminino</label>
                </p>

                <p>
                    <button>Calcular</button>
                </p>
                
                </dl>
            </form>
            </div><!-- fim .panel-body -->
        </div><!-- fim .panel -->
        </div>
        <div class="container">
        	<h3>${resultado}</h3>
        </div>
    </body>
</html>