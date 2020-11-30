package bean;

public class giohangbean {
	private String masach;
	private String tenhang;
	private int gia;
	private int soluong;
	private long thanhtien;

	public giohangbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public giohangbean(String masach, String tenhang, long gia, int soluong) {
		super();
		this.masach = masach;
		this.tenhang = tenhang;
		this.gia = (int) gia;
		this.soluong = soluong;
		this.thanhtien = thanhtien * gia;
	}

	public String getMasach() {
		return masach;
	}

	public void setMasach(String masach) {
		this.masach = masach;
	}

	public String getTenhang() {
		return tenhang;
	}

	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public long getThanhtien() {
		return soluong * gia;
	}

	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}

	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}

}
