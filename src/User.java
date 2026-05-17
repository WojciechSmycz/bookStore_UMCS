public class User {
    private String login;
    private String password;
    private int id;
    private boolean isLoggedIn = false;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public String getLogin() { return login; }
    public int getId() { return id; }
    protected String getPassword() { return password; }

    private void login(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            this.isLoggedIn = true;
            System.out.println("Użytkownik " + login + " zalogował się pomyślnie.");
        } else {
            this.isLoggedIn = false;
            System.out.println("Błąd logowania: Niepoprawny login lub hasło.");
        }
    }

    public void tryLogin(String login, String password) {
        login(login, password);
    }
}