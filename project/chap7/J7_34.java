package project.chap7;

//page 261
public class J7_34 {
    public static void main(String[] args) {
        Unit[] group = {
                new Marine(),
                new Tank(),
                new Dropship()
        };
        for (int i = 0; i < group.length; i++)
            group[i].move(100, 200);
    }
}

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        /* 현재 위치에 정지 */ }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine x= " + x + ", y= " + y + "]");
    }

    void steamPack() {
        /* 스팀팩 사용 */}
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank x= " + x + ", y= " + y + "]");
    }

    void changeMode() {
        /* 모드 변경 */}
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship x= " + x + ", y= " + y + "]");
    }

    void load() {
        /* 태우기 */}

    void unload() {
        /* 내리기 */}
}
