package project.chap8;

import java.io.*;

//page 305
public class J8_13 {
    public static void main(String[] args) {
        try {
            // File f = createFile(""); // 파일 이름을 null로 입력해야 "파일 이름이 유효하지 않습니다가 뜬다"
            File f = createFile("hello.txt"); // hello text를 생성하고 "hello.txt파일 생성 완료"를 출력한다
            System.out.println(f.getName() + "파일 생성 완료");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력하세요");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals(""))
            throw new Exception("파일 이름이 유효하지 않습니다.");
        File f = new File(fileName); // 파일 객체 생성
        // 파일 객체의 크레이트 뉴파일 메서드를 이용하여 실제 파일을 생성
        f.createNewFile();
        return f;
    }
}
