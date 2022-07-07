package Service;

import object.Oto;

import java.io.Serializable;
import java.util.ArrayList;

public class QuanLyOto implements CRUDService<Oto>, Serializable {
    private ArrayList<Oto> otos = new ArrayList<>();

    public ArrayList<Oto> getOtos() {
        return otos;
    }

    public void setOtos(ArrayList<Oto> otos) {
        this.otos = otos;
    }

    @Override
    public Oto layBienSoXe(String bienSoXe) {
        for (Oto oto : otos) {
            if (oto.getBienSoXe().equals(bienSoXe)) {
                return oto;
            }
        }
        return null;
    }

    @Override
    public Oto them(Oto oto) {
        otos.add(oto);
        return oto;
    }

    @Override
    public void capNhap(Oto oto) {
        for ( int i = 0 ; i < otos.size() ; i++){
            if ( otos.get(i).getBienSoXe().equals(oto.getBienSoXe())){
                otos.set(i , oto);
            }
        }

    }

    @Override
    public Oto xoaTheoBienSoXe(String bienSoxe) {
        Oto oto = null;
        for (Oto oto1: otos){
            if (oto1.getBienSoXe().equals(bienSoxe)){
                oto = oto1;
            }
        }
        if (oto != null){
            otos.remove(oto);
            return  oto;
        }
        return null;
    }

    @Override
    public void hienThiTheoBienSoXe(String bienSoXe) {
        for (Oto oto : otos){
            if (oto.getBienSoXe().equals(bienSoXe) ){
                System.out.println(oto);
            }
        }
    }

    @Override
    public void hienThiTatCa() {
        for (Oto oto : otos){
            System.out.println(oto);
        }
    }
}
