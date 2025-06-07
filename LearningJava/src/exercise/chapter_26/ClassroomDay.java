package exercise.chapter_26;

import exercise.chapter_26.Teacher;

public class ClassroomDay {
    public static void main(String[] args) { // 실행 클래스
        // 학생 4명
        Student student1 = new Student("School", 1, 3, 20, "BoB", "Male", 8);
        Student student2 = new Student("School", 1, 3, 21, "Alice", "Female", 8);
        Student student3 = new Student("School", 1, 3, 22, "John", "Male", 8);
        Student student4 = new Student("School", 1, 3, 23, "Jenny", "Female", 8);

        Teacher teacher = new Teacher("Tracer", "Female", "국어", "AB001");

        String subjectName = "국어";
        teacher.teach(student1, subjectName);
        student1.study(teacher, subjectName);
    }
}
