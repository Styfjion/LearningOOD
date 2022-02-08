package constructor.builder;

import constructor.building.Building;

public class HouseBuilder implements Builder{

    final private Building house;

    public HouseBuilder() {
        house = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("挖土方，部署管道，线缆，水泥加固，搭建围墙、花园。");
        house.setBasements("=||=||=||=||=||=||=\n");
    }

    @Override
    public void buildWall() {
        System.out.println("建造木制框架，石膏板封墙并粉饰内外墙。");
        house.setWall("|田 | 田 | 田 | 田|\n");
    }

    @Override
    public void buildRoof() {
        System.out.println("建造木制屋顶阁楼，安装烟囱，做好防水。");
        house.setRoof("◢▬▬▬▬▬▬▬▬▬▬◣\n");
    }

    @Override
    public Building getBuilding() {
        return house;
    }
}
