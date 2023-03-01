package bai2;

public class KyThuat extends NhanVien{
    public String chuyenNganh;

    public KyThuat() {
    }

    @Override
    public String moTaCongViec() {
        return "Cai Dat";
    }

    public KyThuat(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public KyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "KyThuat[" +
                " maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ",chuyenNganh='" + chuyenNganh + '\'' +
                ']';
    }
}
