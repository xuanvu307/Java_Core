package lesson79;

public class Members {
    private static int id=1000;
    private String name;
    private String birthday;
    private String job;

    public Members() {
        id++;
    }

    public static int getId() {
        return id;
    }


    public String getName(String s) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    @Override
    public String toString() {
        return "Members{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
