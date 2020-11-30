package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class DatHangdao {

	public void ThemHoaDon(String tdn, int damua) throws Exception {

		DungChung dc = new DungChung();
		dc.KetNoi();

		String sql = "select * from KhachHang where tendn='" + tdn + "'";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		int mkh = 0;
		while (rs.next()) {
			mkh = rs.getInt("makh");
		}
		PreparedStatement pst = dc.cn.prepareStatement("insert into hoadon(makh,NgayMua,damua) values(?,?,?)");
		pst.setInt(1, mkh);
		pst.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
		pst.setInt(3, 0);
		pst.executeUpdate();
	}

	public static void main(String[] args) throws Exception {

	}

}
