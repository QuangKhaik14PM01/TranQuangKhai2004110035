package sourcecode;

public class HangDienMay extends HangHoa{
    private double congSuat;
    private int baoHanh;
   public HangDienMay(){}
   
   


    public double getCongSuat() {
    return congSuat;
}




public void setCongSuat(double congSuat) {
    if(congSuat<0){
        System.out.println("khong co cong suat nhu vay");
    return;
    }
    this.congSuat = congSuat;
}




public int getBaoHanh() {
    return baoHanh;
}




public void setBaoHanh(int baoHanh) {
   if(baoHanh<0){
       System.out.println("khong duoc de bao hanh nhu vay");
       return;
   }
   this.baoHanh = baoHanh;
}




    public HangDienMay(String maHangHoa, String tenHangHoa, int soLuong, double donGia, double congSuat, int baoHanh) {
    super(maHangHoa, tenHangHoa, soLuong, donGia);
    setBaoHanh(baoHanh);
    setCongSuat(congSuat);}

  public String toString(){
      return "hang dien may"+super.toString()+"bao hanh" +this.baoHanh+"cong suat"+this.congSuat+"danh gia"+danhGia()+"Vat"+VAT();
  }

    @Override
    public String danhGia() {
        if(this.getSoLuong()<3){
          return"ban duoc";
        }

        
        return null;
    }
    @Override
    public double VAT() {
        // TODO Auto-generated method stub
         return this.getDonGia()*this.getSoLuong()*0.01;
    }

    
}
