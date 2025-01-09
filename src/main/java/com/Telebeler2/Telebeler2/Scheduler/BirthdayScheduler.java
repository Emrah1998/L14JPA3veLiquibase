package com.Telebeler2.Telebeler2.Scheduler;

import com.Telebeler2.Telebeler2.SERVICE.TelebeService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BirthdayScheduler {
    private final TelebeService telebeService;

    @Scheduled(fixedDelayString = "PT1S")
    @SchedulerLock(name = "sendBirthdayEmail",lockAtLeastFor = "PT1S",lockAtMostFor = "PT1M")
    @SneakyThrows
    public void sendBirthdayEmail() {
        Thread.sleep(1000L);
        telebeService.sendBirthdayEmail();
        telebeService.saveTelebe2();
//
//    @Scheduled(cron =  "0 0 0 * * ?")
//    @SchedulerLock(name = "sendBirthdayEmail",lockAtLeastFor = "PT1S",lockAtMostFor = "PT1M")
//    @SneakyThrows
//    public void sendBirthdayEmail() {
//        Thread.sleep(5000L);
//        telebeService.sendBirthdayEmail();


//    @Scheduled(fixedDelay = 1000L)
//    @SchedulerLock(name = "sendBirthdayEmail",lockAtLeastFor = "PT1S",lockAtMostFor = "PT1M")
//    @SneakyThrows
//    public void sendBirthdayEmail() {
//        Thread.sleep(3000L);
//        telebeService.sendBirthdayEmail();
    }
}
