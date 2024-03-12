import java.util.Map;

public class LinkedHashMap implements MapFactory {
    @Override
    public Map<String, Integer> createMap() {
        return new LinkedHashMap<>();
    }
}