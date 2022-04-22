package Namph.TieuLuanCuoiKi;

public class HangDienMay extends KhoHang {
    public HangDienMay(String maHH, String tenHH, double soLuongTon, double donGia) {
        super(maHH, tenHH, soLuongTon, donGia);
    }
    public void BaoHanh() {

        for (int i = 0; i > 0; i++) {

            if (i > 0) {
                System.out.println("Thoi gian bao hanh 3 thang");
            } else {
                System.out.println("Khong bao hanh");
            }
        }
    }
    public void setDonGia(double donGia) {
        System.out.println(" da tinh vat" + donGia);
        donGia = donGia * 0.1;
    }
    public void setSoLuongTon(double soLuongTon) {
        if (getSoLuongTon() < 3) {
            System.out.println("Nhap Them");
        } else {
            System.out.println("Giam gia");
        }
        super.setSoLuongTon(soLuongTon);
    }
    public double getSoLuongTon() {
        return 0;
    }
    public void CongSuat() {
        for (int i = 1; i > 1; i++) {
            if (i > 0) {
                System.out.println(" cong suat la ");
            }
        }
    }

    public void DienMay(String maHH, String tenHH, double soLuongTon, double donGia) {
        this.BaoHanh();
        this.CongSuat();
    }

    public String toString() {
        return "DienMay []" + super.toString();
    }
}
