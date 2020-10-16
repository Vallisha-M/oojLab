/*
Vallisha M
1BM19CS177
*/

/*
marksArray stores the marks obtained by the student in courses
creditsArray stores credits associated with each course
gradeArray stores the grade(0,4-10) according to markrs obtained

corresponding elements of theses three arrays are related to each other

example;

let
marksArray[i] = 55;
creditsArray[i] = 3;

then,
gradeArray[i] = 6;

gradeArray[i] is computed using marksArray[i]
creditsArray[i] is credits for the course in the marks obtained is marksArray[i]

*/

import java.util.Scanner;
public class Student
{
     int numberOfCourses;
     String usn, name;
     int creditsArray[];
     int marksArray[];
     int gradeArray[];
     double SGPA;
    
     void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = in.nextLine();
        System.out.print("Enter your USN : ");
        usn = in.next();
        System.out.print("Enter number of courses taken : ");
        numberOfCourses = in.nextInt();
        marksArray = new int[numberOfCourses];
        creditsArray = new int[numberOfCourses];
        gradeArray = new int[numberOfCourses];
        
        int i = 0;
        
	System.out.println();
        for(i = 0;i < numberOfCourses; i++)
        {
            System.out.print("Enter Credits for course "+(i+1)+" : ");
            creditsArray[i] = in.nextInt();
            System.out.print("Enter marks obtained in course "+(i+1)+" : ");
            marksArray[i] = in.nextInt();  
	    System.out.println();         
        }
        in.close();
    }
    
    void computeGradeArray()
    {
        int i = 0;
        for(i=0;i<numberOfCourses;i++)
        {
            if(marksArray[i]==100)
            {
                gradeArray[i] = 10;
                continue;
            }
            if(marksArray[i]>=50)
            {
                gradeArray[i] = (marksArray[i]/10)+1;
                continue;
            }
            if(marksArray[i]>=35)
            {
                gradeArray[i] = 4;
                continue;
            }
            gradeArray[i]=0;
        }
    }
    
     void computeSGPA()
    {
        int i = 0;
        SGPA = 0.0D;
        int netCredits = 0;
        for(i = 0 ; i < numberOfCourses ; i++)
        {
            SGPA = SGPA + creditsArray[i]*gradeArray[i];
            netCredits = netCredits+creditsArray[i];
        }
        SGPA = SGPA/netCredits;
    }
    
     void display()
    {
	System.out.println();
        System.out.println("USN : "+usn);
        System.out.println("Name : "+name);
        System.out.println("Number of Courses taken this semester : "+numberOfCourses);
        int i = 0;
        for(i = 0;i<numberOfCourses; i++)
            System.out.println("Marks scored in course "+(i+1)+" is "+marksArray[i]);
        System.out.println("SGPA : "+SGPA);
        
    }
    public static void main(String []args)
    {
        Student object = new Student();
        object.input();
        object.computeGradeArray();
        object.computeSGPA();
        object.display();
    }
}
