import java.util.Scanner;

public class Letter_Grade_Checker {
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {

        System.out.print("Student First Name: ");
        String firstName = input.next();

        System.out.print("Student Last Name: ");
        String lastName = input.next();

        System.out.print("Student's Grade: ");
        int percentage = input.nextInt();

        String letterGrade;

        if (percentage <= 100 && percentage >= 97) {
            letterGrade = "A+";
        }else if (percentage <= 96 && percentage >= 93){
            letterGrade = "A";
        }else if (percentage <= 92 && percentage >= 90){
            letterGrade = "A-";
        }else if (percentage <= 89 && percentage >= 87){
            letterGrade = "B+";
        }else if (percentage <= 86 && percentage >= 83){
            letterGrade = "B";
        }else if (percentage <= 82 && percentage >= 80){
            letterGrade = "B-";
        }else if (percentage <= 79 && percentage >= 77){
            letterGrade = "C+";
        }else if (percentage <= 76 && percentage >= 73){
            letterGrade = "C";
        }else if (percentage <= 72 && percentage >= 70){
            letterGrade = "C-";
        }else if (percentage <= 69 && percentage >= 67){
            letterGrade = "D+";
        }else if (percentage <= 66 && percentage >= 63){
            letterGrade = "D";
        }else if (percentage <= 62 && percentage >= 60){
            letterGrade = "D-";
        }else {
            letterGrade = "F";
        }

        // %s are placeholders you can make, and after the print statement you add what you want to replace it with! //
        System.out.printf("%s %s received an %s", firstName, lastName, letterGrade);

    }
}
