package project.chap9;

//page 333
public class J9_10 {
    public static void main(String[] args) {
        char[] cArr = new char[0]; // char[] cArr = {};와 결과값이 같음
        String s = new String(cArr); //String s = new String("");과 결과값이 같음

        System.out.println("cArr.length = "+cArr.length);
        System.out.println("@@@"+s+"@@@");
    }
}
