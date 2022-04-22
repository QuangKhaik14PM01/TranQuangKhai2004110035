package sourcecode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HangHoaTestDrive {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new  Scanner(System.in);
        DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa();
        
        System.out.println("nhap ma hang hoa ");
        String maHangHoa = scanner.nextLine();
        System.out.println("nhap ten hang hoa ");
        String tenHangHoa = scanner.nextLine();
        System.out.println("nhap so luong ");
        int soLuong = scanner.nextInt();
        System.out.println("nhap don gia ");
        Double donGia = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("------Menu------");
        System.out.println("Vui lòng chọn chức năng");
        System.out.println
			(  " 1.	Them hang hoa.\n"
             + " 2. Xoa hang hoa.\n "
            +  " 3. Sua hang hoa.\n"
             + " 4. Tim kiem hang hoa\n"
              +" 5. Sap xep hang hoa tu cao den thap\n"
              +" 6. Sap xep hang hoa tu thap den cao\n"
              +" 7. In hang hoa \n"
              +" 8. Lưu File hang hoa\n" 
              +" 0. Thoát\n");
    
    
    int luachon =scanner.nextInt();
    SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
    HangHoa hangHoa;

    if(luachon==1){
        hangHoa = new HangThucPham(maHangHoa, tenHangHoa, soLuong, donGia, "công ty việc nam", ngayVietNam.parse("15/02/2022"),ngayVietNam.parse("15/03/2022"));
    } else{
      hangHoa = new HangDienMay(maHangHoa, tenHangHoa, soLuong, donGia, 80, 13);
    }
    hangHoa =new HangSanhSu(maHangHoa, tenHangHoa, soLuong, donGia, "công ty việt nam", ngayVietNam.parse("01/02/2022"));
    danhSachHangHoa.themHangHoa(hangHoa);
    danhSachHangHoa.themHang();

    
    
 if(luachon==2){
      System.out.println("nhap ten hang hoa");
      System.out.println("xoa hang hoa" + danhSachHangHoa.xoaHangHoa(hangHoa));
 if(luachon==3){
     System.out.println("nhap ten hang hoa");

     System.out.println("sua hang hoa ");
     danhSachHangHoa.suaHangHoa(hangHoa, 5);
 }     
 if (luachon==4){
     System.out.println("nhap hang hoa can tìm "); maHangHoa= scanner.nextLine();
     System.out.println("hang hoa da duoc tim kiem " );
     danhSachHangHoa.timkiemtheoMaHangHoa(maHangHoa);

 }   
 if (luachon==5){
     System.out.println("sap xep hang hoa tu cao den thap");
     danhSachHangHoa.sapxephanghoagiacaodenthap();
     danhSachHangHoa.inHangHoa();
     scanner.nextLine();
 }  if(luachon==6){
     System.out.println("sap xep hang hoa tu thap den cao");
     danhSachHangHoa.sapxephanghoagiathapdencao();
     danhSachHangHoa.inHangHoa();
     scanner.nextLine();
     if(luachon==7){
         System.out.println("in hang hoa");
         danhSachHangHoa.inHangHoa();
         scanner.nextLine();
         if(luachon==8){
             System.out.println("luu hang hoa vao file ");
             
            danhSachHangHoa.luuHangHoavaofile("QuangKhai.dat");
            scanner.nextLine();
            if(luachon==0){
                System.out.println("ket thuc");
            }
         }
         
     }
 }    
      
}
}}
