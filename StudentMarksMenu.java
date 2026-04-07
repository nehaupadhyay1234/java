import java.util.Scanner;

public class StudentMarksMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Enter 1 to input marks, 0 to exit:");
            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the program.");
                break;
            } else if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = scanner.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("this is good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("this is good as well");
                } else if (marks > 100 || marks < 0) {
                    System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                }
                // If marks between 60 and 89, do nothing.
            } else {
                System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        }

        scanner.close();
    }
}
