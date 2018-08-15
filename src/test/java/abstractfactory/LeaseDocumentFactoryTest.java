package abstractfactory;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LeaseDocumentFactoryTest {

    private DocumentFactory documentFactory;

    @Before
    public void setUp() {
        documentFactory = new LeaseDocumentFactory();
    }

    @Test
    public void createDocument() {
        Document doc = documentFactory.createDocument();

        assertThat("LeaseDocument", is(doc.printDocument()));
    }

    @Test
    public void createReport() {
        Report report = documentFactory.createReport();

        assertThat("LeaseReport", is(report.printReport()));
    }
}