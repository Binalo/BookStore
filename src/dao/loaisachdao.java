package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.loaisachbean;

public class loaisachdao {

	public ArrayList<loaisachbean> getLoai() throws Exception {
		ArrayList<loaisachbean> ds = new ArrayList<loaisachbean>();

		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "select * from loai";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet r = cmd.executeQuery();
		while (r.next()) {
			String maloai = r.getString("maloai");
			String tenloai = r.getString("tenloai");
			loaisachbean loai = new loaisachbean(maloai, tenloai);
			ds.add(loai);
		}
		r.close();

		return ds;
	}
}