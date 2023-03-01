package exampleinterface;

import java.util.Scanner;

public class Square implements Shape{
    private double canh;

    public Square() {
    }

    public Square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return canh*4;
    }

    @Override
    public double tinhDienTich() {
        return canh*canh;
    }

    @Override
    public String toString() {
        return "Square{" +
                "canh=" + canh +
                '}';
    }

    @Override
    public void inThongSo(Scanner scanner) {
        System.out.println("Nhap canh : ");
        canh = Double.parseDouble(scanner.nextLine());
    }
}
