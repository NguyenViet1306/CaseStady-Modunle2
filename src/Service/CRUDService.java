package Service;

public interface CRUDService<E> {
    E layBienSoXe(String bienSoXe);
    
    E them (E e);

    void capNhap (E e);

    E xoaTheoBienSoXe(String bienSoxe);

    void  hienThiTheoBienSoXe(String bienSoXe);

    void hienThiTatCa();
}
