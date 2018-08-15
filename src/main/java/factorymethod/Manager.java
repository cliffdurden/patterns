package factorymethod;

public class Manager implements User {

    @Override
    public String sayHi() {
        return "Hi, I am Manager";
    }
}
