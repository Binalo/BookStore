package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.KhachHangbean;

public class KhachHangdao {
	public ArrayList<KhachHangbean> getKH() throws Exception {
		ArrayList<KhachHangbean> ds = new ArrayList<KhachHangbean>();
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "SELECT * FROM KhachHang";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			long makh = rs.getLong("makh");
			String tenkh = rs.getString("hoten");
			String diachi = rs.getString("diachi");
			String sodt = rs.getString("sodt");
			String email = rs.getString("email");
			String tendn = rs.getString("tendn");
			String pass = rs.getString("pass");

			KhachHangbean bean = new KhachHangbean(tenkh, diachi, sodt, email, tendn, pass);
			ds.add(bean);
			;
		}
		rs.close();
		dc.cn.close();
		return ds;
	}

	public KhachHangbean getKhachHangByTenDangNhap(String username) throws Exception {
		KhachHangbean khachHangbean = new KhachHangbean();
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "SELECT * FROM KhachHang WHERE tendn = '" + username + "'";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			long makh = rs.getLong("makh");
			String tenkh = rs.getString("hoten");
			String diachi = rs.getString("diachi");
			String sodt = rs.getString("sodt");
			String email = rs.getString("email");
			String tendn = rs.getString("tendn");
			String pass = rs.getString("pass");

			khachHangbean = new KhachHangbean(tenkh, diachi, sodt, email, tendn, pass);

		}
		rs.close();
		dc.cn.close();
		return khachHangbean;

	}

	public void createKhachHang(String tendn, String email, String pass) throws Exception {
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "INSERT INTO KhachHang (email,tendn,pass) VALUES ('" + email + "','" + tendn + "', '" + pass
				+ "')";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();

	}

}
