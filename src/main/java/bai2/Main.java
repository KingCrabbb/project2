package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KyThuat kyThuat1 = new KyThuat("TP1234", "Nguyen Van A", "01/01/1990", "Ha Noi", "Cong nghe thong tin");
        System.out.println("Thong tin ky thuat 1: ");
        System.out.println(kyThuat1.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin ky thuat 2: ");
        System.out.print("Ma nhan vien: ");
        String maNV = scanner.nextLine();
        System.out.print("Ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nam sinh: ");
        String namSinh = scanner.nextLine();
        System.out.print("Dia chi: ");
        String diaChi = scanner.nextLine();
        System.out.print("Chuyen nganh: ");
        String chuyenNganh = scanner.nextLine();

        KyThuat kyThuat2 = new KyThuat(maNV, hoTen, namSinh, diaChi, chuyenNganh);
        System.out.println("Thong tin ky thuat 2: ");
        System.out.println(kyThuat2.toString());
    }
}
