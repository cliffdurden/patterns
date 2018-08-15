package abstractfactory;

public class LeaseDocument implements Document {

    @Override
    public String printDocument() {
        return "LeaseDocument";
    }
}
