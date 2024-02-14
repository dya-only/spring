package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        this(name, age, 50);  // 아래 생성자에 grade값만 지정하여 중복 제거
        // this()는 생성자 안에서 첫줄에만 사용 가능
    }

    MemberConstruct(String name, int age, int grade) {  // 생성자 있으므로 기본 생성자 자동 생성X
        System.out.println("생성자 호출 name: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
