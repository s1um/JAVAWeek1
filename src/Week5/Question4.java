package Week5;


public class Question4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("현재 숫자: " + i);
            if (i == 50) {
                System.out.println("50을 찾았습니다! 반복을 중단합니다.");
                break;
            }
        }
    }
}