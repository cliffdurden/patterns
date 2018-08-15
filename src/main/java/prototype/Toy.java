package prototype;

public class Toy implements Product {

    private static final String INFO = "This is a toy!";

    @Override
    public String getInfo() {
        return INFO;
    }

    @Override
    public Product clone() {
        return new Toy();
    }
}
