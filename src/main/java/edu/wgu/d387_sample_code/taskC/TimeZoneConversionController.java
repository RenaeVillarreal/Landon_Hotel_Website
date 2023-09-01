package edu.wgu.d387_sample_code.taskC;

import edu.wgu.d387_sample_code.model.request.ConvertedTimes;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.atomic.AtomicReference;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class TimeZoneConversionController {

    @GetMapping("/converted-times")
    public ConvertedTimes getCombinedConvertedTimes() {
        AtomicReference<String> convertedTimes = new AtomicReference<>("");
        ZonedDateTime presentationTime = ZonedDateTime.now();

        Thread etThread = new Thread(() -> {
            TimeConversion timeConversion = new TimeConversion();
            String etTime = timeConversion.convertTime(presentationTime, ZoneId.of("America/New_York"));
            convertedTimes.updateAndGet(times -> times + "\nET: " + etTime);
        });

        Thread mtThread = new Thread(() -> {
            TimeConversion timeConversion = new TimeConversion();
            String mtTime = timeConversion.convertTime(presentationTime, ZoneId.of("America/Denver"));
            convertedTimes.updateAndGet(times -> times + "\nMT: " + mtTime);
        });

        Thread utcThread = new Thread(() -> {
            TimeConversion timeConversion = new TimeConversion();
            String utcTime = timeConversion.convertTime(presentationTime, ZoneId.of("UTC"));
            convertedTimes.updateAndGet(times -> times + "\nUTC: " + utcTime);
        });

        etThread.start();
        mtThread.start();
        utcThread.start();

        try {
            etThread.join();
            mtThread.join();
            utcThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new ConvertedTimes(convertedTimes.get());
    }
}


