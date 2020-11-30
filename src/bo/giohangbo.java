package bo;

import java.util.ArrayList;

import bean.giohangbean;
import dao.giohangdao;

public class giohangbo {
	public ArrayList<giohangbean> ds = new ArrayList<giohangbean>();

	public void Them(String ma, String th, long gia, int sl) {
		for (giohangbean g : ds)
			if (g.getMasach().equals(ma)) {
				g.setSoluong(g.getSoluong() + sl);
				return;
			}
		giohangbean gh = new giohangbean(ma, th, gia, sl);
		ds.add(gh);

	}

	public long Tongtien() {
		int n = ds.size();
		long s = 0;
		for (int i = 0; i < n; i++) {
			s = s + ds.get(i).getThanhtien();
		}
		return s;
	}

	public void xoa(String ma) {
		for (giohangbean g : ds)
			if (g.getMasach().equals(ma)) {
				ds.remove(g);
				return;
			}

	}

	public void ThemChiTietHoaDon() throws Exception {
		giohangdao ghdao = new giohangdao();
		ghdao.ThemChiTiet(ds);

		// TODO Auto-generated method stub

	}
}
