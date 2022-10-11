package lesson6;

public class SinhVienBiz extends SinhVienTechMaster{
    private double maketing;
    private double sales;

    public SinhVienBiz(double maketing, double sales) {
        this.maketing = maketing;
        this.sales = sales;
    }

    public double getMaketing() {
        return maketing;
    }

    public void setMaketing(double maketing) {
        this.maketing = maketing;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }



    @Override
    public double getDiem() {
        double diem = (maketing*2 + sales)/3;
        return diem;
    }

    @Override
    public void view() {
        super.view();
    }
}
