package lesson6.homework;

public class Film {
    private static String id;
    private String title;
    private Constant.CATEGORY category;
    private double ranking;

    public Film() {
    }

    public Film(String title, Constant.CATEGORY category, double ranking) {
        this.title = title;
        this.category = category;
        this.ranking = ranking;
    }
    //-----------begin getter and setter-----------

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Film.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Constant.CATEGORY getCategory() {
        return category;
    }

    public void setCategory(Constant.CATEGORY category) {
        this.category = category;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    //___________end setter and getter___________

}
