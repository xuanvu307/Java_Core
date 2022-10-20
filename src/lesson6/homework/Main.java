package lesson6.homework;


import java.awt.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        MovieModel movieModel = new MovieModel();
        SeriesModel seriesModel= new SeriesModel();

        // Tạo 2 arraylist để quản lý film theo series và theo movie
        //Tạo thêm 1 arraylist film gồm toàn bộ film theo series và theo movie

        ArrayList<Film> movieFilm = new ArrayList<>();
        ArrayList<Film> seriesFilm = new ArrayList<>();
        ArrayList<Film> films = new ArrayList<>();

        //có các lựa chọn để người dùng thực hiện
        // chương trình kết thúc khi nhập 0



        int number =0;
        do {
            System.out.println("++++++++MENU++++++++\n");
            System.out.println(" 1.. Add film");
            System.out.println(" 2.. Print film");
            System.out.println(" 3.. Search film");
            System.out.println(" 4.. Lower ranking film");
            System.out.println(" 5.. COMEDY lower ranking film");
            System.out.println(" 0.. Exit");
            number = sc.nextInt();
            switch (number){
                case 1:

                    /*chọn số film để add vào movie hoặc theo series
                     * film được add sẽ được add vào theo list add và cả vào list film
                     */

                    System.out.println("choose number: ");
                    System.out.println(" 1.. Add movie\n 2.. Add series");
                    int numberAdd = sc.nextInt();
                    switch (numberAdd){
                        case 1:
                            System.out.println("enter number film add: ");
                            int numberFilm = sc.nextInt();
                            for (int i=0; i<numberFilm;i++){
                                Film film = movieModel.inputMovie();
                                movieFilm.add(film);
                                films.add(film);
                                System.out.println("___________OK___________\n");
                            }
                            break;
                        case 2:
                            System.out.println("enter number film");
                            numberFilm = sc.nextInt();
                            for (int i=0; i<numberFilm;i++){
                                Film film = seriesModel.inputSeries();
                                seriesFilm.add(film);
                                films.add(film);
                                System.out.println("___________OK___________\n");
                            }
                            break;
                        default:
                            System.out.println("\n_____number wrong_____\n");

                    }
                    break;
                case 2:

                    /*in film ra màn hình
                     * 1 là in thể loại movie
                     * 2 là in theo series
                     * 3 là in tất cả film
                     */
                    System.out.println("choose number: ");
                    System.out.println(" 1.. Print movie film\n 2.. Print series film\n 3.. Print all film");
                    int numberCheck = sc.nextInt();
                    if (numberCheck == 1){
                        System.out.println("Movie film all: \n" +movieFilm.toString());
                    }else if(numberCheck == 2) {
                        System.out.println("Series film : \n" + seriesFilm.toString());
                    }else if(numberCheck == 3) {
                        System.out.println("All film: \n"+films.toString());
                    }
                    break;
                case 3:

                    /* tìm kiếm film
                     * nhập từ bất kỳ để tìm kiếm và in ra danh sách film
                     * nếu không có film nào thỏa mãn sẽ trả về
                     */

                    sc.nextLine();
                    System.out.println("enter key search: ");
                    String keySearch = sc.nextLine();
                    int check = 0;
                    for (int i = 0; i < films.size(); i ++) {
                        if (keySearch.toLowerCase().contains(films.get(i).getTitle().toLowerCase())
                                || films.get(i).getTitle().toLowerCase().contains(keySearch.toLowerCase()) ){
                            check++;
                            System.out.println(check + " : " +films.get(i).toString());
                        }
                    }
                    if (check == 0){
                        System.out.println("____no result____");
                    }
                    break;
                case 4:

                    /* sắp xếp film theo rank
                     *trả về kết quả 3 film có rank thấp nhất
                     */
                    System.out.println("3 film lower ranking: ");
                    Collections.sort(films, new Comparator<Film>() {
                        @Override
                        public int compare(Film r1, Film r2) {
                            if (r1.getRanking() < r2.getRanking()){
                                return -1;
                            } else if (r1.getRanking()==r2.getRanking())
                                return 0;
                            else {
                                return 1;
                            }
                        }
                    });

                    for (int i = 0 ; i < 3; i++){
                        System.out.println(films.get(i));
                    }
                    break;
                case 5:

                    /* sắp xếp film theo rank
                     * in ra film thể loại COMEDY xếp hạng thấp nhất
                     */

                    System.out.println("COMEDY bad film: ");
                    Collections.sort(films, new Comparator<Film>() {
                        @Override
                        public int compare(Film r1, Film r2) {
                            if (r1.getRanking() < r2.getRanking()){
                                return -1;
                            } else if (r1.getRanking()==r2.getRanking())
                                return 0;
                            else {
                                return 1;
                            }
                        }
                    });

                    for (int i = 0; i < films.size(); i ++) {
                        if (films.get(i).getCategory().equals(Constant.CATEGORY.COMEDY)) {
                            System.out.println(films.get(i).toString());
                            break;
                        } else {
                            System.out.println("\n -----> no category comedy on list");
                        }
                    }
                    break;
                case 0:

                    // nhấn 0 thoát chương trình

                    System.out.println("Exit");
                    break;
                default:

                    // nhập số khác báo nhập sai số và trử về trang chủ

                    System.out.println("----> number wrong <----");

            }

        }while (number !=0);
    }
}