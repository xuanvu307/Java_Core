package lesson6;

public abstract class SinhVienTechMaster {
    private String hoTen;
    private String nganh;


    public abstract double getDiem();


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }




    public String getHocLuc(){
        if (getDiem() < 5){
            return "yeu";
        } else if (getDiem() >= 5 && getDiem() <6.5){
            return "TB";
        } else if (getDiem() >=6.5 && getDiem() < 7.5){
            return "kha";
        } else {
            return "gioi";
        }
    }
    public void view(){
        System.out.println("HT " + getHoTen());
        System.out.println("Nganh " + getNganh());
        System.out.println(getDiem());
        System.out.println(getHocLuc());
    }


}
