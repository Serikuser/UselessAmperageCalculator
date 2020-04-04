package by.siarhei.pikabu.initializing;

import javax.swing.*;

public class Start {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new AppThreadInitializer());
    }
}
