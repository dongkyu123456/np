package project.chap9;

//page 352
public class J9_26 {
    public static void main(String[] args) {
        // Integer i = Integer.valueOf(100);
        // Integer i2 = Integer.valueOf(100);
        Integer i = new Integer(100); //자바8이후로 쓰이지 않게된 문법 예외
        Integer i2 = new Integer(100); //자바8이후로 쓰이지 않게된 문법 예외

        System.out.println("i==i2 ? "+(i==i2));
        System.out.println("i.equals(i2) ? "+i.equals(i2));
        System.out.println("i.compareTo(i2)="+i.compareTo(i2));
        System.out.println("i.toString()="+i.toString());

        System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
        System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
        System.out.println("SIZE="+Integer.SIZE);
        System.out.println("BYTES="+Integer.BYTES);
        System.out.println("TYPE="+Integer.TYPE);
    }
}
