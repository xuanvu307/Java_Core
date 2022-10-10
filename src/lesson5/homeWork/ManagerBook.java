package lesson5.homeWork;

import java.util.Scanner;

public class ManagerBook{
    private int idBook;
    private String nameBook;
    private String authorBook;
    private String categoryBook;
    private String companyBook;
    private int yearPublishBook;

    public ManagerBook() {
    }

    public ManagerBook(int idBook, String nameBook, String authorBook, String categoryBook, String companyBook, int yearPublishBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.categoryBook = categoryBook;
        this.companyBook = companyBook;
        this.yearPublishBook = yearPublishBook;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public String getCategoryBook() {
        return categoryBook;
    }

    public void setCategoryBook(String categoryBook) {
        this.categoryBook = categoryBook;
    }

    public String getCompanyBook() {
        return companyBook;
    }

    public void setCompanyBook(String companyBook) {
        this.companyBook = companyBook;
    }

    public int getYearPublishBook() {
        return yearPublishBook;
    }

    public void setYearPublishBook(int yearPublishBook) {
        this.yearPublishBook = yearPublishBook;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public String toString() {
        return "ManagerBook{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", categoryBook='" + categoryBook + '\'' +
                ", companyBook='" + companyBook + '\'' +
                ", yearPublishBook=" + yearPublishBook +
                '}';
    }

//    public String searchByName(){
//        System.out.println("moi ban nhap sach can tim");
//        String search = sc.nextLine();
//        while (true){
//            if (search.equals(nameBook)){
//                System.out.println(idBook + nameBook + authorBook);
//                return nameBook;
//            } else {
//                System.out.println("no");
//                return nameBook;
//            }
//        }
//    }



    public void display(){

    }
}