package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        // Public Class는 어디서든 접근 가능
        PublicClass publicClass = new PublicClass();

        // Default Class는 다른 패키지에서 접근 불가
//        DefaultClass1 defaultClass1 = new DefaultClass1();
//        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}