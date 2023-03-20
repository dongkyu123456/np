package project.chap7;

//page 253
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 구매시 보너스 포인트

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); // 제품가의 10%
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }

    // 오버라이딩 함
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer { // 고객, 물건을 사는 사람
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스 점수

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price; // 금액 차감
        bonusPoint += p.bonusPoint; // 보너스 포인트 추가
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

public class J7_28 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer());

        System.out.println("현재 남은 돈 :" + b.money + " 만원입니다");
        System.out.println("현재 보너스 점수는 :" + b.bonusPoint + " 점입니다");
    }
}
