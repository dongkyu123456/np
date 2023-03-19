package project.chap7;

//page 224
class Tv {
    boolean power; // 전원상태(on/off)
    int channel; // 채널

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class SmartTv extends Tv {
    boolean caption; // 캡션상태(on/off)

    void displayCaption(String text) {
        if (caption) { // 캡션 상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}

public class J7_2 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("헬로 월드");
        stv.caption = true;
        stv.displayCaption("헬로 월드");
    }
}
