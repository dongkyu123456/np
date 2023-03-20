package project.chap8;

//page 314-315
public class J8_19 {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException2 e) {
            InstallException ie = new InstallException("설치중 예외 발생");
            ie.initCause(e);
            throw ie;
        } catch (MemoryException2 me) {
            InstallException ie = new InstallException("설치중 예외 발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();// 임시 파일 삭제
        }
    }

    static void startInstall() throws SpaceException2, MemoryException2 {
        if (!enoughSpace()) {
            throw new SpaceException2("설치 공간이 없어");
        }

        if (!enoughMemory()) {
            throw new MemoryException2("메모리가 부족해");
            // throw new RuntimeException(new MemoryException("no memory"))
        }

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

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException2 extends Exception {
    SpaceException2(String msg) {
        super(msg);
    }
}

class MemoryException2 extends Exception {
    MemoryException2(String msg) {
        super(msg);
    }
}
