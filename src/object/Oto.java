package object;

import java.io.Serializable;

public class Oto extends PhuongTien implements Serializable {

    private int soGheNgoi;
    private String dongCo;

    public Oto() {
    }

    public Oto( String hangXe, int namSanXuat, int gia, String mau,String bienSoXe, int soGheNgoi, String dongCo) {
        super(bienSoXe, hangXe, namSanXuat, gia, mau);
        this.soGheNgoi = soGheNgoi;
        this.dongCo = dongCo;
    }

    public void setSoGheNgoi(int soGheNgoi) {
        this.soGheNgoi = soGheNgoi;
    }

    public void setDongCo(String dongCo) {
        this.dongCo = dongCo;
    }

    public int getSoGheNgoi() {
        return soGheNgoi;
    }

    public String getDongCo() {
        return dongCo;
    }

    @Override
    public String toString() {
        return "Oto{" + super.toString() +
                "soGheNgoi=" + soGheNgoi +
                ", dongCo='" + dongCo + '\'' +
                '}';
    }
}
