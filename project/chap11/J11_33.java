package project.chap11;

import java.util.Arrays;
import java.util.Comparator;

//p
public class J11_33 {
    public static void main(String[] args) {
        Integer[] arr = { 30, 50, 10, 40, 20 };
        // String[] arr = {"A","C","D","S","F"};
        // String[] arr = {"가","타","하","마","나"}; //스트링도 잘 됨

        Arrays.sort(arr); // 인티저가 가지고 있는 기본 정렬 기준 compareTo()로 정렬
        System.out.println(Arrays.toString(arr));

        // sort(Object[] objArr, Comparator c)
        Arrays.sort(arr, new DescComp()); // DescComp에 구현된 정렬 기준으로 정렬
        System.out.println(Arrays.toString(arr));
    }
}

class DescComp implements Comparator {
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Integer && o2 instanceof Integer))
            return -1;// 인티저가 아닐 경우 비교하지 않고 -1반환

        Integer i = (Integer) o1;
        Integer i2 = (Integer) o2;
        // return o2=1; 또는 return i2.compareTo(i);도 가능
        return i.compareTo(i2) * -1;
    }
}