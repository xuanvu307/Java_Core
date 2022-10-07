package homework;

// Bài tập kiểm tra chuỗi
public class ExString1 {
    public static void main(String[] args) {
        String str = "Hello every one";              // Kiểm tra chuỗi "Hello every one"
        int sumStrE = 0;
        for (int i = 0; i < str.length(); i++) {     //Vì chuỗi có độ dài bắt đầu từ 0 và kết thúc tại length -1
            if (str.charAt(i)=='e') {
                sumStrE += 1 ;
            }
        }
        //Viết ra chuỗi str có bao nhiêu ký tự e và có index là:
        System.out.printf("String \"Hello every one\" with %d character \'e\' and Indexof = %d" ,sumStrE,str.indexOf('e'));
    }
}
