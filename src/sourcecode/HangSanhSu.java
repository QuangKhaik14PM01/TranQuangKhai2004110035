package sourcecode;

import java.util.Date;

public class HangSanhSu extends HangHoa {
    private String nhaSanXuat;
    private Date ngayNhapKho;
    public HangSanhSu(){}
    
   
   
   
   
   
   
   



    public String getNhaSanXuat() {
        return nhaSanXuat;
    }











    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }











    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }











    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }











    public HangSanhSu(String maHangHoa, String tenHangHoa, int soLuong, double donGia, String nhaSanXuat,
            Date ngayNhapKho) {
        super(maHangHoa, tenHangHoa, soLuong, donGia);
        setNgayNhapKho(ngayNhapKho);
        setNhaSanXuat(nhaSanXuat);
    }


    public String toString(){
        return "HangSanhSu"+super.toString()+"ngay nhap kho"+this.ngayNhapKho+"nha san xuat"+this.nhaSanXuat+"danh gia" + danhGia()+ "Vat" +VAT();
    }




    @Override
    public String danhGia() {
        if(this.getSoLuong()>50){
            return"ban cham";
        }
        return null;
    }
    @Override
    public double VAT() {
        // TODO Auto-generated method stub
        return this.getDonGia()*this.getSoLuong()*0.01;
    }
    
}
