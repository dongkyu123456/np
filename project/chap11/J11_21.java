package project.chap11;

import java.util.*;

//p 409
public class J11_21 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5; // q저장값 최대5까지

    public static void main(String[] args) {
        System.out.println("help입력시 도움말");

        while (true) {
            System.out.println(">>");
            try {
                // 화면으로부터 라인 단위로 입력받음
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input))
                    continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말");
                    System.out.println("Q 또는 q - 프로그램 종료");
                    System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    save(input);// 입력받은 명령어 저장

                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();

                    while (it.hasNext())
                        System.out.println(++i + "." + it.next());
                } else {
                    save(input);
                    System.out.println(input);
                } // if(input.equalsIgnoreCase("q")) {
            } catch (Exception e) {
                System.out.println("입력 오류입니다");
            }

        }
    }

    public static void save(String input) {
        if (!"".equals(input))
            q.offer(input); // queue에 저장함

        if (q.size() > MAX_SIZE)
            q.remove();// 큐의 최대 크기를 넘으면 가장 처음에 입력된 것을 삭제함. 사이즈는 콜렉션 인터페이스에 정의
    }
}
