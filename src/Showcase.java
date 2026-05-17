import java.util.List;

public class Showcase {
    public void display(List<Book> list_of_books) {
        System.out.println("\n--- LISTA DOSTĘPNYCH KSIĄŻEK ---");
        if (list_of_books == null || list_of_books.isEmpty()) {
            System.out.println("Brak pozycji do wyświetlenia.");
            return;
        }
        for (int i = 0; i < list_of_books.size(); i++) {
            Book k = list_of_books.get(i);
            System.out.println((i + 1) + ". " + k.toString() + " | Dostępna ilość: " + k.quantity + " [Tagi: " + k.tags + "]");
        }
        System.out.println("--------------------------------\n");
    }
}