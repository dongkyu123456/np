package project.chap6;
//page 196 기본 생성자 예제
class Data_1 {
    int value;
}

class Data_2 {
    int value;

    Data_2(int x) {
        value = x;
    }
}

public class J6_33 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
    //  Data_2 d2 = new Data_2(); 컴파일 에러 발생 The constructor Data_2() is undefined
    //  데이터1에서는 생성자를 정의하지 않아 기본 생성자를 생성했지만 데이터2에서는 데이터2(인트x)가 정의되어있기 때문에 형식에 맞추어
        Data_2 d2 = new Data_2(0);// 같은 방식으로 정의하면 된다
        System.out.println(d1);
        System.out.println(d2);

    }
}
