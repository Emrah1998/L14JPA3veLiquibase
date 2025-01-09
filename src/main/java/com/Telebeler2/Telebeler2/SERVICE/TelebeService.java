package com.Telebeler2.Telebeler2.SERVICE;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TelebeService {


    @Async
    public void sendBirthdayEmail() {
        log.info("Happy Birthday!");
    }


    @SneakyThrows
    @Async
    public void saveTelebe2() {
        Thread.sleep(2000L);
        log.info("Telebe Saved");
    }
}
