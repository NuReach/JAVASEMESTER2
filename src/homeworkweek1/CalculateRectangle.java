package homeworkweek1;

import java.util.Scanner;

public class CalculateRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length :");
        float length = input.nextFloat();
        System.out.println("Enter width :");
        float width = input.nextFloat();
        float area = width * length;
        System.out.println("Result = " + area );
    }
}
