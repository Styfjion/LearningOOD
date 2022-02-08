package constructor.building;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Building {

    final private List<String> buildingComponents = new ArrayList<>();

    public void setBasements(String base) {
        buildingComponents.add(base);
    }

    public void setWall(String wall) {
        buildingComponents.add(wall);
    }

    public void setRoof(String roof) {
        buildingComponents.add(roof);
    }

    @Override
    public String toString() {
        StringBuilder buildingStr = new StringBuilder();
        Collections.reverse(buildingComponents);
        buildingComponents.forEach(buildingStr::append);
        return buildingStr.toString();
    }
}
