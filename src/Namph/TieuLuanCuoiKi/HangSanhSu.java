package Namph.TieuLuanCuoiKi;

public class HangSanhSu extends KhoHang {
    public HangSanhSu(int maHH, String tenHH, double soLuongTon, double donGia) {
        super(maHH, tenHH, soLuongTon, donGia);   
        
    }
    public void NhaSX() {
        System.out.println("Nhà sản xuất là:");
    }
    public void NgayNK() {
        System.out.println("Ngày Nhập Kho là:");
    }
    public void setDonGia(double donGia) {
        donGia = donGia * 0.1;
        System.out.println("Đã tính vat" + donGia);
    }
    public void setSoLuongTon(double soLuongTon) {
        if (getSoLuongTon() > 50) {
            System.out.println("Ngưng nhập");
        } else {
            System.out.println("Nhập thêm");
        }
        super.setSoLuongTon(soLuongTon);
    }

    public void SanhSu(String maHH, String tenHH, double soLuongTon, double donGia) {
        this.NgayNK();
        this.NhaSX();
    }
    public String toString() {
        return "SanhSu []" + super.toString();
    } 
}
