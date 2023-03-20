package project.chap8;

//page 308
public class J8_16 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보하세요");
        } catch (MemoryException me) {
            System.out.println("에러 메시지 : " + me.getMessage());
            me.printStackTrace();
            System.gc(); // 가비지 콜렉션 수행(여유 메모리 증가)
            System.out.println("다시 해보세요");
        } finally {
            deleteTempFiles();// 임시 파일 삭제
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치 공간이 없어");
        if (!enoughMemory())
            throw new MemoryException("메모리가 부족해");
    }

    static void copyFiles() {
        /* 파일 복사 코드 적기 */}

    static void deleteTempFiles() {
        /* 파일 삭제 코드 적기 */}

    static boolean enoughSpace() {
        // 설치 필요한 공간이 있는지 확인하는 코드
        return false;
    }

    static boolean enoughMemory() {
        // 설치 필요한 메모리 있는지 확인하는 코드
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
