package sturctural.decorator;

public class SimpleBlogPost implements BlogPost {
    private String content;

    public SimpleBlogPost(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
