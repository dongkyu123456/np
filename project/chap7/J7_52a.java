package project.chap7;

import java.awt.*;
import java.awt.event.*;

//page  280
public class J7_52a {
    public static void main(String[] args) {
        Button b = new Button("Strat");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}
