package Week5;

// Question6.java

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("두 숫자의 최대공약수는: " + num1);
        scanner.close();
    }
}
