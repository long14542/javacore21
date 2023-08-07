package buoi6.bt1;

public class ChuNhat extends Shape{
    private double dai;
    private double rong;


    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }


    @Override
    public void printInfo() {
        System.out.println("Diện tích hcn là: " + getArea());
        System.out.println("Chu vi hcn là: " + perimeter());
    }

    @Override
    public double getArea() {
        return dai*rong;
    }

    @Override
    public double perimeter() {
        return 2*(dai+rong);
    }
}
