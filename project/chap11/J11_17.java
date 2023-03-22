package project.chap11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//p 405
public class J11_17 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while (!st.empty()) {
            System.out.println(st.pop());// 요소를 하나 꺼내어서 출력한다
        }

        System.out.println("= QUEUE =");
        while (!q.isEmpty()) {
            System.out.println(q.poll());// 요소를 하나 꺼내어서 출력한다
        }
    }
}
