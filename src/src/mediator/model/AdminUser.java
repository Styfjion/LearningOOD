package mediator.model;

public class AdminUser extends User{

    public AdminUser(String name) {
        super(name);
    }

    public void kick(User user) {
        user.logout();
    }
}
