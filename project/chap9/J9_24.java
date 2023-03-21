package project.chap9;

import static java.lang.Math.*;
import static java.lang.System.*;

//page 350
public class J9_24 {
    public static void main(String[] args) {
        double val = 90.7552;
        out.println("round(" + val + ")=" + round(val));
        val *= 100;

        out.println("round(" + val + ")=" + round(val));


        out.println("round(" + val + ")/100  =" + round(val)/100);
        out.println("round(" + val + ")/100.0=" + round(val)/100.0);
        out.println();

        //(%3.1f)가 의미하는 것. %3의 숫자를 늘리면 앞괄호와 숫자 사이에 공백이 생김,1f의 숫자를 늘리면 소수점의 갯수가 늘어남
        //(%1.1f)와 (%3.1f)는 무슨 차이가 있을까?
        out.printf("ceil(%3.1f)=%3.1f%n",1.1, ceil(1.1));
        out.printf("floor(%3.1f)=%3.1f%n",1.5, floor(1.5));
        out.printf("round(%3.1f)=%df%n",1.1, round(1.1));
        out.printf("round(%3.1f)=%d%n",1.5, round(1.5));
        out.printf("rint(%3.1f)=%3.1f%n",1.5, rint(1.5));
        out.printf("round(%3.1f)=%d%n",-1.5, round(-1.5));
        out.printf("rint(%3.1f)=%3.1f%n",-1.5, rint(-1.5));
        out.printf("ceil(%3.1f)=%3.1f%n",-1.5, ceil(-1.5));
        out.printf("floor(%3.1f)=%3.1f%n",-1.5, floor(-1.5));

    }
}
