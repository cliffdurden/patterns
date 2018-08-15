package abstractfactory;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SaleDocumentFactoryTest {

    private DocumentFactory documentFactory;

    @Before
    public void setUp() {
        documentFactory = new SaleDocumentFactory();
    }

    @Test
    public void createDocument() {
        Document doc = documentFactory.createDocument();

        assertThat("SaleDocument", is(doc.printDocument()));
    }

    @Test
    public void createReport() {
        Report report = documentFactory.createReport();

        assertThat("SaleReport", is(report.printReport()));
    }
}