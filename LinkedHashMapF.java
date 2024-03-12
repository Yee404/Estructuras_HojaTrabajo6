import java.util.Map;

public class LinkedHashMapF implements MapFactoryIn {
    @Override
    public Map<String, Integer> createMap() {
        return new LinkedHashMap<>();
    }
}