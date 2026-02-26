package bookstore.service;

import bookstore.model.Book;
import java.util.ArrayList;

public class BookStore {

    private ArrayList<Book> books;

    public BookStore(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Book searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public String showAllBooks() {
        String result = "";
        for (Book b : books) {
            result += b.toString() + "\n";
        }
        return result;
    }
}
