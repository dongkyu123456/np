package project.chap12;

import java.util.*;
//p464
public class J12_7 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕",1,1));
        list.add(new Student("자바짱",1,2));
        list.add(new Student("홍길동",2,1));
 
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            //Student s = (Student) it.next(()) 제네릭스 미사용시 형변환 필요
            Student s = it.next();
            System.out.println(s.name);
            System.out.println("반 : "+s.ban);
            System.out.println("번호 : "+s.no);
        }
    }
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban , int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}
