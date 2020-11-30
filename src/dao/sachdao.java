package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.sachbean;

public class sachdao {

	public ArrayList<sachbean> getsach() throws Exception {
		ArrayList<sachbean> ds = new ArrayList<sachbean>();
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "select Top(20) * from sach";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet r = cmd.executeQuery();
		while (r.next()) {
			String masach = r.getString("masach");
			String tensach = r.getString("tensach");
			String soluong = r.getString("soluong");
			long gia = r.getLong("gia");
			String maloai = r.getString("maloai");
			String tacgia = r.getString("tacgia");
			String anh = r.getString("anh");

			sachbean loai = new sachbean(masach, tensach, tacgia, gia, anh, maloai);
			ds.add(loai);
		}
		r.close();
		return ds;
	}

}