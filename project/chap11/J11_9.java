package project.chap11;

import java.util.*;

//p
public class J11_9 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));// 끝자리는 계산하지 않는다
        print(list1, list2);// [5,4,2,0,1,3], [4,2,0]

        Collections.sort(list1); // 리스트 정렬함
        Collections.sort(list2);
        print(list1, list2);// [0,1,2,3,4,5],[0,2,4]

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));// true
        print(list1, list2);// 상동

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");// 인덱스 3에 A를 추가
        print(list1, list2);// [0,1,2,3,4,5],[0,2,4,A,B,C]

        list2.set(3, "AA");// 인덱스 3에 AA로 변경
        print(list1, list2);// [0,1,2,3,4,5],[0,2,4,AA,B,C]

        // list1에서 llist2와 겹치는 부분만 남기고 나머지는 삭제
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));// true값 반환
        print(list1, list2);// [0,2,4],[0,2,4,AA,B,C]

        // list2에서 list1에 포함된 객체를 삭제한다
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i); // 인덱스가 i인 곳에 저장된 요소를 삭제
        }
        print(list1, list2);// [0,2,4],[AA,B,C]

    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list 1 : " + list1);
        System.out.println("list 2 : " + list2);
        System.out.println();
    }
}
