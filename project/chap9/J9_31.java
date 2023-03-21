package project.chap9;

//page 357
public class J9_31 {
    public static void main(String[] args) {
        int i = 10;

        //기본형을 참조형으로 형변환(형변환 생략 가능)
        Integer intg = (Integer)i;//Integer intg = (Integer)Integer.valueOf(i)
        Object obj = (Object)i; //Object obj = (Object)Integer.valueOf(i)
        Long    lng = 100L;
        
        int i2 = intg + 10; // 참조형과 기본형간의 덧셈
        long l = intg + lng; //참조형간의 덧셈
        
        Integer intg2 = new Integer(20);
        int i3 = (int)intg2; // 참조형 -> 기본형 형변환도 가능(형변환 생략 가능)

            Integer intg3 = intg2 + i3;

            System.out.println("i         ="+i);
            System.out.println("intg      ="+intg);
            System.out.println("obj       ="+obj);
            System.out.println("lng       ="+lng);
            System.out.println("intg + 10 ="+i2);
            System.out.println("intg + lng="+l);
            System.out.println("intg2     ="+intg2);
            System.out.println("i3        ="+i3);
            System.out.println("intg2 + i3="+intg3);
    }
}
