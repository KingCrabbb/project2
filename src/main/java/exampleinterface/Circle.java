package exampleinterface;

import java.util.Scanner;

public class Circle implements Shape {
    private double banKinh;

    public Circle() {
    }

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2*Math.PI*banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*banKinh*banKinh;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "banKinh=" + banKinh +
                '}';
    }

    @Override
    public void inThongSo(Scanner scanner) {
        System.out.println("Nhap ban kinh : ");
        banKinh = Double.parseDouble(scanner.nextLine());
    }
}
