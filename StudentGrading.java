package my.student;

import java.util.Scanner;


public class StudentGrading {
	public static void main(String[]args) {
		Scanner gr = new Scanner(System.in);

        int totalStudents = 0, passes = 0, fails = 0;

        while (true) {
            System.out.print("Enter student marks (0-100) or -1 to stop: ");
            int marks = gr.nextInt();

       
            if (marks == -1) break;

            totalStudents++;

          
            char grade;
            if (marks >= 80) grade = 'A';
            else if (marks >= 70) grade = 'B';
            else if (marks >= 60) grade = 'C';
            else if (marks >= 50) grade = 'D';
            else grade = 'F';

            System.out.println("Grade: " + grade);

        
            if (marks >= 50) passes++;
            else fails++;
        }

   
        System.out.println("\n--- CLASS REPORT ---");
        System.out.println("Total students: " + totalStudents);
        System.out.println("Passes: " + passes);
        System.out.println("Fails: " + fails);

        if (totalStudents > 0) {
            double passRate = (passes * 100.0) / totalStudents;
            System.out.printf("Pass Rate: %.2f%%\n", passRate);
        }
	}
}
