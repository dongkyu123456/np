package project.chap6;

//page 199 매개변수가 있는 생성자 예자

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


public class J6_35 {
    public static void main(String[] args) {
        
    Car c1 = new Car();
    c1.color = "white";
    c1.gearType = "auto";
    c1.door = 4;

    Car c2 = new Car("white","auto",4);
    System.out.println("c1 컬러 : " +c1.color + ", 기어타입 : "+c1.gearType +", 도어 : " +c1.door);
    System.out.println("c2 컬러 : " +c2.color + ", 기어타입 : "+c2.gearType +", 도어 : " +c2.door);
    }

}
