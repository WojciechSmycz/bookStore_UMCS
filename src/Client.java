import java.util.ArrayList;
import java.util.List;

public class Client extends User {
    private List<Book> favorites;
    private Cart cart;
    private float account_balance;
    private String email;

    public Client(int id, String login, String password, String email, float initialBalance) {
        super(id, login, password);
        this.email = email;
        this.account_balance = initialBalance;
        this.favorites = new ArrayList<>();
        this.cart = new Cart();
    }

    public void manage_cart(Cart cart) {
        this.cart = cart;
        System.out.println("[Klient] Zaktualizowano zawartość koszyka. Liczba przedmiotów: " + cart.getCurrentList().size());
    }

    public void manage_favorites(Object x) {
        if (x instanceof Book) {
            Book ksiazka = (Book) x;
            if (favorites.contains(ksiazka)) {
                favorites.remove(ksiazka);
                System.out.println("[Klient] Usunięto z ulubionych: " + ksiazka.title);
            } else {
                favorites.add(ksiazka);
                System.out.println("[Klient] Dodano do ulubionych: " + ksiazka.title);
            }
        }
    }

    public void close_account(String password) {
        if (this.getPassword().equals(password))
            System.out.println("[Klient] Tożsamość potwierdzona. Konto dla adresu " + email + " zostało zamknięte.");
        else
            System.out.println("[Klient] Błąd: Niepoprawne hasło. Nie można zamknąć konta.");
    }

    public void manage_acc_balance() {
        System.out.println("[Klient] Aktualny stan konta użytkownika " + getLogin() + ": " + account_balance + " zł");
    }

    public void place_order(Cart cart, Object selected) {
        System.out.println("[Klient] Składanie zamówienia na wybrane pozycje: " + selected.toString());
        float kosztCalkowity = 0;

        for (Book k : cart.getCurrentList())
            kosztCalkowity += k.price;

        if (account_balance >= kosztCalkowity) {
            account_balance -= kosztCalkowity;
            System.out.println("[Klient] Zamówienie opłacone pomyślnie. Pobrano: " + kosztCalkowity + " zł.");
            cart.getCurrentList().clear(); // Wyczyszczenie koszyka po zakupie
        } else
            System.out.println("[Klient] Błąd: Brak wystarczających środków na koncie. Wymagane: " + kosztCalkowity + " zł.");
    }
}