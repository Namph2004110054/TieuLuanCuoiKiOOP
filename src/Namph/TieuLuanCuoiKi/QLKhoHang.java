package Namph.TieuLuanCuoiKi;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;
public class QLKhoHang extends JFrame {
    ;

    private static final char[] KhoHang = null;

    public static void main(String[] args) throws IOException {
        try

        {
            FileOutputStream outFile = new FileOutputStream("data.HangHoa");
            ObjectOutputStream objOut = new ObjectOutputStream(outFile);
            System.out.println(KhoHang);
            objOut.close();
        } finally {
            FileOutputStream outFile = new FileOutputStream("data.HangHoa");
            ObjectOutputStream objOut = new ObjectOutputStream(outFile);
            objOut.writeObject(KhoHang);
            System.out.println();
            objOut.close();
        }
        Scanner scanner = new Scanner(System.in);
        DanhSachKhoHang dHoa = new DanhSachKhoHang();
        while (dHoa != null) {
            try {
                System.out.println("Nhập vào mã hàng hóa:");
                String maHH = scanner.nextLine();
                System.out.println("Nhập tên hàng hóa:");
                String tenHH = scanner.nextLine();
                System.out.println("Nhập số lượng tồn kho:");
                double soLuongTon = scanner.nextDouble();
                System.out.println("Nhập đơn giá của hàng hóa:");
                double donGia = scanner.nextDouble();
                System.out.println("Hàng hóa Thucpham_1/DienMay_2/SanhSu_3 >>");
                int loai = scanner.nextInt();
                KhoHang khoHang;

                if (loai == 1) {

                    System.out.println("Nhập thông tin của hàng thực phẩm cần thêm");
                    int nsx = scanner.nextInt();
                    int hsd = scanner.nextInt();
                    
                } else if (loai == 2) {
                    System.out.println("Nhập thông tin của hàng điện máy cần thêm");
                
                } else {
                    System.out.println("Nhập thông tin hàng sanh sứ cần thêm ");

                }
            } catch (Exception e) {
                System.out.println("Nhap ky tu");
                e.printStackTrace();
            } finally {
                System.out.println("Nhập vào mã hàng hóa:");
                String maHH = scanner.nextLine();
                System.out.println("Nhập tên hàng hóa:");
                String tenHH = scanner.nextLine();
                System.out.println("Nhập số lượng tồn kho:");
                double soLuongTon = scanner.nextDouble();
                System.out.println("Nhập đơn giá của hàng hóa:");
                double donGia = scanner.nextDouble();
                System.out.println("Hàng hóa Thucpham_1/DienMay_2/SanhSu_3 >>");
                int loai = scanner.nextInt();
                KhoHang khoHang;

                if (loai == 1) {

                    System.out.println("Nhập thông tin của hàng thực phẩm cần thêm");
                    int nsx = scanner.nextInt();
                    int hsd = scanner.nextInt();
                } else if (loai == 2) {
                    System.out.println("Nhập thông tin cua hàng điện máy cần thêm");
                } else {
                    System.out.println("Nhập thông tin hàng sành sứ cần thêm ");

                }

            }
            return;
        }
        System.out.println("Ban co nhap tiep không y/n");
        int nhap = scanner.nextInt();
        int x = scanner.nextInt();

        do {
            System.out.println("----------MENU----------------");
            System.out.println("\n|1.Them hang hoa|");
            System.out.println("\n|2.in ra danh sach hang hoa|");
            System.out.println("\n|3. Xoa hang hoa|");
            System.out.println("\n|4. Tim vi tri hang hoa|");
            System.out.println("\n|5. Sua thong tin hang hoa|");

            System.out.println("\n|0. Ket thuc |");

            switch (x) {
                case 1:

                    dHoa.Them(null);

                    break;
                case 2:
                    dHoa.inDanhSach();
                    break;
                case 3:
                    dHoa.xoaGiaoDich(null);
                    break;
                case 4:
                    dHoa.viTri(true);
                    break;
                case 5:
                    dHoa.suaGiaoDich(null);
                    break;

                default:
                    break;
            }
        } while (x != 0);
        FileInputStream inFile = new FileInputStream("KhoHang");
        ObjectInputStream objIn = new ObjectInputStream(inFile);
        System.out.println(dHoa);
        objIn.close();
        QLKhoHang myWindow = new QLKhoHang();
        myWindow.setSize(400, 540);
        myWindow.setLocationRelativeTo(null);
        myWindow.setVisible(true);
    }

    public QLKhoHang() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
    

