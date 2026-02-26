package bookstore.util;

import bookstore.model.Book;
import bookstore.model.Employee;
import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static ArrayList<Book> loadBooks(String filename) {
        ArrayList<Book> books = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                books.add(new Book(
                        data[0],
                        data[1],
                        Double.parseDouble(data[2]),
                        Integer.parseInt(data[3])
                ));
            }
        } catch (Exception e) {
            System.out.println("Error loading books");
        }

        return books;
    }

    public static void saveBooks(String filename, ArrayList<Book> books) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (Book b : books) {
                pw.println(b.toFileString());
            }
        } catch (Exception e) {
            System.out.println("Error saving books");
        }
    }

    public static ArrayList<Employee> loadEmployees(String filename) {
        ArrayList<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                employees.add(new Employee(data[0], data[1]));
            }
        } catch (Exception e) {
            System.out.println("Error loading employees");
        }

        return employees;
    }
}
