package taiKhoan;


import Main.Menu;
import Service.QuanLyPhuongTien;
import docGhiFile.DocGhiFile;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTaiKhoan {

    DocGhiFile docGhiFile = new DocGhiFile();
    TaiKhoan taiKhoan = new TaiKhoan();

    TaiKhoanQuanTri taiKhoanQuanTri = new TaiKhoanQuanTri();
    ArrayList<TaiKhoan> taiKhoans = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public QuanLyTaiKhoan() {
        docGhiFile.docTaiKhoan();
    }

    public boolean kiemTraTaiKhoan(String taiKhoan) {
        for (TaiKhoan taiKhoanCheck : taiKhoans) {
            if (taiKhoanCheck.getTaiKhoan().equals(taiKhoan)) {
                return true;
            }
        }
        return false;
    }

    private String bienSoXe;

    public TaiKhoan taoTaiKhoan() {
        QuanLyPhuongTien quanLyPhuongTien = new QuanLyPhuongTien();
        System.out.println("Tài khoản quản lý phương tiện cá nhân");
        System.out.println("Nhập tên tài khoản:");
        String tenTaiKhoan = input.nextLine();
        while (kiemTraTaiKhoan(tenTaiKhoan)) {
            System.out.println("Tên tài khoản đã có.");
            System.out.println("Nhập lại tên tài khoản:");
            tenTaiKhoan = input.nextLine();
        }
        System.out.println("Nhập mật khẩu:");
        String matKhauTaiKhoan = input.nextLine();
        System.out.println("Nhập biển số xe:");
        bienSoXe = input.nextLine();
        while (quanLyPhuongTien.kiemTraBienSoXe(bienSoXe)) {
            System.out.println("Biển số xe này chưa đăng ký");
            System.out.println("Nhập lai biển số xe:");
            bienSoXe = input.nextLine();
        }
        return new TaiKhoan(tenTaiKhoan, matKhauTaiKhoan, bienSoXe);
    }

    public void themTaiKhoan() {
        TaiKhoan taiKhoan = taoTaiKhoan();
        taiKhoans.add(taiKhoan);
        docGhiFile.ghiTaiKhoan(taiKhoans);
    }

    public void dangNhapQuanLy() {
        Menu menu = new Menu();
        System.out.println("Nhập tài khoản");
        String tenTaiKhoan = input.nextLine();
        System.out.println("Nhập mật khẩu");
        String matKhau = input.nextLine();

        if (taiKhoanQuanTri.getTaiKhoan().equals(tenTaiKhoan) && taiKhoanQuanTri.getMatKhau().equals(matKhau)) {
            menu.menuQuanLy();
        }

    }

    public void dangNhapTaiKhoan() {
        QuanLyPhuongTien quanLyPhuongTien = new QuanLyPhuongTien();
        docGhiFile.docTaiKhoan();
        System.out.println("Nhập tài khoản cá nhân:");
        String taiKhoanCaNhan = input.nextLine();
        System.out.println("Nhập mật Khẩu cá nhân:");
        String matKhauCaNhan = input.nextLine();
        for (TaiKhoan taiKhoan : taiKhoans ) {
            if (taiKhoan.getTaiKhoan().equals(taiKhoanCaNhan)
                    && taiKhoan.getMatKhau().equals(matKhauCaNhan)) {
                quanLyPhuongTien.hienThiCaNhan();
            }
        }
    }

}
