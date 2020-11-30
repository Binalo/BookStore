package bo;

import java.sql.Array;
import java.util.ArrayList;

import bean.KhachHangbean;
import dao.KhachHangdao;

public class KhachHangbo {
	KhachHangdao dao = new KhachHangdao();
	ArrayList<KhachHangbean> KhachHangdao = new ArrayList<KhachHangbean>();

//
	public ArrayList<KhachHangbean> getAllCustomer() throws Exception {
		KhachHangdao = dao.getKH();
		System.out.print(KhachHangdao.size());
		return KhachHangdao;
	}

//	

	public boolean checkCustomername(String name) {
		for (KhachHangbean khachHangbean : KhachHangdao) {
			if (khachHangbean.getTendn().equals(name))
				return true;
		}
		return false;
	}

	public KhachHangbean getCutomerbyTenDN(String tendn) throws Exception {
		KhachHangbean khachHangbean = new KhachHangbean();
		khachHangbean = dao.getKhachHangByTenDangNhap(tendn);
		return khachHangbean;
	}
	public void creatKhachHang(String tendn, String email, String pass )throws Exception  {
		dao.createKhachHang(tendn, email, pass);
	}
}
