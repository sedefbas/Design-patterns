package behavioral.observer;

// Abone (Observer)
public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    // Blogdan gelen yeni yazıyı günceller
    public void update(String post) {
        System.out.println(name + " received a new blog post: " + post);
    }
}
