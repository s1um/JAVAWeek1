package Week5;

// Question7.java

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long factorial = 1;

        System.out.print("팩토리얼을 계산할 숫자를 입력하세요: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("음수의 팩토리얼은 정의되지 않습니다.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println(number + "! = " + factorial);
        }

        scanner.close();
    }
}
