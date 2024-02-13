package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;  // data가 null이므로 NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
