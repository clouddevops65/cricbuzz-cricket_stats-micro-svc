package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class CourseController {
    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
//create three endpoints getMenBattingrankings and getMenBowlingrankings and getAllrounderrankings
    @GetMapping("/icc-rankings/men/batting")
    public List<String> getMenBattingrankings(){
        logger.info("added for failing sonar build");
        return Arrays.asList("ICC Cricket Rankings - Men's Batting: T20, Poistions", "1: Suryakumar Yadav, 2: Mohammad Rizwan, 3: Devon ConWay" );
    }

    @GetMapping("/icc-rankings/men/bowling")
    public List<String> getMenBowlingrankings(){
        return Arrays.asList("ICC Cricket Rankings - Men's Bowling: T20, Positions", "1: Wanindu Hasaranga, 2: Rashid Khan, 3: Adil Rashid");
    }
    @GetMapping("/icc-rankings/men/all-rounder")
    public List<String> getAllrounderrankings(){
        return Arrays.asList("ICC Cricket Rankings - Men's All-Rounders: T20, Positions", "1:Shakib Al Hasan, 2: Mohammad Nabi, 3: Hardik Pandya");
    }

}
