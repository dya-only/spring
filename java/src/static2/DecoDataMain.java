package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();


    }
}
