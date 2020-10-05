import java.util.Scanner;

class triangle
{
  public static void main(String args[])
  {
    int k = 0, n, i, j;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    n = in.nextInt();
    for(i = 1;i < n; i++)
    {
      for(j = 1; j<=i;j++)
        System.out.print(++k+" ");
      System.out.println();
    }
  }
}
