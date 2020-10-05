import java.util.Scanner;
class fourth
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int c = 0;
			System.out.println("Enter 1 for cylinder");
			System.out.println("Enter 2 for cone");
			System.out.println("Enter 3 for sphere");
			System.out.println("Enter -1 to exit");
			System.out.print("Enter your choice : ");
			c = in.nextInt();
			if(c == -1)	break;
			double area, volume;
			switch(c)
			{
				case 1:
				{
					double h, r;
					System.out.print("Enter height of the cylinder : ");
					h = in.nextDouble();
					System.out.print("Enter radius of the cylinder : ");
					r = in.nextDouble();
					area = 2*3.14*r*h+3.14*2*r*r;
					volume = 3.14*r*r*h;
					System.out.println("Surface Area = "+area);
					System.out.println("Voulume = "+volume+"\n\n");
					break;
				}
				case 2:
				{
					double h, r;
					System.out.print("Enter height of the cone : ");
					h = in.nextDouble();
					System.out.print("Enter radius of the cone : ");
					r = in.nextDouble();
					area = 3.14*r*r+3.14*r*Math.sqrt(h*h+r*r);
					volume = 3.14*r*r*h/3;
					System.out.println("Surface Area = "+area);
					System.out.println("Voulume = "+volume+"\n\n");
					break;
				}
				case 3:
				{
					double r;
					System.out.print("Enter radius of the sphere : ");
					r = in.nextDouble();
					area = 4*3.14*r*r;
					volume = 3.14*r*r*r/3;
					System.out.println("Surface Area = "+area);
					System.out.println("Voulume = "+volume+"\n\n");
					break;
				}
				default:
				{
					System.out.println("\n\nInvalid Input\n\n");
				}
			}
		}
	}
}
