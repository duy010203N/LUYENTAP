package Baitap;

import java.util.Scanner;

public class Hoaqua {
    public double giaban;
    public double soluong;
    public String nguongocxuatxu;
    public String ngaynhap;

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }
    public Hoaqua(double giaban, String nguongocxuatxu, String ngaynhap, double soluong){
        this.giaban= giaban;
        this.nguongocxuatxu = nguongocxuatxu;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }
    public double getGiaban(){
        return giaban;
    }
    public void setGiaban(double giaban){
        this.giaban = giaban;
    }
    public String getnguonggocxuatxu(){
        return nguongocxuatxu;
    }
    public String getNgaynhap(){
        return ngaynhap;
    }
    public void setNgaynhap(String ngaynhap){
        this.ngaynhap = ngaynhap;
    }
    void nhap()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap gia ban");
        giaban =sc.nextDouble();
        System.out.println("Nhap nguon goc xuat xu");
        nguongocxuatxu =sc.nextLine();
        System.out.println("Nhap ngay nhap");
        ngaynhap =sc.nextLine();
        System.out.println("Nhap so luong");
        soluong =sc.nextDouble();  
    }
    void thanhtien(double thanhtien)
    {
        thanhtien =soluong*giaban;
    }
}
class Quacam extends Hoaqua
{
    
    public Quacam(double giaban, String nguongocxuatxu, String ngaynhap, double soluong) {
        super(giaban, nguongocxuatxu, ngaynhap, soluong);
    }
    public String mausac;
    public String dochuangot;
    public String loaicam;
}
class Quatao extends Hoaqua{

    public Quatao(double giaban, String nguongocxuatxu, String ngaynhap, double soluong) {
        super(giaban, nguongocxuatxu, ngaynhap, soluong);
    }
    public String mausac;
    public String loaitao;
}
class Camsanh extends Quacam{
           
    public Camsanh(double giaban, String nguongocxuatxu, String ngaynhap, double soluong) {
        super(giaban, nguongocxuatxu, ngaynhap, soluong);
    }
    public String ngot;
}
class CamCaoPhong extends Quacam{
           
    public CamCaoPhong(double giaban, String nguongocxuatxu, String ngaynhap, double soluong) {
        super(giaban, nguongocxuatxu, ngaynhap, soluong);
    }
    public String chua;
}
class main
{
    public static void main(String[]arg)
    {
        Hoaqua hq =new Hoaqua();
        hq.nhap();
    }
}

           
