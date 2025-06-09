package exercise.chapter_37;

public class InterfaceTest {
    public static void main(String[] args) {
        //Male 3개 Female 2개
        //남편
        HusbandRole male = new Male("철수");
        Wife wife = new Female("영희");

        male.sayLoveEveryDay();
        male.takeCareWife(wife);

        //아빠
        DadRole maleDad = (DadRole) male;
        Baby  baby = new Baby("짱구");
        maleDad.educateBaby(baby);

        //회사원
        EmployeeRole employeeDad = (EmployeeRole) male;
        EmployeeRole maleEmployeeTwo = new MaleTwo("민철");

        employeeDad.workTogether(maleEmployeeTwo);
    }
}
