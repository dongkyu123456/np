package project.chap10;

import java.util.*;

//p368
public class J10_3 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Calendar today = Calendar.getInstance();
        System.out.println("올해는    : " + today.get(Calendar.YEAR) + "년");
        System.out.println("이번달은  : " + today.get((Calendar.MONTH)) + "+1월");
        System.out.println("올해의    : " + today.get(Calendar.WEEK_OF_YEAR) + "번쨋주");
        System.out.println("이번달의  : " + today.get(Calendar.WEEK_OF_MONTH) + "번쨋주");
        System.out.println("이번달의  : " + today.get(Calendar.DAY_OF_MONTH) + "번쨋날");
        System.out.println("올해의    : " + today.get(Calendar.DAY_OF_YEAR) + "번쨋날");
        System.out.println("요일은    : " + today.get(Calendar.DAY_OF_WEEK) + "번째 요일('일','월','화','수','목','금','토')");
        System.out.println("이번달만  : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH) + "번째 맞이하는 요일");
        System.out.println("오전오후  : " + today.get(Calendar.AM_PM) + "  0오전 1오후");
        System.out.println("탁상시계는:" + today.get(Calendar.HOUR) + "시");
        System.out.println("24시시계는:" + today.get(Calendar.HOUR_OF_DAY) + "시");
        System.out.println("지금은    :" + today.get(Calendar.MINUTE) + "분");
        System.out.println("지금은    :" + today.get(Calendar.HOUR_OF_DAY) + "초");
        System.out.println("밀리세컨드:" + today.get(Calendar.MILLISECOND) + "초");
        System.out.println("TimeZone(-12~+12) :" + today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000));
        System.out.println("이달의 마지막날 : " + today.getActualMaximum(Calendar.DATE));
=======
    Calendar today = Calendar.getInstance();
    System.out.println("올해는    : " +today.get(Calendar.YEAR)+"년");
    System.out.println("이번달은  : " +today.get((Calendar.MONTH))+"+1월");
    System.out.println("올해의    : " +today.get(Calendar.WEEK_OF_YEAR)+"번쨋주");
    System.out.println("이번달의  : " +today.get(Calendar.WEEK_OF_MONTH)+"번쨋주");
    System.out.println("이번달의  : " +today.get(Calendar.DAY_OF_MONTH)+"번쨋날");
    System.out.println("올해의    : " +today.get(Calendar.DAY_OF_YEAR)+"번쨋날");
    System.out.println("요일은    : " +today.get(Calendar.DAY_OF_WEEK)+"번째 요일('일','월','화','수','목','금','토')");
    System.out.println("이번달만  : " +today.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"번째 맞이하는 요일");
    System.out.println("오전오후  : " +today.get(Calendar.AM_PM)+"  0오전 1오후");
    System.out.println("탁상시계는:" +today.get(Calendar.HOUR)+"시");
    System.out.println("24시시계는:" +today.get(Calendar.HOUR_OF_DAY)+"시");
    System.out.println("지금은    :" +today.get(Calendar.MINUTE)+"분");
    System.out.println("지금은    :" +today.get(Calendar.HOUR_OF_DAY)+"초");
    System.out.println("밀리세컨드:" +today.get(Calendar.MILLISECOND)+"초");
    System.out.println("TimeZone(-12~+12) :"+today.get(Calendar.ZONE_OFFSET)/(60*60*1000));
    System.out.println("이달의 마지막날 : " +today.getActualMaximum(Calendar.DATE));
>>>>>>> acc8e83f9c692a62365f78d1d346c3733d163506
    }
}
