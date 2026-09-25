import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score: ");
        int score = sc.nextInt();

        char grade;

        if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else if (score >= 60)
            grade = 'D';
        else
            grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Grade: A - Excellent");
                break;
            case 'B':
                System.out.println("Grade: B - Very Good");
                break;
            case 'C':
                System.out.println("Grade: C - Good");
                break;
            case 'D':
                System.out.println("Grade: D - Pass");
                break;
            case 'F':
                System.out.println("Grade: F - Fail");
                break;
        }
    }
}