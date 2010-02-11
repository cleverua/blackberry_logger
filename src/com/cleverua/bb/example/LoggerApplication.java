package com.cleverua.bb.example;

import net.rim.device.api.ui.UiApplication;

public class LoggerApplication extends UiApplication {
    
    private static LoggerApplication application;

    public static void main(String[] args) {
        application = new LoggerApplication();
        application.pushScreen(new LoggerApplicationScreen());
        application.enterEventDispatcher();
    }
}
