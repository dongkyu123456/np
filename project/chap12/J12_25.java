package project.chap12;

//p 484

class Parent {
    void parentMethod(){}
}

class Child extends Parent{
    // @Override 
    void parentmethod() {} //조상 메서드 이름을 잘못 적음
    // 오버라이드를 붙이지 않거나, 차일드 클래스의 메소드 이름을 파렌트메쏘드로 변경하면 해결될 것
}

public class J12_25 {
    public static void main(String[] args) {
        
    }
}
