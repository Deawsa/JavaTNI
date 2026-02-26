package bookstore.model;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void addStock(int amount) {
        stock += amount;
    }

    public boolean reduceStock(int amount) {
        if (stock >= amount) {
            stock -= amount;
            return true;
        }
        return false;
    }

    public String toFileString() {
        return title + "," + author + "," + price + "," + stock;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               " | Author: " + author +
               " | Price: " + price +
               " | Stock: " + stock;
    }
}
