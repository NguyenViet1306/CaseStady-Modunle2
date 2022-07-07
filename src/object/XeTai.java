package object;

import java.io.Serializable;

public class XeTai extends  PhuongTien implements Serializable {
    private String taiTrong ;

    public XeTai() {
    }

    public XeTai( String hangXe, int namSanXuat, int gia, String mau, String bienSoXe, String taiTrong) {
        super(bienSoXe, hangXe, namSanXuat, gia, mau);
        this.taiTrong = taiTrong;
    }

    public String getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(String taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public String toString() {
        return "XeTai{" + super.toString() +
                "taiTrong=" + taiTrong +
                '}';
    }
}
