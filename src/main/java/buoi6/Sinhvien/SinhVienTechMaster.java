package buoi6.Sinhvien;

public abstract class SinhVienTechMaster {
    private String name;
    private String major;

    public SinhVienTechMaster(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public abstract double getDiem();
    public String getHocluc(double point){
        if(point>=8) return "Gioi";
        else if (point <= 8 && point >=6.5) return "Kha";
        else if (point <= 6.5 && point >= 5) return "TB";
        return "Kem";
    }

    public abstract String xuat();

}
