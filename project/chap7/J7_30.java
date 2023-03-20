package project.chap7;

//page 255~256
class Product2 {
    int price; // 제품의 가격
    int bonusPoint; // 구매시 보너스 포인트

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); // 제품가의 10%
    }

    Product2() {
    } // 기본 생성자
}

class Tv2 extends Product2 {
    Tv2() {
        super(100);
    }

    // 오버라이딩 함
    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer2";
    }
}

class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }

    public String toString() {
        return "Audio2";
    }
}

class Buyer2 { // 고객, 물건을 사는 사람
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스 점수
    Product2[] cart = new Product2[10];// 제품 저장 배열
    int i = 0;

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price; // 금액 차감
        bonusPoint += p.bonusPoint; // 보너스 포인트 추가
        cart[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null)
                break;
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("총금액은 " + sum + "만원입니다");
        System.out.println("구입 제품은" + itemList + "입니다");
    }

}

public class J7_30 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
    }
}
