package project.chap12;
import java.util.*;
//p 463
class Product{}
class Tv extends Product{}
class Audio extends Product{}

public class J12_6 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv>      tvList = new ArrayList<Tv>();
        // ArrayList<Product>      tvList = new ArrayList<Tv> 에러
        // List<Tv>           tvList = new ArrayList<Tv>(); // 다형성 가능

    productList.add(new Tv());
    productList.add(new Audio());

    tvList.add(new Tv());
    tvList.add(new Tv());

    printAll(productList);

    }

public static void printAll(ArrayList<Product> list) {
    for (Product p : list)
    System.out.println(p);
}

}
// 위 코드는 다형성을 이해하기 위한 예시 코드입니다.

// 먼저 Product 클래스, Tv 클래스, Audio 클래스가 정의되어 있습니다. Tv 클래스와 Audio 클래스는 Product 클래스를 상속합니다.

// J12_6 클래스에서는 ArrayList 객체를 생성합니다. 
// productList는 Product 객체를 담는 ArrayList입니다. 
//  tvList는 Tv 객체를 담는 ArrayList입니다.

// productList와 tvList에 각각 객체를 추가하고, printAll 메소드를 호출하여 productList에 있는 모든 객체를 출력합니다. 
// printAll 메소드는 ArrayList<Product>를 파라미터로 받아서, 해당 리스트에 있는 모든 객체를 출력합니다.

// 주석에서 보여주는 ArrayList<Product> tvList = new ArrayList<Tv>()는 에러를 발생시키는 코드입니다. 
// ArrayList<Product>는 Product 객체를 담는 리스트를 의미합니다. 
// ArrayList<Tv>는 Tv 객체를 담는 리스트를 의미합니다. 
// 따라서 ArrayList<Tv>를 ArrayList<Product>로 형변환하는 것은 불가능합니다.

// List<Tv> tvList = new ArrayList<Tv>()와 같이 다형성을 이용하면 
// Tv 객체를 담는 리스트를 List 인터페이스로 선언하고, ArrayList로 초기화할 수 있습니다. 
// 이렇게 하면 List 인터페이스의 메소드만 사용 가능하지만, Tv 객체만 담을 수 있는 리스트를 선언할 수 있습니다.