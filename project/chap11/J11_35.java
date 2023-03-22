package project.chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//p 425
public class J11_35 {
    public static void main(String[] args) {
        
        // Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
        Object[] objArr = {"1", Integer.valueOf(1),"2","2","3","3","4","4","4"};
        Set set = new HashSet();//해시셋은 셋인터페이스의 대표적컬렉션으로 중복 요소를 저장하지 않는다

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]); //해시셋에 오브제Arr의 요소들을 저장한다
        }
        System.out.println(set);//두번째 1은 인티저이며 스트링이 아니기때문에 중복으로 판정하지 않는다

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
