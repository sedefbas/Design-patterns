package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        // Blog oluşturuluyor (Subject)
        Blog blog = new Blog();

        // Aboneler oluşturuluyor (Observer)
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        // Aboneler bloga abone oluyor
        blog.subscribe(alice);
        blog.subscribe(bob);
        blog.subscribe(charlie);

        // Blog yeni yazı yayınlıyor
        blog.publishNewPost("Understanding the Observer Pattern");

        // Blog bir başka yazı yayınlıyor
        blog.publishNewPost("Observer Pattern in Real Life Examples");
    }
}
