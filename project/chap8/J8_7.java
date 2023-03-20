package project.chap8;

//page 299
public class J8_7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);

        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("예외 메세지 : " + ae.getMessage());
        }
        System.out.println(6);
    }
}
