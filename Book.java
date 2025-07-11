import java.security.PublicKey;

public class Book {
    String title;
    String author;
    double price;

    //default constructor
    Book() {
        this.title = "No books in stock";
        this.author = "Unknown";
        this.price = 0.0;
    }

    //parameterized constructor
    Book(String title) {
        this(title, "Unknown Author", 0.0);
    }

    //parameterized
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Display some details
    //new method
    public String getAuthor(String author) { // update author details in main file=
        this.author = author;
        return author;
    }

    public void details() { //obj field
        System.out.println("Title:  " + this.title);
        System.out.println("Author:  " + this.author);
        System.out.println("The price:  " + this.price);
    }

    public void setPrice(double price) {
        if(price >= 0.0)
            this.price = price;
        if(price < 0.0)
            this.details();
        System.out.println("Error: Price can't be negative.");
    }

    public void Discount(double discountPercent) {
        if (discountPercent > 0.0 && discountPercent < 100.0) {
            double discountAmount = (discountPercent / 100.0) * this.price;
            this.price = this.price - discountAmount;
            System.out.printf("Discount applied. New price: %.2f%n", discountPercent, this.price);
        } else {
            System.out.println("Error: Discount must be between 0.00 and 100.00.");
        }
    }
}
