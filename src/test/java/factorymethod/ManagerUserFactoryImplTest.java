package factorymethod;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ManagerUserFactoryImplTest {

    @Test
    public void testManagerDialog() {
        UserFactory userFactory = new ManagerUserFactoryImpl();

        assertThat("Hello\nHi, I am Manager", is(userFactory.makeDialog()));
    }

}