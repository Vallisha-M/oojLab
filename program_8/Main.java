import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter father's age : ");
        int fatherAge = in.nextInt();
        System.out.print("Enter son's age : ");
        int sonAge = in.nextInt();
        in.close();
        Son son;
        try {
            son = new Son(sonAge, fatherAge);
            System.out.println("No Errors");
        }
        catch(AgeLessThanZeroException exception) {
            System.out.println(exception.getMessage());
        }
        catch(SonOlderThanFatherException exception) {
            System.out.println(exception.getMessage());
        }
    }
}