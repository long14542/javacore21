package bai5.bt3;

public class Hinhvuong extends Hinhhoc {
    private double canh;


    public Hinhvuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double chuVi() {
        return 4*4;
    }

    @Override
    public double dienTich() {
        return Math.pow(4, 2);
    }
}
