package homeworkweek1;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer guess = 5;
        Integer inputNum =0;
        for ( int i = 0 ; i<=100 ; i++){
            System.out.println(i);
        }
        do {
            System.out.println("Input number :");
            inputNum = input.nextInt();
            if ( inputNum < guess){
                System.out.println("Higher");
            }else if ( inputNum > guess ){
                System.out.println("Lower");
            }else {
                System.out.println("You are correct");
                break;
            }
        }while (inputNum<=10);
    }
}
