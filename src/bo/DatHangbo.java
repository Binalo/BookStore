package bo;

import dao.DatHangdao;

public class DatHangbo {
	DatHangdao dhdao = new DatHangdao();

	public void Them(String tdn, int damua) throws Exception {
		int dm = damua;
		dhdao.ThemHoaDon(tdn, dm);

	}
}
