package lesson5.homework;

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
//    __________begin setter and getter____________

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


    //________________end getter and setter_______________________
    Scanner sc = new Scanner(System.in);


    @Override
    public String toString() {
        return "id book = " + idBook +
                ", name book = " + nameBook  +
                ", author Book = " + authorBook +
                ", category Book = " + categoryBook  +
                ", company Book = " + companyBook  +
                ", year Publish Book = " + yearPublishBook ;
    }


}