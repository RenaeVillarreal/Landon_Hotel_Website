package edu.wgu.d387_sample_code.taskC;


import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayMessage {
    public String getWelcomeMessage(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        return bundle.getString("welcomeMessage");
    }
}
