package Service;

import Main.Menu;
import object.Oto;
import object.PhuongTien;
import object.XeMay;
import object.XeTai;

import java.util.ArrayList;
import java.util.Scanner;

import docGhiFile.DocGhiFile;
import taiKhoan.QuanLyTaiKhoan;
import taiKhoan.TaiKhoan;

public class QuanLyPhuongTien {

    private ArrayList<PhuongTien> phuongTiens = new ArrayList<>();
    private final QuanLyOto quanLyOto = new QuanLyOto();
    private final QuanLyXeMay quanLyXeMay = new QuanLyXeMay();
    private final QuanLyXeTai quanLyXeTai = new QuanLyXeTai();
    public Scanner input = new Scanner(System.in);
    private DocGhiFile docGhiFile = new DocGhiFile();

    public QuanLyPhuongTien() {

        quanLyOto.setOtos(docGhiFile.docFileOto());
        quanLyXeMay.setXeMays(docGhiFile.docFileXeMay());
        quanLyXeTai.setXeTais(docGhiFile.docFileXeTai());

    }

    public void themPhuongTien() {
        phuongTiens.addAll(quanLyOto.getOtos());
        phuongTiens.addAll(quanLyXeMay.getXeMays());
        phuongTiens.addAll(quanLyXeTai.getXeTais());

    }

    // Hàm kiểm tra Biển số xe
    public boolean kiemTraBienSoXe(String bienSoXe) {
        for (PhuongTien phuongTien : phuongTiens) {
            if (phuongTien.getBienSoXe().equals(bienSoXe)) {
                return true;
            }
        }
        return false;
    }

//    private void

    // Tạo thêm Oto mới
    private Oto taoOto() {


        System.out.println("Nhập hãng Oto:");
        String hangXe = input.nextLine();
        System.out.println("Nhập năm sản xuất:");
        int namSanXuat = Integer.parseInt(input.nextLine());
        System.out.println("Nhập giá Oto:");
        int gia = Integer.parseInt(input.nextLine());
        System.out.println("Nhập màu của Oto:");
        String mau = input.nextLine();
        System.out.println("Nhập biển số xe Oto:");
        String bienSoXe = input.nextLine();

        int bienDem = 0;
        while (kiemTraBienSoXe(bienSoXe)) {
            System.out.println("Biển số xe bị trùng");
            System.out.println("Nhập lại biển số xe Oto khác:");
            bienSoXe = input.nextLine();
            bienDem++;
            if (bienDem == 3) {
                System.out.println("Bạn đã nhập quá số lần quy định");
                break;
            }
        }
        System.out.println("Nhập vào số chỗ ngồi của Oto:");
        int soGheNgoi = Integer.parseInt(input.nextLine());
        System.out.println("Nhập vào động cơ của Oto");
        String dongCo = input.nextLine();
        return new

                Oto(hangXe, namSanXuat, gia, mau, bienSoXe, soGheNgoi, dongCo);

    }

    public Oto themOto(Oto oto) {
        oto = taoOto();
        quanLyOto.getOtos().add(oto);
        docGhiFile.ghiFileOto(quanLyOto.getOtos());
        return oto;

    }


    //Tạo thêm Xe Máy mới
    private XeMay taoXeMay() {
        System.out.println("Nhập hãng xe máy:");
        String hangXe = input.nextLine();
        System.out.println("Nhập năm sản xuất:");
        int namSanXuat = Integer.parseInt(input.nextLine());
        System.out.println("Nhập giá xe máy:");
        int gia = Integer.parseInt(input.nextLine());
        System.out.println("Nhập màu của xe máy:");
        String mau = input.nextLine();
        System.out.println("Nhập biển số xe máy:");
        String bienSoXe = input.nextLine();
        while (kiemTraBienSoXe(bienSoXe)) {
            System.out.println("Biển số xe đã có.");
            System.out.println("Nhập biển số xe mới:");
            bienSoXe = input.nextLine();
        }
        System.out.println("Nhập vào công xuất của xe máy:");
        String congSuat = input.nextLine();
        return new XeMay(hangXe, namSanXuat, gia, mau, bienSoXe, congSuat);
    }

