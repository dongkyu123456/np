package project.chap6.test;

//p207
public class T6_2 {// 스튜던트 클래스
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);

    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        super();

        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAvg();
    }

    public int getTotal() {
        return math + kor + eng;
    }

    public float getAvg() {
        return  Math.round(getTotal() / 3f * 10)/10f;
        // return (float) (kor + math + eng) / 3;
    }

}