package ontap_oop.products.Service.btthem.entity;

public class Customer {
    private String name;
    private int sonha;
    private int maso;

    public Customer(String name, int sonha, int maso) {
        this.name = name;
        this.sonha = sonha;
        this.maso = maso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSonha() {
        return sonha;
    }

    public void setSonha(int sonha) {
        this.sonha = sonha;
    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", sonha=" + sonha +
                ", maso=" + maso +
                '}';
    }
}
