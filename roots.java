import java.util.Scanner;
public class roots{
     double a,b,c,d;
     roots(double a, double b, double c)
     {
         this.a = a;
         this.b = b;
         this.c = c;
     }
     public static void main(String []args)
     {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b, c : ");
        
        double a1 = in.nextDouble();
        double b1 = in.nextDouble();
        double c1 = in.nextDouble();
        in.close();
        
        roots obj = new roots(a1, b1, c1);
        obj.d = obj.discriminant();
        
        if(obj.d>0)
            obj.distinct();
        else if(obj.d==0)
            obj.equal();
        else
            obj.imaginary();
     }
     public double discriminant()
     {
         return(b*b-4*a*c);
     }
     public void distinct()
     {
         double x = Math.sqrt(d);
         double r1 = (-1*b+x)/(2*a);
         double r2 = (-1*b-x)/(2*a);
         System.out.println("\nThe roots are real and distinct;\n");
         System.out.println("First Root : "+r1);
         System.out.println("Second Root : "+r2);
     }
     public void equal()
     {
         double x = Math.sqrt(d);
         double r1 = (-1*b+x)/(2*a);
         System.out.println("\nThe roots are real and equal;\n");
         System.out.println("Root : "+r1);
     }
     public void imaginary()
     {
         System.out.println("\nThe roots are imaginary");
         double x = Math.sqrt(-d);
         double r = (-b)/(2*a);
         double i = Math.abs(x/(2*a));
         if(r==0)r = 0;
         System.out.println("The roots are : "+r+" (+/-) i * "+i);
     }
}