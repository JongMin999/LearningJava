package mission;

public class ChuncheonTicket3 {
    public static void main(String[] args) {
        int aliceAge = 70;
        int kimAge = 65;
        int yooAge = 42;

        String aliceCountry = "미국";
        String kimCountry = "한국";
        String yooCountry = "한국";

        final int SENIOR_AGE_STANDARD = 65;

        boolean isHalfPriceForAlice = (aliceAge >= SENIOR_AGE_STANDARD) && (aliceCountry == "한국");
        boolean isHalfPriceForKim = (kimAge >= SENIOR_AGE_STANDARD) && (kimCountry == "한국");
        boolean isHalfPriceForYoo = (yooAge >= SENIOR_AGE_STANDARD) && (yooCountry == "한국");

        System.out.println("Alice는 적용 대상자인가?");
        System.out.println(isHalfPriceForAlice);
        System.out.println("Kim은 적용 대상자인가?");
        System.out.println(isHalfPriceForKim);
        System.out.println("Yoo는 적용 대상자인가?");
        System.out.println(isHalfPriceForYoo);
    }
}
