package sturctural.decorator;

public abstract class BlogPostDecorator implements BlogPost {
    protected BlogPost decoratedBlogPost;

    public BlogPostDecorator(BlogPost blogPost) {
        this.decoratedBlogPost = blogPost;
    }

    @Override
    public String getContent() {
        return decoratedBlogPost.getContent();
    }
}

