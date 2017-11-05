package com.trungnt.data;

/**
 * Created by My PC on 30/10/2017.
 */
public class AnhCayCo extends HinhAnh {
	private String  têngọi, côngdụng;
	private  HinhAnh hinhAnh;
	public AnhCayCo(int IDHìnhảnh, int đườngdẫn, int IDChủđề, int kíchthước,
	                  String tênhìnhảnh, String têngọi,String côngdụng) {
		super(IDHìnhảnh, đườngdẫn, IDChủđề, kíchthước, tênhìnhảnh);
		this.têngọi = têngọi;
		this.côngdụng = côngdụng;
	}
}
