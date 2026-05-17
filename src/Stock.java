import java.util.HashMap;
import java.util.Map;

public class Stock {
    private Map<Book, Integer> list_of_all_books;

    public Stock() {
        this.list_of_all_books = new HashMap<>();
    }

    public void add_to_warehouse(Book book_, int quantity) {
        list_of_all_books.put(book_, quantity);
    }

    public void send_something(String emplyeeEmail) {
        System.out.println("[Magazyn] Generowanie raportu o stanach magazynowych niskiego poziomu...");
        StringBuilder raport = new StringBuilder("Raport: ");

        for (Map.Entry<Book, Integer> entry : list_of_all_books.entrySet())
            if (entry.getValue() < 3)
                raport.append(entry.getKey().title).append(" (Zostało: ").append(entry.getValue()).append("); ");

        System.out.println("[Magazyn] Wysyłanie e-maila do sprzedawcy na adres: " + emplyeeEmail);
        System.out.println("Treść wiadomości: " + (raport.length() > 8 ? raport.toString() : "Wszystkie stany w normie."));
    }
}