import javax.swing.*;
import java.awt.*;

public class Tools {

    public Image setImage(String src) {
        return new ImageIcon("assets/images/" + src).getImage();
    }
}
