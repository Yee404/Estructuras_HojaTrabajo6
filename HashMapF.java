import java.util.Map;

public class HashMapF implements MapFactoryIn {

    @Override
    public Map<String, Integer> createMap() {
        return new HashMap<>();
    }

}
