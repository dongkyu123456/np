package project.chap8;

//page 310
public class J8_17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("메인메서드에서 예외처리됨");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외처리됨");
            throw e;
        }
    }
}
