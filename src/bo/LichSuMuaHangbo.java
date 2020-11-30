package bo;

import java.util.ArrayList;

import bean.LichSuMuaHangbean;
import dao.LichSuMuaHangDao;

public class LichSuMuaHangbo {
	LichSuMuaHangDao lichSuMuaHangDao = new LichSuMuaHangDao();

	ArrayList<LichSuMuaHangbean> ds = new ArrayList<LichSuMuaHangbean>();

	public ArrayList<LichSuMuaHangbean> getLichSuDatHang(String tdn) throws Exception {
		ds = lichSuMuaHangDao.getChiTietDatHang(tdn);

		return ds;
	}

}
