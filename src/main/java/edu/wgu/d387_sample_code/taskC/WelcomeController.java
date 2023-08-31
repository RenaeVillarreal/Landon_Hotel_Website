package edu.wgu.d387_sample_code.taskC;

import edu.wgu.d387_sample_code.model.request.SendMessages;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class WelcomeController {

    @GetMapping("/welcome")
    public SendMessages getCombinedWelcomeMessage() {
        AtomicReference<String> combinedMessage = new AtomicReference<>("");
        Thread englishThread = new Thread(() -> {
            DisplayMessage displayMessage = new DisplayMessage();
            //System.out.println("English: " + displayMessage.getWelcomeMessage(Locale.US));
            String englishWelcomeMessage = displayMessage.getWelcomeMessage(Locale.US);
            combinedMessage.updateAndGet(message -> message + " \nEnglish: " + englishWelcomeMessage +"\n");
        });

        Thread frenchThread = new Thread(() -> {
            DisplayMessage displayMessage = new DisplayMessage();
            //System.out.println("French: " + displayMessage.getWelcomeMessage(Locale.CANADA_FRENCH));
            String frenchWelcomeMessage = displayMessage.getWelcomeMessage(Locale.CANADA_FRENCH);
            combinedMessage.updateAndGet(message -> message + " \nFrench: " + frenchWelcomeMessage + "\n");
        });

        englishThread.start();
        frenchThread.start();

        try {
            englishThread.join();
            frenchThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new SendMessages(combinedMessage.get());
    }


}
