package exercise.chapter_37;

public class Male extends FamilyMan implements HusbandRole, DadRole, EmployeeRole, FamilyRole {
    //속성
    private int age;
    private String job;

    @Override
    public void workTogether(EmployeeRole employee) {
        String name = employee.getName();
        System.out.println(name + "인 직장 동료와 업무를 하고 있습니다.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Male(String name) {
        this.name = name;
    }
}
