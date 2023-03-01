package bai3;

public class VanBan {
    private String text ;

    public VanBan() {
    }

    public VanBan(String text) {
        this.text = text;
    }
    public int demSoTu(){
        String[] words = this.text.split("\\s+");
        return words.length;
    }
    public String chuanHoaXau(){
        return text.trim().replaceAll("\\s+", " ");
    }
    public String vietHoa(){
        String text1=text.trim().replaceAll("\\s+", " ");
        return text1.toUpperCase();
    }
    public String vietThuong(){
        String text2=text.trim().replaceAll("\\s+", " ");
        return text2.toLowerCase();
    }
    public String vietHoaChuDau() {
        StringBuilder sd = new StringBuilder();
        String tx = text.trim().replaceAll("\\s+", " ");
        String[] wo = tx.split("\\s+");
        for (String word : wo) {
                sd.append(Character.toUpperCase(word.charAt(0)));
                sd.append(word.substring(1).toLowerCase());
                sd.append(" ");
                    /*
        String wo1 = wo[0];
        sd.append(Character.toUpperCase(wo1.charAt(0)));
        sd.append(wo1.substring(1).toLowerCase());
        sd.append(" ");
        for (int i =1 ;i<wo.length;i++){
            sd.append(wo[i]);
            sd.append(" ");
        }
         */
        }
        return sd.toString().trim();
    }
}
