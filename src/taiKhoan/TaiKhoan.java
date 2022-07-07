package taiKhoan;

import java.io.Serializable;
import java.util.Scanner;

public class TaiKhoan extends TaiKhoanQuanTri implements Serializable {

    private String bienSoXe;

    public TaiKhoan() {

    }

    public TaiKhoan(String taiKhoan, String matKhau, String bienSoXe) {
        super(taiKhoan, matKhau);
        this.bienSoXe = bienSoXe;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                super.toString() +
                "bienSoXe='" + bienSoXe + '\'' +
                '}';
    }
}
