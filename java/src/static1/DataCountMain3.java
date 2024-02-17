package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);
        // static 변수에 클래스명을 통해 직접 접근
        // 힙 영역 대신 메서드 영역에서 관리

        Data3 data2 = new Data3("A");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("A");
        System.out.println("C count = " + Data3.count);

        // 인스턴스를 통한 접근 (가독성 문제로 추천X)
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}