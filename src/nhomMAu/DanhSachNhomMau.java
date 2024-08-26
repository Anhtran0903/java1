package nhomMAu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachNhomMau {
    private List<NhomMau> arr;
    public DanhSachNhomMau(){
        this.arr=new ArrayList<>();
    }

    public void nhap(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("moi ban nhap so luong: ");
        int n = scanner.nextInt();
        for(int i=0; i<n;i++){
                System.out.println("Nhap thong tin nguoi thu"+i+1);
                System.out.println("1. nhom O");
            System.out.println("2. nhom A");
            System.out.println("3. nhom B");
            System.out.println("4. nhom AB");
            System.out.print("chon nhom mau:");
            int flag =scanner.nextInt();
            if(flag==1){
                NhomMau x = new O();
                x.nhap();
                this.arr.add(x);
            }
            else  if(flag==2){
                NhomMau x = new A();
                x.nhap();
                this.arr.add(x);
            }
            else  if(flag==3){
                NhomMau x = new B();
                x.nhap();
                this.arr.add(x);
            }
            else  if(flag==4){
                NhomMau x = new AB();
                x.nhap();
                this.arr.add(x);
            }
        }
    }
    public void xuat(){
    for (NhomMau x:this.arr){
        x.xuat();
    }

    }


    public static void main(String[] args) {
        DanhSachNhomMau a =new DanhSachNhomMau();
        a.nhap();
        a.xuat();
    }
}
