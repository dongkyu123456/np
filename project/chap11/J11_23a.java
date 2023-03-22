package project.chap11;

import java.util.*;

//p null from chatGPT
//Iterator는 요소들 사이에 위치하지만 ListIterator는 요소 안에 위치합니다.
//따라서 List를 구현한 클래스를 반복할 때, 요소들의 순서를 
//바꾸거나 추가하거나 제거할 때는 ListIterator를 사용하는 것이 적합합니다. 
//그러나 요소들의 순서를 바꾸거나 추가, 제거할 필요가 없다면 Iterator를 사용하는 것이 더 효율적입니다.
public class J11_23a {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Ruby");

        // Iterator를 사용한 요소 출력
        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // ListIterator를 사용한 요소 출력
        System.out.println("Using ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        // 리스트 이터레이터는 양방향이 가능하기 때문에 뒤에서부터 출력할 수도 있다.
        System.out.println("Using ListIterator-back:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}