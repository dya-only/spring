package oop1;

public class ValueData {
    int value;

    void add() {  // 객체에서 메서드를 선언하므로 static X
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
