package Prac;

public class MaxArray {
    public static void main(String[] array){
        int[] numbers = {10, 20, 30, 40, 50};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                System.out.println("최대값: " + max + "max가 더 작습니다.");
                max = numbers[i];
            }else{
                System.out.println("최대값: " + max + "max가 더 작습니다.");
            }
        }

        System.out.println("최대값: " + max);  // 50 출력
    }
}
