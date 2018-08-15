package factorymethod;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DefaultUserFactoryImplTest {

    @Test
    public void testDefaultUserDialog() {
        UserFactory userFactory = new DefaultUserFactoryImpl();

        assertThat("Hello\nHello, I am default", is(userFactory.makeDialog()));
    }

}