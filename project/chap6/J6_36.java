package project.chap6;

//page 200
class Car3 {
    String color;
    String gearType;
    int door;

    Car3() { // Car(String color, String gearType, int door)
        this("white", "auto", 4);
    }

    Car3(String color) { // Car(String color, String gearType, int door) § this (color, "auto", 4);
    }

    Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class J6_36 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3("blue");

        System.out.println("c1 컬러 : " + c1.color + ", 기어타입 : " + c1.gearType + ", 도어 : " + c1.door);
        System.out.println("c2 컬러 : " + c2.color + ", 기어타입 : " + c2.gearType + ", 도어 : " + c2.door);

    }
}