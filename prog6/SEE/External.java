package SEE;
import CIE.Student;
public class External extends Student{
    private int marks[];
    public External(int arr[]) {
        marks = new int[5];
        for(int i = 0;i<5;i++)
            marks[i] = arr[i];
    }
    public int getMark(int i) {
        return marks[i];
    }
}