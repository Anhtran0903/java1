package ThucPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTP {

private List<ThucPham> arr;

    public ListTP() {
        this.arr = new ArrayList<>();
    }
    public void  nhap(){

System.out.print("nhap kh ga- ");
        ThucPham  ga =new Ga();
        ga.nhap();
        this.arr.add(ga);

        System.out.print("nhap kh ca rot- ");
        ThucPham  carot =new CaRot();
        carot.nhap();
        this.arr.add(carot);
        System.out.print("nhap kh Hat sen- ");
        ThucPham  hatsen =new HatSen();
        hatsen.nhap();
        this.arr.add(hatsen);
        System.out.print("nhap kh tao do- ");
        ThucPham  taoDo =new TaoDo();
        taoDo.nhap();
        this.arr.add(taoDo);
        System.out.print("nhap kh nam dong co- ");
        ThucPham  NamDongCo =new NamDongCo();
        NamDongCo.nhap();
        this.arr.add(NamDongCo);

    }
    public  float tinhNangLuong(int flag){
            float sum =0;
            for(ThucPham a :this.arr){
                if(flag==1){
                    sum+= a.getKhoiLuong()/100.0f * a.getCarb();
                }else  if(flag==2){
                    sum+= a.getKhoiLuong()/100.0f * a.getCalo();
                }
                else  if(flag==3){
                    sum+= a.getKhoiLuong()/100.0f * a.getFat();
                }
                else  if(flag==4){
                    sum+= a.getKhoiLuong()/100.0f * a.getProtein();
                }
                else  if(flag==5){
                    sum+= a.getKhoiLuong()/100.0f * a.getFatBaoHoa();
                }
            }
            return sum*0.8f;
    }
public void cau2(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("nhap chi so carb: ");
        int carb =scanner.nextInt();
        float carb1 =tinhNangLuong(1);

    System.out.print("nhap chi so calo: ");
    int calo =scanner.nextInt();
    float calo1 =tinhNangLuong(2);

    System.out.print("nhap chi so Fat: ");
    int fat =scanner.nextInt();
    float fat1 =tinhNangLuong(3);
    System.out.print("nhap chi so protein: ");
    int protein =scanner.nextInt();
    float protein1 =tinhNangLuong(4);

    System.out.print("nhap chi so Fat bao hoa: ");
    int fatBh =scanner.nextInt();
    float fatBH1 =tinhNangLuong(5);
    if(carb>carb1){
        System.out.printf("can bo sung carb %f them  ", carb -carb1);
    }

    if(fat>fat1){
        System.out.printf("can bo sung fat  %f them ",fat-fat1);
    }
    if(protein>protein1){
        System.out.printf("can bo sung protein %f them ",protein-protein1);
    }
    if(calo>calo1){
        System.out.printf("can bo sung calo %f them ",calo-calo1);
    }
    if(fatBh>fatBH1){
        System.out.printf("can bo sung fatbh them ",fatBh-fatBH1);
    }


}
public float cau3(){
if(tinhNangLuong(2)-600>0){
    return 30*(tinhNangLuong(2)-600)/145.5f;
}else{
    return 0;
}

}

}
