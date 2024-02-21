package final1;

public class FinalLocalMain {
    public static void main(String[] args) {

        // final local variable
        final int data1;
        data1 = 10;  // 최초 한 번만 할당 가능
//        data1 = 20; // 컴파일 에러

        // final local variable 2
        final int data2 = 20;

        method(10);
    }

    static void method(final int param) {
        // param = 20;  // 컴파일 에러
    }
}