    public XeMay themXeMay(XeMay xeMay) {
        xeMay = taoXeMay();
        quanLyXeMay.getXeMays().add(xeMay);
        docGhiFile.ghiXeMay(quanLyXeMay.getXeMays());
        return xeMay;
    }

    //Tạo thêm Xe Tải mới
    private XeTai taoXeTai() {
        System.out.println("Nhập hãng xe tải:");
        String hangXe = input.nextLine();
        System.out.println("Nhập năm sản xuất:");
        int namSanXuat = Integer.parseInt(input.nextLine());
        System.out.println("Nhập giá xe tải:");
        int gia = Integer.parseInt(input.nextLine());
        System.out.println("Nhập màu của xe tải:");
        String mau = input.nextLine();
        System.out.println("Nhập biển số xe tải:");
        String bienSoXe = input.nextLine();
        while (kiemTraBienSoXe(bienSoXe)) {
            System.out.println("Biển số xe đã có.");
            System.out.println("Nhập biển số xe mới:");
            bienSoXe = input.nextLine();
        }
        System.out.println("Nhập vào tải trọng của xe tải:");
        String taiTrong = input.nextLine();
        return new XeTai(hangXe, namSanXuat, gia, mau, bienSoXe, taiTrong);
    }

    public XeTai themXeTai(XeTai xeTai) {
        xeTai = taoXeTai();
        quanLyXeTai.getXeTais().add(xeTai);
        docGhiFile.ghiXeTai(quanLyXeTai.getXeTais());
        return xeTai;

    }


    //cập nhập thông tin Oto theo biển số xe
    public void capNhapOto() {
        hienthiOto();
        Oto oto = timKiemOto();
        System.out.println("Nhập thông tin sửa đổi:");
        System.out.println("Nhập giá Oto:");
        int gia = Integer.parseInt(input.nextLine());
        oto.setGia(gia);
        System.out.println("Nhập màu của Oto:");
        String mau = input.nextLine();
        oto.setMau(mau);
        System.out.println("Nhập biển số xe Oto:");
        String bienSoXe = input.nextLine();
        oto.setBienSoXe(bienSoXe);
        System.out.println("Nhập vào động cơ của Oto");
        String dongCo = input.nextLine();
        oto.setDongCo(dongCo);
        docGhiFile.ghiFileOto(quanLyOto.getOtos());

    }

    //cập nhập thông tin Xe máy theo biển số xe
    public void capNhapXeMay() {
        hienThiXeMay();
        XeMay xeMay = timKiemXeMay();
        System.out.println("Nhập thông tin cần cập nhập:");
        System.out.println("Nhập giá xe máy:");
        int gia = Integer.parseInt(input.nextLine());
        xeMay.setGia(gia);
        System.out.println("Nhập màu của xe máy:");
        String mau = input.nextLine();
        xeMay.setMau(mau);
        String bienSoXe = input.nextLine();
        System.out.println("Nhập biển số xe xe máy:");
        xeMay.setBienSoXe(bienSoXe);
        System.out.println("Nhập vào động cơ của xe máy");
        String congSuat = input.nextLine();
        xeMay.setCongSuat(congSuat);
        docGhiFile.ghiXeMay(quanLyXeMay.getXeMays());
    }

    //cập nhập thông tin Xe máy theo biển số xe
    public void capNhapXeTai() {
        hienThiXeTai();
        XeTai xeTai = timKiemXeTai();
        System.out.println("Nhập thông tin cần cập nhập:");
        System.out.println("Nhập giá xe tải:");
        int gia = Integer.parseInt(input.nextLine());
        xeTai.setGia(gia);
        System.out.println("Nhập màu của xe tải:");
        String mau = input.nextLine();
        xeTai.setMau(mau);
        System.out.println("Nhập biển số xe xe tải:");
        String bienSoXe = input.nextLine();
        xeTai.setBienSoXe(bienSoXe);
        System.out.println("Nhập vào tải trọng của xe tải");
        String taiTrong = input.nextLine();
        xeTai.setTaiTrong(taiTrong);
        docGhiFile.ghiXeTai(quanLyXeTai.getXeTais());
    }

