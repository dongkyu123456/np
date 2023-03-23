package project.chap12;

import project.chap12.J12_17.Card.Kind;
import project.chap12.J12_17.Card.Value;

public class J12_17 {
    public static void main(String[] args) {
        Card card = new Card(Kind.CLOVER,Value.ACE);
        System.out.println(card);
    }

    // p 475
    static class Card {
        enum Kind {
            CLOVER, HEART, DIAMOND, SPADE
        } // 열거형 카인드 정의

        enum Value {
            TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
        }// 열거형 밸류 정의

        final Kind kind;
        final Value value;

        public Card(Kind kind, Value value) {
            this.kind = kind;
            this.value = value;

        }
    }

}