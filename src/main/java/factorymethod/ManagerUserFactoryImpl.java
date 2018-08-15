package factorymethod;

public class ManagerUserFactoryImpl extends UserFactory {

    @Override
    public User createUser() {
        return new Manager();
    }
}
