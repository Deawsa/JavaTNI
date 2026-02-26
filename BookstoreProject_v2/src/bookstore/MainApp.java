package bookstore;

import bookstore.model.Book;
import bookstore.model.Employee;
import bookstore.service.*;
import bookstore.util.FileManager;

import javax.swing.*;
import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {

        ArrayList<Book> books = FileManager.loadBooks("books.txt");
        ArrayList<Employee> employees = FileManager.loadEmployees("employees.txt");

        while (true) {
            boolean success = LoginSystem.login(employees);

            if (success) {
                JOptionPane.showMessageDialog(null, "Login Successful!");
                break;
            } else {
                int choice = JOptionPane.showConfirmDialog(
                        null,
                        "Login Failed. Try again?",
                        "Login",
                        JOptionPane.YES_NO_OPTION
                );

                if (choice != JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        }

        BookStore store = new BookStore(books);
        Cart cart = new Cart();

        while (true) {

            String menu = JOptionPane.showInputDialog(
                    "1. Show Books\n" +
                    "2. Add Stock\n" +
                    "3. Add To Cart\n" +
                    "4. View Cart\n" +
                    "0. Exit"
            );

            if (menu == null || menu.equals("0")) {
                FileManager.saveBooks("books.txt", store.getBooks());
                System.exit(0);
            }

            switch (menu) {

                case "1":
                    JOptionPane.showMessageDialog(null, store.showAllBooks());
                    break;

                case "2":
                    String title = JOptionPane.showInputDialog("Enter Book Title:");
                    Book book = store.searchBook(title);

                    if (book != null) {
                        int amount = Integer.parseInt(
                                JOptionPane.showInputDialog("Enter Amount:"));
                        book.addStock(amount);
                        FileManager.saveBooks("books.txt", store.getBooks());
                        JOptionPane.showMessageDialog(null, "Stock Updated");
                    } else {
                        JOptionPane.showMessageDialog(null, "Book Not Found");
                    }
                    break;

                case "3":
                    String title2 = JOptionPane.showInputDialog("Enter Book Title:");
                    Book book2 = store.searchBook(title2);

                    if (book2 != null && book2.reduceStock(1)) {
                        cart.addToCart(book2);
                        FileManager.saveBooks("books.txt", store.getBooks());
                        JOptionPane.showMessageDialog(null, "Added To Cart");
                    } else {
                        JOptionPane.showMessageDialog(null, "Out of Stock or Not Found");
                    }
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, cart.showCart());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
            }
        }
    }
}
