package flyweight.model.impl;

import flyweight.model.Drawable;

public class River implements Drawable {
    final private String image;

    public River() {
        this.image = "河流";
        System.out.println("从磁盘加载【" + image + "】图片，耗时半秒......");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("在位置【" + x +":" + y + "】上绘制图片【" + image + "】图片。");
    }
}
