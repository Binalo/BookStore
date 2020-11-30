package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.giohangbean;

public class giohangdao {
	private ArrayList<giohangbean> ds;

	public void Giohang() {
		ds = new ArrayList<giohangbean>();
	}

	public void ThemHang(giohangbean mh) {
		ds.add(mh);
	}

	public ArrayList<giohangbean> getGH() {
		return ds;
	}

	public void ThemChiTiet(List<giohangbean> ds) throws Exception {
		DungChung dc = new DungChung();
		dc.KetNoi();

		String sql = "select max(MaHoaDon)as maxma  from hoadon";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		int max = 0;
		while (rs.next()) {
			max = rs.getInt("maxma");
		}

		int n = ds.size();
		for (int j = 0; j < n; j++) {

			PreparedStatement pst = dc.cn
					.prepareStatement("insert into ChiTietHoaDon(MaSach,SoLuongMua,MaHoaDon) values(?,?,?)");

			pst.setString(1, ds.get(j).getMasach());
			pst.setInt(2, ds.get(j).getSoluong());
			pst.setInt(3, max);
			pst.executeUpdate();
		}
	}
}
