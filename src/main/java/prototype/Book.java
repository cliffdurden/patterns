package prototype;

public class Book implements Product {

    private static final String INFO = "This is a book!";

    public String getInfo() {
        return INFO;
    }

    @Override
    public Product clone() {
        return new Book();
    }
}
