package com.jupiter.schedule.schedule_service.scheduler;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BatchScheduler {

    @Scheduled(cron = "${batch.scheduler.schedule}")
    @SchedulerLock(name = "${batch.scheduler.name}", lockAtLeastFor = "${batch.scheduler.lock-at-least-for}",
            lockAtMostFor = "${batch.scheduler.lock-at-most-for}")
    public void batchScheduleTask() {


    }
}
