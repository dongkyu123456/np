package project.chap6.test;

//p209
public class T6_4 {
    // 두 점 xy와 x1,y1간의 거리를 구한다
    // 결과값으로 보아 루트2를 구하면 된다
    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
