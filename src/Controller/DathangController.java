package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.DatHangbo;
import bo.giohangbo;

/**
 * Servlet implementation class DathangController
 */
@WebServlet("/DathangController")
public class DathangController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DathangController() {
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
		HttpSession session = request.getSession();

		String tdn = null;
		tdn = (String) session.getAttribute("un");
		if (tdn == null)
			response.sendRedirect("DangNhap");
		else {
			int damua = 1;

			DatHangbo datHangBo = new DatHangbo();
			giohangbo ghbo = new giohangbo();

			try {

				datHangBo.Them(tdn, damua);
//				giohangbo gh = new giohangbo();
				giohangbo gh;
				gh = (giohangbo) session.getAttribute("gh");//
				gh.ThemChiTietHoaDon();
				session.removeAttribute("gh");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("SachController");
			rd.forward(request, response);

		}

		/*
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 */
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
