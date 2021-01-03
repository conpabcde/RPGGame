import object.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class GameClient extends JComponent {
    private int frameWidth;
    private int frameHeight;
    private boolean stop;
    private ArrayList<GameObject> gameObjects;

    public GameClient() {
        this(800, 600);
    }

    public GameClient(int frameWidth, int frameHeight) {
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        this.setPreferredSize(new Dimension(frameWidth, frameHeight));

        new Thread(() -> {
            while (!stop) {
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        init();
    }

    void init() {
        gameObjects = new ArrayList<>();
        Image[][] images = new Image[4][3];
        String[] index = {"U", "D", "L", "R"};
        for (int i = 0; i < images.length; i++) {
            for (int j = 0; j < images[i].length; j++) {
                images[i][j] = new Tools().setImage("princess" + index[i] + j + ".png");
            }
        }
        Roles princess = new Roles(100, 100,Direction.DOWN,images);
        gameObjects.add(princess);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (GameObject o:gameObjects) {
            o.draw(g);
        }
    }

    public int getFrameWidth() {
        return frameWidth;
    }

    public int getFrameHeight() {
        return frameHeight;
    }
}
