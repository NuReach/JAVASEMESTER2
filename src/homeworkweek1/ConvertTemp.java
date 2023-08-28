package homeworkweek1;

import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input celsius :");
        float celsius = input.nextFloat();
        float fahrenheit = (celsius*9/5) + 32;
        System.out.println("Result is : " + fahrenheit);
    }
}
