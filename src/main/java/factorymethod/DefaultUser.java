package factorymethod;

public class DefaultUser implements User {

    @Override
    public String sayHi() {
        return "Hello, I am default";
    }
}
