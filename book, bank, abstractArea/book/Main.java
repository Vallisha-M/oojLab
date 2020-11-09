import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of books : ");
        int n = in.nextInt();
        Book books[] = new Book[n];
        String name, authorName;
        
        int num_pages, price;
        int i;
        for(i = 0;i<n;i++) {
            System.out.print("\n\nEnter name of book "+(i+1)+" : ");
            name = in.next();
            System.out.print("Enter name of author of book "+(i+1)+" : ");
            authorName = in.next();
            System.out.print("Enter price of book "+(i+1)+" : ");
            price = in.nextInt();
            System.out.print("Enter number of pages in book "+(i+1)+" : ");
            num_pages = in.nextInt();
            books[i] = new Book(name, authorName, price, num_pages);
        }
        System.out.println("\n\nThe details of books are ;");
        for(i = 0;i < n;i++) {
            System.out.println("\n\nBook "+(i+1));
            System.out.println(books[i].toString());
        }
    }
}