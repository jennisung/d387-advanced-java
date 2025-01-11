package edu.wgu.d387_sample_code.locale;
import org.springframework.stereotype.Service;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


@Service
public class TimeService {
    public String convertTimeZones(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm z");


        ZonedDateTime easternTime =ZonedDateTime.now(ZoneId.of("America/New_York"));

        ZonedDateTime mountainTime = easternTime.withZoneSameInstant(ZoneId.of("America/Denver"));

        ZonedDateTime universalTime= easternTime.withZoneSameInstant(ZoneId.of("UTC"));

        return String.format("ET: %s, MT: %s, UTC: %s",

                easternTime.format(formatter),
                mountainTime.format(formatter),
                universalTime.format(formatter));
    }
}

