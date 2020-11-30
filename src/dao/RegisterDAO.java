package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterDAO {
	public boolean checkdangki(String user, String pass, String hoten, String diachi, String email, String sodt)
			throws Exception {
		boolean status = false;
		DungChung dc = new DungChung();
		dc.KetNoi();
		PreparedStatement ps = dc.cn.prepareStatement("select * from KhachHang where tendn=?");
		ps.setString(1, user);
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		if (status) {
			return status;
		} else {
			// to do insert
			taotaikhoan(user, pass, hoten, diachi, email, sodt);
			status = false;
			return status;
		}

	}

	public int taotaikhoan(String user, String pass, String hoten, String diachi, String email, String sodt)
			throws Exception {
		DungChung dc = new DungChung();
		dc.KetNoi();
		PreparedStatement ps = dc.cn.prepareStatement("insert into KhachHang values(?,?,?,?,?,?)");
		ps.setString(1, hoten);
		ps.setString(2, diachi);
		ps.setString(3, sodt);
		ps.setString(4, email);
		ps.setString(5, user);
		ps.setString(6, pass);

		int i = ps.executeUpdate();

		return i;
	}
}
