package homeworkweek1;

import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number :");
        float firstNum = input.nextFloat();
        System.out.println("Input second number :");
        float secondNum = input.nextFloat();
        System.out.println("Input third number :");
        float thirdNum = input.nextFloat();
        float average = (firstNum+secondNum+thirdNum)/3;
        System.out.println("Average is :" + average);
    }
}
