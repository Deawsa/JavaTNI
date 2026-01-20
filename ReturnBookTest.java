import javax.swing.*;

public class ReturnBookTest {
    public static void main(String[] args) {
        Book book = new Book("java Programming",5);


        int confirm = JOptionPane.showConfirmDialog(null, "Do you want to borrow/return book?", "Borrow/Return Book",JOptionPane.YES_NO_OPTION);

         while(true) {
             if (confirm == 0) {

                 int newconfirn = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to borrw book\nPress 2 to return book"));
                 if (newconfirn == 1) {
                     if (book.getAvailableBook() != 0) {
                         book.borrowBook();
                         System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books.");
                     }else{JOptionPane.showMessageDialog(null,"NO books avaliable to borrow...","Warning Message",JOptionPane.WARNING_MESSAGE);continue;}
                 } else if (newconfirn == 2) {
                     if (book.getTotalBook() == book.getAvailableBook()) {
                         JOptionPane.showMessageDialog(null, "Cannot return! All books are already here.”");
                               continue;
                     }else{book.returnBook();
                     System.out.println("Returned 1 book, available "+book.getAvailableBook()+" books.");
                     continue;}
                 }else{JOptionPane.showMessageDialog(null,"END PROGRAM");break;}
             }else{JOptionPane.showMessageDialog(null,"END PROGRAM");break;}

         }

    }

}
