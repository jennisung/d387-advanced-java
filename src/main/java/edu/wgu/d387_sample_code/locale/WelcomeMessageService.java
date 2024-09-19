package edu.wgu.d387_sample_code.locale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ArrayList;
import java.util.List;

public class WelcomeMessageService {
    private Locale locale;
    private ResourceBundle resourceBundle;



    public List<String> getWelcomeMessages() {

        List<String> welcomeMessages = new ArrayList<>();

        Thread englishThread = new Thread(() -> {

            ResourceBundle bundleEng = ResourceBundle.getBundle("welcomemessages_ENG");
            String greetingEnglish = bundleEng.getString("Welcome");
            synchronized (welcomeMessages) {
                welcomeMessages.add(greetingEnglish);
            }
        });


        Thread frenchThread = new Thread(() -> {

            ResourceBundle bundleFr = ResourceBundle.getBundle("welcomemessages_FR");
            String greetingFrench = bundleFr.getString("Welcome");
            synchronized (welcomeMessages) {
                welcomeMessages.add(greetingFrench);
            }
        });


        englishThread.start();

        frenchThread.start();

        try {
            englishThread.join();
            frenchThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return welcomeMessages;

    }
}