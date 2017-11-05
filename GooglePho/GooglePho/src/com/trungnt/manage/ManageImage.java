package com.trungnt.manage;

import com.trungnt.data.*;

/**
 * Created by My PC on 30/10/2017.
 */
public class ManageImage {
	AnhCayCo[] anhCayCos;
	AnhDongVat[] anhDongVats;
	AnhSieuXe[] anhSieuXes;
	
	public static void main(String[] args) {
		initDuLieuMau();
		initXeHoi();
		
	}
	
	private static void initXeHoi() {
		AnhSieuXe mercerdes = new AnhSieuXe(siẽue)
	}
	
	private static void initDuLieuMau() {
		DuLieuMau sieuXe = new DuLieuMau("CD1","Siêu xe", "25/10/2017");
		DuLieuMau cayThuoc = new DuLieuMau("CD2","Cây Thuốc", "25/10/2017");
		DuLieuMau dongVatAnThit = new DuLieuMau("CD3","Động vật ăn thịt", "25/10/2017");
	}
}
