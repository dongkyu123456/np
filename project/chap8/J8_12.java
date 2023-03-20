package project.chap8;

//page 304
public class J8_12 {
    public static void main(String[] args) throws Exception {
        method1(); // 같은 클래스 내의 static멤버이므로 객체 생성없이 직접 호출할 수 있다.
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
// 예외가 발생했을 때 모든 메서드가 호출 스택에 있었고 예외가
// 발생한 곳은 가장 윗줄에 있는 메소드2라는 것과
// 메인 메서드가 메서드1을, 메서드1은 메서드2를 호출했다는 것을 알 수 있다

// 위의 예제 코드에서 가장 먼저 예외가 발생한 곳은 method2입니다.
// method2 메소드에서는 throw new Exception(); 문장으로 인해 고의로 Exception 예외를 발생시키고 있습니다.
// 따라서 method2가 호출되어 예외가 발생하고, 이 예외가 method1에서 처리되지 않고 다시 호출자인 main 메소드로 예외가
// 전파됩니다.
// 이후 main 메소드에서도 예외가 처리되지 않고, throws를 통해 예외를 다시 상위 호출자로 던졌기 때문에 예외는 최종적으로 JVM에
// 의해 처리되게 됩니다.