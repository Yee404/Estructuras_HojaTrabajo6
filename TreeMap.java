import java.util.Map;

public class TreeMap implements MapFactory {
    @Override
    public Map<String, Integer> createMap() {
        return new TreeMap<>();
    }
}
