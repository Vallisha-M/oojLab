abstract class Area {
    int dim1, dim2;
    Area(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract void printArea();
}