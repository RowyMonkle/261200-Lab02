import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Book myBook = new Book("my book", "Natthakritta", 0.0);

    Scanner myObj = new Scanner(System.in);

    myBook.details();
    Book ourbook = new Book("Our book");
    ourbook.details();
    ourbook.setPrice(-100.0); //need to create some code that detect price can't be negative and test it.
    ourbook.details();

        System.out.println("=========== **Books in stock** ===========");
        System.out.println(".");
        //test constructor
        Book unknown = new Book();
        unknown.details();
        
        System.out.println("=========== Discount Testing ===========");
        myBook.Discount(-20);    // Invalid
        myBook.Discount(0);      // Invalid
        myBook.Discount(100);    // Invalid
        myBook.Discount(150);    // Invalid
        myBook.Discount(0.5);    // Valid
        myBook.Discount(25.0);   // Valid
        
        System.out.println("=========== **Books in stock** ===========");
        //test parameterized
        Book No1Book = new Book("City of Glass");
        No1Book.getAuthor("Paul Auster");
        No1Book.setPrice(6.50);
        No1Book.details();

        System.out.println(".");

        Book No2Book = new Book("Utopia");
        No2Book.getAuthor("Thomas More");
        No2Book.setPrice(-7.00);
        No2Book.Discount(50.00);

        System.out.println(".");

        Book No3Book = new Book("The Neverending Story");
        No3Book.getAuthor("Michael Ende");
        No3Book.setPrice(7.69);
        No3Book.Discount(-20.00);
        No3Book.details();

        System.out.println(".");

        Book No4Book = new Book("The City Of Blind");
        No4Book.setPrice(6.5);
        No4Book.Discount(-250);
        No4Book.Discount(10.50);
        No4Book.details();
        System.out.println(".");

        No3Book.Discount(20.00);
        No4Book.details();
    }
}
