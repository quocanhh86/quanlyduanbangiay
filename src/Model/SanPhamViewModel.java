/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */ 
public class SanPhamViewModel {
   private String tenSanPham;
   private String kieuDang;
   private String size;
   private Float giaBan;
   private Integer soLuong;

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(String tenSanPham, String kieuDang, String size, Float giaBan, Integer soLuong) {
        this.tenSanPham = tenSanPham;
        this.kieuDang = kieuDang;
        this.size = size;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getKieuDang() {
        return kieuDang;
    }

    public void setKieuDang(String kieuDang) {
        this.kieuDang = kieuDang;
    }

    public Float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Float giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
   
    
}
