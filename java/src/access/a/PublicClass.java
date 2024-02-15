package access.a;

// Public Class는 파일 당 하나
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

// Default Class는 같은 패키지 안에서 사용 가능
class DefaultClass1 {

}

class DefaultClass2 {

}