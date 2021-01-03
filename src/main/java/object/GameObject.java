package object;

import java.awt.*;

public abstract class GameObject {
    protected int x;
    protected int y;
    protected Image[] image;
    protected Image[][] actionImg;

    public GameObject(int x, int y, Image[] image){
        this.x = x;
        this.y = y;
        this.image = image;
    }

    public GameObject(int x, int y , Image[][] actionImg) {
        this.x = x;
        this.y = y;
        this.actionImg = actionImg;
    }

    public abstract void draw(Graphics e) ;

}
