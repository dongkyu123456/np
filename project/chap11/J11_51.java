package project.chap11;

import java.util.*;

//p 442
public class J11_51 {
    public static void main(String[] args) {
        String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };
        HashMap map = new HashMap();

        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) { // 콘테인즈 키는 해당키가 맵에 포함되어있는지는 반환(true/false)
                int value = (int) map.get(data[i]);
                map.put(data[i], value + 1); // 기존 키는 기존값에 1을 더해서 저장
            } else {
                map.put(data[i], 1); // 기존에 없는 키는 1로 저장
            }

            Iterator it = map.entrySet().iterator();
            // Iterator는 hasNext() 메서드를 사용하여 다음 요소가 있는지 확인하고, next() 메서드를 사용하여 다음 요소를 반환합니다.
            // 이 때, next() 메서드는 다음 요소가 없는 경우 NoSuchElementException을 발생시킵니다.

            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int value = (int) entry.getValue();
                System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
            }
        }
    }

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++)
            bar[i] = ch;

        
        return new String(bar);// String(char[] chArr)
    }
}
