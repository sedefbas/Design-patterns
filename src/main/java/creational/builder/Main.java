package creational.builder;

public class Main {
    public static void main(String[] args) {
        BlogPost post = new BlogPost.BlogPostBuilder("My First Post", "This is the content of my first post.")
                .setAuthor("John Doe")
                .setTags(new String[]{"Java", "Design Patterns", "Programming"})
                .setPublicationDate("2024-07-17")
                .build();

        System.out.println("Title: " + post.getTitle());
        System.out.println("Content: " + post.getContent());
        System.out.println("Author: " + post.getAuthor());
        System.out.println("Tags: " + String.join(", ", post.getTags()));
        System.out.println("Publication Date: " + post.getPublicationDate());
    }
}
