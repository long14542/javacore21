package buoi6.Sinhvien;

public class SinhVienBiz extends SinhVienTechMaster{
    private double marketting;
    private double sales;

    public SinhVienBiz(String name, String major, double marketting, double sales) {
        super(name, major);
        this.marketting = marketting;
        this.sales = sales;
    }

    @Override
    public double getDiem() {
        return (2*marketting + sales)/3;
    }

    @Override
    public String xuat() {
        return "Hoc luc cua sinh vien IT la: " + getHocluc(getDiem());
    }
}
