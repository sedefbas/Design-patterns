package creational.builder;

public class BlogPost {
    private String title;
    private String content;
    private String author;
    private String[] tags;
    private String publicationDate;

    // Private Constructor
    private BlogPost(BlogPostBuilder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
        this.tags = builder.tags;
        this.publicationDate = builder.publicationDate;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getTags() {
        return tags;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    // BlogPostBuilder Sınıfı
    public static class BlogPostBuilder {
        private String title;
        private String content;
        private String author;
        private String[] tags;
        private String publicationDate;

        public BlogPostBuilder(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public BlogPostBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BlogPostBuilder setTags(String[] tags) {
            this.tags = tags;
            return this;
        }

        public BlogPostBuilder setPublicationDate(String publicationDate) {
            this.publicationDate = publicationDate;
            return this;
        }

        public BlogPost build() {
            return new BlogPost(this);
        }
    }
}
