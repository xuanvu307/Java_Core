package lesson79;

import java.util.List;

public class HoDan {
    private String address;
    private int soTV;
    private List<Members> members;

    public HoDan(String address, int soTV) {
        this.address = address;
        this.soTV = soTV;
    }

    public HoDan() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSoTV() {
        return soTV;
    }

    public void setSoTV(int soTV) {
        this.soTV = soTV;
    }

    public List<Members> getMembers() {
        return members;
    }

    public void setMembers(List<Members> members) {
        this.members = members;
    }
}
