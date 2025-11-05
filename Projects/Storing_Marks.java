import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number Of Students : ");
        int n = sc.nextInt();

        System.out.println("Enter The Number Of Subjects : ");
        int sub = sc.nextInt();

        String[] names = new String[n];
        int[] RollNo = new int[n];
        int[][] marks = new int[n][sub];

        for(int i=0;i<n;i++){
            System.out.println("Enter The Name Of Student " + (i+1) + " : ");
            names[i] = sc.next();

            System.out.println("Enter The Roll No. Of Student " + (i+1) + " : ");
            RollNo[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++) {
            System.out.println("Enter The Marks Of Student " + (i+1) + " : ");
            for(int j=0;j<sub;j++){
                System.out.println("Subject : " +(j+1));
                marks[i][j] = sc.nextInt();
            }    
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<sub;j++){
                System.out.println("The Marks Of Student " + (i+1) + " For Subject " + (j+1) + " : " + (marks[i][j]));
            }
        }
        
    }
}
