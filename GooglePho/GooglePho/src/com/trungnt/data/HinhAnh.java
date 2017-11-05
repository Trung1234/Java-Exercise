package com.trungnt.data;

/**
 * Created by My PC on 30/10/2017.
 */
public abstract class HinhAnh {
	protected  String IDHìnhảnh, đườngdẫn, IDChủđề, kíchthước;
	protected String Tênhìnhảnh;
	
	public HinhAnh(String IDHìnhảnh, String đườngdẫn, String IDChủđề, String kíchthước, String tênhìnhảnh) {
		this.IDHìnhảnh = IDHìnhảnh;
		this.đườngdẫn = đườngdẫn;
		this.IDChủđề = IDChủđề;
		this.kíchthước = kíchthước;
		this.Tênhìnhảnh = tênhìnhảnh;
	}
	
	
	public void inTT(){
		// in thong tin: maGhiChu, tieuDe, noiDung, thoiGian,diaDiem;
	}
}
