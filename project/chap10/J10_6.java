package project.chap10;

import java.util.Calendar;

//p372
public class J10_6 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
<<<<<<< HEAD
        date.set(2019, 7, 31);

=======
        date.set(2019,7,31);
        
>>>>>>> acc8e83f9c692a62365f78d1d346c3733d163506
        System.out.println(toString(date));
        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 6달 전 =");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        System.out.println("= 31일 후(roll) =");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) =");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
<<<<<<< HEAD
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월" + date.get(Calendar.DATE) + "일 ";
=======
        return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE) +"일 ";
>>>>>>> acc8e83f9c692a62365f78d1d346c3733d163506
    }
}
