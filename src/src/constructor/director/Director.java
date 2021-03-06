package constructor.director;

import constructor.builder.Builder;
import constructor.building.Building;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Building direct() {
        System.out.println("=======工程项目启动=======");
        builder.buildBasement();
        builder.buildWall();
        builder.buildRoof();
        System.out.println("=======工程项目完工=======");
        return builder.getBuilding();
    }
}
