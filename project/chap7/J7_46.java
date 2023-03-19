package project.chap7;

//page 274
public class J7_46 {
    class InstanceInner {
        int iv = 100;
//      static int cv = 100; 인스턴스 내부 클래스에서는 static 멤버를 선언할 수 없다.      
        final static int CONST = 100; // final static은 상수이므로 허용된다.
    }
    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }
    void myMethod() {
        class LocalInner {
            int iv = 300;
//          static int cv = 300; // 에러! 로컬 내부 클래스에서는 static 변수를 선언할 수 없다.
            final static int CONST = 300; // final static은 상수이므로 허용된다.
        }
    }
    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