    //     Xóa phương tiện Oto
    public Oto xoaOtoTheoBienSo() {
        Menu menu = new Menu();
        hienthiOto();
        System.out.println("Nhập biển số oto cần xóa: ");
        String bienSoXe = input.nextLine();
        for (Oto oto : quanLyOto.getOtos()) {
            if (oto.getBienSoXe().equals(bienSoXe)) {
                System.out.println("Bạn có chắc chắn muốn xóa không:");
                menu.menuXoa();
                int chon;
                chon = Integer.parseInt(input.nextLine());

                if (chon == 1) {
                    quanLyOto.xoaTheoBienSoXe(bienSoXe);
                    break;
                }
                    break;
            }
            docGhiFile.ghiFileOto(quanLyOto.getOtos());
        }
        return null;
    }

    // Xóa phương tiện Xe máy
    public XeMay xoaXeMayTheoBienSo() {
        Menu menu = new Menu();
        hienThiXeMay();
        System.out.println("Nhập biển số xe máy cần xóa: ");
        String bienSoXe = input.nextLine();
        for (XeMay xeMay : quanLyXeMay.getXeMays()) {
            if (xeMay.getBienSoXe().equals(bienSoXe)) {
                System.out.println("Bạn có chắc chắn muốn xóa không");
                menu.menuXoa();
                int chon = Integer.parseInt(input.nextLine());
                if (chon == 1) {
                    quanLyXeMay.xoaTheoBienSoXe(bienSoXe);
                    break;
                }
                break;
            }
            docGhiFile.ghiXeMay(quanLyXeMay.getXeMays());
        }
        return null;
    }

    // Xóa phương tiện Xe tải
    public XeTai xoaXeTaiTheoBienSo() {
        hienThiXeTai();
        Menu menu = new Menu();
        System.out.println("Nhập biển số xe tải cần xóa: ");
        String bienSoXe = input.nextLine();
        for (XeTai xeTai : quanLyXeTai.getXeTais()) {
            if (xeTai.getBienSoXe().equals(bienSoXe)) {
                System.out.println("Bạn có chắc chắn muốn xóa không");
                menu.menuXoa();
                int chon = Integer.parseInt(input.nextLine());
                if (chon == 1) {
                    quanLyXeTai.xoaTheoBienSoXe(bienSoXe);
                    break;
                }
                break;
            }
            docGhiFile.ghiXeTai(quanLyXeTai.getXeTais());
        }
        return null;
    }

    // Hiển thị tất cả các phương tiện
    public void hienThiPhuongTien() {
        hienthiOto();
        hienThiXeMay();
        hienThiXeTai();
    }

    // Hiển thị phương tiện Oto
    public void hienthiOto() {
        quanLyOto.hienThiTatCa();
    }

    // Hiển thị phương tiện Xe máy
    public void hienThiXeMay() {
        quanLyXeMay.hienThiTatCa();
    }


    // Hiển thị phương tiện Xe tải
    public void hienThiXeTai() {
        quanLyXeTai.hienThiTatCa();
    }

    public Oto timKiemOto() {
        String bienKiemSoat;
        System.out.println("Nhập biển số xe:");
        bienKiemSoat = input.nextLine();
        for (Oto oto : quanLyOto.getOtos()) {
            if (oto.getBienSoXe().equals(bienKiemSoat)) {
                System.out.println(oto);
                return oto;
            }
        }
        return null;
    }

    public XeMay timKiemXeMay() {
        String biemKiemSoat;
        System.out.println("Nhập biển số xe");
        biemKiemSoat = input.nextLine();
        for (XeMay xeMay : quanLyXeMay.getXeMays()) {
            if (xeMay.getBienSoXe().equals(biemKiemSoat)) {
                System.out.println(xeMay);
                return xeMay;
            }
        }
        return null;
    }

    public XeTai timKiemXeTai() {
        String bienKiemsoat;
        System.out.println("Nhập biển số xe ");
        bienKiemsoat = input.nextLine();
        for (XeTai xeTai : quanLyXeTai.getXeTais()) {
            if (xeTai.getBienSoXe().equals(bienKiemsoat)) {
                System.out.println(xeTai);
                return xeTai;
            }
        }
        return null;
    }

    public void hienThiCaNhan() {
        TaiKhoan taiKhoan = new TaiKhoan();
        for (PhuongTien pt : phuongTiens) {
            if (pt.getBienSoXe().equals(taiKhoan.getBienSoXe())) {
                System.out.println(pt);
            }
        }
    }


}





