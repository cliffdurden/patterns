package abstractfactory;

public class LeaseDocumentFactory implements DocumentFactory {

    @Override
    public Document createDocument() {
        return new LeaseDocument();
    }

    @Override
    public Report createReport() {
        return new LeaseReport();
    }
}
