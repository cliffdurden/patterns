package factorymethod;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AdminUserFactoryImplTest {

    @Test
    public void testAdminDialog() {
        UserFactory userFactory = new AdminUserFactoryImpl();

        assertThat("Hello\nHi, I am Admin", is(userFactory.makeDialog()));
    }
}