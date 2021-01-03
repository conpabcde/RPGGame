import object.GameObject;

import java.awt.*;

public class Roles extends GameObject {

    Direction direction;
    MoveAction mAction;
    private int moveIndex;
    private boolean[] dir;

    public Roles(int x, int y,Direction direction, Image[][] actionImg) {
        super(x, y, actionImg);
        this.direction = direction;
        init();
    }

    @Override
    public void draw(Graphics e) {
        e.drawImage(actionImg[direction.ordinal()][mAction.ordinal()], x, y, null);
    }

    public void init() {
        dir = new boolean[4];
        mAction = MoveAction.SECOND;
    }

    public void detectDirs() {
        if (dir[0]) {
            direction = Direction.UP;
        } else if (dir[1]) {
            direction = Direction.DOWN;
        } else if (dir[2]) {
            direction = Direction.LEFT;
        } else if (dir[3]) {
            direction = Direction.RIGHT;
        }
    }

    public void move() {
        switch (direction) {
            case UP:
                y -= y;
                break;
            case DOWN:
                y += y;
                break;
            case LEFT:
                x -= x;
                break;
            case RIGHT:
                x += x;
                break;
        }
    }

    public void moveAction() {
        switch (mAction) {
            case FIRST:
                break;
            case SECOND:
                break;
            case THIRD:
                break;
            default:
                break;
        }
    }

    public boolean[] getDir() {
        return dir;
    }
}
