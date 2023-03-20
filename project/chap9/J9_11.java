package project.chap9;

//page334 
public class J9_11 {        
        
        // String(String s) 주어진 문자열을 갖는 String인스턴스를 생성함
        String s1 = new String("Hello"); // s1= "Hello"
        // String(char[] value) 주어진 문자열 value를 갖는 String 인스턴스를 생성함
        char[] c1 = {'H','e','l','l','o'};
        String s2 = new String(c1); // s2 = "Hello"
        // String(StringBuffer buf) 스트링버퍼 인스턴스가 갖고있는 문자열과 같은 내용의 String 인스턴스를 생성한다
        StringBuffer sb = new StringBuffer("Hello");
        String s3 = new String(sb); // s3 = "Hello"
        //char charAt(int index) 지정된 위치에 있는 문자를 알려준다.(index는 0부터 시작,)
        String s4 = "Hello";
        String n1 = "0123456";
        char c2 = s4.charAt(1); //c2 = 'e'
        char c3 = s4.charAt(1); //c3 = '1'
        //int compareTo(String str) 문자열을 사전순으로 비교하고 같으면 0을, 이전이면 음수, 이후면 양수를 반환한다
        int i1 = "aaa".compareTo("aaa"); // i1 = 0    
        int i2 = "aaa".compareTo("bbb"); // i2 = -1
        int i3 = "bbb".compareTo("aaa"); // i3 = 1
        //String concat(String str) 문자열 뒤에 덧붙인다
        String s5 = "Hello";
        String s6 = s5.concat("World");
        //boolean contain(CharSequence s) 지정된 문자열 s가 포함되어있는지 검사한다
        String s7 = "abcedfg";
        boolean b1 = s7.contains("bc"); // b1 = true;
        //boolean endWith(String suffix) 지정된 문자열로 끝나는지 검사한다
        String file = "Hello.txt";
        boolean b2 =file.endsWith("txt"); // b2 = true;
        //boolean equals(object obj) 매개변수로 받은 문자열(obj)과 String인스턴스 문자열을 비교한다. 
        // obj가 String이 아니거나 문자열이 다르다면 false를 반환한다
        String s8 = "Hello";
        boolean b3 = s8.equals("Hello"); //b3= true
        boolean b4 = s8.equals("hello"); //b4= false
        //boolean equalsIgnoreCase(String str) 문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다
        String s9 = "Hello";
        boolean b5 = s9.equalsIgnoreCase("HELLO"); // b5 = true
        boolean b6 = s9.equalsIgnoreCase("hello"); // b6 = true
        //int indexOf(int ch) 주어진 문자 ch가 문자열에 존재하는지 확인하여 위치를 알려준다 못 찾으면 -1을 반환한다
        String ss1 = "Hello";
        int idx1 = ss1.indexOf('o'); // = 4
        int idx2 = ss1.indexOf('k'); // = -1
        //int indexOf(int ch, int pos) 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치를 알려준다. 못 찾으면 -1을 반환한다
        String ss2 = "Hello";
        int idx3 = ss2.indexOf('e',0); // idx3 = 1
        int idx4 = ss2.indexOf('e',2); // idx4 = - 1
        //int indexOf(String str) 주어진 문자열이 존재하는지 확인하여 그 위치를 알려준다 없으면 -1을 반환한다
        String ss3 = "ABCDEFG";
        int idx5 = ss3.indexOf("CD"); // idx = 2;
        //String intern() 문자열은 상수풀에 등록한다 이미 상수풀에 같은 내용의 문자열이 있을 경우 그 문자열의 주소값을 반환한다
        String ss4 = new String("abc");
        String ss5 = new String("abc");
        boolean b7 = (ss4==ss5); //b7 = false
        boolean b8 = (ss4.equals(ss5)); //b8 = true
        boolean b9 = (ss4.intern()==ss5.intern()); //b9 = true
        //int lastIndexOf(int ch) 지정된 문자 또는 문자코드를 문자열의 오른쪽에서부터 찾아서 위치(index)를 찾아준다. 못 찾으면 -1을 반환한다
        String ss6 = "java.lang.Object";
        int idx6 = ss6.lastIndexOf('.'); // idx6 = 9
        int idx7 = ss6.indexOf('.'); //idx7 = 4
        //int lastIndexOf(String str) 지정된 문자열을 인스턴스의 문자열 끝부터 찾아서 위치(index)를 찾아준다. 못 찾으면 -1을 반환한다
        String ss7 = "java.lang.java";
        int idx8 = ss7.lastIndexOf("java");//idx = 10
        int idx9 = ss7.indexOf("java"); // idx = 0
        //int length() 문자열의 길이를 알려준다
        String ss8 = "Hello";
        int length = ss8.length(); //length = 5
        //String replace(char old, char nw) 문자열 중의 문자(old)을 새로운 문자열(nw)로 모두 바꾼 문자열을 반환한다
        String ss9 = "Hello";
        String st1 = ss9.replace("H","C");// st1 = "Cello"
        //String replace(Charsequence old,Charsequence nw) 문자열중의 old문자열을 새로운 문자열nw로 모두 바꾼 문자열을 반환한다
        String st2 = "Hellollo";
        String st3 = st2.replace("ll", "LL");
        //String replaceAll(String regex, String replacement) 문자열중에서 지정된 문자열(regex)와 일치하는 것을 
        //새로운 문자열(리플레이스먼트)로 모두 변경한다
        String ab = "AABBAABB";
        String r = ab.replaceAll("BB","bb");//r = AAbbAAbb
        //String replaceFirst(String regex, String replacement) 문자열중에서 지정된 문자열(regex)과 일치하는 것중 첫번째 것만 새로운 문자열로 변경한다.
        String ab2 = "AABBAABB";
        String r2 = ab2.replaceFirst("BB", "bb");
        //String[] split(String regex) 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        //String[] split(String regex, int limit) 문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환한다 단, 문자열 전체를 지정된 수로 자른다.
        String animals2 = "dog,cat,bear";
        String[] arr2 = animals2.split(",",2);
        // boolean startWith(String prefix) 주어진 문자열(prefix)로 시작하는지 검사한다
        String st4 = "java.lang.Object";
        boolean bb1 = st4.startsWith("java");//true
        boolean bb2 = st4.startsWith("lang");// false
        //String substring(int begin) String substring(int begin, int end)
        //시작위치부터 끝위치 범위에 포함된 문자열을 얻는다. 이 때 시작위치의 문자는 범위에 포함되지만 끝 위치의 문자는 포함되지 않는다
        String st5 = "java.lang.Object";
        String st6 = st5.substring(10); //  "object"
        String st7 = st5.substring(5,9); // "lang"
        //String toLowerCase() String인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다.
        String st8 = "Hello";
        String st9 = st8.toLowerCase(); //"hello"
        //String toString String인스턴스에 저장되어있는 문자열을 반환한다.
        String str1 = "Hello";
        String str2 = str1.toString(); // "Hello"
        //String toUpperCase String인스턴스에 저장되어있는 문자열을 대문자로 반환한다.
        String str3 = "Hello";
        String str4 = str3.toUpperCase(); // "HELLO"
        //String trim() 문자열의 왼쪽 오른쪽 끝의 공백을 없앤 결과를 반환한다
        String str5 = "            Hello,World                                    ";
        String str6 = str5.trim();
        //static String valueOf(불린,차르,인트,롱,플롯,더블,옵젝) 지정된 값을 문자열로 변환하여 반환한다. 참조변수의 경우 투스트링을 호출한 결과를 반환한다.
        String b = String.valueOf(true);
        String c = String.valueOf('a');
        String i = String.valueOf(100);
        String l = String.valueOf(100L);
        String f = String.valueOf(10f);
        String d = String.valueOf(10.0);
        java.util.Date dd = new java.util.Date();
        String date = String.valueOf(dd);
        
}
