package mvc;

public class ImcModel {
	public static String tipoImc(double imc) {
		if(imc < 16){
            return "O seu imc � = "+imc+" Magreza grave!";
        }
        else if(imc < 17){
        	return "O seu imc � = "+imc+" Magreza moderada!";
        }
        else if(imc < 18){
        	return "O seu imc � = "+imc+" Magreza leve!";
        }
        else if(imc < 25){
        	return "O seu imc � = "+imc+" Voc� est� saud�vel";
        }
        else if(imc < 30){
        	return "O seu imc � = "+imc+" Sobrepeso!";
        }
        else if(imc < 35){
        	return "O seu imc � = "+imc+" Obesidade Grau 1!";
        }
        else if(imc < 40){
        	return "O seu imc � = "+imc+" Obesidade Grau 2 (severa)!";
        }
        else if(imc >= 40){
        	return "O seu imc � = "+imc+" Obesidade Grau Obesidade Grau 3 (m�rbida)!";
        }
        else
        	return "";
	}
	
}
