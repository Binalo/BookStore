package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.loaisachbean;
import bean.sachbean;
import bo.loaisachbo;
import bo.sachbo;

/**
 * Servlet implementation class SachController
 */
@WebServlet("/SachController")
public class SachController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SachController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			loaisachbo lbo = new loaisachbo();
			sachbo sbo = new sachbo();

			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			ArrayList<loaisachbean> dsloai = lbo.getloai();
			request.setAttribute("lstLoai", dsloai); // lay tat ca loai sach
			ArrayList<sachbean> dssanh = sbo.getsach();
			String maloai = request.getParameter("ml");
			String ten = request.getParameter("txttk");
			if (maloai != null) { // neu tim theo ma
				ArrayList<sachbean> dsma = sbo.TimSachTheoMa(maloai);
				request.setAttribute("lstma", dsma);
			} else {
				if (ten != null) { // tim theo ten sach
					ArrayList<sachbean> dstk = sbo.TimSach(ten);
					request.setAttribute("lsttk", dstk); // tra ve sach tim duoc
				} else { // chay lan dau
					ArrayList<sachbean> dssach = sbo.getsach();
					request.setAttribute("lstSach", dssach);
				}
			}

			RequestDispatcher rDispatcher = request.getRequestDispatcher("Shop.jsp");
			rDispatcher.forward(request, response);
		} catch (Exception tt) {
			response.getWriter().println("<html><body>" + tt.getMessage() + "</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
