package project.chap11;

import java.util.HashMap;
import java.util.Scanner;

//p439
public class J11_49 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", 1234);
        map.put("asdf", 1111);// 이어서 초기화를 했기 때문에 해당 값은 없는 값이 됨.
        map.put("asdf", 1234);// 이미 존재하는 키 추가 가능, 기존 값이 사라짐.

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력하세요");
            System.out.println("id : ");
            String id = s.nextLine().trim();
            System.out.println();

            System.out.println("pw : ");
            String pw = s.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("아이디 없음 재입력");
                continue;
            }
            if (!map.get(id).equals(pw)) {
                System.out.println("비밀번호가 다르네요, 재입력");
            } else {
                System.out.println("둘 다 맞네요");
                break;
            }
        }

    }
}
