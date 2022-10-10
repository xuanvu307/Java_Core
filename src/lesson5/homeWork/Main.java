package lesson5.homeWork;

import java.util.Scanner;

public class Main {
    public static int found = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerBook managerBook = new ManagerBook();

        // Khởi tạo các giá trị

        ManagerBook maths = new ManagerBook(1, "maths", "vn", "learn", "BGD", 2012);
        ManagerBook music = new ManagerBook(2, "music", "vn", "refer", "BGD", 2019);
        ManagerBook english = new ManagerBook(3, "english", "vn", "learn", "BGD", 2016);
        ManagerBook geography = new ManagerBook(4, "geography", "vn", "refer", "BGD", 2021);
        ManagerBook history = new ManagerBook(5, "history", "vn", "learn", "BGD", 2022);

        /* chạy chương trình
        1 tìm kiếm theo tên
        2 tìm kiếm theo thể loại
        3 in sách xuất bản 2022
        4 thoát
         */
        ManagerBook[] arrayBook = {maths, music, english, geography, history};
        System.out.println("choose number 1, 2, 3 or 4 ");
        System.out.println("1. search book by name");
        System.out.println("2. search book by category");
        System.out.println("3. book publish of 2022");
        System.out.println("4. exit");
        int chooseNumber = sc.nextInt();
        sc.nextLine();
        switch (chooseNumber){
            case 1:
                int sum = 0;
                System.out.println("enter name the book");
                String search = sc.nextLine();
                for (int i = 0 ; i < arrayBook.length ; i++){
                    if (arrayBook[i].getNameBook().equals(search)){
                        System.out.println(arrayBook[i]);
                        sum +=1;
                    }
                }
                if (sum == 0) {
                    System.out.println("no book");
                }
                break;
            case 2:
                sum = 0;
                System.out.println("enter category the book");
                search = sc.nextLine();
                for (int i = 0 ; i < arrayBook.length ; i++){
                    if (arrayBook[i].getCategoryBook().equals(search)){
                        System.out.println(arrayBook[i]);
                        sum +=1;
                    }
                }
                if (sum == 0) {
                    System.out.println("no category");
                }
                break;
            case 3:
                sum =0;
                System.out.println("book publish 2022 \n");
                for (int i = 0 ; i < arrayBook.length ; i++){
                    if (arrayBook[i].getYearPublishBook()==2022){
                        System.out.println(arrayBook[i]);
                        sum +=1;
                    }
                }
                if (sum == 0) {
                    System.out.println("no book Publish 2022");
                }
                break;
            default:
                System.out.println("exit");
        }

    }
}

