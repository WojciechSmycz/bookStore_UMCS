public class SuperAdmin extends User {

    public SuperAdmin(int id, String login, String password) {
        super(id, login, password);
    }

    public void manage_sprzedawca(Employee employee) {
        System.out.println("[SuperAdmin] Zarządzanie sprzedawcą o ID: " + employee.getId());

        employee.emailKontaktowy = "admin_verified_" + employee.getLogin() + "@system.pl";
        System.out.println("[SuperAdmin] Zaktualizowano e-mail sprzedawcy na: " + employee.emailKontaktowy);
    }
}