package lesson6;

public class ChuNhat {
    private int dai;
    private int rong;

    public ChuNhat() {
    }

    public ChuNhat(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }

//___________________________________________-

    public int getDai(int dai) {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong(int rong) {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }
    //______________________________-



    public int chuVi(){
        System.out.println("chuvi" +(dai+rong)*2);
     return chuVi();
    }
    public int dienTich(){
        System.out.println("dientich" +(dai*rong));
        return dienTich();
    }

    public void display(){
        System.out.println(dai+rong+chuVi()+dienTich());
    }

}
