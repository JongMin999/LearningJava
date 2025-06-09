package exercise.chapter_37;

public class MaleTwo extends FamilyMan implements FamilyRole, EmployeeRole {


    @Override
    public void workTogether(EmployeeRole employeeRole) {

    }

    @Override
    public String getName() {
        return this.name;
    }

    public MaleTwo(String name) {
        this.name = name;
    }
}
