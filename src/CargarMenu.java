import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CargarMenu
 */
@WebServlet("/CargarMenu")
public class CargarMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// private static final Logger log = LogManager.getRootLogger();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CargarMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		System.out.println(request.getParameter("num"));
		// log.info("Vamos entrando en harina");

		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");

		out = response.getWriter();
		out.println("MENSAJE INICIAL");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
