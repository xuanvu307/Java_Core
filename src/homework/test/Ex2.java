package homework.test;

public class Ex2 {
    public static void main(String[] args) {
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println("length of string " +str.length());
        int sum = 0;
        for (int i = 0; i< str.length(); i++) {
            if (str.charAt(i) == 'o' ) {
                sum += 1;
            }
        }
        System.out.printf("String \'%s\' with %d character \'o\' and Indexof %d" ,str,sum,str.indexOf("o"));
    }
}
