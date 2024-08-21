package geometry;

public class HinhChuNhat extends HinhHoc{
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public static double chuViHinhChuNhat(HinhChuNhat hinhChuNhat) {
        return (hinhChuNhat.getChieuDai() + hinhChuNhat.getChieuRong()) * 2;
    }

    public static double dienTichHinhChuNhat(HinhChuNhat hinhChuNhat) {
        return hinhChuNhat.getChieuDai() * hinhChuNhat.getChieuRong();
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
