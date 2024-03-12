import java.util.Map;

public class HashMap implements MapFactory {

    @Override
    public Map<String, Integer> createMap() {
        return new HashMap<>();
    }

}
