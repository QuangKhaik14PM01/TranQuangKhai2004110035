package sourcecode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachHangHoa {
    List<HangHoa> danhSach = new ArrayList<HangHoa>();
    

//1 thêm hàng hóa
    public void themHangHoa(HangHoa hanghoa){
        for (HangHoa hanghoa1 : danhSach) {
            if(hanghoa1.getTenHangHoa().equals(hanghoa.getTenHangHoa())){
                System.out.println("khong duoc trung ma hang");
                return;
            }
     
        }
    danhSach.add(hanghoa);
    
    }
    SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
public void themHang(){
    try {
        
        danhSach.add(new HangThucPham("200411", "cu cai", 2004, 50000.4, "cong ty nuoc nga", ngayVietNam.parse("10/03/2022"), ngayVietNam.parse("10/03/2022")));
        danhSach.add(new HangThucPham("200512", "ca rot", 2005, 50000.3, "cong ty nuoc ao", ngayVietNam.parse("11/02/2022"), ngayVietNam.parse("11/03/2022")));
        danhSach.add(new HangThucPham("200613", "ca tim", 2006, 50000.5, "cong ty nuoc mi", ngayVietNam.parse("12/04/2022"), ngayVietNam.parse("12/05/2022")));
        danhSach.add(new HangThucPham("200714", "ca thu", 2007, 50000.6, "cong ty nuoc duc", ngayVietNam.parse("01/03/2022"), ngayVietNam.parse("10/04/2022")));
        danhSach.add(new HangDienMay("20451", "may lanh", 3000, 150000000, 87.5, 13));
        danhSach.add(new HangDienMay("20452", "tu lanh", 5000, 320000000, 400, 24));
        danhSach.add(new HangDienMay("20453", "ti vi", 4000, 520000000, 300, 36));
        danhSach.add(new HangDienMay("20454", "quat", 6000, 2000000, 180, 5));
        danhSach.add(new HangSanhSu("21005", "chen", 1000, 20000, "công ty việt nam", ngayVietNam.parse("20/05/2022")));
        danhSach.add(new HangSanhSu("31005", "dia", 2000, 30000, "công ty việt nam", ngayVietNam.parse("20/06/2022")));
        danhSach.add(new HangSanhSu("41005", "to", 3000, 40000, "công ty việt nam", ngayVietNam.parse("20/0/2022")));
        
        
        

    } catch (Exception e) {
        //TODO: handle exception
    }
}
//2 xóa hàng hóa
public boolean xoaHangHoa(HangHoa hanghoa){
   return danhSach.remove(hanghoa);
}
//3 sửa hàng hóa
public void suaHangHoa(HangHoa hanghoa, int vitri ){
danhSach.set(vitri, hanghoa);
}
// in danh sách
public void inHangHoa(){
    for (HangHoa hangHoa : danhSach) {
        System.out.println(hangHoa);
    }
}
//4 tìm kiếm dựa vào mã hàng hóa
public void timkiemtheoMaHangHoa(String maHangHoa){
    for (HangHoa hangHoa : danhSach) {
        if(hangHoa.getMaHangHoa()==maHangHoa){
            System.out.println(hangHoa);
        }
    }
}

// sắp xếp  danh sách hàng hóa theo giá trị từ cao đến thấp
public void sapxephanghoagiacaodenthap(){
    Collections.sort(this.danhSach, new Comparator<HangHoa>() {

        @Override
        public int compare(HangHoa sp1, HangHoa sp2) {
            if(sp1.getDonGia()<sp2.getDonGia()){
                return 1;
            }else if(sp1.getDonGia()>sp2.getDonGia()){
                return -1;
            }else{
                return 0;
            }
        }});}
 // sắp xếp danh sách sản phẩm theo giá trị từ cao đến thấp
 public void sapxephanghoagiathapdencao() {
    Collections.sort(this.danhSach, new Comparator<HangHoa>() {
        @Override
        public int compare(HangHoa sp1, HangHoa sp2) {
            if(sp1.getDonGia()>sp2.getDonGia()) {
                return 1;
            }else if(sp1.getDonGia()<sp2.getDonGia()) {
                return -1;
            }else {
                return 0;
            }
        }	
    });
}       
        
    
//Lưu vào file 

public void luuHangHoavaofile(String tenFile){
    try {
        FileOutputStream outFile = new FileOutputStream(tenFile);
        ObjectOutputStream objectOut = new ObjectOutputStream(outFile);


        objectOut.writeObject(danhSach);
        objectOut.close();
    }catch (IOException e){}
}

}
