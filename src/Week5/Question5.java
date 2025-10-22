package Week5;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("1부터 10까지의 짝수:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
