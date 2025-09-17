package my.attendance;

import java.util.Scanner;
public class AttendanceTracker {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students in the class: ");
        int classSize = sc.nextInt();

        int[] attendance = new int[30]; 
        int days = 0;
        String choice;


        do {
            System.out.print("Enter number of students present on day " + (days + 1) + ": ");
            attendance[days] = sc.nextInt();
            days++;

            sc.nextLine();
            System.out.print("Enter another day? (yes/no): ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("yes") && days < 30);


        int totalAttendance = 0;
        int lowDays = 0;

        System.out.println("\n--- ATTENDANCE REPORT ---");
        System.out.printf("%-10s %-10s\n", "Day", "Present");

        for (int i = 0; i < days; i++) {
            System.out.printf("%-10d %-10d\n", (i + 1), attendance[i]);
            totalAttendance += attendance[i];

            if (attendance[i] < classSize / 2.0) {
                lowDays++;
            }
        }

        double average = totalAttendance / (double) days;
        double lowPercent = (lowDays * 100.0) / days;

        System.out.println("--------------------------");
        System.out.printf("Average Attendance: %.2f\n", average);
        System.out.printf("Low Attendance Days: %d (%.2f%%)\n", lowDays, lowPercent);
    }
	}

