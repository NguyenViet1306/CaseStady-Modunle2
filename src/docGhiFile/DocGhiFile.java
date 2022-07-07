package docGhiFile;


import Service.QuanLyOto;
import Service.QuanLyXeMay;
import Service.QuanLyXeTai;
import object.Oto;
import object.PhuongTien;
import object.XeMay;
import object.XeTai;
import taiKhoan.TaiKhoan;

import java.io.*;

import java.nio.file.Files;
import java.util.ArrayList;

public class DocGhiFile {


    File fileTaiKhoan = new File("D:\\CODEGYM\\Module2\\CaseStudy\\src\\docGhiFile\\FileLuuTaiKhoan.txt");
    File fileOto = new File("D:\\CODEGYM\\Module2\\CaseStudy\\src\\docGhiFile\\FileLuuDuLieuOto.txt");
    File fileXeMay = new File("D:\\CODEGYM\\Module2\\CaseStudy\\src\\docGhiFile\\FileLuuDuLieuXeMay.txt");
    File fileXeTai = new File("D:\\CODEGYM\\Module2\\CaseStudy\\src\\docGhiFile\\FileLuuDuLieuXeTai.txt");



    //* đọc ghi file tài khoản
    public void ghiTaiKhoan(ArrayList<TaiKhoan> taiKhoans) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileTaiKhoan));
            objectOutputStream.writeObject(taiKhoans);
            objectOutputStream.close();
        } catch (Exception e) {
            System.err.println("Không thể lưu thông tin tài khoản!");
        }
    }

    public ArrayList<TaiKhoan> docTaiKhoan() {
        try {
            ArrayList<TaiKhoan> taiKhoans;
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileTaiKhoan));
            taiKhoans = (ArrayList<TaiKhoan>) objectInputStream.readObject();
            objectInputStream.close();
            return taiKhoans;
        } catch (Exception e) {
            System.err.println("Không thể đọc thông tin tài khoản đã lưu!");
        }
        return new ArrayList<>();
    }



    //* Đọc ghi file Oto
    public void ghiFileOto(ArrayList<Oto> otos) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileOto));
            objectOutputStream.writeObject(otos);
            objectOutputStream.close();
        } catch (Exception e) {
            System.err.println("Không thể lưu thông tin Oto");
        }
    }

    public ArrayList<Oto> docFileOto() {
        ArrayList<Oto> otos = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileOto));
            otos = (ArrayList<Oto>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.err.println("Không thể đọc thông tin Oto đã lưu!");
        }
        return otos;
    }

    public void ghiXeMay(ArrayList<XeMay> xeMays) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileXeMay));
            objectOutputStream.writeObject(xeMays);
            objectOutputStream.close();
        } catch (Exception e) {
            System.err.println("Không thể lưu thông tin xe máy");
        }
    }

    public ArrayList<XeMay> docFileXeMay() {
        ArrayList<XeMay> xeMays = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileXeMay));
            xeMays = (ArrayList<XeMay>) objectInputStream.readObject();
            objectInputStream.close();
            return xeMays;
        } catch (Exception e) {
            System.err.println("Không thể đọc được thông tin xe máy");
        }
        return xeMays;
    }

    public void ghiXeTai(ArrayList<XeTai> xeTais) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileXeTai));
            objectOutputStream.writeObject(xeTais);
            objectOutputStream.close();
        } catch (Exception e) {
            System.err.println("Không thể lưu thông tin xe tải");
        }
    }

    public ArrayList<XeTai> docFileXeTai() {
        ArrayList<XeTai> xeTais = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileXeTai));
            xeTais = (ArrayList<XeTai>) objectInputStream.readObject();
            objectInputStream.close();
            return xeTais;
        } catch (Exception e) {
            System.err.println("Không thể đọc được thông tin xe tải");
        }
        return xeTais;
    }
}
