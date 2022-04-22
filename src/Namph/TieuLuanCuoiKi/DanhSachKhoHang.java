package Namph.TieuLuanCuoiKi;

import java.util.ArrayList;
import java.util.List;

public class DanhSachKhoHang {
    List<KhoHang> dKhoHang = new ArrayList<>();

    public void DSHangHoa(KhoHang khoHang) {
        System.out.printf("TP01", "Thit ga", 4400, 35000, 20 / 05 / 2022, 20 / 07 / 2023);
        System.out.printf("TP02", "Trung", 3500, 10000, 19 / 05 / 2022, 20 / 10 / 2022);
        System.out.printf("TP03", "Ca tuoi", 2600, 27000, 4 / 10 / 2022, 25 / 12 / 2022);
        System.out.printf("DM04", "Tivi SONY", 4000, 2790000, 850 , 12);
        System.out.printf("DM05", "May Lanh PANASONIC", 2500, 2200000, 450 , 12);
        System.out.printf("DM06", "Tu lanh TOSHIBA", 3000, 4250000, 180, 12);
        System.out.printf("SS07", "Ly su", 2000, 35000, "Minh Long");
        System.out.printf("SS08", "Chen thuy tinh ", 2540, 400000,"Đinh Quang" );
        System.out.printf("SS09", "Dia gom ", 3000, 25000, "Chanh Tay");
        System.out.printf("SS10", "Dua tre", 2000, 850000, "Tan Binh");

    }

    public DanhSachKhoHang() {
    }

    public void Them(KhoHang khoHang) {

        dKhoHang.add(khoHang);
    }

    public void inDanhSach() {
        for (KhoHang khoHang : dKhoHang) {
            System.out.println(khoHang);
        }
    }

    public KhoHang tiemkiemHangHoa(String MaHH) {

        KhoHang khoHang = null;
        for (KhoHang hh : dKhoHang) {
            if (hh.getmaHang().equalsIgnoreCase(MaHH)) {
                khoHang = (KhoHang) hh;
            }
        }
        return khoHang;

    }

    public void xoaGiaoDich(KhoHang khoHang) {
        this.dKhoHang.remove(khoHang);
    }

    public int timViTriCuaGD(KhoHang khoHang) {
        int viTri = -1;
        viTri = this.dKhoHang.indexOf(khoHang);
        return viTri;
    }

    public void suaGiaoDich(int viTri,KhoHang khoHang) {
        this.dKhoHang.set(viTri, khoHang);
    }

    public void suaGiaoDich(String hanghoa) {
    }

    public void viTri(boolean b) {
    }

    public void add(String string, String string2, int a, int b, int c, int d) {
    }
}
