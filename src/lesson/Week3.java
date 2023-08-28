package lesson;

import java.util.Scanner;

public class Week3 {
//	public static void main(String[] args) {
//		double sum= 0;
//		double average;
//		double[] moduleScore = { 60,55,61,45,85 };
//		for( int i=0; i<moduleScore.length ; i++ ) {
//			sum = moduleScore[i]+sum;
//		}
//		average = sum/moduleScore.length;
//		System.out.println("The avergae score of Jean is : "+average);
//	}
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int[] numbers = new int[5];
//		double sum = 0;
//		double average;
//		int i = 0;
//		 do {
//		    	System.out.println("Input number" + (i+1) +" : ");
//		    	int num = input.nextInt();
//		    	numbers[i] = num;
//		    	sum += num;
//		    	i++;
//			} while (i <5);
//		 average = sum/numbers.length;
//		 
//		int max =0;
//		int index = 0;
//		 System.out.println("The avergae score of Jean is : "+average);
//		 for( int j=0; j<numbers.length ; j++ ) {
//			for( int z=0 ; z<numbers.length ;z++ ) {
//				if( numbers[z] > numbers[j] ) {
//					max=numbers[z];
//					index= z++;
//				}
//			}
//		 }
//		 System.out.println("The max is : "+ max + " from module " + index  );
//	}
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int[][] array = new int[2][3];
//		
//		for( int r=0; r< array.length ; r++ ) {
//			for( int c=0 ; c<array[r].length;c++){
//				int num = input.nextInt();
//				array[r][c] = num;
//			}
//		}
//	}
	
//	public static void main(String[] args) {
//		double total =0;
//		double average ;
//		int[][] array = { {60,55,70},{80,60,41} } ;
//		for( int r=0; r< array.length ; r++ ) {
//			for( int c=0 ; c<array[r].length;c++){
//				total= total + array[r][c];
//			}
//	}
//		average = total/array[0].length;
//		System.out.println(average);
//	}	

	public static void average(double[] numbers) {
		double sum=0;
		double average;
		for( int i=0; i<numbers.length;i++ ) {
			sum = sum+numbers[i];
		}
		average = sum/numbers.length;
		System.out.println(average);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[2];
		int i =0;
		do {
			int num = input.nextInt();
			for(int r =0; r<numbers.length ; r++) {
				numbers[r] = num;
			}
			i++;
;		} while (i<3);
		average(numbers);
		
	}


}

