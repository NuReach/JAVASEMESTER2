package lesson;
import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//ex1
//		for (int i = 0; i < 5; i++) {
//			int num = input.nextInt();
//			System.out.println("number " + (i+1) + " is: " + num);
//		}
		//ex2
//		int i = 0;
//		while (i<5) {
//			int num = input.nextInt();
//			System.out.println("number " + (i+1) + " is: " + num);
//			i++;
//		}
		//ex3
//		int i = 0;
//		do {
//		int num = input.nextInt();
//		System.out.println("number " + (i+1) + " is: " + num);
//		i++;
//		} while (i<5);
		//ex4
//		System.out.println("Input one number");
//		int num = input.nextInt();
//		for (int i = 1; i < 11; i++) {
//		System.out.println( num + " x " + i + " = " + num*i );
//		ex5
//		int i =1;
//		int sum = 0;
//		do {
//			System.out.println("Input number" + i +" : ");
//			int num = input.nextInt();
//			if( num <= 0) {
//				num = 0;
//			}else {
//			sum = sum + num;
//			}
//			i++;
//		} while ( i <= 5);
//		System.out.println( "sum is : " + sum );
//		ex6	
//		int i=1;
//		int sum=0;
//		while (true) {
//			System.out.println("Input number" + i +" : ");
//			int num = input.nextInt();
//			i++;
//			if(num==5)
//			break;
//			sum += num;
//		}
//		System.out.println( "sum is : " + sum );
//		input.close();
		
//		ex7 
		int i=0;
		int sum=0;
		int[] numbers = new int[5];
	    do {
	    	System.out.println("Input number" + (i+1) +" : ");
	    	int num = input.nextInt();
	    	numbers[i] = num;
	    	sum += num;
	    	i++;
		} while (i <5);
	    
	    for( int j = 0 ; j<numbers.length ; j++) {
	    	System.out.println("Input number " + (j+1) +" : " + numbers[j]);
	    }
	    System.out.println("The sum is : " + sum);
	    
	}
	
}

