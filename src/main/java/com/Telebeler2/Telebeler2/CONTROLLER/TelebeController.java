package com.Telebeler2.Telebeler2.CONTROLLER;

import com.Telebeler2.Telebeler2.SERVICE.TelebeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/telebeler")
public class TelebeController {
    private final TelebeService telebeService;


    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void saveTelebe2(){
        telebeService.saveTelebe2();
    }
}
