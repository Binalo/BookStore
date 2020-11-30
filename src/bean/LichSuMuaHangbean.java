package bean;

import java.sql.Date;

public class LichSuMuaHangbean {

	private String tensach;
	private String anh;
	private long gia;
	private long soluongmua;
	private Date ngaymua;
	private Integer mahoadon;
	private Integer machitiethoadon;

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public long getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public long getSoluongmua() {
		return soluongmua;
	}

	public void setSoluongmua(long soluongmua) {
		this.soluongmua = soluongmua;
	}

	public Date getNgaymua() {
		return ngaymua;
	}

	public void setNgaymua(Date ngaymua) {
		this.ngaymua = ngaymua;
	}

	public Integer getMahoadon() {
		return mahoadon;
	}

	public void setMahoadon(Integer mahoadon) {
		this.mahoadon = mahoadon;
	}

	public Integer getMachitiethoadon() {
		return machitiethoadon;
	}

	public void setMachitiethoadon(Integer machitiethoadon) {
		this.machitiethoadon = machitiethoadon;
	}

	public LichSuMuaHangbean(String tensach, String anh, long gia, long soluongmua, Date ngaymua, Integer mahoadon,
			Integer machitiethoadon) {
		super();
		this.tensach = tensach;
		this.anh = anh;
		this.gia = gia;
		this.soluongmua = soluongmua;
		this.ngaymua = ngaymua;
		this.mahoadon = mahoadon;
		this.machitiethoadon = machitiethoadon;
	}

	public LichSuMuaHangbean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
