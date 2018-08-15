package factorymethod;

public class AdminUserFactoryImpl extends UserFactory {

    @Override
    public User createUser() {
        return new Admin();
    }
}
