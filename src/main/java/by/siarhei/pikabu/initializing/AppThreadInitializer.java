package by.siarhei.pikabu.initializing;

import by.siarhei.pikabu.frame.AppMainFrameInitializer;
import by.siarhei.pikabu.frame.MainFramePanel;


public class AppThreadInitializer implements Runnable {
    @Override
    public void run() {
        MainFramePanel mainFramePanel = new MainFramePanel();
        new AppMainFrameInitializer(mainFramePanel);
    }
}
