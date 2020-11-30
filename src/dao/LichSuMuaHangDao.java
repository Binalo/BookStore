package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.LichSuMuaHangbean;

public class LichSuMuaHangDao {
	Connection cn;

	public ArrayList<LichSuMuaHangbean> getChiTietDatHang(String tdn) throws Exception {

		DungChung dc = new DungChung();

		dc.KetNoi();
		String sql = "select * from VLichSuMH where tendn='" + tdn + "'";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		ArrayList<LichSuMuaHangbean> ds = new ArrayList<LichSuMuaHangbean>();

		while (rs.next()) {
			String tensach = rs.getString("tensach");
			String anh = rs.getString("anh");
			Long gia = (long) rs.getInt("gia");
			Long soluongmua = (long) rs.getInt("SoLuongMua");
			Date ngaymua = rs.getDate("NgayMua");
			Integer mahoadon = rs.getInt("MaHoaDon");
			Integer machitiethoadon = rs.getInt("MaChiTietHD");

			LichSuMuaHangbean chiTietDatHangBean = new LichSuMuaHangbean(tensach, anh, gia, soluongmua, ngaymua,
					mahoadon, machitiethoadon);
			ds.add(chiTietDatHangBean);
		}
		return ds;

	}

//	public static void main(String[] args) throws Exception {
//		LichSuMuaHangbo lsbo = new LichSuMuaHangbo();
//		ArrayList<LichSuMuaHangbean> ds = new ArrayList<LichSuMuaHangbean>();
//		ds = lsbo.getLichSuDatHang("dien");
//		int n = ds.size();
//		for (int i = 0; i < n; i++) {
//			System.out.println(ds.get(i).getMachitiethoadon());
//		}
//
//	}

}
