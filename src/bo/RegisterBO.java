package bo;

import dao.RegisterDAO;

public class RegisterBO {
	RegisterDAO RgDAO = new RegisterDAO();

	public boolean LoginBO(String user, String pass, String hoten, String diachi, String email, String sodt)
			throws Exception {
		return RgDAO.checkdangki(user, pass, hoten, diachi, email, sodt);
	}
}
