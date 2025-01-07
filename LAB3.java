import java.util.Scanner;
class Book {
    String name;
    String author;
    double price;
    int pages;
public Book(String name, String author, double price, int pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }
public String toString(){
return "name="+name+"\n"+"author="+author+"\n"+"price="+price+"\n"+"pages="+pages;
}
}
public class BookInfo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter details for book " + (i + 1) + ":");
            System.out.print("enter the name of book: ");
            String name = sc.nextLine();
            System.out.print("enter the name of author: ");
            String author = sc.nextLine();
            System.out.print("enter the price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("enter the number of pages: ");
            int pages = sc.nextInt();
            sc.nextLine();
            books[i] = new Book(name, author, price, pages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Details of book " + (i + 1) + ":");
            System.out.println(books[i].toString());
         
        }

        sc.close();
    }
}