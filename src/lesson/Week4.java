package lesson;

import java.util.Scanner;

public class Week4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//
		double[] semester = new double[6];
		double total =0;
		int i=0;
		while (i<6) {
			System.out.println("Input semester " + (i+1) +" score :"  );
			double score = input.nextDouble();
			semester[i] = score;
			total = score + total;
			i++;
		}
		//
		double average;
		average = total/6;
		//
		double max=0;
		int index = 0;
		 for( int j=0; j<semester.length ; j++ ) {
			 if ( semester[j]>max ) {
				max = semester[j];
				index++;
			}
		 }
		System.out.println("Total score is : "+total);
		System.out.println("average score is : "+average);
		System.out.println("The max is : "+ max + " from semester " + index  );
		
	}
}
