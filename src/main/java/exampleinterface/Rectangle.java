package exampleinterface;

import java.util.Scanner;

public class Rectangle implements Shape{
    private double chieuDai;
    private double chieuRong;

    public Rectangle() {
    }

    public Rectangle(double chieuDai, double chieuRong) {
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

    @Override
    public double tinhChuVi() {
        return (chieuDai+chieuRong)*2;
    }

    @Override
    public double tinhDienTich() {
        return chieuRong*chieuDai;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }

    @Override
    public void inThongSo(Scanner scanner) {
        System.out.println("Nhap chieu dai : ");
        chieuDai = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap chieu rong : ");
        chieuRong = Double.parseDouble(scanner.nextLine());
    }
}
