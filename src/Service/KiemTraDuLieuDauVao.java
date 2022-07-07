package Service;

import java.util.Scanner;
import java.util.regex.Pattern;

public class KiemTraDuLieuDauVao {
    QuanLyPhuongTien quanLyPhuongTien = new QuanLyPhuongTien();
    Scanner input = new Scanner(System.in);

    public boolean kiemTraDauVao(String dauVao) {
        return Pattern.matches("^\\d{2}[A-Z]\\d{5}$", dauVao);
    }

    public void kiemTraKieuDuLieu(String bienSoXe) {
        while (true) {
            int bienDem = 0;
            if (kiemTraDauVao(bienSoXe)) {
                System.out.println("Nhập biển số xe Oto:");
                bienSoXe = input.nextLine();
                bienDem++;
            } else {
                break;
            }

        }
    }

}


