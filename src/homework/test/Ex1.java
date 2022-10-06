package homework.test;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("print rectag");
        for (int i=1 ; i<5; i++){
            for (int j = 1; j<5 ;j++){
                System.out.print("* \t");
            }
            System.out.println("");
        }
        System.out.println("print recangle");
        for (int i=1 ; i<5; i++){
            for (int j = 1; j<5 ;j++){
                System.out.print("* \t");
                if (j>=i){
                    break;
                }
            }
            System.out.println("");
        }
    }
}
