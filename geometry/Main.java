package geometry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        System.out.println("Nhập chiều dài và chiều rộng:");
        nhapHinhChuNhat(sc, hinhChuNhat);
        double chuVi = HinhChuNhat.chuViHinhChuNhat(hinhChuNhat);
        double dienTich = HinhChuNhat.dienTichHinhChuNhat(hinhChuNhat);
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);

        HinhVuong hinhvuong = new HinhVuong();
        System.out.println(" nhập cạnh của hình vuông ");
        int a = Integer.parseInt(sc.nextLine());
        hinhvuong.setCanh(a);
        double chuViHV = HinhVuong.chuViHinhVuong(hinhvuong);
        double dienTichHV = HinhVuong.dienTichHinhVuong(hinhvuong);
        System.out.println("Chu vi: " + chuViHV);
        System.out.println("Diện tích: " + dienTichHV);
    }
    public static void nhapHinhChuNhat(Scanner sc, HinhChuNhat hinhChuNhat) {
        System.out.println("Nhập chiều dài:");
        double chieuDai = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập chiều rộng:");
        double chieuRong = Double.parseDouble(sc.nextLine());
        hinhChuNhat.setChieuDai(chieuDai);
        hinhChuNhat.setChieuRong(chieuRong);
    }
}
