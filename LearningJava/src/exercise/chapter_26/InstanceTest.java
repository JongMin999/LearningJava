package exercise.chapter_26;

public class InstanceTest {
    public static void main(String[] args) {
        //학생 4명, 선생님 1명, 과목: 국어, 영어, 수학, 기간: 5/11 ~ 5/18

        Student student1 = new Student("School", 1, 3, 20, "Bob", "male", 9);
        /*
        Student student1 = new Student();
        student1.name = "Bob";
        student1.gender = "Male";
        student1.schoolName = "School";
        student1.classYear = 1;
        student1.classRoomNumber = 3;
        student1.studentNumber = 20;
         */

        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.studentNumber);

        Student student2 = new Student();
        student2.name = "Alice";
        student2.gender = "Female";
        student2.schoolName = "School";
        student2.classYear = 1;
        student2.classRoomNumber = 3;
        student2.studentNumber = 19;

        Student student3 = new Student();
        Student student4 = new Student();

        /*
        Subject subject1 = new Subject(); // teacher보다 선행되어야 함
        subject1.subjectName = "Korean";
        subject1.subjectCode = "AB001";
         */

        Teacher teacher = new Teacher("Tom", "Male", "Korean", "AB001");
        /*
        teacher.name = "Tom";
        teacher.schoolName = "School";
        teacher.gender = "Male";
        teacher.subject = subject1;
         */

        System.out.println(teacher.subject.subjectName);
        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.subject.subjectCode);
    }

}
