package taiKhoan;

import java.io.Serializable;

public class TaiKhoanQuanTri implements Serializable {
    private String taiKhoan = "Admin";
    private String matKhau =  "Admin";

    public TaiKhoanQuanTri() {
    }

    public TaiKhoanQuanTri(String taiKhoan, String matKhau) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }


    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }


    @Override
    public String toString() {
        return "TaiKhoanQuanTri{" +
                "taiKhoan='" + taiKhoan + '\'' +
                ", matKhau='" + matKhau + '\'' +
                '}';
    }

}
