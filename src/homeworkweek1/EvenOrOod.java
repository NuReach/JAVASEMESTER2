package homeworkweek1;

import java.util.Scanner;

public class EvenOrOod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number :");
        Integer number = input.nextInt();
        Integer condition = number % 2;
        if ( condition == 0 ){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}
