public class Triangle extends Area {
    Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }
    void printArea() {
        double area = dim1*dim2/2;
        System.out.println("Area of triangle is "+area);
    }
}