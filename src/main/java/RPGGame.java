import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class RPGGame {
    static GameClient gameClient;
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        gameClient = new GameClient(1024,768);
        frame.add(gameClient);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        System.out.println(e.getKeyCode());

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                }
        );
    }
}
