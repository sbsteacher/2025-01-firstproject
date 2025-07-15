package com.green.firstproject.memo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/memo")
public class MemoController {

    @GetMapping
    public String get() {
        log.info("memo - get");
        return "memo";
    }
}
