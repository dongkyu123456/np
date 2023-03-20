package project.chap9;

//page 343
public class J9_18 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " +sb.equals(sb2));
        //버퍼로 나온 인스턴스의 결과물은 false

        //StringBuffer의 내용을 String으로 변환한다
        String s  = sb.toString(); // String s = new String(sb);와 같다
        String s2 = sb2.toString();

        System.out.println("S.equals(s2) ? " + s.equals(s2));
        //버퍼로 나온 결과물은 달랐지만 toString으로 나온 결과물은 같았다
        
        //String 클래스와는 달리 StringBuffer 클래스는 equals메서드를 오버라이딩 하지 않아 
        //StringBuffer클래스의 equals메서드를 사용해도 등가비교연산자로 비교한 것과 같은 결과를 얻는다 
        //-> 스트링 버퍼 클래스의 이퀄 메서드와 일반 이퀄 메서드의 차이점은 무엇인가?
        // 따라서 StringBuffer인스턴스에 담긴 문자열을 비교하기 위해서는 StringBuffer인스턴스에 toString()을 호출해서 
        // String 인스턴스를 얻은 다음, 여기에 equals메서드를 사용하여 비교해야한다

    }
}