package flyweight.factory;

import flyweight.model.Drawable;
import flyweight.model.impl.Grass;
import flyweight.model.impl.House;
import flyweight.model.impl.River;
import flyweight.model.impl.Road;

import java.util.HashMap;
import java.util.Map;

public class TileFactory {
    final private Map<String, Drawable> images;

    public TileFactory() {
        images = new HashMap<>();
    }

    public Drawable getDrawable(String image) {
        if (!images.containsKey(image)) {
            switch (image) {
                case "河流" -> images.put(image, new River());
                case "草地" -> images.put(image, new Grass());
                case "道路" -> images.put(image, new Road());
                case "房屋" -> images.put(image, new House());
            }
        }
        return images.get(image);
    }
}
