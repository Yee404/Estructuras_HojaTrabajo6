import java.util.*;

public class MapFactoryC {
    public Map<String, String> getMap(int option) {
        switch (option) {
            case 1:
                return new HashMap<>();
            case 2:
                return new TreeMap<>();
            case 3:
                return new LinkedHashMap<>();
            default:
                return null;
        }
    }
}
