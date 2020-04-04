package by.siarhei.pikabu.frame;

import javax.swing.*;
import java.awt.*;

public class AppMainFrameInitializer extends JFrame {
    private static final String ICON_LABEL = "icon";
    private static final String IMAGES_FOLDER_NAME = "/images/";
    private static final String EXPANSION_PNG = ".png";
    private static final String FRAME_NAME = "One more useless app";

    public AppMainFrameInitializer(Component... components) {
        setTitle(FRAME_NAME);
        setSize(640, 480);
        setIconImage(getImage(ICON_LABEL));
        for (Component component : components) {
            add(component);
        }
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private Image getImage(String name) {
        String filename = IMAGES_FOLDER_NAME + name.toLowerCase() + EXPANSION_PNG;
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        return icon.getImage();
    }
}
