package bookstore.service;

import bookstore.model.Book;
import java.util.ArrayList;

public class Cart {

    private ArrayList<Book> items = new ArrayList<>();

    public void addToCart(Book book) {
        items.add(book);
    }

    public String showCart() {
        String result = "";
        double total = 0;

        for (Book b : items) {
            result += b.getTitle() + " - " + b.getPrice() + "\n";
            total += b.getPrice();
        }

        result += "\nTotal: " + total;
        return result;
    }
}
