package lol.model;

import java.util.ArrayList;

public class School {
    private String qly;
    private String tc;
    private Class classA;


    public School() {
    }


    public School(String qly, String tc, Class classA) {
        this.qly = qly;
        this.tc = tc;
        this.classA = classA;
    }

    public String getQly() {
        return qly;
    }

    public void setQly(String qly) {
        this.qly = qly;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }


    public Class getClassA() {
        return classA;
    }

    public void setClassA(Class classA) {
        this.classA = classA;
    }

    @Override
    public String toString() {
        return "School{" +
                "qly='" + qly + '\'' +
                ", tc='" + tc + '\'' +
                ", classes=" + classA +
                '}';
    }
}
