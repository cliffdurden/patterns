package factorymethod;


public class DefaultUserFactoryImpl extends UserFactory {

    @Override
    public User createUser() {
        return new DefaultUser();
    }
}