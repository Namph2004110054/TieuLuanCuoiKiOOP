package Namph.TieuLuanCuoiKi;

public abstract class KhoHang {
    private String maHang;
    private String tenHang;
    private double DonGia;
    private double SoLuongTon;

    public void setmaHang(String maHH) {
        maHang = "01";
        maHang = maHH;
    }

    public String getmaHang() {
        return maHang;
    }
    public void settenHang(String tenHH) {
        tenHang = "Ten Hang";
        tenHang = tenHH;
    }

    public String gettenHang() {
        return tenHang;
    }
    public void setDonGia(double donGia) {
        if (donGia > 0) {
            DonGia = donGia;

        }
        DonGia = donGia;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setSoLuongTon(double soluongton) {
        if (soluongton > 0) {
            SoLuongTon = soluongton;

        } else {
            System.out.println("Het Hang");
        }
        SoLuongTon = soluongton;
    }

    public double getSoLuongTon() {
        return SoLuongTon;
    }
        public KhoHang(String maHH, String tenHH, double soLuongTon, double donGia) {
            maHang = maHH;
            tenHang = tenHH;
            SoLuongTon = soLuongTon;
            DonGia = donGia;
        }
    
        public KhoHang(int maHH, String tenHH, double soLuongTon2, double donGia2) {
        }

        public String toString() {
            return "HangHoa [DonGia=" + DonGia + ", maHang=" + maHang + ", SoLuongTon=" + SoLuongTon + ", tenHang=" + tenHang + "]";
        }
    
}


    