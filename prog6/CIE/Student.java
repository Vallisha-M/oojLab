package CIE;

public class Student {
    private String name, usn;
    private int sem;
    public Student(String name, String usn, int sem) {
        this.name = name;
        this.usn = usn;
        this.sem = sem;
    }
    public Student() {
        name = usn = null;
        sem = 0;
    }
    @Override
    public String toString() {
        return String.format("Name : "+name+"\nUSN : "+usn+"\nSemester : "+sem+"\n");
    }
}