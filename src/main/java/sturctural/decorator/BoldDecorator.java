package sturctural.decorator;

public class BoldDecorator extends BlogPostDecorator {
    public BoldDecorator(BlogPost blogPost) {
        super(blogPost);
    }

    @Override
    public String getContent() {
        return "<b>" + decoratedBlogPost.getContent() + "</b>";
    }
}
