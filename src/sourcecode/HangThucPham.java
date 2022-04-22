package sourcecode;

import java.util.Date;

public class HangThucPham extends HangHoa {
    private String nhaCungCap;
    private Date ngaySanXuat, ngayHetHan;

    public HangThucPham() {
    }

    

    public String getNhaCungCap() {
        return nhaCungCap;
    }



    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }



    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }



    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }



    public Date getNgayHetHan() {
        return ngayHetHan;
    }



    public void setNgayHetHan(Date ngayHetHan) {
       if(ngayHetHan!=ngaySanXuat){
           System.out.println("ngay het han phai sau ngay san xuat");
           return;
       }
       this.ngayHetHan = ngayHetHan;
    }



    public HangThucPham(String maHangHoa, String tenHangHoa, int soLuong, double donGia, String nhaCungCap,
            Date ngaySanXuat, Date ngayHetHan) {
        super(maHangHoa, tenHangHoa, soLuong, donGia);
       setNhaCungCap(nhaCungCap);
       setNgayHetHan(ngayHetHan);
       setNgaySanXuat(ngaySanXuat);
    }

     public String toString(){
         return"hang thuc pham " + super.toString() + "nha cung cap " + this.nhaCungCap + "ngay san xuat" + this.ngaySanXuat+"ngay het hang"+this.ngayHetHan+"danh gia"+danhGia()+"Vat"+VAT();
     }

    @Override
    public String danhGia() {
        if(this.getSoLuong()>0&&getNgayHetHan().before(new Date())){
         return"kho ban";
            
        }
        return null;
      
    }

    @Override
    public double VAT() {
        
        return this.getDonGia()*this.getSoLuong()*0.005;
    }

}
