package lesson6.homework;

import java.util.Scanner;

public class FilmModel {
    Scanner sc = new Scanner(System.in);
    public Film inputFilm(){
        Film film = new Film();
        System.out.println("enter id film:");
        film.setId(sc.nextLine());
        System.out.println("enter title file: ");
        film.setTitle(sc.nextLine());
        System.out.println("enter category: ");
        System.out.println("1..action");
        System.out.println("2..comedy");
        System.out.println("3..horror");
        System.out.println("4..documentary");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                film.setCategory(Constant.CATEGORY.ACTION);
                break;
            case 2:
                film.setCategory(Constant.CATEGORY.COMEDY);
                break;
            case 3:
                film.setCategory(Constant.CATEGORY.HORROR);
                break;
            default:
                film.setCategory(Constant.CATEGORY.DOCUMENTARY);
                break;
        }
        System.out.println("enter ranking: ");
        film.setRanking(sc.nextDouble());
        sc.nextLine();
        return film;
    }
}
