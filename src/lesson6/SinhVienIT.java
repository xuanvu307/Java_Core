package lesson6;

public class SinhVienIT extends SinhVienTechMaster {
    private double java;
    private double html;
    private double css;

    public SinhVienIT() {
    }


    public SinhVienIT(double java, double html, double css) {
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }


    @Override
    public double getDiem() {
        double diem = (java*2 + html + css) / 4;
        return diem;
    }

}
