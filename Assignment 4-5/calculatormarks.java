import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    String name;
    int rollno;
    double[] marks;
    double average;
    char grade;

    Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollno = rollNo; 
        this.marks = marks;
 for (double mark : marks) {
            if (mark < 0 || mark > 100) { 

                throw new IllegalArgumentException("Marks must be between 0 and 100");
            }

    }

 
    void calculateAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark; 
        }
        this.average = total / marks.length;
    }

    void calculateGrade() {
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + rollno);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage: " + average);
        System.out.println("Grade: " + grade);
    }
}

class calculatormarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int rollno;
        double[] marks = new double[5];

        try {
            System.out.println("Enter name:");
            name = sc.nextLine();
            System.out.println("Enter rollno:");
            rollno = sc.nextInt();
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter the marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextDouble();             }

            Student e = new Student(name, rollno, marks);
           // e.vmarks(marks); 
            e.calculateAverage(); 
            e.calculateGrade(); 
            e.displayinfo(); 

        } catch (InputMismatchException a) {
            System.out.println("Invalid input. enter numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution successful.");
            
        }
    }
}
