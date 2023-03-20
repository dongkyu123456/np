package project.chap9;
//page 328
class Card{
    String kind;
    int number;

    Card() {
        this("Spade",1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}
public class J9_5 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }    
}
