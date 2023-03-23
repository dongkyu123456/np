package project.chap12;


enum Direction {
    EAST, SOUTH, WEST, NORTH
};

// p 478
public class J12_20 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 : "+d1);
        System.out.println("d2 : "+d2);
        System.out.println("d3 : "+d3);

        System.out.println("d1==d2 ? "+ (d1==d2));
        System.out.println("d1==d3 ? "+ (d1==d3));
        System.out.println("d1.equals(d3) ? "+ d1.equals(d3));

        System.out.println("d1.compareTo(d3) ? "+d1.compareTo(d3));
        System.out.println("d1.compareTo(d2) ? "+d1.compareTo(d2));
        //compareTo()는 Comparable 인터페이스에서 정의된 메소드로, 두 객체를 비교하여 순서를 결정하는 데 사용됩니다.
        //compareTo() 메소드의 반환값은 int형이며, 두 객체의 순서를 비교한 결과를 나타냅니다. 
        //만약 첫 번째 객체가 두 번째 객체보다 작으면 음수를, 크면 양수를, 같으면 0을 반환합니다.

switch (d1) {
    case EAST:
        System.out.println("The direction is EAST.");
        break;
    case SOUTH:
        System.out.println("The direction is SOUTH.");
        break;
    case WEST:
        System.out.println("The direction is WEST.");
        break;
    case NORTH:
        System.out.println("The direction is NORTH.");
        break;    
    default:
    System.out.println("인발리드 디렉션.");
        break;
}

        Direction[] dArr = Direction.values();
        for (Direction d : dArr)  
            System.out.printf("%s=%d%n",d.name(), d.ordinal());
        

    }
}
