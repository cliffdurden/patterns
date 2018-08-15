package abstractfactory;

public class SaleDocumentFactory implements DocumentFactory {

    @Override
    public Document createDocument() {
        return new SaleDocument();
    }

    @Override
    public Report createReport() {
        return new SaleReport();
    }
}
