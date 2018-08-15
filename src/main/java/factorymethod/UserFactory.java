package factorymethod;

abstract class UserFactory {
    String makeDialog() {
        return "Hello\n" + createUser().sayHi();
    }

    abstract User createUser();
}
