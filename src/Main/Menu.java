package Main;

import Service.QuanLyPhuongTien;
import object.Oto;

import object.XeMay;
import object.XeTai;
import taiKhoan.QuanLyTaiKhoan;


import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    QuanLyPhuongTien quanLyPhuongTien = new QuanLyPhuongTien();

    QuanLyTaiKhoan quanLyTaiKhoan = new QuanLyTaiKhoan();

    public Menu() {

    }



    public void menuBatDau() {
        int chon;
        do {
            System.out.println("------------------------------XIN CHÀO --------------------------------");
            System.out.println("|                                                                     |");
            System.out.println("|                         1. Bạn là Quản lý                           |");
            System.out.println("|                                                                     |");
            System.out.println("|                         2. Bạn là Cá Nhân                           |");
            System.out.println("|                                                                     |");
            System.out.println("|                         0. Thoát trương trình                       |");
            System.out.println("-----------------------------------------------------------------------");
            chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    quanLyTaiKhoan.dangNhapQuanLy();
                    break;
                case 2:
                    menuCaNhan();
                    break;
           }

        } while (chon != 0);

    }



    public void menuCaNhan() {
        int chon;
        do {
            System.out.println("-------------------------------XIN CHÀO -------------------------------");
            System.out.println("|                                                                     |");
            System.out.println("|                         1. Đăng nhập tài khoản                      |");
            System.out.println("|                                                                     |");
            System.out.println("|                         2. Đăng ký tài khoản                        |");
            System.out.println("|                                                                     |");
            System.out.println("|                         0. Thoát trương trình                       |");
            System.out.println("-----------------------------------------------------------------------");
            chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    quanLyTaiKhoan.dangNhapTaiKhoan();
                    break;
                case 2:
                    quanLyTaiKhoan.themTaiKhoan();
                    break;
            }

        } while (chon != 0);

    }

    public void menuQuanLy() {
        int chon;
        do {
            System.out.println("--------------------------XIN CHÀO QUẢN LÝ-----------------------------");
            System.out.println("|                                                                     |");
            System.out.println("|                         1. Hiển thị phương tiện                     |");
            System.out.println("|                                                                     |");
            System.out.println("|                         2. Tìm kiếm phương tiện                     |");
            System.out.println("|                                                                     |");
            System.out.println("|                         3. Thay đổi thông tin phương tiện           |");
            System.out.println("|                                                                     |");
            System.out.println("|                         4. Thêm phương tiện                         |");
            System.out.println("|                                                                     |");
            System.out.println("|                         5. Thu hồi phương tiện                      |");
            System.out.println("|                                                                     |");
            System.out.println("|                         0. Thoát trương trình                       |");
            System.out.println("-----------------------------------------------------------------------");
            chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    menuHienThiPhuongTien();
                    break;
                case 2:
                    menuTimPhuongTien();
                    break;
                case 3:
                    menuSuaPhuongTien();
                    break;
                case 4:
                    menuThemPhuongTien();
                    break;
                case 5:
                    menuXoaPhuongTien();
                    break;

            }

        } while (chon != 0);
    }


    public void menuHienThiPhuongTien() {
        int chon;
        do {
            System.out.println("--------------------------HIỂN THỊ PHƯƠNG TIỆN-------------------------");
            System.out.println("|                                                                     |");
            System.out.println("|                         1. Oto                                      |");
            System.out.println("|                                                                     |");
            System.out.println("|                         2. Xe Máy                                   |");
            System.out.println("|                                                                     |");
            System.out.println("|                         3. Xe Tải                                   |");
            System.out.println("|                                                                     |");
            System.out.println("|                         4. Hiển thị tất cả                          |");
            System.out.println("|                                                                     |");
            System.out.println("|                         0. Thoát trương trình                       |");
            System.out.println("-----------------------------------------------------------------------");
            chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    quanLyPhuongTien.hienthiOto();
                    break;
                case 2:
                    quanLyPhuongTien.hienThiXeMay();
                    break;
                case 3:
                    quanLyPhuongTien.hienThiXeTai();
                    break;
                case 4:
                    quanLyPhuongTien.hienThiPhuongTien();
                    break;
            }
        } while (chon != 0);
    }


    public void menuTimPhuongTien() {
        int chon;
        do {
            System.out.println("--------------------------TÌM KIẾM PHƯƠNG TIỆN-------------------------");
            System.out.println("|                                                                     |");
            System.out.println("|                         1. Oto                                      |");
            System.out.println("|                                                                     |");
            System.out.println("|                         2. Xe Máy                                   |");
            System.out.println("|                                                                     |");
            System.out.println("|                         3. Xe Tải                                   |");
            System.out.println("|                                                                     |");
//            System.out.println("|                         4. Khác                                     |");
//            System.out.println("|                                                                     |");
            System.out.println("|                         0. Thoát trương trình                       |");
            System.out.println("-----------------------------------------------------------------------");
            chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    quanLyPhuongTien.timKiemOto();
                    break;
                case 2:
                    quanLyPhuongTien.timKiemXeMay();
                    break;
                case 3:
                    quanLyPhuongTien.timKiemXeTai();
                    break;
//                case 4:
//                    menuKhac();
//                    break;
            }

        } while (chon != 0);
    }


    public void menuSuaPhuongTien() {
        int chon;
        do {
            System.out.println("----------------------THAY ĐỔI THÔNG TIN PHƯƠNG TIỆN-------------------");
            System.out.println("|                                                                     |");
            System.out.println("|                         1. Oto                                      |");
            System.out.println("|                                                                     |");
            System.out.println("|                         2. Xe Máy                                   |");
            System.out.println("|                                                                     |");
            System.out.println("|                         3. Xe Tải                                   |");
            System.out.println("|                                                                     |");
            System.out.println("|                         0. Thoát trương trình                       |");
            System.out.println("-----------------------------------------------------------------------");
            chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    quanLyPhuongTien.capNhapOto();
                    break;
                case 2:
                    quanLyPhuongTien.capNhapXeMay();
                    break;
                case 3:
                    quanLyPhuongTien.capNhapXeTai();
                    break;
            }
        } while (chon != 0);
    }


    public void menuThemPhuongTien() {
        int chon;
        do {
            System.out.println("--------------------------THÊM PHƯƠNG TIỆN-----------------------------");
            System.out.println("|                                                                     |");
            System.out.println("|                         1. Oto                                      |");
            System.out.println("|                                                                     |");
            System.out.println("|                         2. Xe Máy                                   |");
            System.out.println("|                                                                     |");
            System.out.println("|                         3. Xe Tải                                   |");
            System.out.println("|                                                                     |");
            System.out.println("|                         0. Thoát trương trình                       |");
            System.out.println("-----------------------------------------------------------------------");
            chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    quanLyPhuongTien.themOto(new Oto());
                    break;
                case 2:
                    quanLyPhuongTien.themXeMay(new XeMay());
                    break;
                case 3:
                    quanLyPhuongTien.themXeTai(new XeTai());
                    break;
            }
        } while (chon != 0);
    }


    public void menuXoaPhuongTien() {
        int chon;
        do {
            System.out.println("--------------------------THU HỒI PHƯƠNG TIỆN--------------------------");
            System.out.println("|                                                                     |");
            System.out.println("|                         1. Oto                                      |");
            System.out.println("|                                                                     |");
            System.out.println("|                         2. Xe Máy                                   |");
            System.out.println("|                                                                     |");
            System.out.println("|                         3. Xe Tải                                   |");
            System.out.println("|                                                                     |");
            System.out.println("|                         0. Thoát trương trình                       |");
            System.out.println("-----------------------------------------------------------------------");
            chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    quanLyPhuongTien.xoaOtoTheoBienSo();
                    break;
                case 2:
                    quanLyPhuongTien.xoaXeMayTheoBienSo();
                    break;
                case 3:
                    quanLyPhuongTien.xoaXeTaiTheoBienSo();
                    break;
            }

        } while (chon != 0);
    }

    public void menuXoa() {
        System.out.println("------------------------------------------");
        System.out.println("|                1. Có                   |");
        System.out.println("|                                        |");
        System.out.println("|                2. Không                |");
        System.out.println("------------------------------------------");
    }


}