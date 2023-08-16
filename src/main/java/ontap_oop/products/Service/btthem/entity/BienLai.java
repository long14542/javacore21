package ontap_oop.products.Service.btthem.entity;

import java.util.ArrayList;

public class BienLai {
    private ArrayList<Customer> customers;
    private double chisocu;
    private double chisomoi;
    private int tienphaitra;

    public BienLai(ArrayList<Customer> customers, double chisocu, double chisomoi, int tienphaitra) {
        this.customers = customers;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
        this.tienphaitra = tienphaitra;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }

    public int getTienphaitra() {
        return tienphaitra;
    }

    public void setTienphaitra(int tienphaitra) {
        this.tienphaitra = tienphaitra;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "customers=" + customers +
                ", chisocu=" + chisocu +
                ", chisomoi=" + chisomoi +
                ", tienphaitra=" + tienphaitra +
                '}';
    }
}
