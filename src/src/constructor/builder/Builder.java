package constructor.builder;

import constructor.building.Building;

public interface Builder {

    void buildBasement();

    void buildWall();

    void buildRoof();

    Building getBuilding();
}
