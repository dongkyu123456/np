package project.chap7;

//page 275
public class J7_47 {
    class InstanceInner {
    }

    static class StaticInner {
    }

    // 인스턴스 멤버간에는 서로 직접 접근 가능
    InstanceInner iv = new InstanceInner();
    // static 멤버간에는 서로 직접 접근이 가능하다
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        // InstanceInner obj1 = new InstanceInner();
        // static StaticInner obj2 = new StaticInner(); // 스태틱 멤버는 인스턴스 멤버에 직접 접근할 수 없다.

        // 굳이 접근하고자한다면 아래처럼 객체를 생성해야한다
        // 인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다
        J7_47 outer = new J7_47();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        // 인스턴스 메서드에서는 인스턴스 멤버와 클래스 멤버 모두 접근 가능하다.
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        // 메서드 내에 자연적으로 선언된 내부 클래스는 외부에서 접근할 수 없다
        // localInner lIv = new LocalInner();
    }

    void myMethod() {
        class LocalInner {
        }
        LocalInner Iv = new LocalInner();
    }

}
