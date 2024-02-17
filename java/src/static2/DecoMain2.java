package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";

        String deco = DecoUtil2.deco(s);  // 클래스 메서드, 객체 생성 없이 바로 접근

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}