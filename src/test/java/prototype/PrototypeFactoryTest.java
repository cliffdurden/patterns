package prototype;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class PrototypeFactoryTest {

    private PrototypeFactory prototypeFactory;

    @Before
    public void setUp() {
        prototypeFactory = new PrototypeFactory();
    }

    @Test
    public void shouldReturnPrototypeOfBook() {
        assertThat("This is a book!", is(prototypeFactory.getPrototype("book").getInfo()));
    }

    @Test
    public void shouldReturnDifferentBookObjects() {
        assertThat(prototypeFactory.getPrototype("book"), is(not(prototypeFactory.getPrototype("book"))));
    }

    @Test
    public void shouldReturnPrototypeOfToy() {
        assertThat("This is a toy!", is(prototypeFactory.getPrototype("toy").getInfo()));
    }

    @Test
    public void shouldReturnDifferentToyObjects() {
        assertThat(prototypeFactory.getPrototype("toy"), is(not(prototypeFactory.getPrototype("toy"))));
    }
}