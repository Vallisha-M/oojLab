public class Rectangle extends Area {
    Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }
    void printArea() {
        double area = dim1*dim2;
        System.out.println("Area of rectangle is "+area);
    }
}