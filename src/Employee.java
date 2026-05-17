import java.util.ArrayList;
import java.util.List;

public class Employee extends User {
    private List<Object> transactions;
    public String emailKontaktowy;

    public Employee(int id, String login, String password, String contactEmail) {
        super(id, login, password);
        this.emailKontaktowy = contactEmail;
        this.transactions = new ArrayList<>();
    }

    public void order(Object x) {
        System.out.println("[Sprzedawca] Przyjęto nowe zamówienie do realizacji: " + x.toString());
    }

    public void manage_selection(List<Object> vector) {
        System.out.println("[Sprzedawca] Aktualizacja wyboru asortymentu. Przetwarzanie " + vector.size() + " elementów.");
        for (Object item : vector) {
            System.out.println(" - Zarządzanie elementem: " + item.toString());
        }
    }

    public void authorize_user(User user) {
        System.out.println("[Sprzedawca] Autoryzacja użytkownika: " + user.getLogin());
        System.out.println("Użytkownik o ID " + user.getId() + " został zweryfikowany w bazie.");
    }

    public void transaction(User user, Object x) {
        String logTransakcji = "Transakcja dla: " + user.getLogin() + " | Przedmiot/Kwota: " + x.toString();
        transactions.add(logTransakcji);
        System.out.println("[Sprzedawca] Zarejestrowano transakcję: " + logTransakcji);
    }
}