import java.util.Map;

public class TreeMapF implements MapFactoryIn {
    @Override
    public Map<String, Integer> createMap() {
        return new TreeMap<>();
    }
}
