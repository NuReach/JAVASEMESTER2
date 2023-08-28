package lesson;

import java.util.Scanner;

public class week4ex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input number of student");
		int student = input.nextInt();
		System.out.println("I"
				+ "nput number of paper");
		int paper = input.nextInt();
		double[][] array = new double[student][paper];
		double[] total = new double[student];
		for( int r=0; r< array.length ; r++ ) {
			for( int c=0 ; c<array[r].length;c++){
				System.out.println("Input score of student" + (r+1) + " :" );
				double num = input.nextDouble();
				array[r][c] = num;
				total[r] = num+total[r];
			}
			
		}
		double max = 0;
		int index = 0;
		for( int r=0; r< total.length ; r++ ) {
			if (total[r]>max) {
				max= total[r];
				index++;
			}
		}
		for( int r=0; r< total.length ; r++ ) {
			System.out.println("The average of student "+(1+r)+" is :"+total[r]/paper);
		}
		System.out.println("Student has the highest average is student number " + index);
	}
}
