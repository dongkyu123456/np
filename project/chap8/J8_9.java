package project.chap8;

//page 301
public class J8_9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의발생");
            throw e; // 예외를 발생시킴
        } catch (Exception e) {
            System.out.println("예외 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
