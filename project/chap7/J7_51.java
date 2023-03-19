package project.chap7;

//page 279
public class J7_51 {
    Object iv = new Object() {
        void method() {
        }
    };
    static Object cv = new Object() {
        void method() {
        }
    };

    void myMethod() {
        Object lv = new Object() {
            void method() {
            }
        };
    }
}
