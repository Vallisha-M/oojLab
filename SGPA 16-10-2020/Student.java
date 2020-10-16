/*
Vallisha M
1BM19CS177
*/

/*
marksArray stores the marks obtained by the student in courses
creditsArray stores credits associated with each course
gradesArray stores the grade(0,4-10) according to markrs obtained

corresponding elements of theses three arrays are related to each other

example;

let
marksArray[i] = 55;
creditsArray[i] = 3;

then,
gradesArray[i] = 6;

gradesArray[i] is computed using marksArray[i]
creditsArray[i] is credits for the course in the marks obtained is marksArray[i]

*/

import java.util.Scanner;
public class Student
{
     int numberOfCourses;
     String usn, name;
     int creditsArray[];
     int marksArray[];
     int gradesArray[];
     double SGPA;
    
     void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter your Name : ");
        name = in.nextLine();
        System.out.print("Enter your USN : ");
        usn = in.next();
        System.out.print("Enter number of courses taken : ");
        numberOfCourses = in.nextInt();
        marksArray = new int[numberOfCourses];
        creditsArray = new int[numberOfCourses];
        gradesArray = new int[numberOfCourses];
        
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
    
    void computeGradesArray()
    {
        int i = 0;
        for(i=0;i<numberOfCourses;i++)
        {
            if(marksArray[i]==100)
            {
                gradesArray[i] = 10;
                continue;
            }
            if(marksArray[i]>=50)
            {
                gradesArray[i] = (marksArray[i]/10)+1;
                continue;
            }
            if(marksArray[i]>=35)
            {
                gradesArray[i] = 4;
                continue;
            }
            gradesArray[i]=0;
        }
    }
    
     void computeSGPA()
    {
        int i = 0;
        SGPA = 0.0D;
        int netCredits = 0;
        for(i = 0 ; i < numberOfCourses ; i++)
        {
            SGPA = SGPA + creditsArray[i]*gradesArray[i];
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
        object.computeGradesArray();
        object.computeSGPA();
        object.display();
    }
}
