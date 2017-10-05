package mvc;

public class ImcModel {
	public static String tipoImc(double imc) {
		if(imc < 16){
            return "O seu imc é = "+imc+" Magreza grave!";
        }
        else if(imc < 17){
        	return "O seu imc é = "+imc+" Magreza moderada!";
        }
        else if(imc < 18){
        	return "O seu imc é = "+imc+" Magreza leve!";
        }
        else if(imc < 25){
        	return "O seu imc é = "+imc+" Você está saudável";
        }
        else if(imc < 30){
        	return "O seu imc é = "+imc+" Sobrepeso!";
        }
        else if(imc < 35){
        	return "O seu imc é = "+imc+" Obesidade Grau 1!";
        }
        else if(imc < 40){
        	return "O seu imc é = "+imc+" Obesidade Grau 2 (severa)!";
        }
        else if(imc >= 40){
        	return "O seu imc é = "+imc+" Obesidade Grau Obesidade Grau 3 (mórbida)!";
        }
        else
        	return "";
	}
	
}
