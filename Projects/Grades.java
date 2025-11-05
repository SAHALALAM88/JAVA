
import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number of Subjects : ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter The Marks Of Subject " + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("The Marks of Subject " + (i + 1) + " : " + marks[i]);
        }
        System.out.println("Do You Want To Check Your Grade? : ");

        String choice = sc.next();
        while (choice.equalsIgnoreCase("Yes")) {

            for (int i = 0; i < n; i++) {
                System.out.print("The Grade Of Subject " + (i + 1) + " is : ");

                if (marks[i] >= 90) 
                {
                    System.out.println("Grade A+");
                } 
                else if (marks[i] >= 80) 
                {
                    System.out.println("Grade A");
                } 
                else if (marks[i] >= 70) 
                {
                    System.out.println("Grade B+");
                } 
                else if (marks[i] >= 60) 
                {
                    System.out.println("Grade B");
                } 
                else if (marks[i] >= 50) 
                {
                    System.out.println("Grade C");
                } 
                else if (marks[i] >= 40) 
                {
                    System.out.println("Pass");
                } 
                else 
                {
                    System.out.println("You Are Failed!");
                }

            }
            System.out.println();
            System.out.println("Do You Want To Check Again? (Yes/No): ");
            choice = sc.next();
        }

        sc.close();
    }
}

