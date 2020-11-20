import java.util.Scanner;
import CIE.*;
import SEE.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int sem, n, i, j;
        String name, usn;
        System.out.print("Enter number of students : ");
        n = in.nextInt();
        int marks[][] = new int[n][5];
        int arr[] = new int[5];
        Student stu[] = new Student[n];
        Internals internal[] = new Internals[n];
        External ext[] = new External[n];
        for(i = 0;i<n;i++) {
            System.out.println("-----Student "+(i+1)+"-----\n");
            System.out.print("Enter Name : ");
            name = in.next();
            System.out.print("Enter USN : ");
            usn = in.next();
            System.out.print("Enter Semester : ");
            sem = in.nextInt();
            stu[i] = new Student(name, usn, sem);
            for(j = 0; j<5 ; j++){
                System.out.print("Enter CIE marks in course "+(j+1)+" : ");
                arr[j] = in.nextInt();
            }
            System.out.println("\n\n");
            internal[i] = new Internals(arr);
            for(j = 0; j<5 ; j++){
                System.out.print("Enter SEE marks in course "+(j+1)+" : ");
                arr[j] = in.nextInt();
            }
            ext[i] = new External(arr);
        }
        in.close();
        for(i = 0;i<n;i++)
            for(j = 0;j<5;j++)
                marks[i][j] = internal[i].getMark(j) + ((ext[i].getMark(j))/2);
        System.out.println("\n-----STUDENT DETAILS-----\n\n");
        for(i = 0;i<n;i++) {
            System.out.println("-----Student "+(i+1)+"-----\n\n");
            System.out.println(stu[i].toString());
            for(j = 0;j<5;j++) {
                System.out.println("Marks scored in course "+(j+1)+" : "+marks[i][j]);
            }
            System.out.println("----------------------------------\n\n");
        }
    }
}