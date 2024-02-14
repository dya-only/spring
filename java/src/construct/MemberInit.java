package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // MemberInit() {}  // 생성자가 없다면 기본 생성자 자동 생성

    void initMember (String name, int age, int grade) {
        this.name = name;  // this: 멤버변수를 가르킴
        this.age = age;
        this.grade = grade;
    }
}
