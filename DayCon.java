package com.nac.daycontangdan;

public class DayCon {
	private final String CHUOI = "1 2 3 5 4 6 7 8 9 8 7 6 5 11 12 13 15 14 16 18 2 4 3 5 7 9 11 11 11 12 13 14 3 4 32 1 2";
	private int viTriDuyet = 0;

	public void lietKeDayConTangDan() {
		viTriDuyet = 0;
		while (viTriDuyet < CHUOI.length()) {
			timKiemDayCon();
		}
	}

	private void timKiemDayCon() {
		int khoangCach = -1;
		int soDau = -1;

		while (viTriDuyet < CHUOI.length()) {
			// Tim được số nguyên trên đường đi
			int soNguyen = timSoNguyen();
			boolean kt = false;

			if (soDau == -1) {
				soDau = soNguyen;
				kt = true;
			} else if (soNguyen - soDau > 0) {
				if (khoangCach == -1) {
					khoangCach = soNguyen - soDau;

					System.out.print("\n" + soDau + " " + soNguyen);
					soDau = soNguyen;
					kt = true;
				} else if (khoangCach == soNguyen - soDau) {
					soDau = soNguyen;
					kt = true;
					System.out.print(soNguyen + " ");
				}
			}

			if (!kt) {
				// Lùi lại 2 số trước để duyệt
				// VD: 1 2 3 5 thì phải lùi về trước số 3
				if (soNguyen - soDau > 0) {
					viTriDuyet = viTriDuyet - (soNguyen + "").length();
					viTriDuyet = viTriDuyet - (soDau + "").length() - 2;
				} else {
					// Lùi lại 1 số trước để duyệt
					// VD: 3 5 4 thì phải lùi về trước số 4
					viTriDuyet = viTriDuyet - (soNguyen + "").length() - 1;
				}
				return;
			}
		}
	}

	private int timSoNguyen() {
		String soNguyen = "";
		while (viTriDuyet < CHUOI.length()) {
			boolean kiemTra = false;
			char kyTu = CHUOI.charAt(viTriDuyet);
			if (kyTu >= '0' && kyTu <= '9') {
				soNguyen += kyTu;
				if (viTriDuyet != CHUOI.length() - 1) {
					kiemTra = true;
				}
			}

			viTriDuyet++;
			if (!kiemTra && !soNguyen.isEmpty()) {
				return Integer.parseInt(soNguyen);
			}
		}
		return -1;
	}
}
