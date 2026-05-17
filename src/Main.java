import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICJALIZACJA SYSTEMU SKLEPU Z KSIĄŻKAMI ===");

        // Tworzenie książek
        Book k1 = new Book("Wiedźmin", "Andrzej Sapkowski", 49.99f, "Fantasy", 5);
        Book k2 = new Book("Czysty Kod", "Robert C. Martin", 69.00f, "Programowanie", 1);

        // Przygotowanie magazynu
        Stock magazyn = new Stock();
        magazyn.add_to_warehouse(k1, k1.quantity);
        magazyn.add_to_warehouse(k2, k2.quantity);

        // Wyświetlenie książek przez klienta
        Showcase panelWyboru = new Showcase();
        List<Book> katalog = new ArrayList<>();
        katalog.add(k1);
        katalog.add(k2);
        panelWyboru.display(katalog);

        // Inicjalizacja ról i aktorów systemu
        Client klient = new Client(101, "marysiaCougar", "haslo123", "marysia@mail.com", 150.00f);
        Employee sprzedawca = new Employee(201, "mirekIYKYK", "feet2", "mirek@sklep.pl");
        SuperAdmin admin = new SuperAdmin(1, "boss", "adminGodMode");

        // Symulacja scenariusza działań
        klient.tryLogin("janusz99", "haslo123");
        klient.manage_favorites(k1); // Dodanie do ulubionych

        Cart koszykKlienta = new Cart();
        koszykKlienta.add_book(k1);
        koszykKlienta.add_book(k2);
        klient.manage_cart(koszykKlienta);

        klient.manage_acc_balance();
        klient.place_order(koszykKlienta, "Zamówienie_Krajowe_Standard");

        // Działania sprzedawcy i admina
        sprzedawca.authorize_user(klient);
        sprzedawca.transaction(klient, 118.99f);

        admin.manage_sprzedawca(sprzedawca);
        magazyn.send_something(sprzedawca.emailKontaktowy);
    }
}