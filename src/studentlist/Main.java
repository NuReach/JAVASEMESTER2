package studentlist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student[] student = new Student[2];
		int j =0;
		while ( j < student.length) {
			System.out.println("Input name,age,id :");
			String name = input.next();
			int age = input.nextInt();
			int id = input.nextInt();
			student[j] = new Student(name, age, id);
			j++;
		}
		for(int i = 0 ; i<student.length; i++) {
			System.out.println(student[i].id+" "+student[i].name+" "+student[i].age);
		}
	}

}
