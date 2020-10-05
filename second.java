import java.util.Scanner;
class second
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter CIE marks : ");
		int cie = in.nextInt();
		System.out.print("Enter SEE marks : ");
		int see = in.nextInt();
	if((cie<0)||(cie>50)||(see<0)||(see>50))
	{
		System.out.println("Invalid Input");
		System.exit(0);
	}
	int total = cie+see;
	char grade = 'F';
	if(total >= 90)
		grade = 'S';
	else if(total>=80)
		grade = 'A';
	else if(total>=70)
		grade = 'B';
	else if(total>=60)
		grade = 'C';
	else if(total>=50)
		grade = 'D';
	else if(total>=45)
		grade = 'E';
	System.out.println("Grade : "+grade);
	}
}