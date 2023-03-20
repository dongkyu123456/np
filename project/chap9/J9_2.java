package project.chap9;

//page 325
public class J9_2 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("둘이 같음");
        else
            System.out.println("둘이 다름");
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}
