package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    private static Map<String, Product> prototypes = new HashMap<>();

    static {
        prototypes.put("book", new Book());
        prototypes.put("toy", new Toy());
    }

    public Product getPrototype(String type) {
        return prototypes.get(type).clone();
    }
}
