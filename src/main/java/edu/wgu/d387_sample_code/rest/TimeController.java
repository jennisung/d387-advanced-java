package edu.wgu.d387_sample_code.rest;
import edu.wgu.d387_sample_code.locale.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TimeController {
    private TimeService timeService;

    public TimeController(TimeService timeService) {

        this.timeService= timeService;

    }

    @GetMapping("/presentationTimes")
    public String getPresentationTimes() {
        return timeService.convertTimeZones();
    }

}
