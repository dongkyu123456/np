package project.chap8;

//page 296
public class J8_5a {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(0 / 0);
            System.out.println(2);
        } catch (Exception e) {
            System.out.println(3);
        }
        System.out.println(4);
    }

}
