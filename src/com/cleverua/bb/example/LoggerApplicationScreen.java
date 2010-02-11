package com.cleverua.bb.example;

import com.cleverua.bb.logger.Logger;

import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.Dialog;
import net.rim.device.api.ui.container.MainScreen;

public class LoggerApplicationScreen extends MainScreen {

    private static final String SCREEN_TITLE = "Logger Demo";
    private static final String BUTTON_LABEL = "Test the Logger";

    private ButtonField testLoggerButton;

    public LoggerApplicationScreen() {
        super();
        initUI();
    }

    private void initUI() {
        setTitle(SCREEN_TITLE);

        // Set some top padding in order the testLoggerButton is not stuck to
        // the screen border.
        getMainManager().setPadding(10, 0, 0, 0);

        testLoggerButton = new ButtonField(BUTTON_LABEL, FIELD_HCENTER);

        testLoggerButton.setChangeListener(new FieldChangeListener() {
            public void fieldChanged(Field f, int c) {
                Logger.debug(this, BUTTON_LABEL + " has been fired!");
                Dialog.inform("Log entry has been put to \"" + Logger.LOG_FILE + "\".");
            }
        });

        add(testLoggerButton);
    }

    protected boolean onSavePrompt() {
        return true;
    }
}