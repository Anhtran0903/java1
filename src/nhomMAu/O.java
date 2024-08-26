package nhomMAu;

public class O extends NhomMau{
    public O(){
        this.loaiMau=_O;
    }

    public  boolean KiemtraDitruyen(NhomMau cha ,NhomMau con) {
        if (cha.getLoaiMau() == _A) {
            if (con.getLoaiMau() == _A || con.getLoaiMau() == _O) {
                return true;
            }
        } else if (cha.getLoaiMau() == _B) {
            if (con.getLoaiMau() == _B || con.getLoaiMau() == _O) {
                return true;
            }
        } else if (cha.getLoaiMau() == _AB) {
            if (con.getLoaiMau() == _A || con.getLoaiMau() == _B) {
                return true;
            }
        }

        else if (cha.getLoaiMau() == _O) {
            if (con.getLoaiMau() == _O) {
                return true;
            }
        }
        return false;
    }


    public boolean KiemTraNhomMau(NhomMau nhan) {

            return true;

    }
}
