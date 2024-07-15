import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********GRADE CALCULATOR******");
        System.out.println("Enter the number of subjects:");
        int subjects = sc.nextInt();
        int totalMarks = 0;
        for (int i = 0; i < subjects; i++) {
            System.out.println("Enter marks obtained in subject :" + (i+1) + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        double average = (double) totalMarks / subjects;
        char Grade = 'A';
        if (average >= 90) {
            System.out.println(Grade = 'O');
        } else if (average >= 80) {
            System.out.println(Grade = 'A');

        } else if (average >= 70) {
            System.out.println(Grade = 'B');
        } else if (average >= 60) {
            System.out.println(Grade = 'C');
        } else if (average >= 50) {
            System.out.println(Grade = 'D');
        } else {
            System.out.println("Fail");
        }
        System.out.println("Total Marks Scored :" + totalMarks);
        System.out.println("Average Percentage is:" + average);
        System.out.println("Grade obtained :" + Grade);
    }
}