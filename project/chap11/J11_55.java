package project.chap11;

import java.util.*;
import static java.util.Collections.*;
//p
public class J11_55 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list,1,2,3,4,5);
        System.out.println(list);

        rotate(list, 2); // 오른쪽 두 칸 로테이션
        System.out.println(list);
        
        swap(list,0, 2); // 스왑
        System.out.println(list);
        
        shuffle(list); // 셔플
        System.out.println(list);
        
        sort(list, reverseOrder()); // 역순 정렬
        System.out.println(list);
        
        sort(list); // 정렬
        System.out.println(list);
        
        int idx = binarySearch(list, 3); // 3이 저장된 위치(인덱스)를 반환
        System.out.println("index of 3 : " + idx);
        
        System.out.println("max= " + max(list));
        System.out.println("mix= " + min(list));
        System.out.println("mix= " + max(list,reverseOrder()));

        //  9로 채운다
        fill(list,9);
        System.out.println("list= "+list);

        //리스트와 같은 크기의 새로운 리스트를 생성하고 2로 채운다(결과 변경 불가)
        List newList = nCopies(list.size(), 2);
        System.out.println("newList= "+newList);
 
        System.out.println(disjoint(list, newList));//공통요소가 없으면 트루

        copy(list, newList);
        System.out.println("newList="+newList);
        System.out.println("list="+list);

        replaceAll(list, 2, 1); //리스트의 모든 2를 1로 변경시킴
        System.out.println("list="+list);
        
        Enumeration e = enumeration(list); // list 객체를 Enumeration 타입으로 변환하고, 
        ArrayList list2 = list(e);        //이를 list 메서드를 사용하여 ArrayList 타입으로 변환합니다.

        System.out.println("list2="+list2);//변환된 list2 객체를 출력
    }
}
