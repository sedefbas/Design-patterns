package sturctural.proxy;

public class UserServiceImpl implements UserService {

    @Override
    public void addUser(String username) {
        System.out.println("User " + username + " added successfully.");
    }
}
