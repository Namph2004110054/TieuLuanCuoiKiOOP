package Namph.TieuLuanCuoiKi;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class HangThucPham extends KhoHang {
    public HangThucPham(String maHH, String tenHH, double soLuongTon, double donGia) {
        super(maHH, tenHH, soLuongTon, donGia);
    }
    private int maHang;
    private String tenHang;
    private double donGia;
    private Date nSX, hSD;
    
    public void KhoHang(int maHang, String tenHang, double donGia, Date nSX, Date hSD) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.nSX = nSX;
        this.hSD = hSD;
    }
    public void ThucPham() {
    }
 
    public int getMaHang() {
        return maHang;
    }
 
    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }
 
    public String getTenHang() {
        return tenHang;
    }
 
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
 
    public double getDonGia() {
        return donGia;
    }
 
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
 
    public Date getnSX() {
        return nSX;
    }
 
    public void setnSX(Date nSX) {
        this.nSX = nSX;
    }
 
    public Date gethSD() {
        return hSD;
    }
 
    public void sethSD(Date hSD) {
        this.hSD = hSD;
    }
    public void setSoLuongTon(double soLuongTon) {
        if (getSoLuongTon() > 0 && nSX.after(this.hSD)) {
            System.out.println("Giam so Luong");
        }
        super.setSoLuongTon(soLuongTon);
    }
    public String toString() {
        SimpleDateFormat ngayVN = new SimpleDateFormat();
        return "ThucPham [hSD=" + ngayVN.format(hSD) + ", nSX=" + ngayVN.format(nSX) + "]" + super.toString();
    }
}

