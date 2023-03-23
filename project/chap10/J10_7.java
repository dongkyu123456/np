package project.chap10;

import java.util.Calendar;

//p
public class J10_7 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage : java J10_7 2019 9");
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDAY = Calendar.getInstance();
        Calendar eDAY = Calendar.getInstance();
        // 월은 0부터 11의 값을 가지므로 1을 빼줘야 한다
        sDAY.set(year, month - 1, 1);
        eDAY.set(year, month, 1);

        // 다음달의 첫날에서 하루를 빼면 마지막날이 된다
        eDAY.add(Calendar.DATE, -1);

        // 첫번쨰 요일이 뭔지 알아낸다
        START_DAY_OF_WEEK = sDAY.get(Calendar.DAY_OF_WEEK);

        END_DAY = eDAY.get(Calendar.DATE);

        System.out.println("         " + args[0] + "년 " + args[1] + "월 ");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 1일에 따라 공백을 출력한다.
        // 1일이 수요일이라면 공백을 세 번 찍는다(일요일부터 시작됨)
        for (int i = 0; i < START_DAY_OF_WEEK; i++)
            System.out.println("   ");

        for (int j = 0, n = START_DAY_OF_WEEK; j <= END_DAY; j++, n++) {
            System.out.print((j < 10) ? "  " + j : " " + j);
            if (n % 7 == 0)
                System.out.println();
        }
    }
}
