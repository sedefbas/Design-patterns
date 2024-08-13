package sturctural.proxy;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserService loggingProxy = new LoggingProxy(userService);

        loggingProxy.addUser("john_doe");
    }
}


//decorater benziyor çünkü ikiside composition ilkesine dayanıyor.