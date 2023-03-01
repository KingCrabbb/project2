package bai3;

public class Main {
    public static void main(String[] args) {
        VanBan vb = new VanBan("   abc dEf     Ghi");
        System.out.println(vb.demSoTu());
        System.out.println(vb.chuanHoaXau());
        System.out.println(vb.vietHoa());
        System.out.println(vb.vietThuong());
        System.out.println(vb.vietHoaChuDau());
    }
}
