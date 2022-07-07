package Service;

import object.XeMay;

import java.io.Serializable;
import java.util.ArrayList;

public class QuanLyXeMay implements CRUDService<XeMay>, Serializable {
    private ArrayList<XeMay> xeMays = new ArrayList<>();

    public ArrayList<XeMay> getXeMays() {
        return xeMays;
    }

    public void setXeMays(ArrayList<XeMay> xeMays) {
        this.xeMays = xeMays;
    }

    @Override
    public XeMay layBienSoXe(String bienSoXe) {
        return null;
    }

    @Override
    public XeMay them(XeMay xeMay) {
        xeMays.add(xeMay);
        return xeMay;
    }

    @Override
    public void capNhap(XeMay xeMay) {
        for (int i = 0; i < xeMays.size(); i++) {
            if (xeMays.get(i).getBienSoXe() == xeMay.getBienSoXe()) {
                xeMays.set(i, xeMay);
            }
        }
    }

    @Override
    public XeMay xoaTheoBienSoXe(String bienSoxe) {
        XeMay xeMay = null;
        for (XeMay xeMay1 : xeMays) {
            if (xeMay1.getBienSoXe() == bienSoxe) {
                xeMay = xeMay1;
            }
        }
        if (xeMay != null) {
            xeMays.remove(xeMay);
            return (xeMay);
        }
        return null;
    }

    @Override
    public void hienThiTheoBienSoXe(String bienSoXe) {
        for (XeMay xeMay : xeMays) {
            if (xeMay.getBienSoXe() == bienSoXe) {
                System.out.println(xeMay);
            }
        }
    }

    @Override
    public void hienThiTatCa() {
        for (XeMay xeMay : xeMays) {
            System.out.println(xeMay);
        }
    }
}
