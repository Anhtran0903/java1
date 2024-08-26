package nhomMAu;

import java.util.Scanner;

public abstract class NhomMau {
    protected  boolean  rh;
    protected int loaiMau;

    public static final int _O=1;
    public static final int _A=2;
    public static final int _B=3;
    public static final int _AB=4;

    public NhomMau() {
    }

    public void nhap(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap RH: ");
        this.rh = scanner.nextBoolean();




    }
    public void xuat(){
        System.out.println("------------------------");
        if(this.loaiMau==_O)System.out.print("O");
        if(this.loaiMau==_A)System.out.print("A");
        if(this.loaiMau==_B)System.out.print("B");
        if(this.loaiMau==_AB)System.out.print("AB");

        if(rh==false){System.out.println("-");}
        else System.out.println("+");
        System.out.println("------------------------");
    }

    public abstract boolean KiemtraDitruyen(NhomMau cha ,NhomMau con);

    public abstract boolean KiemTraNhomMau(NhomMau nhan);

public boolean KiemTraRh(NhomMau nhan){
    if(this.rh==true){
        return true;
    } else if (this.rh==false) {
        return true;
    }
    return false;
}

public boolean KiemTranChoNhan(NhomMau nhan){
    boolean nhomMau =KiemTraNhomMau(nhan);
    boolean rh = KiemTraRh(nhan);

    if(nhomMau && rh){
        return true;

    }else{
        return false;
    }
}
    public boolean isRh() {
        return rh;
    }

    public void setRh(boolean rh) {
        this.rh = rh;
    }

    public int getLoaiMau() {
        return loaiMau;
    }

    public void setLoaiMau(int loaiMau) {
        this.loaiMau = loaiMau;
    }
}
