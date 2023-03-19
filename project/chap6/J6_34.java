package project.chap6;

//page 198 매개변수가 있는 생성자
class Car {
    String color; // 색상
    String gearType; // 기어 종류
    int door; //문 갯수

    Car() {} // 기본 생성자


    
    Car(String c, String g, int d) { // 매개변수가 존재하는 생성자
        color=c;
        gearType=g;
        door=d;
    }
}

public class J6_34 {
    
}
