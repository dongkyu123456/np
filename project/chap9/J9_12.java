package project.chap9;

import java.util.StringJoiner;

//page 337
public class J9_12 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear"; // 문자열 독 캣 베어가 있다
        String[] arr = animals.split(","); // 배열을 ,을 기준으로 나눈다
        System.out.println(arr[0]); // 독
        System.out.println(arr[1]); // 캣
        System.out.println(arr[2]); // 베어로 나뉘어졌다

        System.out.println(String.join("-", arr));//스트링 조인으로 사이에 -를 넣는다

        System.out.println(arr[0]); // 독
        System.out.println(arr[1]); // 캣
        System.out.println(arr[2]); // 베어로 여전히 나뉘어졌다

        StringJoiner sj = new StringJoiner("/", "[", "]"); //앞뒤에 []를 넣고 글자 사이사이에 /를 넣어준다

        for (String s : arr)
            sj.add(s);
        System.out.println(sj.toString());

        System.out.println(arr[0]); // 독
        System.out.println(arr[1]); // 캣
        System.out.println(arr[2]); // 베어로 여전히 나뉘어졌다
    }
}
