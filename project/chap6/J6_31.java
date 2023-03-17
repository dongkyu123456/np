package project.chap6;

//page 194 오버로딩 예제
public class J6_31 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println("mm.add(3,3) :" + mm.add(3, 3));
        System.out.println("mm.add(3L,3) :" + mm.add(3L, 3));
        System.out.println("mm.add(3,3L) :" + mm.add(3, 3L));
        System.out.println("mm.add(3L,3L) :" + mm.add(3L, 3L));

        int[] a = { 100, 200, 300 };
        System.out.println("mm.add(a) 결과: " + mm.add(a));

    }
}

class MyMath {
    int add(int a, int b) {
        System.out.println("int add(int a, int b) - ");
        return a + b;
    }

    long add(int a, long b) {
        System.out.println("int add(int a, long b) - ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.println("int add(long a, int b) - ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.println("int add(long a, long b) - ");
        return a + b;
    }

    int add(int[] a) {
        System.out.println("int add(int[] a) - ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];

        }
        return result;
    }

}
