package project.chap9;

//page 326
class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj instanceof Person)
            return id == ((Person) obj).id;
        else
            return false;
    }

    Person(long id) {
        this.id = id;
    }

}

public class J9_3 {
    public static void main(String[] args) {
        Person p1 = new Person(80110811222L);
        Person p2 = new Person(80110811222L);
        
        if (p1.equals(p2))
            System.out.println("둘이 같음");
        else
            System.out.println("둘이 다름");
    }
}
