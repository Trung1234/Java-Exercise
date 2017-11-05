package com.trungnt.data;

/**
 * Created by My PC on 30/10/2017.
 */
public class AnhDongVat extends HinhAnh {
	private String têngọi, nơisống, tiếngkêu;
	
	public AnhDongVat(String IDHìnhảnh, String đườngdẫn, String IDChủđề, String kíchthước,
	                  String tênhìnhảnh, String têngọi,String nơisống,String tiếngkêu) {
		super(IDHìnhảnh, đườngdẫn, IDChủđề, kíchthước, tênhìnhảnh);
		this.nơisống = nơisống;
		this.têngọi = têngọi;
		this.tiếngkêu = tiếngkêu;
	}
}
