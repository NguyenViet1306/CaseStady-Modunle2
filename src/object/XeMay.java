package object;

import java.io.Serializable;

public class XeMay extends PhuongTien implements Serializable {
    private String congSuat;

    public XeMay() {
    }

    public XeMay( String hangXe, int namSanXuat, int gia, String mau, String bienSoXe, String congSuat) {
        super(bienSoXe, hangXe, namSanXuat, gia, mau);
        this.congSuat = congSuat;
    }


    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return  "XeMay{" + super.toString() +
                "congSuat=" + congSuat +
                '}';
    }
}
