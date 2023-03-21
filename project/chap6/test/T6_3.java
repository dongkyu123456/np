package project.chap6.test;
//p208
public class T6_3 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름: "+s.name);
        System.out.println("총점: "+s.getTotal());
        System.out.println("평균: "+s.getAvg());
    }
}

class Student1 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    
    public Student1() {}

    public int getTotal() {
        return math + kor + eng;
    }

    public float getAvg() {
        return  Math.round(getTotal() / 3f * 10)/10f;
    }

}