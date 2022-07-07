package Service;

import object.XeMay;
import object.XeTai;

import java.io.Serializable;
import java.util.ArrayList;

public class QuanLyXeTai implements CRUDService<XeTai>, Serializable {

    private ArrayList<XeTai> xeTais = new ArrayList<>();

    public ArrayList<XeTai> getXeTais() {
        return xeTais;
    }

    public void setXeTais(ArrayList<XeTai> xeTais) {
        this.xeTais = xeTais;
    }

    @Override
    public XeTai layBienSoXe(String bienSoXe) {
        for (XeTai xeTai : xeTais) {
            if (xeTai.getBienSoXe().equals(bienSoXe)) {
                return xeTai;
            }
        }
        return null;
    }

    @Override
    public XeTai them(XeTai xeTai) {
        xeTais.add(xeTai);

        return xeTai;
    }

    @Override
    public void capNhap(XeTai xeTai) {
        for (int i = 0; i < xeTais.size(); i++) {
            if (xeTais.get(i).getBienSoXe().equals(xeTai.getBienSoXe())) {
                xeTais.set(i, xeTai);
            }
        }
    }

    @Override
    public XeTai xoaTheoBienSoXe(String bienSoxe) {
        XeTai xeTai = null;
        for (XeTai xeTai1 : xeTais) {
            if (xeTai.getBienSoXe().equals(bienSoxe)) {
                xeTai = xeTai1;
            }
        }
        if (xeTai != null) {
            xeTais.remove(xeTai);
            return xeTai;
        }
        return null;
    }

    @Override
    public void hienThiTheoBienSoXe(String bienSoXe) {
        for (XeTai xeTai : xeTais) {
            if (xeTai.getBienSoXe().equals(bienSoXe)) {
                System.out.println(xeTai);
            }
        }
    }

    @Override
    public void hienThiTatCa() {
        for (XeTai xeTai : xeTais) {
            System.out.println(xeTai);
        }
    }
}
