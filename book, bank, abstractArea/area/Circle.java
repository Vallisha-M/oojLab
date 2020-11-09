public class Circle extends Area {
    Circle(int dim) {
        super(dim, dim);
    }
    void printArea() {
        double area = 3.142*dim1*dim2;
        System.out.println("Area of circle is "+area);
    }
}