package bai5.bt3;

public class Hcn extends Hinhhoc{
    private double chieudai;
    private double chieurong;

    public Hcn(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }


    @Override
    public double chuVi() {

        return 2*(chieurong+chieudai);
    }

    @Override
    public double dienTich() {
        return chieudai*chieurong;
    }
}
