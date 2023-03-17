package project.chap6;

//page 186 참조형 매개변수
class Data2 {
    int x;
}

public class J6_24 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

    }

    static void change(Data2 d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }

}
