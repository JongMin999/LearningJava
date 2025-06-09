package exercise.chapter_37;

public interface FamilyRole extends DadRole, HusbandRole{
    @Override
    default void sayLoveEveryDay() {
        HusbandRole.super.sayLoveEveryDay();
        DadRole.super.sayLoveEveryDay();
    }
}
