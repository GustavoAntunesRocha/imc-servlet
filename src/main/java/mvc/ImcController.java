package mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImcController
 */
@WebServlet(value = "/mvc/imc-mvc")
public class ImcController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtendo os parametros
		String alturaString = request.getParameter("altura");
	    Double altura = alturaString == null ? 0.0 : Double.parseDouble(alturaString);
	    String pesoString = request.getParameter("peso");
	    Double peso = pesoString == null ? 0.0 : Double.parseDouble(pesoString);
	    Double imc = peso / (altura*altura);
	    
	    //Aplicando regra de negocio
	    String imcString = ImcModel.tipoImc(imc);
	    
	    //chamando a view
	    request.setAttribute("resultado", imcString);
		request.getRequestDispatcher("imcView.jsp").forward(request, response);
	}

}
