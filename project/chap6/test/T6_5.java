package project.chap6.test;
//p209
public class T6_5 {
// 클래스(static 변수)
// 인스턴스 변수
// 지역 변수를 구분하시오
}

class PlayingCard{ //클래스
    int kind;//지역변수
    int num; //지역변수

    static int width; // 스태틱 변수
    static int height; // 스태틱 변수
    
    PlayingCard(int k, int n){ // 인스턴스 변수
        kind =k; //
        num = n; //
    }
    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1);
        System.out.println(card);
    }
}
