public class Book {
    private String name, author;
    private int price, num_pages;
    Book() {
        this.name = null;
        this.author = null;
        this.price = 0;
        this.num_pages = 0;
    }
    Book(String name, String author, int price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }
    @Override
    public String toString() {
        return String.format("Book Name : "+name+"\nAuthor Name : "+author+"\nBook Price : "+price+"\nNumber of Pages : "+num_pages);
    }
}