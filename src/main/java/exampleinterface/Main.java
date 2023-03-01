package exampleinterface;

import java.util.*;

class DescendingComparator implements Comparator<Double> {
    public int compare(Double a, Double b) {
        return b.compareTo(a);
    }
}
public class Main {
    public static void main(String[] args) {

        /*
        ====== Menu hinh hoc ======
        1. Thêm hình học (tối đa 100 hình)
        2. In rq tất cả các hình
        3. In ra hình có diện tích lớn nhất
        4. In ra hình có diện tích bé nhất
        5. Sắp xếp theo chu vi tăng dần hoặc giảm dần
        */
        Scanner sc = new Scanner(System.in);
        List<Shape> shape = new ArrayList<>();
        List<Double> shape1 = new ArrayList<>();
         do {
            System.out.println("=====Menu Hình Học ======\n"+
                    "        1. Thêm hình học (tối đa 100 hình)\n" +
                    "        2. In ra tất cả các hình\n" +
                    "        3. In ra hình có diện tích lớn nhất\n" +
                    "        4. In ra hình có diện tích bé nhất\n" +
                    "        5. Sắp xếp theo chu vi tăng dần hoặc giảm dần"
            );
            int option = Integer.parseInt(sc.nextLine());
            if(option<0||option>5){
                System.out.println("Khong hop le : ");
            }
            switch (option){
                case 1:
                    System.out.println("Chọn Hình muốn thêm ");
                    System.out.println("1.Hình tròn ");
                    System.out.println("2.Hình Vuông");
                    System.out.println("3.Hình Chũ Nhật");

                    int optionehinh = Integer.parseInt(sc.nextLine());
                    Shape h =null;
                    switch (optionehinh){
                        case 1:
                            h = new Circle();
                            break;
                        case 2:
                            h = new Square();
                            break;
                        case 3:
                            h = new Rectangle();
                            break;
                    }
                    h.inThongSo(sc);
                    shape.add(h);
                    break;
                case 2:
                    for(int i=0;i<shape.size();i++){
                        System.out.println(shape.get(i));
                    }
                    break;
                case 3:
                    for (Shape x: shape) {
                        for (int i = 0 ; i<shape.size();i++){
                          shape1.add(x.tinhDienTich());
                        }
                        System.out.println("Dien tich cac hinh la "  + x.tinhDienTich());
                    }
                    double max = shape1.get(0);
                    int vt = -1;
                    for (Double y:shape1) {
                        if(max<y){
                            max = y;
                            vt++;
                        }
                    }
                    System.out.println("Dien tich lon nhat : "+max);
 //                   Collections.sort(shape1, new DescendingComparator());
   //                 System.out.println("Dien tich lon nhat :"+ shape1.get(shape1.size()));
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("ket thuc chuong trinh");
                    System.exit(0);
                    break;
            }

        }
        while (true);
    }
}
