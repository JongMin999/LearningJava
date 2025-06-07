package exercise.chapter_25;

public class Student{
    // 속성
    String schoolName;
    int classYear;
    int classRoomNumber;
    int studentNumber;

    // 기본 정보
    String name;
    String gender;
    String agge;

    // 행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.name;
        System.out.printf("저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }
}
