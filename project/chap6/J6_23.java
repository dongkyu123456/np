package project.chap6;

//p185 기본형 매개변수 예제
    
class Data {
    int x;
}
public class J6_23 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;// 참조형 매개변수, 아무리 변형하여도 Data클래스에 선언한 int x에는 영향을 줄 수 없다
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println((d.x));
    }

    static void change(int x) {
        x = 1000;
        System.out.println(+x);
    }
}

