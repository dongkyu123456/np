package project.chap7;

import java.awt.*;
import java.awt.event.*;

//page 280
public class J7_52 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");
    }
}
// 아무 일도 일어나지 않는다. 익명 클래스로 변환하는 예를 보여주기 위한 것일 뿐이기 때문