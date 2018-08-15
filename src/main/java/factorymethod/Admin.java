package factorymethod;

public class Admin implements User {

    @Override
    public String sayHi() {
        return "Hi, I am Admin";
    }
}
