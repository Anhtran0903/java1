package ThucPham;

import java.util.Scanner;

public class ThucPham {

    protected long Carb;
    protected  long Fat;
    protected long FatBaoHoa;
    protected  long Protein;
    protected  long Calo;
    protected  long KhoiLuong;

    public ThucPham() {
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("khoi luong: ");
        this.KhoiLuong = scanner.nextInt();
}

    public long getCarb() {
        return Carb;
    }

    public void setCarb(long carb) {
        Carb = carb;
    }

    public long getFat() {
        return Fat;
    }

    public void setFat(long fat) {
        Fat = fat;
    }

    public long getFatBaoHoa() {
        return FatBaoHoa;
    }

    public void setFatBaoHoa(long fatBaoHoa) {
        FatBaoHoa = fatBaoHoa;
    }

    public long getProtein() {
        return Protein;
    }

    public void setProtein(long protein) {
        Protein = protein;
    }

    public long getCalo() {
        return Calo;
    }

    public void setCalo(long calo) {
        Calo = calo;
    }

    public long getKhoiLuong() {
        return KhoiLuong;
    }

    public void setKhoiLuong(long khoiLuong) {
        KhoiLuong = khoiLuong;
    }
}
