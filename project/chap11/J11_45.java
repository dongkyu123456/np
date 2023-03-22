package project.chap11;

import java.util.TreeSet;

//p435
public class J11_45 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80,95,50,35,45,65,10,100};
        
        for (int i = 0; i < score.length; i++)
            // set.add(new Integer(score[i]));
            set.add(Integer.valueOf(score[i]));
            // set.add(score[i]);

            System.out.println("50미만 값 : " + set.headSet(Integer.valueOf(50)));
            System.out.println("50이상 값 : " + set.tailSet(Integer.valueOf(50)));
        
    }
}
