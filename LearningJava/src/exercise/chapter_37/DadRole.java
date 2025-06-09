package exercise.chapter_37;

public interface DadRole {
    void educateBaby(Baby baby);
    default void sayLoveEveryDay(){
        System.out.println("우리 아기 사랑합니다.");
    }
}
