package lesson5.homeWork;

// Bài tập quản lý nhân viên

import java.time.LocalDate;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employyee employyee = new Employyee();
        LocalDate localDate = LocalDate.now();


        //Danh sách nhân viên và mảng gồm các nhân viên

        Employyee nguyenVanA = new Employyee("NV01","Nguyen Van A", "10/11/1999",1000, Utils.GENDER.MALE);
        Employyee tranThiB = new Employyee("NV02","Tran Thi B", "20/10/1985",1230, Utils.GENDER.FEMALE);
        Employyee hoangVanC = new Employyee("NV03","Hoang Van C", "02/01/2005",890, Utils.GENDER.MALE);
        Employyee nguyenThiD = new Employyee("NV04","Nguyen Thi D", "16/02/2000",1504, Utils.GENDER.FEMALE);
        Employyee leThiD = new Employyee("NV05","Le Thi D", "10/09/1991",1300, Utils.GENDER.FEMALE);

        Employyee [] arrayEmployees = {nguyenVanA,tranThiB,hoangVanC,nguyenThiD,leThiD};

        int sum = 0;

        /*  Chạy chương trình
        1...tìm kiếm nhân viên chính xác theo id hoặc chứa  từ tìm kiếm trong tên
        2...đếm số nhân viên nam và nữ
        3... liệt kê nhân viên lớn hơn 30 tuổi
        4... nhập 1 tháng và in ra ai có tháng sinh nhật đó
        5... in ra 3 người lương cao nhất
        6... thoát chwong trình

         */
        System.out.println("choose number.....");
        System.out.println("1...search by name or id");
        System.out.println("2...employee male and female");
        System.out.println("3...employee over 30 years old");
        System.out.println("4...search birthday employee");
        System.out.println("5...high salary employee");
        System.out.println("6.exit");
        int chooseNumber = sc.nextInt();
        sc.nextLine();


        switch (chooseNumber){
            case 1 :
                sum = 0;
                System.out.println("enter name or id : ");
                String search = sc.nextLine();
                System.out.println("result:");
                for (int i = 0; i < arrayEmployees.length; i++){
                    if (arrayEmployees[i].getId().equals(search)
                            || arrayEmployees[i].getName().toLowerCase().contains(search.toLowerCase())
                            || search.toLowerCase().contains(arrayEmployees[i].getName().toLowerCase())) {

                        sum += 1;
                        System.out.println(sum + ": " +arrayEmployees[i].idAndName());
                    }
                }
                if (sum == 0) {
                    System.out.println("no results returned");
                }
                break;

            case 2:
                int sumMale = 0;
                int sumFemale = 0;
                for (int i = 0; i <arrayEmployees.length; i++){
                    if (arrayEmployees[i].getGender().equals(Utils.GENDER.MALE)){
                        sumMale +=1;
                    } else {
                        sumFemale +=1;
                    }
                }
                System.out.println("employee male = " +sumMale);
                System.out.println("employee female = " +sumFemale);
                break;

            case 3:
                sum = 0;
                System.out.println("employee over 30 years old: ");
                for (int i = 0; i <arrayEmployees.length; i++) {
                    int differenceYears = LocalDate.now().getYear() - arrayEmployees[i].convertDay().getYear();
                    if (differenceYears > 30) {
                        sum += 1;
                        System.out.println(sum+ ": " +arrayEmployees[i].getName()+  " --- age: " +differenceYears);
                    }
                }
                if (sum == 0) {
                    System.out.println("no employee over 30 years old");
                }
                break;

            case 4:
                sum = 0;
                System.out.println("enter month of year: ");
                int checkValue = sc.nextInt();
                for (int i = 0; i <arrayEmployees.length; i++){
                    if (checkValue == arrayEmployees[i].convertDay().getMonthValue()){
                        sum +=1;
                        System.out.println(arrayEmployees[i].getName()+" --- "+arrayEmployees[i].convertDay());

                    }
                }
                if (sum==0) {
                    System.out.println("no birthday month " +checkValue);
                }
                break;

            case 5:
                Employyee min = arrayEmployees[0];
                System.out.println("high salary employee");
                for (int i = 0; i < arrayEmployees.length; i++){
                    for (int j = i+1; j <arrayEmployees.length; j++){
                        if (arrayEmployees[i].getSalary()<arrayEmployees[j].getSalary()){
                            min = arrayEmployees[i];
                            arrayEmployees[i]= arrayEmployees[j];
                            arrayEmployees[j] = min;
                        }
                    }
                }
                for (int i = 0; i < 3; i++){
                    System.out.println(arrayEmployees[i].idAndName()+ ", salary = " +arrayEmployees[i].getSalary());
                }
                break;

        }
    }
}
