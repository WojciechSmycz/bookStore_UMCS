import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> current_list;

    public Cart() {
        this.current_list = new ArrayList<>();
    }

    public void add_book(Book book) {
        current_list.add(book);
    }

    public List<Book> getCurrentList() {
        return current_list;
    }

    public void send_info(Book ksiazka, Object data) {
        System.out.println("[Koszyk] Wysyłanie powiadomienia o książce: " + ksiazka.title);
        System.out.println("Szczegóły zdarzenia: " + data.toString());
    }
}