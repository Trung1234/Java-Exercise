package com.trungnt.data;

/**
 * Created by My PC on 30/10/2017.
 */
public class AnhSieuXe extends HinhAnh {
	private String tênxe, hãngxe, giátiền;
	private DuLieuMau duLieuMau;
	public AnhSieuXe(String IDHìnhảnh, String đườngdẫn, String duLieuMau., String kíchthước,
	                  String tênhìnhảnh, String tênxe,String hãngxe,String giátiền) {
		super(IDHìnhảnh, đườngdẫn, IDChủđề, kíchthước, tênhìnhảnh);
		this.đườngdẫn = đườngdẫn;
		this.hãngxe = hãngxe;
		this.giátiền = giátiền;
	}
}
