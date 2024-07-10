

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String numUnoString = request.getParameter("numUno");
		String numDosString = request.getParameter("numDos");
		String operacion = request.getParameter("operacion");
		
		try {
			int numUno = Integer.parseInt(numUnoString);
			int numDos = Integer.parseInt(numDosString);
			String resultado ="";
			
			switch(operacion) {
			case "sumar":
				resultado = "Resultado: " + (numUno + numDos);
				break;
			case "restar":
				resultado = "Resultado: " + (numUno - numDos);
				break;
			case "multiplicar":
				resultado = "Resultado: " + (numUno * numDos);
				break;
			case "dividir":
				if (numDos != 0) {
					resultado =  "Resultado: " + (numUno / numDos);
				} else {
					System.out.println("No se puede dividir por cero");
				}				
				break;
			case "ordenar":
				if (numUno < numDos) {
					resultado = "Resultado: " + numDos + " , " + numUno;
				} else {
					resultado = "Resultado: " + numUno + " , " + numDos;
				}	
				break;
			case "parImpar":
				resultado = "Número 1 es: " + (numUno % 2 == 0 ? "Par" : "Impar") + " y Número 2 es: " + (numDos % 2 == 0 ? "Par" : "Impar");				
				break;
			}			
			request.setAttribute("resultado", resultado);
			request.getRequestDispatcher("resultado.jsp").forward(request, response);
			
		} catch (NumberFormatException e) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		
	}

}
