package sourcecode;

import java.io.Serializable;

public abstract class HangHoa implements Serializable {
  private   String maHangHoa, tenHangHoa;
  private int soLuong;
  private double donGia;
  public HangHoa(){}
public HangHoa(String maHangHoa, String tenHangHoa, int soLuong, double donGia) {
    setMaHangHoa(maHangHoa);
    setTenHangHoa(tenHangHoa);
    setSoLuong(soLuong);
    setDonGia(donGia);
}
public String getMaHangHoa() {
    return maHangHoa;
}
private void setMaHangHoa(String maHangHoa) {
    if(maHangHoa==null){
        System.out.println("khong duoc de trong");
        return;
    }
     this.maHangHoa=maHangHoa;
}
public String getTenHangHoa() {
    return tenHangHoa;
}
public void setTenHangHoa(String tenHangHoa) {
   if(tenHangHoa==null){
       System.out.println("khong duoc de trong");
       return;
   }
   this.tenHangHoa = tenHangHoa;
}
public int getSoLuong() {
    return soLuong;
}
public void setSoLuong(int soLuong) {
    if(soLuong<0){
        System.out.println("khong nhan duoc");
         return;
    }
     this.soLuong = soLuong;
}
public double getDonGia() {
    return donGia;
}
public void setDonGia(double donGia) {
    if(donGia<0){
        System.out.println("khong nhan duoc");
        return;
    }
    this.donGia = donGia;
}

@Override
public String toString() {
    return "HangHoa [donGia=" + this.donGia + ", maHangHoa=" + this.maHangHoa + ", soLuong=" + this.soLuong + ", tenHangHoa="
            + this.tenHangHoa + "]";
}
  public abstract String danhGia();
  public abstract double VAT();

    
}
