package sturctural.decorator;

public class Main {
    public static void main(String[] args) {
        BlogPost post = new SimpleBlogPost("Hello, World!");

        BlogPost boldPost = new BoldDecorator(post);
        System.out.println(boldPost.getContent()); // Output: <b>Hello, World!</b>

        BlogPost italicPost = new ItalicDecorator(post);
        System.out.println(italicPost.getContent()); // Output: <i>Hello, World!</i>

        BlogPost boldItalicPost = new BoldDecorator(new ItalicDecorator(post));
        System.out.println(boldItalicPost.getContent()); // Output: <b><i>Hello, World!</i></b>
    }
}
