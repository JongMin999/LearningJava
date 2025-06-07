package exercise.chapter_26;

public class Student{
    // 속성
    String schoolName;
    int classYear;
    int classRoomNumber;
    int studentNumber;

    // 기본 정보
    String name;
    String gender;
    int age;

    // 행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.name;
        System.out.printf("저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }
    //생성자
    Student(){

    }
    Student(String pschoolName, int pclassYear, int pclassRoomNumber, int pstudentNumber, String pname, String pgender, int page){
        this.schoolName = pschoolName;
        this.classYear = pclassYear;
        this.classRoomNumber = pclassRoomNumber;
        this.studentNumber = pstudentNumber;
        this.name = pname;
        this.gender = pgender;
        this.age = page; // p를 붙인 이유는 파라미터인 것을 확인하기 위해서.
    }
}
