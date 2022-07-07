package object;

import java.io.Serializable;

public class PhuongTien implements Serializable {
    private String bienSoXe;
    private String hangXe;
    private int namSanXuat;
    private int gia;
    private String mau;

    public PhuongTien() {
    }

    public PhuongTien(String bienSoXe, String hangXe, int namSanXuat, int gia, String mau) {
        this.bienSoXe = bienSoXe;
        this.hangXe = hangXe;
        this.namSanXuat = namSanXuat;
        this.gia = gia;
        this.mau = mau;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "bienSoXe=" + bienSoXe +
                ", hangXe='" + hangXe + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", gia=" + gia +
                ", mau='" + mau + '\'' +
                '}';
    }
}
