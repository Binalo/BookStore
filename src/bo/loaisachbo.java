package bo;

import java.util.ArrayList;

import bean.loaisachbean;
import dao.loaisachdao;

public class loaisachbo {

	loaisachdao ldao = new loaisachdao();

	public ArrayList<loaisachbean> getloai() throws Exception {
		ArrayList<loaisachbean> ds = ldao.getLoai();
		return ds;

	}
}
