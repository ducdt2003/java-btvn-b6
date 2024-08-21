package geometry;

public class HinhVuong extends HinhHoc {
    private double canh;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public static double chuViHinhVuong(HinhVuong hinhVuong){
        return hinhVuong.getCanh() * 4;
    }
    public static double dienTichHinhVuong(HinhVuong hinhVuong){
        return hinhVuong.getCanh() * hinhVuong.getCanh();
    }
    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                '}';
    }
}
