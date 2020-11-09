import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int dim1, dim2;
        System.out.println("Enter 1 for Triangle");
        System.out.println("Enter 2 for Rectangle");
        System.out.println("Enter 3 for Circle");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:{
                System.out.print("Enter height of triangle : ");
                dim1 = sc.nextInt();
                System.out.print("Enter base of triangle : ");
                dim2 = sc.nextInt();
                Triangle triangle = new Triangle(dim1, dim2);
                triangle.printArea();
                break;
            }
            case 2:{
                System.out.print("Enter width of Rectangle : ");
                dim1 = sc.nextInt();
                System.out.print("Enter length of Rectangle : ");
                dim2 = sc.nextInt();
                Rectangle rectangle = new Rectangle(dim1, dim2);
                rectangle.printArea();
                break;
            }
            case 3:{
                System.out.print("Enter radius of circle : ");
                dim1 = sc.nextInt();
                Circle circle = new Circle(dim1);
                circle.printArea();
                break;
            }
            default:
            System.out.println("Wrong Input");
        }
        sc.close();
    }
}