package edu.wgu.d387_sample_code.taskC;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeConversion {

    public String getConvertedTimes(ZonedDateTime presentationTime) {
        String convertedTimes = convertTime(presentationTime, ZoneId.of("America/New_York")) +
                "\nMT: " + convertTime(presentationTime, ZoneId.of("America/Denver")) +
                "\nUTC: " + convertTime(presentationTime, ZoneId.of("UTC"));

        return convertedTimes;
    }

    protected String convertTime(ZonedDateTime originalTime, ZoneId targetZone) {
        ZonedDateTime convertedTime = originalTime.withZoneSameInstant(targetZone);
        int hours = convertedTime.getHour();
        int minutes = convertedTime.getMinute();
        String amPm = (hours <12) ? "AM" : "PM";
        hours = (hours == 0 || hours == 12) ? 12: hours % 12;
        return String.format("%d:%02d %s", hours, minutes, amPm);
        //return String.format("%02d:%02d", hours, minutes);
    }
}

