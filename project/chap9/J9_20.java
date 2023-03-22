package project.chap9;

//page 346
public class J9_20 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01"); // 지정된 문자열값을 담은 버퍼를 가진 StringBuffer 인스턴스를 생성한다
        StringBuffer sb2 = sb.append(23); //매개변수로 입력된 값을 문자열로 변환하여 스트링 버퍼 인스턴스가 저장하고 있는 문자열의 뒤에 덧붙인다
        sb.append('4').append(56); // 매개변수로 입력된 값을 문자열로 변환하여 스트링 버퍼 인스턴스가 저장하고 있는 문자열의 뒤에 덧붙인다
        System.out.println(sb); // 0123456 -> 의미하는 바는? 메서드 4개를 합쳤다.
        System.out.println(sb2); // 0123456 -> ?? 얜 왜 123456인가
        //sb.append(23)값을 줬다 -> 그럼 0123이 아닌가?
        //sb.append의 변화에 따라 sb2, sb3는 실시간으로 변화한다
        StringBuffer sb3 = sb.append(78);
        System.out.println(sb3);
        sb3.append(9.0);
        
        System.out.println("sb = "+sb);
        System.out.println("sb2 = "+sb2);
        System.out.println("sb3 = "+sb3);

        System.out.println("sb = "+sb.deleteCharAt(0)); // 지정된 위치(인덱스)의 문자를 제거한다
        System.out.println("sb = "+sb.delete(3,6)); // 시작점으로 부터 끝위치 직전까지의 문자를 제거한다. 끝 위치의 문자는 제거하지 않는다
        System.out.println("sb = "+sb.insert(3,"abc"));// 두번째 매개변수값을 문자열로 변환하여 지정된 위치에 추가한다. pos는 0부터 시작한다(인덱스와 같다)
        System.out.println("sb = "+sb.replace(6,sb.length(),"END"));//지정 범위의 문자들을 주어진 문자열로 바꾼다, 끝 위치의 문자는 제거하지 않는다
        System.out.println(sb2);// sb값과 같다
        
        System.out.println("capacity = "+sb.capacity());//스트링버퍼 인스턴스의 버퍼 크기를 알려준다
        //버퍼 사이즈가 18인 이유? 선언할때 스트링값 "01"+16으로 18?
        System.out.println("length = "+sb.length());//버퍼에 담긴 문자열의 길이를 알려준다
    }
}
//"Buffer"는 컴퓨터 프로그래밍에서 일시적으로 데이터를 저장하거나 
//전송 속도를 조절하는 데 사용되는 메모리 영역을 의미합니다.
// 버퍼는 데이터가 처리되는 동안 발생하는 임시적인 지연이나 혼잡을 완화하고, 
//송수신하는 데이터의 양이나 속도가 불규칙하게 변하는 경우에도 
//데이터 전송을 보다 안정적으로 수행할 수 있도록 돕습니다.