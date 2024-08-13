package behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class Blog {
    private List<Subscriber> subscribers = new ArrayList<>(); // Observer listesi
    private String latestPost;

    // Yeni yazı yayınlandığında tüm gözlemcileri bilgilendirir
    public void publishNewPost(String post) {
        this.latestPost = post;
        notifyAllSubscribers();
    }

    // Aboneleri (okuyucuları) ekler
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Tüm abonelere yeni yazıyı gönderir
    public void notifyAllSubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestPost);
        }
    }
}