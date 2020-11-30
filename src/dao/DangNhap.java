package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DangNhap {
	public boolean KtDangNhap(String un, String pass) throws Exception {

		DungChung dc = new DungChung();

		dc.KetNoi();

		String sql = "select * from KhachHang where tendn='" + un + "' and pass='" + pass + "'";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		boolean kq = rs.next();

		rs.close();
		return kq;
	}

}
