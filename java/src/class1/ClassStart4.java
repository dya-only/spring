package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();  // 메모리에 실제 사용할 공간 생성 -> 메모리 참조값 반환 및 저장
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student(); student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }

        // iter
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        // Reference value
        System.out.println("student1: " + student1);
        System.out.println("student2: " + student2);
    }
}
