package exercise.chapter_26;

public class Teacher {
    // 학교 정보
    String schoolName;

    // 담당 과목
    Subject subject;

    // 기본 정보
    String name;
    String gender;
    int age;

    //행위

    Teacher(){

    }
    Teacher(String pname, String pgender, String psubjectName, String psubjectCode) {
        this.name = pname;
        this.gender = pgender;

        Subject newsubject = new Subject();
        newsubject.subjectName = psubjectName;
        newsubject.subjectCode = psubjectCode;

    }
    void teach(Student student, String subjectName){
        String studentName = student.name;
        System.out.printf("선생: %s 학생에게 %s 과목을 가르치고 있습니다.\n", studentName, subjectName);
    }
}
