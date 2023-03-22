package project.chap10;

import java.util.*;

//p370
public class J10_4 {
    public static void main(String[] args) {
        // 요일은 1부터 시작하기 때문에 Day_Of_WEEK[0]은 비워둔다
        final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        // 몬쓰의 경우 0부터 시작하기 때문에 4월인 경우 3으로 지정해야한다.
        // date1.set(2023, Calendar.MARCH,20);과 같이 지정할 수도 있다
        date1.set(2023, Calendar.MARCH, 20); // 23년 3월 21일로 지정한 모습
        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
        System.out.println("오늘(Date2)은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다");

        long diffrence = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
        System.out.println("그 날(Date1)부터 지금(Date2)까지 " + diffrence + "초가 지났습니다.");
        System.out.println("날짜로 계산하면" + diffrence / (24 * 60 * 60) + "일입니다");

    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월" + date.get(Calendar.DATE) + "일 ";
    }
}
