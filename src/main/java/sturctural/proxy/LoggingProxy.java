package sturctural.proxy;

public class LoggingProxy implements UserService {

    private UserService userService;

    public LoggingProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void addUser(String username) {
        beforeAddUser();
        userService.addUser(username);
        afterAddUser();
    }

    private void beforeAddUser() {
        System.out.println("Before adding user...");
    }

    private void afterAddUser() {
        System.out.println("After adding user...");
    }
}
