package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;  // 정적 변수 접근
        staticMethod();  // 정적 메서드 접근

        // static에서 인스턴스 변수, 메서드 접근 불가
//        instanceValue++;
//        instanceMethod();
    }

    public void instanceCall() {
        instanceValue++;  // 인스턴스 변수 접근
        instanceMethod();  // 인스턴스 메서드 접근

        // instance에서 정적 변수, 메서드 접근 가능
        staticValue++;  // 정적 변수
        staticMethod();  // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
