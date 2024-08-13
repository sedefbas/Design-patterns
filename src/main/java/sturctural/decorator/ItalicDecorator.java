package sturctural.decorator;

public class ItalicDecorator extends BlogPostDecorator {
    public ItalicDecorator(BlogPost blogPost) {
        super(blogPost);
    }

    @Override
    public String getContent() {
        return "<i>" + decoratedBlogPost.getContent() + "</i>";
    }
}
