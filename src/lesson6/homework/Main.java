package lesson6.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieModel movieControl = new MovieModel();
        SeriesModel seriesControl = new SeriesModel();
        List<Film> movieFilm = new ArrayList<>();
        List<Film> seriesFilm = new ArrayList<>();





//
//        Film film2 = seriesControl.inputFilm();
//        seriesFilm.add(film2);
//        System.out.println(List.of(seriesFilm));
        int number =0;
        do {
            System.out.println("1..add film");
            System.out.println("2..print film");
            System.out.println("3.. search film");
            System.out.println("4..lower ranking film");
            System.out.println("5..COMEDY lower ranking film");
            System.out.println("0..Exit");
            number = sc.nextInt();
            switch (number){
                case 1:
                    System.out.println("1 add movie or 2 add series");
                    int numberAdd = sc.nextInt();
                    switch (numberAdd){
                        case 1:
                            System.out.println("enter number film");
                            int numberFilm = sc.nextInt();
                            for (int i=0; i<numberFilm;i++){
                                Film film = movieControl.inputFilm();
                                movieFilm.add(film);
                            }
                            break;
                        case 2:
                            System.out.println("enter number film");
                            break;
                        default:

                    }
                    break;
                case 2:
                    System.out.println(List.of(movieFilm));
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("number wrong");

            }


        }while (number !=0);


    }
}
