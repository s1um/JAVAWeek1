package Week5;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("1 이상의 숫자를 입력하세요: ");
            number = scanner.nextInt();
        } while (number < 1);

        System.out.println("입력한 값: " + number);
        scanner.close();
    }
}
