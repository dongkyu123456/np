package project.chap6;

//page189 스태틱 메서드, 인스턴스 메서드 예제
public class J6_27 {
    long a, b;

    // 인스턴스 변수만을 이용해서 하는 작업으로 매개 변수가 필요없다.
    long add() {
        return a + b;
    }

    double divide() {
        return a / (double) b;
    }

    // 인스턴스 변수와는 별개로 매개변수로만 작업이 가능하다
    static long add(long a, long b) {
        return a + b;
    }

    static double divide(long a, long b) {
        return a / (double) b;
    }
}

class J627 {
    public static void main(String[] args) {
        //클래스 매서드 호출. 인스턴스 생성없이 호출 가능
        System.out.println(J6_27.add(200L, 100L));
        System.out.println(J6_27.divide(200L, 100L));
        
        J6_27 jv = new J6_27(); //인스턴스 생성
        jv.a = 200L;
        jv.b = 100L;
        //인스턴스 메서드는 객체 생성후에만 호출 가능
        System.out.println(jv.add());
        System.out.println(jv.divide());
    }

}
// 클래스 설계시에 모든 인스턴스에 공통으로 사용할 경우 static을 붙인다
// 생성된 인스턴스는 독립적이기때문에 각 인스턴스 변수는 다른 값을 유지하지만 
// 모든 인스턴스에서 같은 값이 유지되어야 하는 변수의 경우에는 static을 붙여 클래스 변수로 정의해야한다

//메서드 내에서 인스턴스 변수를 사용하지 않는다면 static을 붙여서 메서드 호출 시간은 짧아지게 할 수 있다